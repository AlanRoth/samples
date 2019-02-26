<%-- 
    Document   : multiply
    Created on : Feb 26, 2019, 12:26:02 PM
    Author     : asroth
--%>

<%@page import="java.math.BigDecimal"
        import="org.alan.roth.jsp.sample.Calculator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%
            BigDecimal value1 = new BigDecimal(request.getParameter("input1"));
            BigDecimal value2 = new BigDecimal(request.getParameter("input2"));    
        %>
        
        <%= Calculator.multiply(value1, value2) %>
    </body>   
</html>
