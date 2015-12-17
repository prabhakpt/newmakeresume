
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <spring:hasBindErrors name="userLogin">
    	<c:forEach items="${errors.globalErrors}" var="errorMess">
    	has bing errors
            <div id="errors" class="errors">
                    <c:out value="${errorMess.defaultMessage}" />
            </div>
        </c:forEach>
    </spring:hasBindErrors>
<form:form action="login" method="POST" commandName="userLogin">
	UserName: <form:input path="userName"/>
	<form:errors path="userName" cssClass="error"></form:errors>
	<br>
	Password: <form:password path="password"/>
	<form:errors path="password" cssClass="error"></form:errors>
	
	<input type="submit" value="Login"/>
	
</form:form>
</body>
</html>