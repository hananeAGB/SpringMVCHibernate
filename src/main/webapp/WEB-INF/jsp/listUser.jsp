<%-- 
    Document   : webjsp
    Created on : 15 janv. 2019, 12:11:33
    Author     : admin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Person Page</title>
      <style type="text/css">
            .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
            .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
            .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
            .tg .tg-4eph{background-color:#f9f9f9}
       </style>
    </head>
    <body>
        <h1>
           Gestion des utilisateurs :
        </h1>

        <!-- c:url var="addAction" value="/utilisateur/add"  c:url -->

        <form:form method="POST" action="/PosUserProject/addUser" modelAttribute="utillisateur">

            <table>
                <c:if test="${!empty utilisateur.nom}">
                    <tr>
                        <td>
                            id Utilisateur :</td> <td>
                            <input type="text" path="id"></td>

 </tr> <tr>
                        <td>

                            Nom :</td> <td>
                            <input type="text" path="nom"></td>

                    </tr>
                </c:if>
                <tr>

                    <td>
                        prenom :</td> <td>
                        <input type="text" path="prenom"></td>


                </tr>
                <tr>

                    <td>
                        profession :</td> <td>
                        <input type="text" path="profession"></td>



                </tr>
                <tr>
                    <td colspan="2">
                <c:if test="${!empty utilisateur.nom}">
                    <input type="submit"
                           value="<spring:message text="Modifier un Utilisateur"/>" />
                </c:if>
                <c:if test="${empty utilisateur.nom}">
                    <input type="submit"
                           value="<spring:message text="Ajouter un Utilisateur"/>" />
                </c:if>
            </td>
        </tr>
    </table>	
</form:form>
<br>
<h3>List des utilisateurs :</h3>
<c:if test="${!empty listPersons}">
    <table class="tg">
        <tr>
            <th width="80"> ID</th>
            <th width="120">Nom</th>
            <th width="120">Prenom</th>
            <th width="120">Profession</th>
            <th width="60">Modifier</th>
            <th width="60">Supprimer</th>
        </tr>
        <c:forEach items="${listPersons}" var="utilisateur">
            <tr>
                <td>${utilisateur.idUser}</td>
                <td>${utilisateur.nom}</td>
                <td>${utilisateur.prenom}</td>
                <td>${utilisateur.profession}</td>
                <td><a href="<c:url value='/edit/${utilisateur.idUser}' />" >Modifier</a></td>
                <td><a href="<c:url value='/remove/${utilisateur.idUser}' />" >Supprimer</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>