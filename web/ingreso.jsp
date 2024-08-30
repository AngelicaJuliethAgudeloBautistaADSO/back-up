<%-- 
    Document   : ingreso
    Created on : 14/08/2024, 4:17:42 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <<link rel="stylesheet" href="css/ingreso.css"/>
    </head>
    <body>
    <div class="logo_inicio">
        <img class="img_logo" src="img/logo.png" alt="">
    </div>
    <div class="contenido">
        <h1>¡Bienvenido/a!</h1>
        <p >Esperamos que disfrutes de una experiencia relajante y rejuvenecedora</p>    
        
        <form>
            <label for="Correo"></label>
            <input id="Correo" name="Correo" placeholder="Correo electronico" autocomplete="off">
        
            <label for="contrasena"></label>
            <input id="contrasena_ingreso" name="contrasena" placeholder="Contraseña" autocomplete="off" onkeyup="coincidircontasena()">
            
            <label id="avisocontrasena">------</label>
            
            <button type="summit" id="summit" >
                <a href="panel_usuario/panel_inicio_usuario.jsp">
                    <%--panel_admin/panel_inicio_admin.jsp--%>
                   Ingresar 
                </a>
            </button>    
        </form>
        <!-- <script src="inicio.js"></script> -->
        <div class="login-link">
            <p class="p_login">¿Aun no tienes cuenta? 
            <a href="registro.jsp">Registrarte</a></p>
        </div>
    </div>
</body>
<script src="JavaScritp/funciones_ingreso.js"></script>
</html>
