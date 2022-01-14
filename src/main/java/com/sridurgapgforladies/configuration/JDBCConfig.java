package com.sridurgapgforladies.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JDBCConfig {

	static final JDBCConfig jdbcConnection = new JDBCConfig();
	static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/sridurgapgforladies";
	static final String USER_NAME = "root";
	static final String PASSWORD = "root";

	private static final Logger logger = LogManager.getLogger(JDBCConfig.class);

	private JDBCConfig() {

		try {

			Class.forName(MYSQL_DRIVER);

		} catch (ClassNotFoundException e) {

			logger.info("Error  : unable to connect Database" + e);
		}
	}

	private Connection createConnection() {

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

		} catch (Exception e) {
			logger.info("Error  : unable to connect Database" + e);

		}
		return connection;

	}

	public static Connection getConnection() throws SQLException {

		return jdbcConnection.createConnection();

	}

}

