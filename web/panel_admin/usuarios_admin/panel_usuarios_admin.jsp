<%-- 
    Document   : panel_usuarios_admin
    Created on : 27/08/2024, 7:35:36 p. m.
    Author     : angel
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.cliente"%>
<%@page import="modeloDAO.clienteDAO"%>
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
                    <h2 class="h2_principal">Usuarios</h2>
                    <button class="boton_panel">
                        <a href="controlAdminUsuario?accion=add">+ Agregar nuevo</a>
                    </button>
                    <table class="tabla_principal">
                        <thead class="thead_tabla">
                            <tr class="tr_tabla">
                                <th class="th_tabla">Id</th>
                                <th class="th_tabla">Nombre</th>
                                <th class="th_tabla">Apellido</th>
                                <th class="th_tabla">Tipo</th>
                                <th class="th_tabla">Documento</th>
                                <th class="th_tabla">Genero</th>
                                <th class="th_tabla">Telefono</th>
                                <th class="th_tabla">Email</th>
                                <th class="th_tabla">Acciones</th>
                            </tr>
                        </thead>
                        
                        
                        <tbody>
                <%
                    List<cliente> lista = (List<cliente>) request.getAttribute("clientes");
                    for (cliente cliente : lista) {
                %>
                <tr>
                    <td><%= cliente.getId_cliente() %></td>
                    <td><%= cliente.getNom_cliente() %></td>
                    <td><%= cliente.getApell_cliente() %></td>
                    <td><%= cliente.getTipo_cliente() %></td>
                    <td><%= cliente.getDocument_cliente() %></td>
                    <td><%= cliente.getGenero_cliente() %></td>
                    <td><%= cliente.getTelef_cliente() %></td>
                    <td><%= cliente.getEmail_cliente() %></td>
                    <td>
                        <a href="controlAdminUsuario?accion=editar&id=<%= cliente.getId_cliente() %>">Editar</a>
                        <a href="controlAdminUsuario?accion=eliminar&id=<%= cliente.getId_cliente() %>">Eliminar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
                    </table>
                </div>
            </div>
        </main>
    </div>
    
    </body>
</html>
