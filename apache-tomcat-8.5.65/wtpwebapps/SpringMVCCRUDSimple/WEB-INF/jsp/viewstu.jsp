    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Students List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Enrollment</th><th>Semester</th><th>SPI</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="student" items="${list}"> 
    <tr>
    <td>${student.id}</td>
    <td>${student.enrollment}</td>
    <td>${student.sem}</td>
    <td>${student.spi}</td>
    <td><a href="editstu/${student.id}">Edit</a></td>
    <td><a href="deletestu/${student.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="stuform">Add New Student</a>