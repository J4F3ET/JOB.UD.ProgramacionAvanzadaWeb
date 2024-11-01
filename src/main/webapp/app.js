document.getElementById('clear').addEventListener('click', (evt) =>
    fetch(evt.target.dataset.url, {method: "DELETE"})
        .then(() => location.reload())
);