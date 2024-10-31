<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nomina CTO</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
    <section class="section_form_area">
    <div class="container">
        <div class="form_area">
            <p class="title">Formulario de nomina</p>
            <form id="form" action="nomina-cto" method="post">
                <div class="form_group">
                    <label class="sub_title" for="nombre">Nombre:</label>
                    <input placeholder="Ingresa tu nombre" class="form_style" id="nombre" type="text" name="nombre">
                </div>
                <div class="form_group">
                    <label class="sub_title" for="identificacion">Identificacion:</label>
                    <input placeholder="Ingresa tu identificacion" class="form_style" id="identificacion" type="text" name="identificacion">
                </div>
                <div class="form_group">
                    <label class="sub_title" for="salario">Salario:</label>
                    <select class="form_style" id="salario" name="salario">
                        <option selected value="0">$ 1.300.000</option>
                        <option value="1">$ 1.500.000</option>
                        <option value="2">$ 2.000.000</option>
                        <option value="3">$ 2.500.000</option>
                        <option value="4">$ 3.000.000</option>
                    </select>
                </div>
                <div class="form_group">
                    <label class="sub_title" for="dias">Dias:</label>
                    <input placeholder="Ingresa los dias laborados" min="1" max="30" class="form_style" id="dias" type="number" name="dias">
                </div>
                <div class="form_group">
                    <input id="submit"  class="btn calc" type="submit" value="Calcular">
                    <input class="btn clear" type="reset" value="Limpiar">
                </div>
            </form>
        </div>
    </div>
    </section>
    <section class="section_result_area">
        <div class="container">
            <div class="result">
                <p class="title">Resultado</p>
                <p id="result"></p>
            </div>
        </div>
    </section>
    <script src="./js/app.js"></script>
</body>
</html>