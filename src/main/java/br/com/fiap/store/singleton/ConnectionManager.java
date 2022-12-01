package br.com.fiap.store.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	private static ConnectionManager connectionManager;

	private ConnectionManager() {
	}

	public static ConnectionManager getInstance() {
		if (connectionManager == null) {
			connectionManager = new ConnectionManager();
		}
		return connectionManager;
	}

	public Connection getConnection() {
		Connection connection = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql:///fiapstore","root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}