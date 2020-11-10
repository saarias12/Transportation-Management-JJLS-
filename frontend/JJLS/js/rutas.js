//Llenar los Select con la info de la base de datos

var requestOptions = {
  method: 'GET',
  redirect: 'follow'
};

fetch("http://localhost:9090/departamentos", requestOptions)
  .then(response => response.text())
  .then(result => obtenerdatosF(result))
  .catch(error => console.log('error', error));


function obtenerdatosF(result) {

var result2 = JSON.parse(result);
var x = document.getElementById("origen");
var z = document.getElementById("destino");
var a = document.getElementById("origen2");
var b = document.getElementById("destino2");
	
for (var i = 0; i < result2.length; i++) {
	
   var option = document.createElement("option");
   option.text = result2[i].nombre;
	
   var option2 = document.createElement("option");
   option2.text = result2[i].nombre;
	
   var option3 = document.createElement("option");
   option3.text = result2[i].nombre;
	
	var option4 = document.createElement("option");
   option4.text = result2[i].nombre;
	
   x.add(option);
   z.add(option2);
	
   a.add(option3);
   b.add(option4);
		
}
	console.log(result2);
}



//Llenar los Select con la info de la base de datos


fetch("http://localhost:9090/conductores", requestOptions)
  .then(response => response.text())
  .then(result => obtenerdatosC(result))
  .catch(error => console.log('error', error));


function obtenerdatosC(result) {

var result2 = JSON.parse(result);
var x = document.getElementById("conductor");

	
for (var i = 0; i < result2.length; i++) {
	
   var option = document.createElement("option");
   option.text = result2[i].nombre;
	
   
	
   x.add(option);
  
		
}
	console.log(result2);
}
	



//registro de rutas


function obtenerdatos() {
	
var oringen = document.getElementById('origen').value;
var destino = document.getElementById('destino').value;
var conductor = document.getElementById('conductor').value;
var fechai = document.getElementById('fechai').value;
var fechaf = document.getElementById('fechaf').value;
var horaS = document.getElementById('horaS').value;
var horaL = document.getElementById('horaL').value;

if ((oringen == "") || (destino == "") || (conductor == "") || (fechai == "")|| (fechaf == "")|| (horaS == "")|| (horaL == "") ) {  //COMPRUEBA CAMPOS VACIOS
    alert("Los campos no pueden quedar vacios");
    return true;	
	
	}

	console.log(fechaf);
	
	
var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");
myHeaders.append("Access-Control-Allow-Origin","*");


var raw = JSON.stringify({"conductor":conductor,"destino":destino,"fechaFinal":fechaf,"fechaInicial":fechai,"horaLlegada":horaL,"horaSalida":horaS,"origen":oringen});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};
console.log(raw);
	
fetch("http://localhost:9090/rutas", requestOptions)
  .then(response => validarrespuesta(response))
  .then(result => console.log(result))
  .catch(error => console.log('error', error));

}


function validarrespuesta(response){
	
	console.log(response);
	
	
	
	if (response.status=="201"){
window.location.href="file:///C:/Users/Luisp/Desktop/JJLS/Vistas/AdminUser/Registro_correcto2.html";
		}

		
}




//Registro de encomiendas


function obtenerdatosE() {
	
var origen2 = document.getElementById('origen2').value;
var destino2 = document.getElementById('destino2').value;
var fechai2 = document.getElementById('fechai2').value;
var fechaf2 = document.getElementById('fechaf2').value;
var peso = document.getElementById('peso').value;
var valor = document.getElementById('valor').value;
var horaS2 = document.getElementById('horaS2').value;
var horaL2 = document.getElementById('horaL2').value;
var descri = document.getElementById('descri').value;

if ((origen2 == "") || (destino2 == "") || (fechai2 == "")|| (fechaf2 == "")|| (peso == "")|| (valor == "")||(horaS2 == "")|| (horaL2 == "") || (descri == "") ) {  //COMPRUEBA CAMPOS VACIOS
    alert("Los campos no pueden quedar vacios");
    return true;	
	
	}

	console.log(fechaf);
	
	
var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");
myHeaders.append("Access-Control-Allow-Origin","*");


var raw = JSON.stringify({"descripcion":descri,"destino":destino2,"fechaFinal":fechaf2,"fechaInicial":fechai2,"horaLlegada":horaL2,"horaSalida":horaS2,"origen":origen2,"peso":peso,"valor":valor});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};
console.log(raw);
	
fetch("http://localhost:9090/encomiendas", requestOptions)
  .then(response => validarrespuesta(response))
  .then(result => console.log(result))
  .catch(error => console.log('error', error));

}


function validarrespuesta(response){
	
	console.log(response);
	
	
	
	if (response.status=="201"){
window.location.href="file:///C:/Users/Luisp/Desktop/JJLS/Vistas/AdminUser/Registro_correcto2.html";
		}

		
}






















