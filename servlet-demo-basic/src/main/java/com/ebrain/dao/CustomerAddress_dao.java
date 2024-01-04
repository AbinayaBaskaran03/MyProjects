package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ebrain.dto.CustomerAddress_dto;
import com.ebrain.jdbc.connection.DatabaseConnectionUtil;

public class CustomerAddress_dao {

	public static void saveAddress(CustomerAddress_dto addressObj) throws Exception {
		Connection connection =DatabaseConnectionUtil.getconnection();
String insertquery = "INSERT INTO tb_customer_address_abi(customer_id,address_type,address_line1,address_line2,city,state,country,postal_code)VALUES(?,?,?,?,?,?,?,?)";
PreparedStatement preparedStatement = connection.prepareStatement(insertquery);
        preparedStatement.setString(1,addressObj.getCustomer_id());
        preparedStatement.setString(2,addressObj.getAddress_type());
		preparedStatement.setString(3,addressObj.getAddress_line1());
		preparedStatement.setString(4,addressObj.getAddress_line2());
		preparedStatement.setString(5,addressObj.getCity());
		preparedStatement.setString(6,addressObj.getState());
		preparedStatement.setString(7,addressObj.getCountry());
		preparedStatement.setString(8,addressObj.getPostal_code());
		preparedStatement.executeUpdate();	
	}
	public static List<CustomerAddress_dto> getAddress() throws ClassNotFoundException, SQLException {
		Connection connection = DatabaseConnectionUtil.getconnection();
		String selectquery = "SELECT * FROM tb_customer_address_abi";
		PreparedStatement preparedStatement = connection.prepareStatement(selectquery);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<CustomerAddress_dto> addObj=new ArrayList<CustomerAddress_dto>();
		while(resultSet.next()) {
			String id=resultSet.getString(1);
			String customer_id=resultSet.getString(2);
			String address_type=resultSet.getString(3);
			String address_line1=resultSet.getString(4);
			String address_line2=resultSet.getString(5);
			String city=resultSet.getString(6);
			String state=resultSet.getString(7);
			String country=resultSet.getString(8);
			String postal_code=resultSet.getString(9);
			
			
CustomerAddress_dto MyObj=new CustomerAddress_dto(id,customer_id,address_type,address_line1,address_line2,city,state,country,postal_code);
			addObj.add(MyObj);
		}
		return addObj;
	}
	}
