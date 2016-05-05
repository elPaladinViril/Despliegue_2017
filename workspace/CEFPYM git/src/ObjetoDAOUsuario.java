import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ObjetoDAOUsuario{
	/*
			public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
				
				String con= "jdbc:mysql://localhost/tabla_usuarios";
				String usuario= "";
				String password ="";
				
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				Connection conexion= DriverManager.getConnection(con, usuario, password);
				System.out.println("Conexion establecida");
				
				Statement stmt= conexion.createStatement();
				
				ResultSet equiposNba = stmt.executeQuery("");
				
				while (equiposNba.next()){
					String nombre= equiposNba.getString("nombre");
					String ciudad= equiposNba.getString("ciudad");
					String conferencia= equiposNba.getString("conferencia");
					String division= equiposNba.getString("division");
					
					System.out.printf("El equipo %s, de la ciudad %s, se encuentra en la conferencia %s de la division %s.\n", nombre, ciudad, conferencia, division);
				}
				
				conexion.close();
				
			}

*/
}


