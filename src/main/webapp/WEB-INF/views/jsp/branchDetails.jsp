   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View Branch Details</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
    rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="text-center mt-3">
        <h2>Branch Management</h2>
        <form method="get" action="search" class="form-inline mt-3">
            
            <button type="submit" class="btn btn-primary ml-2">Search</button>
            <br><br>
            <input type="text" name="keyword" class="form-control" />
        </form>
        <br> 
        <h3 class="mt-3"><a href="add" class="btn btn-success">Add Branch</a></h3>
        <table class="table table-bordered table-striped mt-3">
            <thead class="thead-dark">
                <tr>
                    <th>Branch Id</th>
                    <th>Branch Name</th>
                    <th>Branch Address</th>
                    <th>Bank Id</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <c:forEach items="${branch}" var="branch">
                <tr>
                    <td>${branch.id}</td>
                    <td>${branch.name}</td>
                    <td>${branch.address}</td>
                    <td>${branch.bankId}</td>
                    <td>
                        <a href="editDetails/${branch.id}" class="btn btn-warning">Edit</a>
                        <a href="delete/${branch.id}" class="btn btn-danger ml-2">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
