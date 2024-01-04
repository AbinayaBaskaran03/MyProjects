<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
   <h3>Create Student Form</h3>
  <form action="Studentdetail-submit" method="POST">
  
  <br>
    <div>
       <label>Student id</label>
       <input type="text" id="studentid" name="studentid"> 
        </div>
        <br>
    <div>
       <label>Student user_name</label>
       <input type="text" id="studentuser_name" name="studentuser_name">
          </div>
          <br>
    <div>
       <label>Student first_name</label>
       <input type="text" id="studentfirst_name" name="studentfirst_name">
          </div>
          <br>
    <div>
       <label>Student last_name</label>
       <input type="text" id="studentlast_name" name="studentlast_name">
          </div>
          <br>
    <div>
       <label>Student mobile_no</label>
       <input type="text" id="studentmobile_no" name="studentmobile_no">
          </div>
    <div>
     
       <input type="submit" style="background-color: blue;color: white;" value="Create">
          </div>
  </form>


</body>
</html>