<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view admin</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include><br>

<table style="width:1250px; height=350px">
<tr>
<th style="bolder:1px solid black;background-Color:skyblue;text-align:center;">Admin Id</th>
<th style="bolder:1px solid black;background-Color:skyblue;text-align:center;">FirstName</th>
<th style="bolder:1px solid black;background-Color:skyblue;text-align:center;">Address</th>
<th style="bolder:1px solid black;background-Color:skyblue;text-align:center;">EmailId</th>
<th style="bolder:1px solid black;background-Color:skyblue;text-align:center;">Mobile Number</th>
<th style="bolder:1px solid black;background-Color:skyblue;text-align:center;">Update</th>
<th style="bolder:1px solid black;background-Color:skyblue;text-align:center;">Delete</th>
</tr>

<c:forEach items="${adminBOList}" var="adminBO"> <!-- for(adminBO S:listobj)sysout(s.getFirstName) -->

<tr>
<td style="bolder:1px solid black;text-align:center;"><c:out value="${adminBO.adminId}"></c:out></td>
<td style="bolder:1px solid black;text-align:center;"><c:out value="${adminBO.firstName}"></c:out></td>
<td style="bolder:1px solid black;text-align:center;"><c:out value="${adminBO.address}"></c:out></td>
<td style="bolder:1px solid black;text-align:center;"><c:out value="${adminBO.mobileNum}"></c:out></td>
<td style="bolder:1px solid black;text-align:center;"><c:out value="${adminBO.emailId}"></c:out></td>
<td style="bolder:1px solid black;text-align:center;"><a href="update-admin?adminId=${adminBO.adminId}">Update</a>
<td style="bolder:1px solid black;text-align:center;"><a href="delete-admin?adminId=${adminBO.adminId}">Delete</a>

</tr>
</c:forEach>
</table>
</body>
</html>