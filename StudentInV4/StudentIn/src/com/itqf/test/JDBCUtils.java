package com.itqf.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ��ȡ���ӵĹ����࣡ ��c3p0���ӳ��л�ȡ
 * 
 * @author admin
 *
 */
public class JDBCUtils {

	public static ComboPooledDataSource source = new ComboPooledDataSource();

	public static DataSource getSource() {
		return source;
	}

	// ��ȡ���ӵķ���

	public static Connection getConnection() throws SQLException {

		return source.getConnection();
	}

	// �ͷ���Դ�ķ���
	public static void close(ResultSet resultSet) {

		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void close(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection connection) {

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement statement, Connection connection) {
		close(statement);
		close(connection);
	}

	public static void close(ResultSet resultSet, Statement statement, Connection connection) {
		close(resultSet);
		close(statement);
		close(connection);
	}

}
