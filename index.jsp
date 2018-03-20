<%-- 
    Document   : index
    Created on : 19-mar-2018, 16:30:01
    Author     : Juli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
        <script src="js/main.js"></script>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form method="post" action="Inicio" id="forminicio">
            <label> Nombre</label>
            <input type="text" name="Nombre" id="txtusuario" /><br>
            <label> Contraseña </label>
            <input type="password" name="Contrasena" id="txtContrasena" /><br>
            <input type="button" value="Iniciar Sesion" id="btniniciar" />    
        </form>
       <br>
    Si No Tienes Una Cuenta <a href="Registro.jsp">Registrate</a>
    </body>
</html>
