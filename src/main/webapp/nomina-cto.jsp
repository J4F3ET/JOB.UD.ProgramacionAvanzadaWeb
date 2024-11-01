<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Nomina" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nomina CTO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./style.css">
</head>
<body>
    <section class="section_form_area">
    <div class="container">
        <div class="form_area">
            <p class="title">Formulario de nomina</p>
            <form id="form" action="nomina-cto" method="post">
                <div class="form_group">
                    <label class="sub_title" for="nombre">Nombre:</label>
                    <input required placeholder="Ingresa tu nombre" class="form_style" id="nombre" type="text" name="nombre">
                </div>
                <div class="form_group">
                    <label class="sub_title" for="identificacion">Identificacion:</label>
                    <input required placeholder="Ingresa tu identificacion" class="form_style" id="identificacion" type="text" name="identificacion">
                </div>
                <div class="form_group">
                    <label class="sub_title" for="salario">Salario básico:</label>
                    <select required class="form_style" id="salario" name="salario">
                        <option selected value="0">$ 1.300.000</option>
                        <option value="1">$ 1.500.000</option>
                        <option value="2">$ 2.000.000</option>
                        <option value="3">$ 2.500.000</option>
                        <option value="4">$ 3.000.000</option>
                    </select>
                </div>
                <div class="form_group">
                    <label class="sub_title" for="dias">Dias:</label>
                    <input required  placeholder="Ingresa los dias laborados" min="1" max="30" class="form_style" id="dias" type="number" name="dias">
                </div>
                <div class="form_group">
                    <input id="submit" class="btn calc" type="submit" value="Calcular">
                </div>
            </form>
        </div>
    </div>
    </section>
    <section class="section_result_area">
        <div class="result_area">
            <p class="title">  Resultado</p>
            <div id="result-container" class="container"></div>
            <table class="result-table">
                <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Identificación</th>
                    <th>Salario Básico</th>
                    <th>Días Trabajados</th>
                    <th>Auxilio de Transporte</th>
                    <th>Descuento por Salud</th>
                    <th>Descuento por Pensión</th>
                    <th>Nómina</th>
                </tr>
                </thead>
            <%
                HashMap<String, Nomina> nominaMap = (HashMap<String, Nomina>) request.getAttribute("nominaMap");
                if (nominaMap != null) {
            %>

                <tbody class="result-table-row">
                <% for (Map.Entry<String, Nomina> entry : nominaMap.entrySet()) {
                    Nomina nomina = entry.getValue();
                    String nombre = entry.getKey();
                %>
                <tr id="<%=  nombre %>">
                    <td class="result-table-cell"><%= nomina.getNombre() %></td>
                    <td class="result-table-cell"><%= nomina.getId() %></td>
                    <td class="result-table-cell">$ <%= nomina.getSalarioBasico() %></td>
                    <td class="result-table-cell"><%= nomina.getDias() %></td>
                    <td class="result-table-cell">$ <%= nomina.getAuxilioTransporte() > 0 ? nomina.getAuxilioTransporte() : "NA" %></td>
                    <td class="result-table-cell">$ <%= nomina.getSalud() %></td>
                    <td class="result-table-cell">$ <%= nomina.getPension() %></td>
                    <td class="result-table-cell">$ <%= nomina.calcularSalario() %></td>
                </tr>
                <% } %>
                </tbody>

            <%
            } else {
            %>
            <tr>
            </tr>
            <%
                }
            %>
            </table>
            <button id="clear" data-url="<%= request.getContextPath() %>/nomina-cto" class="btn clear">Limpiar</button>
        </div>
    </section>
    <script src="./app.js"></script>
</body>
</html>