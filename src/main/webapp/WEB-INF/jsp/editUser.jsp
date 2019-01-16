<%-- 
    Document   : editUser
    Created on : 12 janv. 2019, 18:02:38
    Author     : admin
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Insert title here</title>
        </head>
        <body>

            <h1>Modifier Profil</h1>
            
        <form:form method="POST" action="/PosUserProject/editUser" modelAttribute="utillisateur">
            <table>
                <tr>
                    <td>Photo:</td> <td><input type="file" name="photo" accept="image/*"/>
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
        
    </html>