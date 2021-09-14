<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language="java" import="java.util.*" %>
      <%@page import="student.db.*"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>

<table border="1">
<tr>
<!-- <td><b>Select</b></td> -->
<td><b>ID</b></td>
<td><b>Name</b></td>
<td><b>Department</b></td>
<td><b>City</b></td>
<td><b>Action</b></td>
</tr>

<% List data = (List)request.getAttribute("data");
   Iterator itr = data.iterator();
   Student details=null;
  // System.out.println(itr);
      while(itr.hasNext()){
    	 details = (Student)itr.next();
%>
<tr>
<!-- <td><input type="radio" name="delete"></td> -->
 <td><%=details.getId()%></td> 
<td><%=details.getName()%></td>
<td><%=details.getDepartment()%></td>
<td><%=details.getCity()%></td>
<td> <a href="DeleteStudentServlet?id=<%=details.getId() %>"><button type="button" class="delete">Delete</button></a></td> 
</tr>
 <%}%>
</table>
<br>
 <a href="add.jsp"><button type="button" class="add">ADD</button></a>
</body>
</html>