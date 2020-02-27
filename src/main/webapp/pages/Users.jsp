<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Article List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <h2>Users List</h2>
  <table class="table table-striped">
   <thead>
    <th scope="row">#ID</th>
    <th scope="row">Firstname</th>
    <th scope="row">Lastname</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${ usersList }" var="user" >
     <tr>
      <td>${User.User_Id }</td>
      <td>${User.Firstname}</td>
      <td>${User.Lastname }</td>
      <td>
       <spring:url value="/user/updateUser/${user.User_Id}" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/user/deleteUser/${user.User_Id }" var="deleteURL" />
       <a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/users/addUser/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New User</a>
 </div>
</body>
</html>