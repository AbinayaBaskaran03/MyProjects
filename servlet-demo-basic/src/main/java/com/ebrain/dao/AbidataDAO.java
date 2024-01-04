package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrain.entity.AbiData;
import com.ebrain.jdbc.connection.DatabaseConnectionUtil;

public class AbidataDAO {
	
	public static void saveAbi(AbiData abidataObj ) throws ClassNotFoundException, SQLException {
		Connection connection =DatabaseConnectionUtil.getconnection();
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tb_abi(id,user_name,first_name,last_name,mobile_no)VALUES (?,?,?,?,?)")	;
		preparedStatement.setInt(1,abidataObj.getId());
		preparedStatement.setString(2,abidataObj.getUser_name());
		preparedStatement.setString(3,abidataObj.getFirst_name());
		preparedStatement.setString(4,abidataObj.getLast_name());
		preparedStatement.setString(5 ,abidataObj.getMobile_no());
		preparedStatement.executeUpdate();
	}
	
	public static List<AbiData>  getAllvalue( ) throws ClassNotFoundException, SQLException {
		Connection connection =DatabaseConnectionUtil.getconnection();
		String query = "SELECT id,user_name,first_name,last_name,mobile_no FROM tb_abi ";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
	    ResultSet resultSet = preparedStatement.executeQuery();
	    List<AbiData> Data = new ArrayList<AbiData>();
	while(resultSet.next()) {
		Integer id = resultSet.getInt(1);
		String username = resultSet.getString(2);
		String firstname = resultSet.getString(3);
		String lastname = resultSet.getString(4);
		String mobileno = resultSet.getString(5);
		AbiData abidataObj = new AbiData(id,username,firstname,lastname,mobileno);
		Data.add(abidataObj);
	  }
	  return Data;
	  }
}
