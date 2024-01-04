package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ebrain.dto.CustomerOrder_dto;
import com.ebrain.jdbc.connection.DatabaseConnectionUtil;

public class CustomerOrder_dao {
	
	public static void saveOrder(CustomerOrder_dto orderObj) throws Exception {
		Connection connection =DatabaseConnectionUtil.getconnection();
String insertquery ="INSERT INTO tb_customer_order_abi (customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,order_total_amount,payment_type,delivery_date,status,created_date,created_by,modified_date,modified_by)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
PreparedStatement preparedStatement = connection.prepareStatement(insertquery);
        preparedStatement.setString(1,orderObj.getCustomer_id());
        preparedStatement.setString(2,orderObj.getOrder_no());
		preparedStatement.setString(3,orderObj.getOrder_date());
		preparedStatement.setString(4,orderObj.getNo_of_items());
		preparedStatement.setString(5,orderObj.getOrder_sub_total());
		preparedStatement.setString(6,orderObj.getOrder_discount());
		preparedStatement.setString(7,orderObj.getOrder_total_amount());
		preparedStatement.setString(8,orderObj.getPayment_type());
		preparedStatement.setString(9,orderObj.getDelivery_date());
		preparedStatement.setString(10,orderObj.getStatus());
		preparedStatement.setString(11,orderObj.getCreated_date());
		preparedStatement.setString(12,orderObj.getCreated_by());
		preparedStatement.setString(13,orderObj.getModified_date());
		preparedStatement.setString(14,orderObj.getModified_by());

		preparedStatement.executeUpdate();	
	}
	public static List<CustomerOrder_dto> getOrder() throws ClassNotFoundException, SQLException {
		Connection connection = DatabaseConnectionUtil.getconnection();
		String selectquery = "SELECT * FROM tb_customer_order_abi";
		PreparedStatement preparedStatement = connection.prepareStatement(selectquery);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<CustomerOrder_dto> Obj=new ArrayList<CustomerOrder_dto>();
		while(resultSet.next()) {
			String id=resultSet.getString(1);
			String customer_id=resultSet.getString(2);
			String order_no=resultSet.getString(3);
			String order_date=resultSet.getString(4);
			String no_of_items=resultSet.getString(5);
			String order_sub_total=resultSet.getString(6);
			String order_discount=resultSet.getString(7);
			String order_total_amount=resultSet.getString(8);
			String payment_type=resultSet.getString(9);
			String delivery_date=resultSet.getString(10);
			String status=resultSet.getString(11);
			String created_date=resultSet.getString(12);
			String created_by=resultSet.getString(13);
			String modified_date=resultSet.getString(14);
			String modified_by=resultSet.getString(15);

			
CustomerOrder_dto MyObj=new CustomerOrder_dto(id,customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,order_total_amount,payment_type,delivery_date,status,created_date,created_by,modified_date,modified_by);
Obj.add(MyObj);
		}
		return Obj;
	}
}
