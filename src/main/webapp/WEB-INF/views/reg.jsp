<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Your Profile</h1>
    account:<c:out value="${m.account}" /><br/>
  </body>
</html>
