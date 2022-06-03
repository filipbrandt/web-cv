<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<%--    <link rel="stylesheet" href="style.css">--%>
    <title>Document</title>
</head>
<body>
<%@ page import="com.example.cv02.Adresa" %>
<form class="form" action="/AdresaServelt" method="post">
    <div class="form-group">
        <label>Meno</label>
        <input id="meno" type="text" class="form-control" placeholder="Jožko" name="meno">
    </div>
    <div class="form-group">
        <label>Priezvisko</label>
        <input id="priezvisko" type="text" class="form-control" placeholder="Mrkvička" name="priezvisko">
    </div>
    <button class="btn btn-primary" type="submit">Pridaj užívatela</button>
</form>
</body>
</html>