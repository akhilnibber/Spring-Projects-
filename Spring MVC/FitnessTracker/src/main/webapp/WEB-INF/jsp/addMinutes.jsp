<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>

<title>Add Minutes Page</title>
</head>
<body>
<h1>Add Minutes Exercised</h1>
Language:<a href="?language=en">English</a>|<a href="?language=es">Spanish</a>
<form:form modelAttribute="exercise">
<table>
  <tr>
     <td></td>
     <td><spring:message code="goal.text"/><form:input path="minutes"/></td> <!-- minutes same as model -->
    </tr>
    <tr>
       <td colspan="2">
          <input type="submit" value="Enter"/>
          </td>
    </tr> 
    
</table>
<h1>${goal.minutes}</h1>
</form:form>
</body>
</html>