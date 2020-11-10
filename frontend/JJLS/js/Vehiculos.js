
var base64 = "";

function obtenerdatosF() {
	
var tipo = document.getElementById('bus').value;
var marca = document.getElementById('marca').value;	
var kilometros = document.getElementById('kilometraje').value;
var modelo = document.getElementById('modelo').value;
var placa = document.getElementById('placa').value;
var cilindraje = document.getElementById('cilindraje').value;
var tipoGasolina = document.getElementById('tipog').value;
var mantenimiento = document.getElementById('mantenimiento').value;	

	
	
	
var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");
myHeaders.append("Access-Control-Allow-Origin","*");


var raw = JSON.stringify({"id":0,"tipo":tipo,"marca":marca,"kilometros":kilometros,"modelo":modelo,"placa":placa,"cilindraje":cilindraje,"tipoGasolina":tipoGasolina,"mantenimiento":mantenimiento,"imagen":base64});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};
console.log(raw);
	
fetch("http://localhost:9090/vehiculos", requestOptions)
  .then(response => validarrespuesta(response))
  .then(result => console.log(result))
  .catch(error => console.log('error', error));

}


function validarrespuesta(response){
	
	console.log(response);
	
	if (response.status!="201"){
	alert("Error registro: Datos incompletos o erroneos");	
		}
	
	if (response.status=="201"){
	window.location.href="file:///C:/Users/Luisp/Desktop/JJLS/Vistas/Usuario/Registro_correcto.html";	
		}
		
}

var input = document.querySelector('input[type=file]');

// You will receive the Base64 value every time a user selects a file from his device
// As an example I selected a one-pixel red dot GIF file from my computer
input.onchange = function () {
  var file = input.files[0],
    reader = new FileReader();

  reader.onloadend = function () {
    // Since it contains the Data URI, we should remove the prefix and keep only Base64 string
    var b64 = reader.result.replace(/^data:.+;base64,/, '');
    console.log(b64); //-> "R0lGODdhAQABAPAAAP8AAAAAACwAAAAAAQABAAACAkQBADs="
	  base64=b64;
  };

  reader.readAsDataURL(file);
};


