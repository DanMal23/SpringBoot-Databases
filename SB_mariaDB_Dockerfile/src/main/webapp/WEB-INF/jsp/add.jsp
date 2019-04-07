<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<style>
body {background: url(http://image.freepik.com/free-photo/weathered-blue-page_53876-88602.jpg);
        background-size: 100% ;
	 color: #ddc8be;
	 padding: 10px;
	 padding-left: 50px;}
	 a {text-decoration: none; }
</style>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Sterke Verb</title>
</head>

<body>
<a  href="/"><font color="00ff9d">| Tilbake | </font></a>
<a href="/table"><font color="00ff9d">| Se bordet |</font></a>

<br><br>
 	<div class="form-container">

 	<h1>Sterke verb</h1>

	<form:form method="POST" modelAttribute="verb" class="form-horizontal" action="save">


		<div class="row">
			<div class="form-group col-md-10">
				<label class="col-md-8 control-lable" for="norsk">norsk</label>
				<div class="col-md-6">
					<form:input type="text" path="norsk" id="norsk" class="form-control input-sm"/>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-10">
				<label class="col-md-8 control-lable" for="engelsk">engelsk</label>
				<div class="col-md-6">
					<form:input type="text" path="engelsk" id="engelsk" class="form-control input-sm"/>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-10">
				<label class="col-md-12 control-lable" for="preteritum">skriv setning i preteritum</label>
				<div class="col-md-12">
					<form:input type="text" path="preteritum" id="preteritum" class="form-control input-sm" size="36"/>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-8">
				<label class="col-md-12 control-lable" for="perfektum">skriv setning i perfektum</label>
				<div class="col-md-12">
					<form:input type="text" path="perfektum" id="perfektum" class="form-control input-sm" size="36"/>
				</div>
			</div>
		</div>
<br><br>
		<div class="row">
			<div class="form-actions float-right">
				<input type="submit" value="Legg til" class="btn btn-primary btn-sm">
			</div>
		</div>
	</form:form>
	</div>
<br><br>
<!--
<a href="/table"<h4>Se bordet</a>
<br><br>
<a  href="/"><h4>Tilbake</h4></a>
-->
</body>
</html>