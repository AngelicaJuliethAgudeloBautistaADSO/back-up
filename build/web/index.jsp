<%-- 
    Document   : index
    Created on : 14/08/2024, 2:35:42 p. m.
    Author     : angel
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/index.css"/>
    </head>
    <body class="body">
    <header>
        <div class="contenedor_header">
            <div class="cont_logo">
                <img class="logo" src="img/logo.png" alt="">
            </div>
            <div class="boton_menu">
                <button class="boton">
                    <img  src="img/logo_menu.png" alt="">
                </button>
            </div>
        </div>
    </header>
        
    <section class="container_inicio">
        <div class="contenedor_inicio">
            <div class="inicio_h1_p">
                <h1 class="h1_inicio">Sensacion Spa Te Da La Bienvenida</h1>
                <p class="p_inicio">Cosmetologia y estetica integral para tu vida y tu piel</p>
            </div>
            <div class="inicio_boton">
                <button class="bott_servicios">
                    <a href="ingreso.jsp">Reservar cita</a>
                </button>
                <button class="bott_contacto">
                    <a href="registro.jsp">Registrarme</a>
                </button>
                
            </div>
        </div>
        
    </section>
</body>
</html>
