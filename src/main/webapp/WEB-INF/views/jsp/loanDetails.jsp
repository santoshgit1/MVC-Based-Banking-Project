   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View Loan Details</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
    rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="text-center mt-3">
        <h2>Loan Management</h2>
        <form method="get" action="search" class="form-inline mt-3">
            
            <button type="submit" class="btn btn-primary ml-2">Search</button>
            <br><br>
            <input type="text" name="keyword" class="form-control" />
        </form>
        <br> 
        <h3 class="mt-3"><a href="add" class="btn btn-success">Add Loan</a></h3>
        <table class="table table-bordered table-striped mt-3">
            <thead class="thead-dark">
                <tr>
                    <th>Loan Id</th>
                    <th>Type</th>
                    <th>Amount</th>
                    <th>Branch Id</th>
                    <th>Customer Id </th>
                    <th>Actions</th>
                </tr>
            </thead>
            <c:forEach items="${loan}" var="loan">
                <tr>
                    <td>${loan.id}</td>
                    <td>${loan.type}</td>
                    <td>${loan.amount}</td>
                    <td>${loan.branchId}</td>
                    <td>${loan.customerId}</td>
                    <td>
                        <a href="editDetails/${loan.id}" class="btn btn-warning">Edit</a>
                        <a href="delete/${loan.id}" class="btn btn-danger ml-2">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
