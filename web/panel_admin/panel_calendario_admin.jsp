<%-- 
    Document   : panel_calendario_admin
    Created on : 17/08/2024, 7:37:20 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_admin/panel_calendario_admin.css"/>
    </head>
    <body>
    <div class="contenedor">
        <aside class="contenedor_lateral">
            <div class="cont_logo">
                <img src="../img/logo.png" alt="">
                <p>Cosmetología y Estética Integral</p>
            </div>
            <button class="boton_logo">
                <a href="../index.jsp">Cerrar sesion</a>
            </button>
            <nav class="nav_logo">
                <button class="button_nav_logo" >
                    <a href="panel_inicio_admin.jsp">Panel de inicio</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_cosmetologo_admin.jsp">Cosmetologo/a</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_calendario_admin.jsp">Calendario</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_citas_admin.jsp">Citas</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="controlAdminUsuario?accion=listar">Usuarios</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_servicios_admin.jsp">Servicios</a>
                </button>
            </nav>
        </aside>
        <main class="cont_logo">
            <div class="panel">
                <div class="contenido_principal">
                    <h2 class="h2_principal">Administrador de horarios</h2>
                    <p class="p_principal">Calendario de sesion</p>
                    <button class="boton_panel">
                        <a href="">+ Agregar nueva sesion</a>
                    </button>
                    <label for="fecha">Fecha:</label>
                    <input class="boton_panel" type="date" id="fecha" placeholder="dd / mm / aaaa">
                    
                    <label for="doctor">Doctor:</label>
                    <select class="boton_panel" id="doctor">
                        <option value="" disabled selected>Escoge el nombre del doctor</option>
                    </select>
                    <table class="tabla_principal">
                        <thead class="thead_tabla">
                            <tr class="tr_tabla">
                                <th class="th_tabla">Servicio</th>
                                <th class="th_tabla">Cosmetolog@</th>
                                <th class="th_tabla">Fecha y hora</th>
                                <th class="th_tabla">Servicio</th>
                                <th class="th_tabla">Acciones</th>
                                <!-- <td>
                                    <div class="boton_modif_elim">
                                        <button class="modificar">Modificar</button>
                                        <button class="eliminar">Eliminar</button>
                                    </div>
                                </td>  -->
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
