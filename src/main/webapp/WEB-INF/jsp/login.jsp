<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div>
		<h1>Login</h1>
     </div>
    <c:if test="${not empty param.login_error}">
    	<p class="">
        Your login attempt was not successful, try again.<br/><br/>
        Reason: <c:out value="${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}"/>.
        </p>
    </c:if>
    <div>
    <div>
    <form id="loginForm" action="<c:url value="/j_spring_security_check" />" method="POST">
		<ul>
			<li>	
				<label for="username">Nombre de usuario:</label>
			    <input type="text" name="j_username" id="username" value="${sessionScope.SPRING_SECURITY_LAST_USERNAME}"  />
		    </li>
		   <li>
				<label for="password">Password:</label>
				<input type="password" name="j_password" id="password" value="">		 
		 	</li>
		 	<li>
			 	<input type="checkbox" name="_spring_security_remember_me" id="remember_me" />
				<label for="remember_me">Recordarme en este dispositivo</label>
		 	</li>
		</ul>
		<fieldset>
			<%--
			<c:url value="/index.jsp" var="cancelDestination" scope="page" />
			<div class="ui-block-a"><a href="${cancelDestination }" data-theme="a" data-role="button">Cancel</a></div>
			 --%>
			<div class="ui-block-b"><input type="submit" value="Login"></div>
		</fieldset>
	</form>
	</div>
	</div>
</body>
</html>