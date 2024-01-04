<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="com.ebrain.dto.CustomerOrderItem_dto" %>
    <%@ page import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDERITEM DETAILS</title>
</head>
<body>
 <h2 align="center">ORDER INFORMATIONS</h2>
    <table align="center" >

<tr>
  <button ><a href="OrderItem.jsp">INSERT YOUR DETAILS IN CUSTOMER ORDERITEM TABLE</a></button>
</tr>
 <div>
    <table border="1">
<tr>
  <th>id</th>
  <th>order_id</th>
  <th>item_name</th>
  <th>item_sku</th>
  <th>item_rate</th>
  <th>ordered_qty</th>
  <th>order_total</th>
 
</tr>
<%
    List<CustomerOrderItem_dto> itObj= (List<CustomerOrderItem_dto>)request.getAttribute("keylist");
    if(null!=itObj && itObj.size()>0){
    for(CustomerOrderItem_dto itemObj:itObj){
%>
	<tr>
	<td><%= itemObj.getId() %></td> 
	<td><%= itemObj.getOrder_id() %></td>
	<td><%= itemObj.getItem_name() %></td>
	<td><%= itemObj.getItem_sku() %></td>
	<td><%= itemObj.getItem_rate() %></td>
	<td><%= itemObj.getOrdered_qty() %></td>
	<td><%= itemObj.getOrder_total() %></td>
	
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
   <button onclick="window.location.href='OrderItemIndex.jsp'">Return to home</button> 
</form>
</div>
</div>
</body>
</html>