
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionMySQL {
    private Connection cn;
    public static Connection conectar() {
    Connection cn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_java_mysql","root","");
        if(cn != null){
            JOptionPane.showMessageDialog(null,"CONECTADO");
        }
    } catch (ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null,"Error al cargar el controlador JDBC: " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("Error al establecer la conexión con la base de datos: " + e.getMessage());
    }
    return cn;
    }
}
   

    

