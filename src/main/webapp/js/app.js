function sendData(event) {
    event.preventDefault();
    const form = new FormData(document.getElementById('form'));
     fetch('nomina-cto', {
        method: "POST",
        body: form
    }).then(response => response.text())
         .then(data => {
             document.getElementById("result").innerHTML = data;
         })
         .catch(error => console.error("Error:", error));
}
document.getElementById('submit').addEventListener('click', sendData);