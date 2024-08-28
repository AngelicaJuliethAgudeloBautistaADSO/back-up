<%-- 
    Document   : panel_usuarios_admin
    Created on : 27/08/2024, 7:35:36 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_admin/panel_usuarios_admin.css"/>
    </head>
    <body>
    <div class="contenedor">
        <aside class="contenedor_lateral">
            <div class="cont_logo">
                <img src="../imagenes/logo.png" alt="">
                <p>Cosmetología y Estética Integral</p>
            </div>
            <button class="boton_logo">
                <a href="index.html">Cerrar sesion</a>
            </button>
            <nav class="nav_logo">
                <button class="button_nav_logo" >
                    <a href="panel_inicio_admin.html">Panel de inicio</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_cosmetologo_admin.html">Cosmetologo/a</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_calendario_admin.html">Calendario</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_cita_admin.html">Citas</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_usuarios_admin.html">Usuarios</a>
                </button>
                <button class="button_nav_logo" >
                    <a href="panel_servicios_admin.html">Servicios</a>
                </button>
            </nav>
        </aside>
        <main class="cont_logo">
            <div class="panel">
                <div class="contenido_principal">
                    <h2 class="h2_principal">Usuarios</h2>
                    <table class="tabla_principal">
                        <thead class="thead_tabla">
                            <tr class="tr_tabla">
                                <th class="th_tabla">ID</th>
                                <th class="th_tabla">Nombre</th>
                                <th class="th_tabla">Apellido</th>
                                <th class="th_tabla">Edad</th>
                                <th class="th_tabla">Genero</th>
                                <th class="th_tabla">Telefono</th>
                                <th class="th_tabla">Email</th>
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
