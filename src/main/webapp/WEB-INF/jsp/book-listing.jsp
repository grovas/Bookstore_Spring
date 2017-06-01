<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pl">
<head>
    <title>Title</title>
</head>
<body>
<p>Time: ${time} </p>
<p>Listing: ${listing}</p>
<p>Total books: ${listing.count}</p>
<table>
    <thead>

    <tr>
        <th>Tytuł</th>
        <th>Author</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listing.books}" var="book">
        <tr>
            <td><c:out value="${book.title}"/> </td>
            <td><c:out value="${book.author}"/> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
