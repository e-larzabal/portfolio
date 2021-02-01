

function showThePassword() {
    let x = document.getElementById("user-password");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}


function countChars(obj){
    let maxLength = 5000;
    let strLength = obj.value.length;
    let charRemain = (maxLength - strLength);

    if(strLength > maxLength){
        document.getElementById("charNumber").innerHTML = '<span style="color: red;">'+strLength+' out of '+maxLength+' characters</span>';
    }else{
        document.getElementById("charNumber").innerHTML = charRemain+' characters remaining';
    }
}