<%-- 
    Document   : firstjsp
    Created on : May 16, 2024, 4:42:54 PM
    Author     : ducha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%!
        int id=0;
        public double dt(double dai, double rong){
            return dai+rong;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.println("Hello from scriptlet</br>");
        %>
    </body>
</html>
