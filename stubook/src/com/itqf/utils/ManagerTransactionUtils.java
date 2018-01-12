package com.itqf.utils;

import java.sql.Connection;
import java.sql.SQLException;



public class ManagerTransactionUtils {

	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

	public static Connection getConnection() {
		// 1.先从threadlocal查找
		Connection connection = threadLocal.get();
		if (connection == null) {
			// 从数据源中获取连�?
			try {
				connection = JDBCUtils.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 用threadlocal存储使用的Connection
			threadLocal.set(connection);
		}
		return connection;
	}

	// �?启事�?
	public static void startTransaction() {
		try {
			getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 关闭事务
	public static void closeTransaction() {
		try {
			getConnection().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 回滚事务
	public static void rollBackTransaction() {
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
