<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World From Struts2</h1>
	   <form action="crearUsuario">
	   
	      <label for="username">Username</label>
	      <input type="text" name="username"/><br/>
	      
	      <label for="password">Password</label>
	      <input type="password" name="password"/><br/>
	      
	      <label for="nombre">Name</label>
	      <input type="text" name="nombre"/><br/>
	      
	      <label for="apePat">Last Name 1</label>
	      <input type="text" name="apePat"/><br/>
	      
	      <label for="apeMat">Last Name 2</label>
	      <input type="text" name="apeMat"/><br/>
	      
	      <input type="submit" value="Create user"/>
	   </form>
</body>
</html>