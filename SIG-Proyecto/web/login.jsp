<%-- 
    Document   : login
    Created on : 03-08-2019, 12:25:27 AM
    Author     : luigivis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="views/css/materialize.min.css"  media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="views/js/materialize.min.js"></script>

    <body>
        <style>
            body {
                background: #E3DFDE;
            }

            .content {
                max-width: 500px;
                top: 50%;
                margin: auto;
                padding: 3%;
            }
        </style>

        <script>
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(function (position) {
                    document.getElementById("geoLocation").value = position.coords.latitude + ", " + position.coords.longitude;
                }
                );
            }
        </script>

        <div class="content">
            <form action="login.jsp" method="POST">

                <div class="col s12 m6">
                    <div class="card white darken-1">
                        <div class="card-content blue-text">
                            <span class="card-title">Login, Direcciones de Ubicaciones</span>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">person</i>
                                <input type="text" id="autocomplete-input" class="autocomplete">
                                <label for="autocomplete-input">Usuario</label>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">lock</i>
                                <input type="password" id="autocomplete-input" class="autocomplete">
                                <label for="autocomplete-input">Contrasena</label>
                            </div>
                        </div>
                        <div class="card-action">
                            <button name="enviar" onclick="getLocation()" ><a>Ingresar</a></button>
                        </div>
                        <br>
                        <div class="divider"></div>
                        <p>No tienes una cuenta?<a href="">Registrate</a></p>      
                    </div>
                </div>    
                <input name="Location"type="hidden" id="geoLocation" >
            </form>
        </div> 
    </body>
</html>
