//Función que me aplica el estilo a la opciòn seleccionada y quita la previamente seleccionada
function seleccionar(link) {
    var opciones = document.querySelectorAll('#links  a');
    opciones[0].className = "inicio";
    opciones[1].className = "nosotros";
    opciones[2].className = "servicios";
    opciones[3].className = "skills";
    opciones[4].className = "proyecto";
    opciones[5].className = "contacto";
    link.className = "seleccionado";

    //Hacemos desaparecer el menu una vez que se ha seleccionado una opcion
    //en modo responsive
    var x = document.getElementById("nav");
    x.className = "";
}

//función que muestra el menu responsive
function responsiveMenu() {
    var x = document.getElementById("nav");
    if (x.className === "") {
        x.className = "responsive";
    } else {
        x.className = "";
    }
}

//detecto el scrolling para aplicar la animación del la barra de habilidades
window.onscroll = function() { efectoHabilidades() };

//funcion que aplica la animación de la barra de habilidades
function efectoHabilidades() {
    var skills = document.getElementById("skills");
    var distancia_skills = window.innerHeight - skills.getBoundingClientRect().top;
    if (distancia_skills >= 300) {
        document.getElementById("html").classList.add("barra-progreso1");
        document.getElementById("js").classList.add("barra-progreso2");
        document.getElementById("bd").classList.add("barra-progreso3");
        document.getElementById("ps").classList.add("barra-progreso4");
    }

}
function mostrarImagen(src) {
    var ventanaEmergente = document.getElementById("ventana-emergente");
    var imagenGrande = document.getElementById("imagen-grande");
    imagenGrande.src = src;
    ventanaEmergente.classList.remove("oculto");
  }
  
  function cerrarVentanaEmergente() {
    var ventanaEmergente = document.getElementById("ventana-emergente");
    ventanaEmergente.classList.add("oculto");
  }
  