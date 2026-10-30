(() => {
  const status = document.getElementById('status');
  window.QuizJarBridge = Object.freeze({
    ready() {
      status.textContent = 'Player ready.';
    }
  });

  status.textContent = 'Waiting for native game state…';
})();
