 <%-- 
    Document   : registro
    Created on : 14/08/2024, 4:15:55 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/registro.css"/>
    </head>
    <body>
        <div class="logo_inicio">
        <img class="img_logo" src="img/logo.png" alt="">
    </div>
    <div class="contenido">
        <h1>¡Bienvenido/a!</h1>
        <p >Esperamos que disfrutes de una experiencia relajante y rejuvenecedora</p>    
        
        <form method="post" action="controlAdminUsuario">
            
            <label for="Nombre"></label>
            <input type="text" id="nombre" name="nombre" placeholder="Nombre" autocomplete="off">
        
            <label for="Apellidos"></label>
            <input type="text" id="apellido" name="apellido" placeholder="Apellido" autocomplete="off">
            
            <label for="tipo"></label>
                <select id="tipo" name="tipo">
                    <option value="">tipo de documento</option>
                    <option value="1">Tarjeta de identidad</option>
                    <option value="2">Cedula de ciudadania</option>
                    <option value="3">Otro</option>
            </select>
            
            <label for="documento"></label>
            <input type="number" id="documento" name="documento" placeholder="Documento de identidad" autocomplete="off">

            <label for="genero"></label>
            <select id="genero" name="genero">
                <option value="">Género</option>
                <option value="1">Masculino</option>
                <option value="2">Femenino</option>
                <option value="3">Otro</option>
            </select>
        
            <label for="telefono"></label>
                <input type="number" id="telefono" name="telefono" placeholder="Número de teléfono" autocomplete="off">
        
            <label for="email"></label>
            <input type="text" id="email" name="email" placeholder="Correo electronico" autocomplete="off">
        
            
            <label for="contrasena"></label>
            <input type="password" id="contrasena" name="contrasena" placeholder="Contraseña" autocomplete="off">
            
            <button type="submit" id="submit" name="accion" value="Agregar">
                <a href="panel_admin/panel_inicio_admin.jsp">
                    Registrarse
                </a>
            </button>   
        </form>
        <script src="inicio.js"></script>
        <div class="login-link">
            <p class="p_login">¿Ya tienes cuenta? 
            <a href="ingreso.jsp" >Ingresar</a></p>
        </div>
    </div>   
</body>
<script src="JavaScritp/funciones_registro.js"></script>
</html>
