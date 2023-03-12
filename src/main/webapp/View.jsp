<%@ page import="ClassModel.Model" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/03/2023
  Time: 00:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ClassModel.Model" %>
<html>
<head>
    <title>Calcul-Credit</title>
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<nav  class="Navigation" > Simulation de Credit  </nav>
<body>
<% Model monMod = new Model();%>
<% monMod=(Model)request.getAttribute("BanqueModel") ;%>
<% if(monMod==null){
    monMod = new Model();
}%>

<div  id="01">
        <form action="CalculCredit.php" method="post" >
    <table>
    <tr>
        <td id="m">Montant </td>
        <td> <input type="text" name="Montant" value="<%=monMod.getCapital()%>"></td>
    </tr>

    <tr>
        <td id="T">Taux </td>
        <td> <input type="text" name="Taux" value="<%=monMod.getTaux()%>"></td>
    </tr>

    <tr>
        <td id="D">Duree</td>
        <td> <input type="text" name="Duree" value="<%=monMod.getDuree()%>"></td>
    </tr>
    </table>
    <button  id="Button" type="submit" value="Calculer">Calculer</button>
</form>
</div>
<div id="Men">
    Mensualite = <%=monMod.getMensualite() %>
</div>


</body>
</html>
