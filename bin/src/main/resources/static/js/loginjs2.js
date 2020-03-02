//se crea mail y clave provisoria para poder testear los errores hasta inclir la base de datos.
var mailDefault = "admin@hotmail.com";
var claveDefault = "admin123";

function validarLogin()
    {
        var mail = document.getElementById("mail").value;
        var clave = document.getElementById("clave").value;

        if(mail == mailDefault && clave == claveDefault)
        {
            return true;
        }
        else if (mail == mailDefault && clave != claveDefault)
        {
            document.getElementById("spanLogin").style.alignContent = "center";
            document.getElementById("spanLogin").style.color ="red";
            document.getElementById("spanLogin").innerHTML = "La contraseña es incorrecta";
            return false;
        }
        else if(mail != mailDefault && clave == claveDefault)
        {
            document.getElementById("spanLogin").style.alignContent = "center";
            document.getElementById("spanLogin").style.color ="red";
            document.getElementById("spanLogin").innerHTML = "El mail es incorrecta";
            return false;
        }
        else if(mail != mailDefault && clave != claveDefault)
        {
            document.getElementById("spanLogin").style.alignContent = "center";
            document.getElementById("spanLogin").style.color ="red";
            document.getElementById("spanLogin").innerHTML = "Identificación incorrecta";
            return false;
        }

    }
