<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Banking MVC App</title>

<spring:url value="/resources/core/css/main.css" var="coreCss" />
<spring:url value="/webjars/bootstrap/5.2.0/css/bootstrap.min.css" var="bootstrapCss" />

<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>

<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
  <a class="navbar-brand" href="#">com.spring</a>
</nav>

<main role="main" class="container">

  <div class="starter-template">
      <h1>Welcome To</h1>
      <h2>
            <c:if test="${not empty message}">
                Hello ${message}
            </c:if>

            <c:if test="${empty message}">
                Banking Management MVC App!
            </c:if>
      </h2> <br>
      <h3> Manage: </h3> <br> <br>
      
      <div style="font-size: 25px;">
      
    <a href="/spring-mvc-hello-world-jsp/banks" class="btn btn-info ml-2" 
    style="font-size: 24px;">Bank</a> &nbsp;&nbsp;
    
    <a href="/spring-mvc-hello-world-jsp/branches" class="btn btn-info ml-2" 
    style="font-size: 24px;">Branch</a>&nbsp;&nbsp;
    
    <a href="/spring-mvc-hello-world-jsp/accounts" class="btn btn-info ml-2" 
    style="font-size: 24px;">Account</a>&nbsp;&nbsp;
    
    <a href="/spring-mvc-hello-world-jsp/loans" class="btn btn-info ml-2" 
    style="font-size: 24px;">Loan</a>&nbsp;&nbsp;
    
    <a href="/spring-mvc-hello-world-jsp/customers" class="btn btn-info ml-2" 
    style="font-size: 24px;">Customer</a>
      
      </div>
      
  </div>

</main>

<spring:url value="/resources/core/js/main.js" var="coreJs" />
<spring:url value="/webjars/bootstrap/5.2.0/js/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>