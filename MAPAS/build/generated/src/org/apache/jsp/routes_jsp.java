package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class routes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Directions Service</title>\n");
      out.write("    <style>\n");
      out.write("        /* Always set the map height explicitly to define the size of the div\n");
      out.write("       * element that contains the map. */\n");
      out.write("        #map {\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Optional: Makes the sample page fill the window. */\n");
      out.write("        html,\n");
      out.write("        body {\n");
      out.write("            height: 100%;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #floating-panel {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 10px;\n");
      out.write("            left: 25%;\n");
      out.write("            z-index: 5;\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 5px;\n");
      out.write("            border: 1px solid #999;\n");
      out.write("            text-align: center;\n");
      out.write("            font-family: 'Roboto', 'sans-serif';\n");
      out.write("            line-height: 30px;\n");
      out.write("            padding-left: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <button onclick=\"getLocation()\">Try It</button>\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("    <script>\n");
      out.write("        function initMap() {\n");
      out.write("\n");
      out.write("            function getLocation() {\n");
      out.write("                if (navigator.geolocation) {\n");
      out.write("                    navigator.geolocation.getCurrentPosition(showPosition);\n");
      out.write("                } else {\n");
      out.write("                    x.innerHTML = \"Geolocation is not supported by this browser.\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function showPosition(position) {\n");
      out.write("                x.innerHTML = position.coords.latitude + \", \"\n");
      out.write("                    + position.coords.longitude;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            var pointA = new google.maps.LatLng(12.149603, -86.283036),\n");
      out.write("                pointB = new google.maps.LatLng(12.1503526, -86.1754945),\n");
      out.write("                myOptions = {\n");
      out.write("                    zoom: 7,\n");
      out.write("                    center: pointA\n");
      out.write("                },\n");
      out.write("                map = new google.maps.Map(document.getElementById('map'), myOptions),\n");
      out.write("                // Instantiate a directions service.\n");
      out.write("                directionsService = new google.maps.DirectionsService,\n");
      out.write("                directionsDisplay = new google.maps.DirectionsRenderer({\n");
      out.write("                    map: map\n");
      out.write("                }),\n");
      out.write("                markerA = new google.maps.Marker({\n");
      out.write("                    position: pointA,\n");
      out.write("                    title: \"point A\",\n");
      out.write("                    label: \"A\",\n");
      out.write("                    map: map\n");
      out.write("                }),\n");
      out.write("                markerB = new google.maps.Marker({\n");
      out.write("                    position: pointB,\n");
      out.write("                    title: \"point B\",\n");
      out.write("                    label: \"B\",\n");
      out.write("                    map: map\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            // get route from A to B\n");
      out.write("            calculateAndDisplayRoute(directionsService, directionsDisplay, pointA, pointB);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        function calculateAndDisplayRoute(directionsService, directionsDisplay, pointA, pointB) {\n");
      out.write("            directionsService.route({\n");
      out.write("                origin: pointA,\n");
      out.write("                destination: pointB,\n");
      out.write("                travelMode: google.maps.TravelMode.DRIVING\n");
      out.write("            }, function (response, status) {\n");
      out.write("                if (status == google.maps.DirectionsStatus.OK) {\n");
      out.write("                    directionsDisplay.setDirections(response);\n");
      out.write("                } else {\n");
      out.write("                    window.alert('Directions request failed due to ' + status);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        initMap();\n");
      out.write("    </script>\n");
      out.write("    <script async defer src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAyJ-MhZFGOlAgf1XpifPw0cbhnTponCnI&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
