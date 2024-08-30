<%-- 
    Document   : panel_servicios_usuario
    Created on : 29/08/2024, 6:06:14 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="../css/css_usuario/panel_servicios_usuario.css"/>
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
                    <h2 class="h2_principal">Servicios</h2>
                    <p class="p_principal">Estos son los servicios especializados que te ofrecemos:</p>
                    <!-- acordeon desplegable -->
                    <div class="accordion" id="accordion">
                        <div class="card">
                            <div class="card-header" id="headingOne">
                                <h2 class="mb-0">
                                    <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                        Limpieza facial sencilla
                                    </button>
                                </h2>
                            </div>
                            <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                                <div class="card-body">
                                    <p>Diagnóstico</p>
                                    <p>Limpieza de cutis</p>
                                    <p>Exfoliación</p>
                                    <p>Mascarilla desincrustante</p>
                                    <p>Vaporización</p>
                                    <p>Extracción</p>
                                    <p>Mascarilla según tipo de piel</p>
                                    <p>Alta frecuencia</p>
                                    <p>Tónico</p>
                                    <p>Protector solar</p>
                                    <p>$ 70.000</p>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header" id="headingTwo">
                                <h2 class="mb-0">
                                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                        Limpieza facial profunda
                                    </button>
                                </h2>
                            </div>
                            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                                <div class="card-body">
                                    <p>Diagnóstico</p>
                                    <p>Limpieza de cutis</p>
                                    <p>Exfoliación</p>
                                    <p>Microdermoabrasión</p>
                                    <p>Mascarilla desincrustante</p>
                                    <p>Vaporización</p>
                                    <p>Extracción</p>
                                    <p>Mascarilla según tipo de piel</p>
                                    <p>Alta frecuencia</p>
                                    <p>Fototerapia</p>
                                    <p>Tónico</p>
                                    <p>Protector solar</p>
                                    <p>$ 90.000</p>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="card-header" id="headingThree">
                                <h2 class="mb-0">
                                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                        Limpieza facial con plasma rico en plaquetas
                                    </button>
                                </h2>
                            </div>
                            <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                                <div class="card-body">
                                    <p>Diagnóstico</p>
                                    <p>Limpieza de cutis</p>
                                    <p>Exfoliación</p>
                                    <p>Microdermoabrasión</p>
                                    <p>Mascarilla desincrustante</p>
                                    <p>Vaporización</p>
                                    <p>Extracción</p>
                                    <p>Mascarilla según tipo de piel</p>
                                    <p>Plasma rico en plaquetas</p>
                                    <p>Mascarilla descongestionante</p>
                                    <p>Alta frecuencia</p>
                                    <p>Fototerapia</p>
                                    <p>Tónico</p>
                                    <p>Protector solar</p>
                                    <p>$ 120.000</p>
                                </div>
                            </div>
                        </div>
                    </div>                    
                </div>
            </div>
        </main>
    </div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
   
</body>
</html>
