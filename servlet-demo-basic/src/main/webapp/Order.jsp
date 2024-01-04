<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details</title>
</head>
<body>
     <h3>ORDER DETAILS</h3>
 <table>
     <tr> 
        <td><form action="Order" method="post"></td>
        
     </tr>
    <tr> 
    <td>Customer customer_id:<input type="text" id="customer_id" name="customer_id"></td>
       </tr> 
    <tr> 
    <td>Customer order_no:<input type="text" id="order_no" name="order_no"></td>
       </tr>
     <tr>
     <td> Customer order_date:<input type="text" id="order_date" name="order_date"></td>
         </tr> 
     <tr>
       <td>Customer no_of_items:<input type="text" id="no_of_items" name="no_of_items"></td>
         </tr> 
    
     <tr>
       <td>Customer order_sub_total:<input type="text" id="order_sub_total" name="order_sub_total"></td>
         </tr> 
    
     <tr>
         <td>Customer order_discount:<input type="text" id="order_discount" name="order_discount"></td>
          </tr>      
       <tr>
         <td>Customer order_total_amount:<input type="text" id="order_total_amount" name="order_total_amount"></td>
          </tr>     
       <tr>
           <td>Customer payment_type:<input type="text" id="payment_type" name="payment_type"></td>
           </tr>       
       <tr>
           <td>Customer delivery_date:<input type="text" id="delivery_date" name="delivery_date"></td>
           </tr>             
       <tr>
          <td>Customer status:<input type="text" id="status" name="status"></td>
          </tr>          
       <tr>
           <td>Customer created_date:<input type="text" id="created_date" name="created_date"></td>
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