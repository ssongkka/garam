<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
<script>
	var message = '${msg}';
	console.log("messagemessage   " + message);
	var retrun = '${url}';
	console.log(message);
	alert(message);
	window.location.replace("${pageContext.request.contextPath}" + retrun);
</script>
</html>