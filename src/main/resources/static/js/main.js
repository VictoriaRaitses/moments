
var realFileBtn = document.getElementById("real-file");
var customBtn = document.getElementById("custom-button");
customBtn.addEventListener("click",function() {
    realFileBtn.click();
    });

var realSubmitBtn = document.getElementById("real-submit");
var customSubmitBtn = document.getElementById("submit-button");

customSubmitBtn.addEventListener("click",function(){
if(realFileBtn.value){
realSubmitBtn.click();
}
});

function picInfo(element, likes, comments) {

    console.log(likes, comments)
}


function upload(){

    var element = document.getElementById("upload");
    element.style.display = "block";
}

function closeUploadWindow(){

    var element = document.getElementById("upload");
    element.style.display = "none";
}
