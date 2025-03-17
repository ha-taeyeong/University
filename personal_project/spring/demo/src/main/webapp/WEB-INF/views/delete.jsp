<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
    <h1>Are you sure you want to delete user ${user.name}?</h1>
    <form action="/users/delete/${user.id}" method="POST">
        <input type="submit" value="Delete User">
    </form>
    <br>
    <a href="/users">Back to User List</a>
</body>
</html>
