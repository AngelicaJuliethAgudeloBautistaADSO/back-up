<%@page import="java.util.Iterator"%>
<%@page import="modelo.cliente"%>
<%@page import="modeloDAO.clienteDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>cliente</h1>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>APELLIDO</th>
                        <th>DOCUMENTO</th>
                        <th>GENERO</th>
                        <th>TELEFONO</th>
                        <th>EMAIL</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                clienteDAO dao=new clienteDAO();
                List<cliente>list=dao.listar();
                Iterator<cliente>iter=list.iterator();
                cliente clie=null;
                while (iter.hasNext()) {                        
                        clie=iter.next();
                    
                 %>
                <tbody>
                    <tr>
                        <td><%= clie.getId()%></td>
                        <td><%= clie.getNom()%></td>
                        <td><%= clie.getApell()%></td>
                        <td><%= clie.getDocument()%></td>
                        <td><%= clie.getGenero()%></td>
                        <td><%= clie.getTelef()%></td>
                        <td><%= clie.getEmail()%></td>
                        <td>
                            <a>Editar</a>
                            <a>Remover</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
