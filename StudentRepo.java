// yaredmgmt@gmail.com

package com.itsc.ioc;

import java.sql.*;

public class StudentRepo extends Student {
//	String student_name = "Abel";
//	String student_email = "abelseyoum.swe@gmail.com";
	String databaseName = "testDB";
	String tableName = "student";
	String database = "USE " + databaseName;
	String createDB = "CREATE DATABASE " + databaseName;
	String createTable = "CREATE TABLE " + tableName + " (id int auto_increment primary key, name varchar(255), email varchar(255)";
	String insertData = "INSERT INTO " + tableName + " (name varchar(255), email varchar(255) VALUE (" + this.name + ", " + this.email + ")";
	
	Connection connection = null;
	Statement statement = null;
	
	public void createConnection() {
		String url = "jdbc:mysql://localhost:3306/?user=root";
		String username = "root";
		String password = "MySQL.P@5s_001!";
				
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established successfully!");
			statement = connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void createDBAndTable() {
		
		try {
			createConnection();
			statement.executeUpdate(createDB);
			statement.executeUpdate(database);
			statement.executeUpdate(createTable);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertIntoTable(Student student) {
		try {
			createConnection();
			statement.executeUpdate(insertData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
