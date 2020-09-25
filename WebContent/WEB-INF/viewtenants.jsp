<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Tenants List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>RoomNo</th><th>Name</th><th>ShareType</th><th>Rent</th><th>Student</th><th>Working</th><th>Payment</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="tenant" items="${list}">   
   <tr>  
   <td>${tenant.id}</td>  
   <td>${tenant.roomNo}</td>  
   <td>${tenant.name}</td>  
   <td>${tenant.ShareType}</td>  
   <td>${tenant.Rent}</td> 
   <td>${tenant.student}</td> 
   <td>${tenant.working}</td>
   <td>${tenant.payment}</td>  
   <td><a href="edittenant/${tenant.id}">Edit</a></td>  
   <td><a href="deletetenant/${tenant.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="tenantform">Add New Tenants</a>  