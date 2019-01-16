<%-- 
    Document   : CreateUser
    Created on : 12 janv. 2019, 16:20:02
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form method="POST" action="/PosUserProject/addUser" modelAttribute="utillisateur">
            <table>
                <tr>
                    <td>Photo:</td> <td><input type="file" accept="image/*" name="photo"/>
                    </td>

                </tr>
                <tr>
                    <td>Nom :</td><td><input type="text" name="nom"/></td>

                </tr>
                <tr>
                    <td>Prenom :</td><td><input type="text" name="prenom"/></td>

                </tr>
                <tr>
                    <td>Profession :</td><td><input type="text" name="profession"/></td>

                </tr>



                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>

        </form:form>
    </body>
    <!--
                   <td>:label path="profession">
                     Profession :/form:label></td>
                   <td>orm:select items="$ofessions}" path="profession"/></td>
    -->
</html>
