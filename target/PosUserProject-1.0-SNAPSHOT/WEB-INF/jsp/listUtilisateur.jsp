<%-- 
    Document   : listUtilisateur
    Created on : 12 janv. 2019, 15:20:02
    Author     : admin
--%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    
                    
                    <th>Id utilisateur :</th>
                    <th>Nom :</th>
                    <th>Prenom :</th>
                    <th>Profession :</th>
                    <th>Photo :</th>
                    
                    <th>${nom}</th> 
                    <th>${user.nom}</th> 
                    
    </tr>
</thead>
<tbody>
   
</tbody>
</table>
</body>
</html>

