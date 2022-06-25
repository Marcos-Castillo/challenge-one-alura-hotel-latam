package jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

public class probarConexion {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexion();
		
		System.out.println("cerrando conexion!!");
		
		connection.close();
			}
}
