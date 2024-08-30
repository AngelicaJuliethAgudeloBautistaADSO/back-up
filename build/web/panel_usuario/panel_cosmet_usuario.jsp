<%-- 
    Document   : panel_cosmet_usuario
    Created on : 29/08/2024, 6:04:36 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_usuario/panel_cosmet_usuario.css"/>
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
                    <h2 class="h2_principal">Panel cosmetolog@</h2>
                    <p class="p_principal">Estos son los cosmetolog@s de nuestro equipo de trabajo y su especialidad para tu necesidad</p>
                    <table class="tabla_principal">
                        <thead class="thead_tabla">
                            <tr class="tr_tabla">
                                <th class="th_tabla">Nombre</th>
                                <th class="th_tabla">Email</th>
                                <th class="th_tabla">Especialidad</th>
                                <th class="th_tabla">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                        </tbody>
                    </table>
                </div>
            </div>
        </main>
    </div>
</body>
</html>
