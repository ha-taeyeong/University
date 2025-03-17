<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update User</title>
</head>
<body>
    <h1>Update User</h1>
    <form action="/users/update/${user.id}" method="post">
        Name: <input type="text" name="name" value="${user.name}" required><br>
        Email: <input type="email" name="email" value="${user.email}" required><br>
        <button type="submit">Update</button>
    </form>
    <a href="/users/select">Go to User List</a>
</body>
</html>
