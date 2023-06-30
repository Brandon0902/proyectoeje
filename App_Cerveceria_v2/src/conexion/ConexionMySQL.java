
package conexion;

import Login.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionMySQL {
    private Connection cn;

    public Connection conectar() throws ClassNotFoundException {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_java_myqsl","root","");
            if(cn != null){
                JOptionPane.showMessageDialog(null,"CONECTADO");
            }
        } /*catch (ClassNotFoundException e) {
            
            // JOptionPane.showMessageDialog(null, e.getCause());
        }*/ catch (SQLException e) {
            System.out.println("Error al establecer la conexión con la base de datos: " + e.getMessage());
        }
        return cn;
    }
}

    

