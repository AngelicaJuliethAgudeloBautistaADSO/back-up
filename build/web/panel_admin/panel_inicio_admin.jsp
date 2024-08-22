<%-- 
    Document   : panel_inicio_admin
    Created on : 17/08/2024, 7:36:26 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_admin/panel_inicio_admin.css"/>
    </head>
    <body>
    <div class="contenedor">
        <aside class="contenedor_lateral">
            <div class="cont_logo">
                <img src="imagenes/logo.png" alt="">
                <p>Cosmetología y Estética Integral</p>
            </div>
            <button class="boton_logo">
                <a href="index.html">Cerrar sesion</a>
            </button>
            <nav class="nav_logo">
                <button class="button_nav_logo" >
                    <a href="">Panel de inicio</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_cosmetologo_admin.html">Cosmetologo/a</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="">Calendario</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="">Citas</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="">Usuarios</a>
                </button>
            </nav>
        </aside>
        <main class="cont_logo">
            <div class="panel">
                <div class="contenido_principal">
                    <h2 class="h2_principal">Citas de la semana </h2>
                    <p class="p_principal">estan son las citas que esta agendadas para esta semana 
                        para mas informacion detallada ingresa a la sesion “Citas” </p>
                    <table class="tabla_principal">
                        <thead class="thead_tabla">
                            <tr class="tr_tabla">
                                <th class="th_tabla">Código de cita</th>
                                <th class="th_tabla">Nombre de usuario</th>
                                <th class="th_tabla">Cosmetólogo</th>
                                <th class="th_tabla">Servicio</th>
                                <th class="th_tabla">Fecha y hora</th>
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
