let audio = document.getElementById("audio");
let playBtn = document.getElementById("play");
let nextBtn = document.getElementById("next");
let prevBtn = document.getElementById("prev");
let seekBar = document.getElementById("seek");
let volume = document.getElementById("volume");
let currentTimeEl = document.getElementById("current-time");
let durationEl = document.getElementById("duration");
let titleEl = document.getElementById("song-title");
let artistEl = document.getElementById("song-artist");
let albumArt = document.getElementById("album-art");
let playlistEl = document.getElementById("playlist");
let favoritesList = document.getElementById("favorites-list");
let recentlyList = document.getElementById("recently-list");
let searchInput = document.getElementById("search");
let voiceBtn = document.getElementById("voice-search");

let songs = [];
let currentIndex = 0;
let favorites = JSON.parse(localStorage.getItem("favorites")) || [];
let recently = JSON.parse(localStorage.getItem("recently")) || [];

// Load songs from JSON
fetch("songs.json")
  .then(res => res.json())
  .then(data => {
    songs = data;
    loadSong(currentIndex);
    renderPlaylist();
    renderFavorites();
    renderRecently();
  });

function loadSong(index) {
  let song = songs[index];
  audio.src = song.path;
  titleEl.textContent = song.title;
  artistEl.textContent = song.artist;
  albumArt.src = song.image;
}

// Play/Pause
playBtn.addEventListener("click", () => {
  if (audio.paused) {
    audio.play();
    playBtn.textContent = "⏸";
  } else {
    audio.pause();
    playBtn.textContent = "▶";
  }
});

// Next/Prev
nextBtn.addEventListener("click", () => changeSong(1));
prevBtn.addEventListener("click", () => changeSong(-1));

function changeSong(step) {
  currentIndex = (currentIndex + step + songs.length) % songs.length;
  loadSong(currentIndex);
  audio.play();
  playBtn.textContent = "⏸";
  addRecently(songs[currentIndex]);
}

// Progress
audio.addEventListener("timeupdate", () => {
  seekBar.value = (audio.currentTime / audio.duration) * 100 || 0;
  currentTimeEl.textContent = formatTime(audio.currentTime);
  durationEl.textContent = formatTime(audio.duration);
});

seekBar.addEventListener("input", () => {
  audio.currentTime = (seekBar.value / 100) * audio.duration;
});

// Volume
volume.addEventListener("input", () => {
  audio.volume = volume.value;
});

// Recently Played
function addRecently(song) {
  recently.unshift(song);
  recently = [...new Set(recently.map(s => s.title))].map(title => recently.find(s => s.title === title));
  recently = recently.slice(0, 10);
  localStorage.setItem("recently", JSON.stringify(recently));
  renderRecently();
}

function renderRecently() {
  recentlyList.innerHTML = "";
  recently.forEach(song => {
    let li = document.createElement("li");
    li.textContent = song.title;
    recentlyList.appendChild(li);
  });
}

// Favorites
function toggleFavorite(song) {
  let exists = favorites.find(s => s.title === song.title);
  if (exists) {
    favorites = favorites.filter(s => s.title !== song.title);
  } else {
    favorites.push(song);
  }
  localStorage.setItem("favorites", JSON.stringify(favorites));
  renderFavorites();
}

function renderFavorites() {
  favoritesList.innerHTML = "";
  favorites.forEach(song => {
    let li = document.createElement("li");
    li.textContent = song.title;
    favoritesList.appendChild(li);
  });
}

// Playlist
function renderPlaylist() {
  playlistEl.innerHTML = "";
  songs.forEach((song, i) => {
    let div = document.createElement("div");
    div.textContent = song.title;
    div.addEventListener("click", () => {
      currentIndex = i;
      loadSong(i);
      audio.play();
      playBtn.textContent = "⏸";
      addRecently(song);
    });
    playlistEl.appendChild(div);
  });
}

// Search
searchInput.addEventListener("input", () => {
  let value = searchInput.value.toLowerCase();
  let filtered = songs.filter(song => song.title.toLowerCase().includes(value));
  playlistEl.innerHTML = "";
  filtered.forEach(song => {
    let div = document.createElement("div");
    div.textContent = song.title;
    div.addEventListener("click", () => {
      currentIndex = songs.indexOf(song);
      loadSong(currentIndex);
      audio.play();
      playBtn.textContent = "⏸";
      addRecently(song);
    });
    playlistEl.appendChild(div);
  });
});

// Voice Search
voiceBtn.addEventListener("click", () => {
  let recognition = new (window.SpeechRecognition || window.webkitSpeechRecognition)();
  recognition.start();
  recognition.onresult = (event) => {
    searchInput.value = event.results[0][0].transcript;
    searchInput.dispatchEvent(new Event("input"));
  };
});

function formatTime(sec) {
  if (isNaN(sec)) return "0:00";
  let min = Math.floor(sec / 60);
  let secRemain = Math.floor(sec % 60).toString().padStart(2, "0");
  return `${min}:${secRemain}`;
}