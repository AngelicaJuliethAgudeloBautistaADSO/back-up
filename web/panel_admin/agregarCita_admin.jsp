<%-- 
    Document   : agregarCita_admin
    Created on : 5/09/2024, 5:40:55 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_admin/agregarCita_admin.css"/>
    </head>
    <body>
        <div class="contenido">
        <div class="logo_inicio">
            <img class="img_logo" src="../imagenes/logo.png" alt="">
        </div>
        <form class="cont_reservar">
            <p>Reserva tu cita</p>
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
                <a href="panel_cita_admin.html">Reservar</a>
            </button>
        </form>
    </div>
    </body>
</html>
