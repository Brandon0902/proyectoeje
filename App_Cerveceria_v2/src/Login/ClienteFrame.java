package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static login.ConexionMySQL.conectar;
import java.sql.ResultSet;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author brand
 */
public class ClienteFrame extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public ClienteFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seleccionarProducto = new javax.swing.JComboBox<>();
        seleccionarSucursal = new javax.swing.JComboBox<>();
        cantidadCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        seleccionarEstablecimiento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido Estimado Cliente");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Realizar una compra ");

        seleccionarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el producto", "Corona Light", "Corona Cero", "Barrilito", "Estrella", "León", "Modelo Especial", "Modelo Negra", "Modelo Ámbar", "Montejo", "Pacífico", "Pacífico Light", "Tropical Light", "Victoria", "Cerveza Ideal: Azabache y As de oros", "Cucapá", "Bocanegra", "Tijuana", "Mexicali", "Agua Nestle", "Agua Perrier", "Agua Santa Maria" }));

        seleccionarSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la Sucursal", "Guadalajara ", "Zacatecas", "Sinaloa", "Coahuila", "Hidalgo", "Ciudad de Mexico", "Oxaca", "Yucutan" }));
        seleccionarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarSucursalActionPerformed(evt);
            }
        });

        cantidadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        cantidadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadClienteActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo-modelo (1)-PhotoRoom.png-PhotoRoom.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito-de-supermercado.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerveza.png"))); // NOI18N
        jButton1.setText("Finalizar Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        seleccionarEstablecimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de establecimiento", "Tiendas de autoservicio", "Tiendas de conveniencia", "Bares y restaurantes", "Hoteles", "Distribuidores autorizados", "Modeloramas", "Independiente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seleccionarEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(seleccionarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadCliente)
                                .addComponent(seleccionarSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(seleccionarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cantidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seleccionarEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionarSucursalActionPerformed

    private void cantidadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String selecProducto = seleccionarProducto.getSelectedItem().toString();
    String selecSucursal = seleccionarSucursal.getSelectedItem().toString();
    String selecEstablecimiento = seleccionarEstablecimiento.getSelectedItem().toString();
    int cantCliente = Integer.parseInt(cantidadCliente.getText());
   
    if (!selecProducto.isEmpty() && !selecSucursal.isEmpty() &&  cantCliente > 0) {
        try {
            Cliente Cliente= new Cliente();
            Cliente.setSeleccionarProducto(selecProducto);
            Cliente.setSeleccionarSucursal(selecSucursal);
            Cliente.setProductoCantidad( cantCliente);
            Connection cn = conectar(); // Reemplaza conectar() con tu método de conexión a la base de datos

            // Consulta para verificar la disponibilidad del producto en la sucursal
            String consultaDisponibilidad = "SELECT * FROM productos WHERE nombre = ? AND sucursal = ?";
            PreparedStatement psDisponibilidad = cn.prepareStatement(consultaDisponibilidad);
            psDisponibilidad.setString(1, selecProducto);
            psDisponibilidad.setString(2,  selecSucursal);
            ResultSet rsDisponibilidad = psDisponibilidad.executeQuery();

            if (rsDisponibilidad.next()) {
                // Producto disponible en la sucursal
                int cantidadDisponible = rsDisponibilidad.getInt("cantidad");

                if ( cantCliente <= cantidadDisponible) {
                    // Realizar la inserción en la base de datos
                    String consulta = "INSERT INTO pedidos (nombre_producto, sucursal_compra, establecimiento, cantidad) VALUES (?, ?, ?, ?)";
                    PreparedStatement ps = cn.prepareStatement(consulta);
                    ps.setString(1, selecProducto);
                    ps.setString(2, selecSucursal);
                    ps.setString(3, selecEstablecimiento);
                    ps.setInt(4,  cantCliente);
                    ps.executeUpdate();

                    // Actualizar la cantidad en la tabla de productos
                    int nuevaCantidad = cantidadDisponible - cantCliente;
                    String consultaActualizarCantidad = "UPDATE productos SET cantidad = ? WHERE nombre = ? AND sucursal = ?";
                    PreparedStatement psActualizarCantidad = cn.prepareStatement(consultaActualizarCantidad);
                    psActualizarCantidad.setInt(1, nuevaCantidad);
                    psActualizarCantidad.setString(2, selecProducto);
                    psActualizarCantidad.setString(3, selecSucursal);
                    psActualizarCantidad.executeUpdate();

                    // Cerrar la conexión
                    cn.close();

                    JOptionPane.showMessageDialog(this, "La compra se ha realizado correctamente");

                    // Limpiar los campos
                    seleccionarProducto.setSelectedIndex(0);
                    seleccionarSucursal.setSelectedIndex(0);
                    seleccionarEstablecimiento.setSelectedIndex(0);
                    cantidadCliente.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "No hay suficiente cantidad disponible del producto en la sucursal");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El producto no está disponible en la sucursal seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un producto, una sucursal y un establecimiento, y la cantidad debe ser mayor a 0");
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> seleccionarEstablecimiento;
    private javax.swing.JComboBox<String> seleccionarProducto;
    private javax.swing.JComboBox<String> seleccionarSucursal;
    // End of variables declaration//GEN-END:variables
}
