<%-- 
    Document   : logoff
    Created on : 05/08/2018, 17:23:54
    Author     : Ebrahin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Logoff ::</title>
    </head>
    <body>
        <%        
        request.getSession().removeAttribute("usuario");
        request.getSession().invalidate();
        response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 
        response.setDateHeader ("Expires", 0); //prevents caching at the proxy server 
        response.sendRedirect("../index.html");
        %>
    </body>
</html>
