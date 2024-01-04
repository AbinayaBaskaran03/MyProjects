<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OrderItem Details</title>
</head>
<body>
<h3>ORDERITEM DETAILS</h3>
 <table>
     <tr> 
        <td><form action="OrderItem" method="post"></td>
     </tr>
    <tr> 
    <td>Customer order_id:<input type="text" id="order_id" name="order_id"></td>
       </tr> 
    <tr> 
    <td>Customer item_name:<input type="text" id="item_name" name="item_name"></td>
       </tr>
     <tr>
     <td> Customer item_sku:<input type="text" id="item_sku" name="item_sku"></td>
         </tr> 
     <tr>
       <td>Customer item_rate:<input type="text" id="item_rate" name="item_rate"></td>
         </tr> 
    
     <tr>
       <td>Customer ordered_qty:<input type="text" id="ordered_qty" name="ordered_qty"></td>
         </tr> 
    
     <tr>
         <td>Customer order_total:<input type="text" id="order_total" name="order_total"></td>
          </tr>      
      
       <tr>
          <td><button onclick="Submit"  style="background-color: blue;color: white;">Submit</button><td>
           </tr>
     </form>
</table>
</body>
</html>