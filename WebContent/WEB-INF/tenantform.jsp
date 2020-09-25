<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Tenant</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>roomNo : </td>   
          <td><form:input path="roomNo"  /></td>  
         </tr>    
         <tr>    
          <td>Name :</td>    
          <td><form:input path="name" /></td>  
         </tr>
          <tr>    
          <td>ShareType :</td>    
          <td><form:input path="ShareType" /></td>  
         </tr>   
         <tr>    
          <td>Rent :</td>    
          <td><form:input path="Rent" /></td>  
         </tr>  
          <tr>    
          <td> Student:</td>    
          <td><form:input path="student" /></td>  
         </tr> 
         <tr>    
          <td>working :</td>    
          <td><form:input path="working" /></td>  
         </tr>
         <tr>    
          <td>Payment :</td>    
          <td><form:input path="payment" /></td>  
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    