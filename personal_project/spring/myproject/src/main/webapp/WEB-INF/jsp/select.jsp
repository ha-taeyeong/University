<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th {
            border: 2px solid black; /* 헤더 셀은 두꺼운 실선 */
            background-color: #f2f2f2;
            padding: 8px;
        }
        td {
            border: 1px dotted gray; /* 본문 셀은 점선 */
            padding: 8px;
        }
    </style>
</head>
<body>
    <h1>User List</h1>
    
	<!-- 이름으로 검색 -->
	<form action="/users/searchByName" method="get">
	    <input type="text" name="name" placeholder="Search by Name" />
	    <button type="submit">Search by Name</button>
	</form>
	
	<!-- 이메일로 검색 -->
	<form action="/users/searchByEmail" method="get">
	    <input type="text" name="email" placeholder="Search by Email" />
	    <button type="submit">Search by Email</button>
	</form>

    <!-- Add User button -->
    <br><br>
    <a href="/users/insert">Add New User</a>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
        
        <!-- Loop through the list of users and create a table row for each -->
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>
                    <!-- Edit button -->
                    <a href="/users/update/${user.id}">Edit</a> |
                    <!-- Delete button -->
                    <a href="/users/delete/${user.id}" onclick="return confirm('Are you sure you want to delete this user?');">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

