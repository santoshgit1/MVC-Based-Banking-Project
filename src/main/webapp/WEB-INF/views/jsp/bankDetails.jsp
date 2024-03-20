   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View Bank Details</title>

    <!-- Include Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
    rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="text-center mt-3">
        <h2>Bank Management</h2>
        <form method="get" action="/spring-mvc-hello-world-jsp/banks/search" class="form-inline mt-3">
            
            <button type="submit" class="btn btn-primary ml-2">Search</button>
            <br><br>
            <input type="text" name="name" class="form-control" />
        </form>
        <br> 
        <h3 class="mt-3"><a href="/spring-mvc-hello-world-jsp/banks/add" class="btn btn-success">Add Bank</a></h3>
        <table class="table table-bordered table-striped mt-3">
            <thead class="thead-dark">
                <tr>
                    <th>Bank Id</th>
                    <th>Bank Name</th>
                    <th>Bank Address</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <c:forEach items="${bank}" var="bank">
                <tr>
                    <td>${bank.id}</td>
                    <td>${bank.name}</td>
                    <td>${bank.address}</td>
                    <td>
                        <a href="/spring-mvc-hello-world-jsp/banks/editDetails/${bank.id}" class="btn btn-warning">Edit</a>
                        <a href="/spring-mvc-hello-world-jsp/banks/delete/${bank.id}" class="btn btn-danger ml-2" 
                        onclick="if (!(confirm('Are you sure you want to delete this Bank?'))) return false">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>

<!-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Bank Details</title>
</head>
<body>
<div align="center">
	<h2>Bank Management</h2>
	<form method="get" action="search">
		<input type="text" name="keyword" /> &nbsp;
		<input type="submit" value="Search" />
	</form>
	<h3><a href="add">Add Bank</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>Bank Id</th>
			<th>Bank Name</th>
			<th>Bank Address</th>
			
		</tr>
		<c:forEach items="${bank}" var="bank">
		<tr>
			<td>${bank.id}</td>
			<td>${bank.name}</td>
			<td>${bank.address}</td>
		
			<td>
				<a href="editDetails/${bank.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete/${bank.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>	
</body>
</html>
-->