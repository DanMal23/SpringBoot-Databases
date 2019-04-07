<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>SpringBootApp</title>
<style>
body {background: #e8e0da;
	 color: #272b33;
	 padding: 10px;
	 padding-left: 50px;}
table, td, th{font-family: calibri;
        border: 1px solid gray;
		text-align: left;
        padding: 5px;}
</style>
</head>
<body>
<h3 style="font-style:italic;"><font color=#50545e> Samling av setninger: </font></h3>
<table cellpadding="5">
<tr>
    <th>...</th>
	<th>norsk</th>
	<th>engelsk</th>
	<th></th>
</tr>
   <c:forEach var = "list" items = "${lists}">
  <tr>
  <td>${list.id}</td>
  <td>${list.norsk}</td>
  <td>${list.engelsk}</td>
  <td><a href="/delete/${list.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
<hr/>
<form method="post" action="/save">
<input type="hidden" name="id" value=""/>
 <h4> norsk:
  <input type="text" name="norsk" size="32"/>
  >>> engelsk:
  <input type="text" name="engelsk" size="32" >
  <br><br>
  <input type="submit" value="Submit"> </h4>
</form>
</body>
</html>