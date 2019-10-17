package com.rjxy.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import java.sql.*;

public class SqlHelper {
	//定义变量
	private static Connection connection = null;
	 //大多数情况下用preparedstatement替代statement
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	

	public static List<Object[]> executeQuery(String sql, Object[] parameters) {
		List<Object[]> results = new ArrayList<>();
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			if (parameters != null) {
				for (int i = 0; i < parameters.length; i++) {
					preparedStatement.setObject(i + 1, parameters[i]);
				}
			}
			resultSet = preparedStatement.executeQuery();
			
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			//通过上一对象获得结果有多少列
			int columnNum = resultSetMetaData.getColumnCount();
			//循环获取,封装到ArrayList结果集
			while(resultSet.next()) {
				Object[] objects = new Object[columnNum];
				for(int i = 0;i < objects.length;i++) {
					objects[i] = resultSet.getObject(i + 1);
				}
				
				results.add(objects);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}
		return results;
	}



	public static void executeUpdate2(String[] sql, Object[][] parameters) {
		try {
			connection = DBUtil.getConnection();
			connection.setAutoCommit(false);

			for (int i = 0; i < sql.length; i++) {

				if (null != parameters[i]) {
					preparedStatement = connection.prepareStatement(sql[i]);
					for (int j = 0; j < parameters[i].length; j ++) {
						preparedStatement.setObject(j + 1, parameters[i][j]);
					}
					preparedStatement.executeUpdate();
				}

			}

			connection.commit();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}

	}

	public static void executeUpdate(String sql, Object[] parameters) {
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			if (parameters != null) {
				for (int i = 0; i < parameters.length; i ++) {
					preparedStatement.setObject(i + 1, parameters[i]);
				}
			}
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();//开发阶段
            //抛出异常
            //可以处理，也可以不处理
			throw new RuntimeException(e.getMessage());
		} finally {
			DBUtil.close(resultSet, preparedStatement, connection);
		}
	}

}
