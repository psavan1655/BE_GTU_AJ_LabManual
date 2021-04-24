<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Student details</h1>
       <form:form method="POST" action="/SpringMVCCRUDSimple/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Enrollment : </td> 
          <td><form:input path="enrollment"  /></td>
         </tr>  
         <tr>  
          <td>Semester :</td>  
          <td><form:input path="sem" /></td>
         </tr> 
         <tr>  
          <td>SPI :</td>  
          <td><form:input path="spi" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
