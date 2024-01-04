<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="com.ebrain.dto.CustomerAddress_dto" %>
    <%@ page import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER ADDRESS</title>
</head>
<body>
       <h2 align="center">CUSTOMERS ADDRESS</h2>
      <table align="center" >
<tr>
       <button ><a href="Address.jsp">VIEW CUSTOMER ADDRESS</a></button>
</tr>
 <div>
      <table border="1">
 <tr>   
       <th>id</th>
        <th>customer_id</th>
       <th>address_type</th>
       <th>address_line1</th>
       <th>address_line2</th>
       <th>city</th>
       <th>state</th>
       <th>country</th>
       <th>postal_code</th>
</tr>
<%
    List<CustomerAddress_dto> addObj= (List<CustomerAddress_dto>)request.getAttribute("keylist");
    if(null!=addObj && addObj.size()>0){
    for(CustomerAddress_dto addressObj:addObj){
%>
	<tr>
	<td><%= addressObj.getId() %></td>	
	<td><%= addressObj.getCustomer_id() %></td>
	<td><%= addressObj.getAddress_type() %></td>
	<td><%= addressObj.getAddress_line1() %></td>
	<td><%= addressObj.getAddress_line2() %></td>
	<td><%= addressObj.getCity() %></td>
	<td><%= addressObj.getState() %></td>
	<td><%= addressObj.getCountry() %></td>
	<td><%= addressObj.getPostal_code() %></td>
	
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
   <button onclick="window.location.href='AddIndex.jsp'">Return to home</button> 
</form>
</div>
</div>
</body>
</html>