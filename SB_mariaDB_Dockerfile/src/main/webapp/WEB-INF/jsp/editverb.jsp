<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<style>
body {background: url(http://image.freepik.com/free-vector/free-photo/weathered-blue-page_53876-88602.jpg);
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
<a  href="/table"><font color="00ff9d">| Tilbake | </font></a>
 	<div class="form-container">

 	<h2>Korrigere verbene</h2>

	<form:form method="POST" modelAttribute="verb"  class="form-horizontal" action="/editsave">

<div class="row">
			<div class="form-group col-md-8">
				<label class="col-md-8 control-lable" for="norsk"></label>
				<div class="col-md-6">
					<form:hidden path="id"  class="form-control input-sm"/>

				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-8">
				<label class="col-md-8 control-lable" for="norsk">norsk</label>
				<div class="col-md-6">
					<form:input type="text" path="norsk" id="norsk" class="form-control input-sm"/>

				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-8">
				<label class="col-md-8 control-lable" for="engelsk">engelsk</label>
				<div class="col-md-6">
					<form:input type="text" path="engelsk" id="engelsk" class="form-control input-sm"/>

				</div>
			</div>
		</div>


		<div class="row">
			<div class="form-group col-md-8">
				<label class="col-md-8 control-lable" for="preteritum">setning i preteritum</label>
				<div class="col-md-6">
					<form:input type="text" path="preteritum" id="preteritum" class="form-control input-sm" size="46"/>

				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-8">
				<label class="col-md-auto control-lable" for="perfektum">setning i perfektum</label>
				<div class="col-md-6">
					<form:input type="text" path="perfektum" id="perfektum" class="form-control input-sm" size="46"/>

				</div>
			</div>
		</div>

<br><br>
		<div class="row">
			<div class="form-actions float-right">
				<input type="submit" value="Rediger" class="btn btn-primary btn-sm">
			</div>
		</div>
	</form:form>
	</div>
</body>
</html>