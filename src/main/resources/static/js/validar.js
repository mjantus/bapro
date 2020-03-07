window.onload=iniciar;

function iniciar()
{
    console.log("se cargo");

    var nombre, mail, direccion, telefono, usuario, clave1, clave2;
    
    //addEventListener Nonbre
    document.getElementById("nombre").addEventListener("input", ValidarNombre);
    document.getElementById("nombre").addEventListener("click", ErrorNombre);
    document.getElementById("nombre").addEventListener("blur", BorrarSpanNombre);
    //addEventListener Apellido
    document.getElementById("apellido").addEventListener("input", ValidarApellido);
    document.getElementById("apellido").addEventListener("click", ErrorApellido);
    document.getElementById("apellido").addEventListener("blur", BorrarSpanApellido);
     //addEventListener Email
     document.getElementById("email").addEventListener("input", ValidarEmail);
     document.getElementById("email").addEventListener("click", ErrorEmail);
     document.getElementById("email").addEventListener("blur", BorrarSpanEmail);
     //addEventListener Direccion
     document.getElementById("direccion").addEventListener("input", ValidarDireccion);
     document.getElementById("direccion").addEventListener("click", ErrorDireccion);
     document.getElementById("direccion").addEventListener("blur", BorrarSpanDireccion);
    //addEventListener Provincia
     document.getElementById("provincia").addEventListener("click", ErrorProvincia);
     //addEventListener Telefono
     document.getElementById("telefono").addEventListener("input", ValidarTelefono);
     document.getElementById("telefono").addEventListener("click", ErrorTelefono);
     document.getElementById("telefono").addEventListener("blur", BorrarSpanTelefono);
     //addEventListener Usuario
     document.getElementById("usuario").addEventListener("input", ValidarUsuario);
     document.getElementById("usuario").addEventListener("click", ErrorUsuario);
     document.getElementById("usuario").addEventListener("blur", BorrarSpanUsuario);
     //addEventListener Clave1
     document.getElementById("password").addEventListener("input", ValidarClave1);
     document.getElementById("password").addEventListener("click", ErrorClave1);
     document.getElementById("password").addEventListener("blur", BorrarSpanClave1);
     //addEventListener Calve2
     document.getElementById("clave2").addEventListener("input", ValidarClave2);
     document.getElementById("clave2").addEventListener("click", ErrorClave2);
     document.getElementById("clave2").addEventListener("blur", BorrarSpanClave2);
    
    expresionEmail = /[\w._%+-]+@[\w.-]+\.[\w]{2,40}$/;
    expresionTelefono = /[(][\d]{2,4}[)][\d\s]{4,15}$/;
    expresionLetras = /^[\D\s]{2,30}$/;
    expresionDireccion = /[\w\s]{2,40}/;
    expresionUsuario = /[\w\S]{5,30}$/;
    expresionClave = /^(?=.*[a-z])(?=.*[0-9])(?=.{8,})/;
}

function ValidarNombre ()
{
    
    if (document.getElementById("nombre").value != null)
    {
        
     if(expresionLetras.test(document.getElementById("nombre").value))
     {
       document.getElementById("spanNombre").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanNombre").style.color="red"; 
        return false;
     }
    }
}

function ErrorNombre()
{
    document.getElementById("spanNombre").innerHTML = "El apellido tiene que tener menos de 30 caracteres";
}

function BorrarSpanNombre()
{
    if(document.getElementById("nombre").value != null && expresionLetras.test(document.getElementById("nombre").value))
    {
        document.getElementById("spanNombre").innerHTML = " ";
    }

}

function ValidarApellido ()
{
    if (document.getElementById("apellido").value != null)
    {
        
     if(expresionLetras.test(document.getElementById("apellido").value))
     {
       document.getElementById("spanApellido").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanApellido").style.color="red"; 
        return false;
     }
    }
}
function ErrorApellido()
{
    console.log("se cargo spanApellido");
    document.getElementById("spanApellido").innerHTML = "El nombre tiene que tener menos de 30 caracteres";
}

function BorrarSpanApellido()
{
    console.log("se fue spanApellido");
    if(document.getElementById("apellido").value != null && expresionLetras.test(document.getElementById("apellido").value))
    {
        document.getElementById("spanApellido").innerHTML = " ";
        console.log("entro if");
    }
}


function ValidarEmail()
{
    if (document.getElementById("email").value != null)
    {
        if(expresionEmail.test(document.getElementById("email").value))
     {
       document.getElementById("spanEmail").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanEmail").style.color="red"; 
        return false;
     }
    } 
}
function ErrorEmail()
{
    document.getElementById("spanEmail").innerHTML = "Ingrese un mail válido.";
}

function BorrarSpanEmail()
{
    if(document.getElementById("email").value != null && expresionEmail.test(document.getElementById("email").value))
    {
        document.getElementById("spanEmail").innerHTML = " ";
    }

}


function ValidarDireccion()
{
    if (document.getElementById("direccion").value != null)
    {
        if(expresionDireccion.test(document.getElementById("direccion").value))
     {
       document.getElementById("spanDireccion").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanDireccion").style.color="red"; 
        return false;
     }
    } 

}
function ErrorDireccion()
{
    document.getElementById("spanDireccion").innerHTML = "Ingrese su direccion.";
}

function BorrarSpanDireccion()
{
    if(document.getElementById("direccion").value != null && expresionDireccion.test(document.getElementById("direccion").value))
    {
        document.getElementById("spanDireccion").innerHTML = " ";
    }

}
function ErrorProvincia()
{  
    if (document.getElementById("provincia").value == "")
    {
       document.getElementById("ErrorProvincia").innerHTML = "La provincia es obligatoria";
       document.getElementById("provincia").style.color = "red";

    }else{
        document.getElementById("ErrorProvincia").innerHTML = "";
       document.getElementById("provincia").style.color = "green";

    }

}

function ValidarTelefono ()
{
    if (document.getElementById("telefono").value != null)
    {
        if(expresionTelefono.test(document.getElementById("telefono").value))
     {
       document.getElementById("spanTelefono").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanTelefono").style.color="red"; 
        return false;
     }
    }
}
function ErrorTelefono()
{
    document.getElementById("spanTelefono").innerHTML = "Ej: (11) 15xxxxxxx";
}

function BorrarSpanTelefono()
{
    if(document.getElementById("telefono").value != null && expresionTelefono.test(document.getElementById("telefono").value))
    {
        document.getElementById("spanTelefono").innerHTML = " ";
    }

}


function ValidarUsuario ()
{
    if (document.getElementById("usuario").value != null)
    {
        if(expresionUsuario.test(document.getElementById("usuario").value))
     {
       document.getElementById("spanUsuario").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanUsuario").style.color="red"; 
        return false;
     }
    }
}
function ErrorUsuario()
{
    document.getElementById("spanUsuario").innerHTML = "El usuario tiene que tener minimo 5 caracteres";
}

function BorrarSpanUsuario()
{
    if(document.getElementById("usuario").value != null && expresionUsuario.test(document.getElementById("usuario").value)) 
    {
        document.getElementById("spanUsuario").innerHTML = " ";
    }

}


function ValidarClave1()
{
    if (document.getElementById("clave1").value != null)
    {
        if(expresionClave.test(document.getElementById("clave1").value))
     {
       document.getElementById("spanClave1").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanClave1").style.color="red"; 
        return false;
     }
    }
}

function ErrorClave1()
{
    document.getElementById("spanClave1").innerHTML = "La clave tiene que contener mínimo 8 carácteres, incluyendo números y texto";
}

function BorrarSpanClave1()
{
    if(document.getElementById("clave1").value != null && expresionClave.test(document.getElementById("clave1").value)) 
    {
        console.log("se borro clave1");
        document.getElementById("spanClave1").innerHTML = " ";
    }

}


function ValidarClave2()
{
    if (document.getElementById("clave2").value != null)
    {
        if(document.getElementById("clave1").value == document.getElementById("clave2").value)
     {
       document.getElementById("spanClave2").style.color="green";
       return true;
     }
     else 
     {
        document.getElementById("spanClave2").style.color="red"; 
        return false;
     }
    }
}

function ErrorClave2()
{
    document.getElementById("spanClave2").innerHTML = "Reingrese nuevamente su contraseña";
}

function BorrarSpanClave2()
{
    if(document.getElementById("clave2").value != null && expresionClave.test(document.getElementById("clave2").value)) 
    {
        document.getElementById("spanClave2").innerHTML = " ";
    }


}

function validarTodo() 
{
    console.log("funciona");

   if (ValidarNombre() && ValidarApellido() && ValidarEmail() && ValidarDireccion() && ValidarNombre() && ValidarUsuario() && ValidarClave1() && ValidarClave2())
   {
       return true;
   }
   else
   {
       return false;
   }
    
}

fetch("https://apis.datos.gob.ar/georef/api/provincias")
.then(function(rta){
	return rta.json();
})
.then(function(datos){
	var opcionesDeProvincias = document.querySelector("#provincia");

	for(var i = 0; i < datos.provincias.length; i++){
	    //console.log(datos.provincia[i].nombre);
	    opcionesDeProvincias.innerHTML += '<option value="'+ datos.provincias[i].nombre +'">' + datos.provincias[i].nombre + "</option>";
	}
})
.catch(function(error){})


