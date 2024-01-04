<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
     <h3>CUSTOMER DETAILS</h3>
 <table>
     <tr> 
        <td><form action="Submit" method="post"></td>
     </tr>
    <tr> 
    <td>Customer id:<input type="text" id="id" name="id"></td>
       </tr> 
    <tr> 
    <td>Customer name:<input type="text" id="name" name="name"></td>
       </tr>
     <tr>
     <td> Customer code:<input type="text" id="code" name="code"></td>
         </tr> 
     <tr>
       <td>Customer email:<input type="text" id="email" name="email"></td>
         </tr> 
    
     <tr>
     
       <td>Customer phone:<input type="text" id="phone" name="phone"></td>
         </tr> 
    
     <tr>
         <td>Customer contact_person_name:<input type="text" id="contact_person_name" name="contact_person_name"></td>
          </tr>      
       <tr>
         <td>Customer contact_person_phone:<input type="text" id="contact_person_phone" name="contact_person_phone"></td>
          </tr>     
       <tr>
           <td>Customer status:<input type="text" id="status" name="status"></td>
           </tr>       
       <tr>
           <td>Customer create_date:<input type="text" id="create_date" name="create_date"></td>
           </tr>             
       <tr>
          <td>Customer created_by:<input type="text" id="created_by" name="created_by"></td>
          </tr>          
       <tr>
           <td>Customer modified_date:<input type="text" id="modified_date" name="modified_date"></td>
          </tr>              
       <tr>
           <td>Customer modified_by:<input type="text" id="modified_by" name="modified_by"></td>
          </tr>       
       <tr>
          <td><button onclick="Submit"  style="background-color: blue;color: white;">Submit</button><td>
           </tr>
     </form>
</table>
</body>
</html>