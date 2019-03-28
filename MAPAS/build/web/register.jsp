<%-- 
    Document   : register
    Created on : 03-14-2019, 02:04:02 AM
    Author     : luigivis
--%>

<!DOCTYPE html>
<!-- saved from url=(0043)https://semantic-ui.com/examples/login.html -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Standard Meta -->

        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

        <!-- Site Properties -->
        <title>Registrese-SIG</title>

        <script src='style/js/jquery-3.3.1.js' type="text/javascript"></script>
        <script  src="style/js/botones_function.js" type="text/javascript"></script>
        <script src="style/js/semantic.js" type="text/javascript"></script>
        <script src="style/js/semantic.min.js"></script>
        <script src="style/datatable/dataTables.semanticui.min.js"
        type="text/javascript"></script>
        <script src="style/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="style/datatable/jquery.dataTables.min.js"
        type="text/javascript"></script>

        <script src="style/datatable/dataTables.semanticui.min.js"
        type="text/javascript"></script>

        <link rel='stylesheet prefetch' href='style/css/components/icon.min.css'>
        <link rel='stylesheet prefetch' href='style/css/semantic.css'>
        <link rel='stylesheet prefetch' href='style/css/dataTables.semanticui.min.css'>
        <link rel="shortcut icon" href="style/image/comusol_logo.jpg">

    </head>
    <style type="text/css">
        body {
            background-image: url("style/images/fondo.jpg");
        }
        body > .grid {
            height: 100%;
        }
        .image {
            margin-top: -100px;
        }
        .column {
            max-width: 450px;
        }
    </style>

    <body>

        <div class="ui middle aligned center aligned grid">
            <div class="column">
                <h2 class="ui teal image header">
                    <div class="content">
                        Sistema de informacion geograficos - Registro
                    </div>
                </h2>

                <form class="ui large form" method="POST" action="register">
                    <div class="ui stacked segment">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="user icon"></i>
                                <input type="text" name="username" placeholder="Usuario">
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="lock icon"></i>
                                <input type="password" name="password" placeholder="Password">
                            </div>
                        </div>
                    </div>

                    <button class="ui fluid large teal submit button"> 
                        Guardar
                    </button>
                </form>
                <br>
                <button class="ui fluid large red submit button"> 
                        Cancelar
                    </button>

                <c:if test="${not empty error}">
                    ${error}
                </c:if> 


            </div>
        </div>




    </body>
</html>