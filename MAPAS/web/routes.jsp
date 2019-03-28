<%-- 
    Document   : routes
    Created on : Mar 12, 2019, 12:44:25 AM
    Author     : Semantic UI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAyJ-MhZFGOlAgf1XpifPw0cbhnTponCnI&callback=initMap"></script>
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

    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta charset="utf-8">
        <title>Ruta deseada</title>
        <style>
            /* Always set the map height explicitly to define the size of the div
           * element that contains the map. */
            #map {
                height: 100%;
            }

            /* Optional: Makes the sample page fill the window. */
            html,
            body {
                height: 100%;
                margin: 0;
                padding: 0;
            }

            #floating-panel {
                position: absolute;
                top: 10px;
                left: 25%;
                z-index: 5;
                background-color: #fff;
                padding: 5px;
                border: 1px solid #999;
                text-align: center;
                font-family: 'Roboto', 'sans-serif';
                line-height: 30px;
                padding-left: 10px;
            }
        </style>
    </head>

    <body>
        <div id="map"></div>

        <script>

            function initMap() {
                var pointA = new google.maps.LatLng(${Location}),
                        pointB = new google.maps.LatLng(<%= request.getParameter("coordenadas").toString()%>),
                        myOptions = {
                            zoom: 7,
                            center: pointA
                        },
                        map = new google.maps.Map(document.getElementById('map'), myOptions),
                        // Instantiate a directions service.
                        directionsService = new google.maps.DirectionsService,
                        directionsDisplay = new google.maps.DirectionsRenderer({
                            map: map
                        }),
                        markerA = new google.maps.Marker({
                            position: pointA,
                            title: "point A",
                            label: "A",
                            map: map
                        }),
                        markerB = new google.maps.Marker({
                            position: pointB,
                            title: "point B",
                            label: "B",
                            map: map
                        });

                // get route from A to B
                calculateAndDisplayRoute(directionsService, directionsDisplay, pointA, pointB);

            }



            function calculateAndDisplayRoute(directionsService, directionsDisplay, pointA, pointB) {
                directionsService.route({
                    origin: pointA,
                    destination: pointB,
                    travelMode: google.maps.TravelMode.DRIVING
                }, function (response, status) {
                    if (status == google.maps.DirectionsStatus.OK) {
                        directionsDisplay.setDirections(response);
                    } else {
                        window.alert('Directions request failed due to ' + status);
                    }
                });
            }

            initMap();
        </script>

    </body>

</html>
