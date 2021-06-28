<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Index</title>
</head>
<body>
  <div class="form-group row">
    <div class="col-sm-10">
    <h1> <b>Usuario</b>  </h1>
     <a href="${pageContext.request.contextPath}/usuarioRegistro.jsp" class="btn btn-primary">Registrar Usuario</a>
     <a href="${pageContext.request.contextPath}/usuarioList.jsp" class="btn btn-primary">Lista Usuario</a>
     <h1><b>Token</b></h1>
     <a href="${pageContext.request.contextPath}/tokenList.jsp" class="btn btn-primary">Lista Token</a>
     <h1><b>Reporte</b></h1>
     <a href="${pageContext.request.contextPath}/reporteList.jsp" class="btn btn-primary">Lista Reporte</a>
    </div>
</body>
</html>