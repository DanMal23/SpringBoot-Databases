<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>SpringBootApp-SterkeVerb</title>
<style>
body {background: #f7efe6;
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
<h3 style="font-style:italic;"><font color=#5b544c> Samling av sterke verb: </font></h3>
<table cellpadding="5">
<tr>
    <th>...</th>
	<th>Infinitiv</th>
	<th>Presens</th>
	<th>Preteritum</th>
	<th>Perf particip</th>
	<th>engelsk</th>
	<th></th>
</tr>
   <c:forEach var = "list" items = "${lists}">
  <tr>
  <td>${list.id}</td>
  <td>${list.infinitiv}</td>
  <td>${list.presens}</td>
  <td>${list.preteritum}</td>
  <td>${list.perfektum_partisipp}</td>
  <td>${list.engelsk}</td>
  <td><a href="/delete/${list.id}">slette</a></td>
</tr>
</c:forEach>
</table>
<hr/>
<form method="post" action="/save">
<input type="hidden" name="id" value=""/>
 <h4> infinitiv:
  <input type="text" name="infinitiv"  size="6"/>
  presens:
  <input type="text" name="presens" size="6">
  preteritum:
    <input type="text" name="preteritum" size="6"/>
  perfektum_partisipp:
     <input type="text" name="perfektum_partisipp" size="6">
  engelsk:
    <input type="text" name="engelsk" size="10">
  <br><br>
  <input type="submit" value="Submit"> </h4>
</form>
</body>
</html>