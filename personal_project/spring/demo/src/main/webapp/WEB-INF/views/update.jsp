<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update User</title>
</head>
<body>
    <h1>Update User</h1>
    <form action="/users/update/${user.id}" method="POST">
        Name: <input type="text" name="name" value="${user.name}" required><br>
        Age: <input type="number" name="age" value="${user.age}" required><br>
        <input type="submit" value="Update User">
    </form>
    <br>
    <a href="/users">Back to User List</a>
</body>
</html>

