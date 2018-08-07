<%@page import="com.cg.pckgResume.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Resume</title>
</head>
<body>
<% 


Resume rm=(Resume)request.getAttribute("ResumeRequest");



%>


<%=rm.getFirstname()%>
<%=rm.getLastname()%>
<%=rm.getDob()%>
<%=rm.getContact()%>
<%=rm.getEmaild()%>
<%=rm.getGender()%>
<%=rm.getHighestQualification()%>
<%=rm.getDescription()%>
<%=rm.getSkills()%>
<%=rm.getHobbies()%>



</body>
</html>