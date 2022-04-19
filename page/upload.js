async function uploadFile() {
    let input = document.getElementById("fileupload");
    let formData = new FormData();
    formData.append("file", input.files[0]);
    let response = await fetch('http://localhost:8080/upload', {
        method: "POST",
        body: formData
    });

    if (response.status === 200) {
        alert("File successfully uploaded.");
    }
}