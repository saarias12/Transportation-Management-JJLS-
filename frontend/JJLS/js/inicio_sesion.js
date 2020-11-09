window.addEventListener('load', () => {

    let button = document.getElementById('formulario');
    let usuario = document.getElementById('usuario');
    let password = document.getElementById('password');
    
    console.log(usuario);

var myHeaders = new Headers();
myHeaders.append("Authorization", "Basic YXBwLWpqbHM6ampsczg5Y29kZXg=");
myHeaders.append("Access-Control-Allow-Origin","*");
	
	
	
	
    function data() {

        let datos = new FormData();
        datos.append("usuario", usuario.value);
        datos.append("password", password.value);
        fetch("http://localhost:9090/oauth", {
			
		method: 'POST',
        headers: myHeaders,
        redirect: 'follow',
		body: datos	
			
		})
		
		
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));

		
		

    }

	
	
    function validarrespuesta(response){
	
	console.log(response);
	
	if (response.status!="201"){
	alert("Datos incompletos o erroneos");	
		}
	
	if (response.status=="201"){
	window.location.href="file:///C:/Users/Luisp/Desktop/JJLS/Vistas/Usuario/indexUser.html";	
		}
		
}

	
	
    button.addEventListener('submit', (e) => {
        e.preventDefault();

        data();


    });




});
























/*

window.addEventListener('load',()=>{
	
	let button = document.getElementById('formulario');
	let usuario = document.getElementById('usuario');
	let password = document.getElementById('password');
	
	console.log(usuario);
	
	var myHeaders = new Headers();
    myHeaders.append("Authorization", "Basic YXBwLWpqbHM6ampsczg5Y29kZXg=");
	myHeaders.append("Content-Type", "application/json");
    myHeaders.append("Access-Control-Allow-Origin","*");
	
	
	
	
	function data(){
		let datos = new FormData();
		
		datos.append("usuario", usuario.value);
		datos.append("password", password.value);
		
		fetch('http://localhost:9090/oauth',{
			method: 'POST',
			body: datos	
		})
		
		.then(Response => Response.json())
		.then(datoss =>{
			
			console.log(datos);
			
		} );
		
	}
	
	
	
	button.addEventListener('submit',(e) =>{
		e.preventDefault();
		data();
	});
	
	
});
*/
