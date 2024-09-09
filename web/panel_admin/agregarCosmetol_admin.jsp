<%-- 
    Document   : agregarCosmetol_admin
    Created on : 5/09/2024, 5:29:15 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/css_admin/agregarCosmetol_admin.css"/>
    </head>
    <body>
        <div class="contenido">
        <div class="logo_inicio">
            <img class="img_logo" src="../imagenes/logo.png" alt="">
        </div>
        <form>
        <p >Agrega un nuevo cosmetolog@</p> 
            <label for="nombre"></label>
            <input type="text" id="nombre" name="nombre" placeholder="Nombre" autocomplete="off">
        
            <label for="apellido"></label>
            <input type="text" id="apellido" name="apellido" placeholder="Apellido" autocomplete="off">
        
            <label for="nombre"></label>
            <input type="text" id="nombre" name="nombre" placeholder="Nombre" autocomplete="off">
        
            <label for="telefono"></label>
            <input type="number" id="telefono" name="telefono" placeholder="Telefono" autocomplete="off">
        
            <label for="especialidad"></label>
            <input type="text" id="especialidad" name="especialidad" placeholder="Especialidad" autocomplete="off">
        
            <button type="summit" id="summit">
                <a href="panel_cosmetologo_admin.jsp">Agregar</a>
            </button> 
        </form>
    </div>
    </body>
</html>
