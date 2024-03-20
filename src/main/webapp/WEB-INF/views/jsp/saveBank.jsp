<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>New Bank</title>

    <!-- Include Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
    rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="text-center mt-5">
        <h2>Add Bank</h2> <br>
        <div class="d-flex justify-content-center">
            <form:form action="save" method="post" modelAttribute="bank">
                <table class="table table-bordered" cellpadding="5" style="max-width: 400px;">
                    <tr>
                        <td>Bank Id:</td>
                        <td><form:input path="id" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Bank Name:</td>
                        <td><form:input path="name" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td>Bank Address:</td>
                        <td><form:input path="address" class="form-control" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Save" 
                        class="btn btn-primary btn-block" /></td>
                    </tr>
                </table>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>