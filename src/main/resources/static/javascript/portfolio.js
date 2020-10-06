

function showThePassword() {
    let x = document.getElementById("user-password");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}