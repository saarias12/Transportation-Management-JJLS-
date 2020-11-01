
function obtenerdatos() {
	
var correo = document.getElementById('correo').value;
var nombres = document.getElementById('nombre').value;
var password = parseFloat(document.getElementById('contra').value)
var username = document.getElementById('username').value;


	
var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");
myHeaders.append("Access-Control-Allow-Origin","*");


var raw = JSON.stringify({"correo":correo,"enabled":true,"id":0,"nombres":nombres,"password":password,"username":username});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};
console.log(raw);
	
fetch("http://localhost:9090/usuarios", requestOptions)
  .then(response => validarrespuesta(response))
  .then(result => console.log(result))
  .catch(error => console.log('error', error));

}


function validarrespuesta(response){
	
	console.log(response);
	
}


