<%-- 
    Document   : Registro
    Created on : 19-mar-2018, 16:39:03
    Author     : Juli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Formulario De Registro</h1>
        <form method="post" action="UsuarioNuevo">
        <label>Nombre</label>
        <input type="text" name="nombrer"/><br>
        <label>Contraseña</label>
        <input type="password" name="contrasenar"/><br>
        <input type="submit" value="Registro"/>
        </form>
    </body>
</html>
