<%-- 
    Document   : panel_citas_usuario
    Created on : 29/08/2024, 6:10:39 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_usuario/panel_citas_usuario.css"/>
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
                    <h2 class="h2_principal">Citas</h2>
                    <p class="p_principal">Reserva tu cita con el tratamiento que mas te halla gustado:</p>
                    <div class="cont_reservar">
                        <h2>Reserva tu cita</h2>
                        <label for="fecha">Fecha:</label>
                        <input class="boton_panel" type="date" id="fecha" placeholder="dd / mm / aaaa">

                        <select class="elegir_servicio" name="servicio" id="servicio" placeholder="Elige el servicio que desees">
                            <option value="">1</option>
                            <option value="">2</option>
                            <option value="">3</option>
                        </select>

                        <label for="hora">Hora:</label>
                        <input class="hora" type="time" id="hora" name="hora"></input>

                        <button class="boton_panel">
                            <a href="">Reservar</a>
                        </button>
                    </div>
                </div>
            </div>
        </main>
    </div>
</body>
</html>
