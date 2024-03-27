<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<h1 style="color:midnightblue;text-align:center;"> Enter Admin Details </h1>
<form:form action="update-admin" modelAttribute="adminBO" method="post">
<form:hidden path="adminId" value="${adminBO.adminId}"/>
<label>First Name:</label><form:input type="text" path="firstName" value="${adminBO.firstName}" placeholder="Name"/><br><br>
<label>Address:</label><form:input type="text" path="address" value="${adminBO.address}" placeholder="address"/><br><br>
<label>Mobile Number:</label><form:input type="text" path="mobileNum" value="${adminBO.mobileNum}" placeholder="mobileNumber"/><br><br>
<label>EmailId:</label><form:input type="text" path="emailId" value="${adminBO.emailId}" placeholder="emailId"/><br><br>
<input type="submit" value="save" style="margin-left:200px;">

</form:form>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>