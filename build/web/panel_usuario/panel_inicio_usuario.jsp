<%-- 
    Document   : panel_inicio_usuario
    Created on : 29/08/2024, 5:52:08 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_usuario/panel_inicio_usuario.css"/>
    </head>
    <body>
    <div class="contenedor">
        <aside class="contenedor_lateral">
            <div class="cont_logo">
                <img src="../img/logo.png" alt="">
                <p>Cosmetología y Estética Integral</p>
            </div>
            <button class="boton_logo">
                <a href="index.html">Cerrar sesion</a>
            </button>
            <nav class="nav_logo">
                <button class="button_nav_logo" >
                    <a href="panel_inicio_usuario.jsp">Panel de inicio</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_cosmet_usuario.jsp">Cosmetologo/a</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_servicios_usuario.jsp">Servicios</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_citas_usuario.jsp">Citas</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_config_usuario.jsp">Configuracios</a>
                </button>
            </nav>
        </aside>
        <main class="cont_logo">
            <div class="panel">
                <div class="contenido_principal">
                    <h2 class="h2_principal">Panel de inicio</h2>
                    <p class="p_principal">¡Bienvenid@!</p>
                </div>
            </div>
        </main>
    </div>
</body>
</html>
