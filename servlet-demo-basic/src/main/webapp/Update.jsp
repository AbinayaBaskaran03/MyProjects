<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="com.ebrain.dto.Customer_dto" %>
    <%@ page import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> UPDATE CUSTOMERS</title>
</head>
<body>
        <h2 align="center"> UPDATE CUSTOMERS INFORMATIONS</h2>
       <table align="center" >

<tr>
  <button ><a href="UpdateCustomer">UPDATE YOUR DETAILS INTO CUSTOMER TABLE</a></button>
</tr>
 <div>
    <table border="1">
<tr>
  <th>id</th>
  <th>name</th>
  <th>code</th>
  <th>email</th>
  <th>phone</th>
  <th>contact_person_name</th>
  <th>contact_person_phone</th>
  <th>status</th>
  <th>created_date</th>
  <th>created_by</th>
  <th>modified_date</th>
  <th>modified_by</th>
</tr>
<%
    List<Customer_dto> cus= (List<Customer_dto>)request.getAttribute("keylist");
    if(null!=cus && cus.size()>0){
    for(Customer_dto MyObj:cus){
%>
	<tr>
	 <td><%= MyObj.getId() %></td> 
	<td><%= MyObj.getName() %></td>
	<td><%= MyObj.getCode() %></td>
	<td><%= MyObj.getEmail() %></td>
	<td><%= MyObj.getPhone() %></td>
	<td><%= MyObj.getContact_person_name() %></td>
	<td><%= MyObj.getContact_person_phone() %></td>
	<td><%= MyObj.getStatus() %></td>
	<td><%= MyObj.getCreate_date() %></td>
	<td><%= MyObj.getCreated_by() %></td>
	<td><%= MyObj.getModified_date()%></td>
	<td><%= MyObj.getModified_by()%></td>
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