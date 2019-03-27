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
        session.setAttribute("Tipo",null);
        session.invalidate();
        response.sendRedirect("../home.html");
        %>
    </body>
</html>
