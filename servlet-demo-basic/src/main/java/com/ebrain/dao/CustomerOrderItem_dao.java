package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ebrain.dto.CustomerOrderItem_dto;
import com.ebrain.jdbc.connection.DatabaseConnectionUtil;

public class CustomerOrderItem_dao {
	public static void saveItemOrder(CustomerOrderItem_dto itemObj) throws Exception {
		Connection connection =DatabaseConnectionUtil.getconnection();
String insertquery ="INSERT INTO tb_customer_order_item_abi (order_id,item_name,item_sku,item_rate,ordered_qty,order_total)VALUES(?,?,?,?,?,?)";
PreparedStatement preparedStatement = connection.prepareStatement(insertquery);
        preparedStatement.setString(1,itemObj.getOrder_id());
        preparedStatement.setString(2,itemObj.getItem_name());
		preparedStatement.setString(3,itemObj.getItem_sku());
		preparedStatement.setString(4,itemObj.getItem_rate());
		preparedStatement.setString(5,itemObj.getOrdered_qty());
		preparedStatement.setString(6,itemObj.getOrder_total());
		
		preparedStatement.executeUpdate();	
	}
	public static List<CustomerOrderItem_dto> getItemOrder() throws ClassNotFoundException, SQLException {
		Connection connection = DatabaseConnectionUtil.getconnection();
		String selectquery = "SELECT * FROM tb_customer_order_item_abi";
		PreparedStatement preparedStatement = connection.prepareStatement(selectquery);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<CustomerOrderItem_dto> itObj=new ArrayList<CustomerOrderItem_dto>();
		while(resultSet.next()) {
			String id=resultSet.getString(1);
			String order_id=resultSet.getString(2);
			String item_name=resultSet.getString(3);
			String item_sku=resultSet.getString(4);
			String item_rate=resultSet.getString(5);
			String ordered_qty=resultSet.getString(6);
			String order_total=resultSet.getString(7);
			
			
CustomerOrderItem_dto MyObj=new CustomerOrderItem_dto(id,order_id,item_name,item_sku,item_rate,ordered_qty,order_total);
itObj.add(MyObj);
		}
		return itObj;
	}
}
