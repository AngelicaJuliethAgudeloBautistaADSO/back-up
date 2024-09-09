<%@page import="modelo.cosmetologo"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modeloDAO.cosmetologoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_admin/panel_cosemtologo_admin.css"/>
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
                    <a href="controlCosmetolo?accion=listar">Cosmetologo/a</a>
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
                    <h2 class="h2_principal">Agregar nuevo cosmetologo </h2>
                    <button class="boton_panel">
                        <a href="agregarCosmetol_admin.jsp">+ Agregar nuevo</a>
                    </button>
                    <table class="tabla_principal">
                        <thead class="thead_tabla">
                            <tr class="tr_tabla">
                                <th class="th_tabla">Id</th>
                                <th class="th_tabla">Nombre</th>
                                <th class="th_tabla">Apellido</th>
                                <th class="th_tabla">Telefono</th>
                                <th class="th_tabla">Especialidad</th>
                            </tr>
                        </thead>
                        
                        
                        <tbody>
                        <%
                            cosmetologoDAO dao=new cosmetologoDAO();
                            List<cosmetologo>list=dao.listar();
                            Iterator<cosmetologo>iter=list.iterator();
                            cosmetologo cosm=null;
                            while (iter.hasNext()) {
                                    cosm=iter.next();
                                
                        %>
                            <tr>
                                <td class=""><%= cosm.getId_cosmetolo()%></td>
                                <td class=""><%= cosm.getNom_cosmetolo() %></td>
                                <td class=""><%= cosm.getApell_cosmetolo() %></td>
                                <td class=""><%= cosm.getTelef_cosmetolo() %></td>
                                <td class=""><%= cosm.getEspeci_cosmetolo()%></td>
                                <td class="">
                                    <div class="">
                                        <a class="">Modificar</a>
                                        <a class="">Eliminar</a>
                                    </div>
                                </td>
                            </tr>
                         <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </main>
    </div>
    </body>
</html>
