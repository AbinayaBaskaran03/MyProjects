  <%@ page import ="com.ebrain.entity.AbiData" %>
    <%@ page import ="java.util.List" %>
    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
  <h3>Student</h3> 
  <div>
    <button><a href ="studentdetail-form">Create Student Details</a></button> <br/>
  </div>
    <br/>
  <div>   
       <table border="1">
          <tr>
           <th>Student id<th/>
            <th>Student user_name<th/>
            <th>Student first_name<th/>
            <th>Student last_name<th/>
            <th>Student mobile_no<th/>
         </tr>
         
         <% List<AbiData> Data = (List<AbiData>) request.getAttribute("keylist"); 
         if (null != Data && Data.size() >0 ) {
         for(AbiData abidataObj : Data ){
         %>
            <tr>
              <td><%=abidataObj.getId() %></td>
              <td><%=abidataObj.getUser_name() %></td>
              <td><%=abidataObj.getFirst_name() %></td>
              <td><%=abidataObj.getLast_name() %></td>
              <td><%=abidataObj.getMobile_no() %></td>
           </tr>
        <%
             }
            } else {
         %>
            <td colspan="5">No Records Found</td>
         <% 
           } 
         %>
    
      </table>
      </div>
</body>
</html>