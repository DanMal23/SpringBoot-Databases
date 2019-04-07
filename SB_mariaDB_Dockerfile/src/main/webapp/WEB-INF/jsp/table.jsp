<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<style>
body {background: url(http://image.freepik.com/free-photo/weathered-blue-page_53876-88602free-photo/weathered-blue-page_53876-88602.jpg);
        background-size: 100% ;
	 color: #ddc8be;
	 padding: 10px;
	 padding-left: 50px;}
a {text-decoration: none; }
</style>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

</head>
<body>
<th>
<a  href="/add" ><h4><font color="00ff9d">| Tilbake |</font></h4></a>

</th>
<h2 align="center">Sterke Verb Liste</h2>
<table id="t2" cellpadding="2">
<tr>

</tr>
</table>
<table >
<tr>

  <th>Nummer på siden :
<c:forEach var="count" items="${pageCount}"  varStatus="theCount">
<a align="right" href="/table/${theCount.count}"><font color="00ff9d">${theCount.count}</font></a>
</c:forEach>
</th>

</tr>

</table>

<form:form  class="form-horizontal" >
<table id="t1" border="2" width="85%" cellpadding="2">
<tr><th>id</th>
<th>norsk</th>
<th>engelsk</th>
<th>setning i preteritum</th>
<th>setning i perfektum partisipp</th>

<th>rediger</th><th>slett</th></tr>

   <c:forEach var="verb" items="${list}">
   <tr>
   <td>${verb.id}</td>
   <td>${verb.norsk}</td>
   <td>${verb.engelsk}</td>
   <td>${verb.preteritum}</td>
   <td>${verb.perfektum}</td>

   <td><a href="/editverb/${verb.id}"><font color="00ff9d">Edit</font></a></td>
   <td><a href="/deleteverb/${verb.id}"><font color="00ff9d">Delete</font></a></td>
   </tr>
   </c:forEach>

   </table>
   <br/>

   </form:form>
</body>
</html>