<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<body>

	<table>
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="staffmid" value="${cus.staffmid}"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="leavetype" value="${cus.leavetype}"/>
	<c:set var="startdate" value="${cus.startdate}"/>
	<c:set var="enddate" value="${cus.enddate}"/>
	<c:set var="reason" value="${cus.reason}"/>
	<c:set var="assignamem" value="${cus.assignamem}"/>
	<c:set var="askapp" value="${cus.askapp}"/>
	
	<tr>
		<td>Staff member ID</td>
		<td>${cus.staffmid}</td>
	</tr>
	<tr>
		<td>Staff member Name</td>
		<td>${cus.name}</td>
	</tr>
	<tr>
		<td>Type of leave</td>
		<td>${cus.leavetype}</td>
	</tr>
	<tr>
		<td>Start date</td>
		<td>${cus.startdate}</td>
	</tr>
	<tr>
		<td>End date</td>
		<td>${cus.enddate}</td>
	</tr>
	<tr>
		<td>Reason</td>
		<td>${cus.reason}</td>
	</tr>
	<tr>
		<td>Assign a member </td>
		<td>${cus.assignamem}</td>
	</tr>
	<tr>
		<td>Ask approve </td>
		<td>${cus.askapp}</td>
	</tr>

	</c:forEach>
	</table>
		
</body>
</html>