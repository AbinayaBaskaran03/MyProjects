package com.ebrain.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.ebrain.dto.Customer_dto;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import com.ebrain.jdbc.connection.DatabaseConnectionUtil;

public class Customer_dao {

	public static void saveCus(Customer_dto MyObj) throws Exception {
	Connection connection =DatabaseConnectionUtil.getconnection();
		
String insertquery = "INSERT INTO tb_customer_abi (name,code,email,phone,contact_person_name,contact_person_phone,status,create_date,created_by,modified_date,modified_by)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		
         PreparedStatement preparedStatement = connection.prepareStatement(insertquery);
         
      //  preparedStatement.setInt(1,MyObj.getId());
		preparedStatement.setString(1,MyObj.getName());
		preparedStatement.setString(2,MyObj.getCode());
		preparedStatement.setString(3,MyObj.getEmail());
		preparedStatement.setString(4,MyObj.getPhone());
		preparedStatement.setString(5,MyObj.getContact_person_name());
		preparedStatement.setString(6,MyObj.getContact_person_phone());
		preparedStatement.setString(7,MyObj.getStatus());
		preparedStatement.setString(8,MyObj.getCreate_date());
		preparedStatement.setString(9,MyObj.getCreated_by());
		preparedStatement.setString(10,MyObj.getModified_date());
		preparedStatement.setString(11,MyObj.getModified_by());
		preparedStatement.executeUpdate();
		
	}
	public static List<Customer_dto> getAllDetails() throws ClassNotFoundException, SQLException {
		Connection connection =DatabaseConnectionUtil.getconnection();
		String SelectQuery = "select * from tb_customer_abi";
		PreparedStatement preparedStatement = connection.prepareStatement(SelectQuery);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Customer_dto> cus=new ArrayList<Customer_dto>();
		while(resultSet.next()) {
		    String id=resultSet.getString(1);
			String name=resultSet.getString(2);
			String code=resultSet.getString(3);
			String email=resultSet.getString(4);
			String phone=resultSet.getString(5);
			String contact_person_name=resultSet.getString(6);
			String contact_person_phone=resultSet.getString(7);
			String status=resultSet.getString(8);
			String created_date=resultSet.getString(9);
			String created_by=resultSet.getString(10);
			String modified_date=resultSet.getString(11);
			String modified_by=resultSet.getString(12);
			
Customer_dto Obj=new Customer_dto(id,name,code,email,phone,contact_person_name,contact_person_phone,status,created_date,created_by,modified_date,modified_by);
			cus.add(Obj);
		}
		return cus;
	}

	
	
}
