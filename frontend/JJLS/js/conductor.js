function obtenerdatos() {
	
var nombre = document.getElementById('nombre').value;
var documento = document.getElementById('documento').value;	
var tipo = document.getElementById('tipo').value;
var licencia = document.getElementById('licencia').value;

if ((nombre == "") || (documento == "") || (tipo == "") || (licencia == "") ) {  //COMPRUEBA CAMPOS VACIOS
    alert("Los campos no pueden quedar vacios");
    return true;
}
	
var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");


var raw = JSON.stringify({"nombre":nombre,"numeroDocumento":documento,"numeroLicencia":licencia,"tipoLicencia":tipo});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};
console.log(raw);
	
fetch("http://localhost:9090/conductores", requestOptions)
  .then(response => validarrespuesta(response))
  .then(result => console.log(result))
  .catch(error => console.log('error', error));

}


function validarrespuesta(response){
	
	console.log(response);
	
	
	
	if (response.status!="201"){
	alert("Error registro: Datos incompletos o erroneos");	
		}
	else if(response.status=="201"){
window.location.href="file:///C:/Users/Luisp/Desktop/JJLS/Vistas/AdminUser/Registro_correcto2.html";
		}
		
}