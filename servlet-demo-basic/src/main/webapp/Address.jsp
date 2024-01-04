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
		<td><form action="address" method="post"></td>
	</tr>
<tr>		
		<td>customer_id:<input type="text" name="customer_id" id="customer_id"></td>
	</tr>
<tr>
		<td>address_type:<input type="text" name="address_type" id="address_type"></td>
  </tr>
<tr>
		<td>address_line1:<input type="text" name="address_line1"id="address_line1"></td>
  </tr>
<tr>
		<td>address_line2:<input type="text" name="address_line2" id="address_line2"></td>
	</tr>
<tr>
		<td>city:<input type="text" name="city" id="city"></td>
	</tr>
<tr>
		<td>state:<input type="text" name="state" id="state"></td>
	</tr>
<tr>
		<td>country:<input type="text" name="country" id="country"></td>
	</tr>
<tr>
		<td>postal_code:<input type="text" name="postal_code" id="postal_code"></td>
	</tr>
<tr>
		<td><button type="submit">submit</button></td>
	</tr>
	</form>
 </table>  
</body>
</html>