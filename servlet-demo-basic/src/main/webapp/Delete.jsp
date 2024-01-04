<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import ="com.ebrain.dto.CustomerOrder_dto" %>
    <%@ page import ="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> DELETE CUSTOMERS INFORMATIONS</title>
</head>
<body>
        <h2 align="center"> DELETE CUSTOMERS INFORMATIONS</h2>

<tr>
    <button ><a href="DeleteCustomer">DELETE YOUR DETAILS FROM CUSTOMER TABLE</a></button>
</tr>
 <div>
       <table border="1">
<tr>
  <th>id</th>
  <th>customer_id</th>
  <th>order_no</th>
  <th>order_date</th>
  <th>no_of_items</th>
  <th>order_sub_total</th>
  <th>order_discount</th>
  <th>order_total_amount</th>
  <th>payment_type</th>
  <th>delivery_date</th>
  <th>status</th>
  <th>created_date</th>
  <th>created_by</th>
  <th>modified_date</th>
  <th>modified_by</th>
</tr>
<%
    List<CustomerOrder_dto> Obj= (List<CustomerOrder_dto>)request.getAttribute("keylist");
    if(null!=Obj && Obj.size()>0){
    for(CustomerOrder_dto orderObj:Obj){
%>
	<tr>
	<td><%= orderObj.getId() %></td> 
	<td><%= orderObj.getCustomer_id() %></td>
	<td><%= orderObj.getOrder_no() %></td>
	<td><%= orderObj.getOrder_date() %></td>
	<td><%= orderObj.getNo_of_items() %></td>
	<td><%= orderObj.getOrder_sub_total() %></td>
	<td><%= orderObj.getOrder_discount() %></td>
	<td><%= orderObj.getOrder_total_amount() %></td>
	<td><%= orderObj.getPayment_type() %></td>
	<td><%= orderObj.getDelivery_date() %></td>
	<td><%= orderObj.getStatus()%></td>
	<td><%= orderObj.getCreated_date()%></td>
	<td><%= orderObj.getCreated_by()%></td>
	<td><%= orderObj.getModified_date()%></td>
	<td><%= orderObj.getModified_by()%></td>
	
	</tr>
<% }
}else{
%>
  <tr><td colspan="12">No Records Found</td></tr>
  <%
   }
    %>

  <div>
   <tr>

   </tr>
  </div>
  </table>
</form>
</div>
</div>
</body>
</html>