/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RENTA_VEHICULOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.menu;

/**
 *
 * @author Diana
 */
public class VEHICULO_ESTADO extends javax.swing.JFrame {

    /**
     * Creates new form VEHICULO_ESTADO
     */
    public VEHICULO_ESTADO() {
        initComponents();
         this.tabladedatos.setModel(model);
        this.model.addColumn("Codigo");
        this.model.addColumn("ID_VEHICULO_ESTADO");
        this.model.addColumn("DESCRIPCION");
      
       
    
        
        this.tabladedatos.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     DefaultTableModel model=new DefaultTableModel();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtidvehiculoestado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladedatos = new javax.swing.JTable();
        Label_status = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("ID_VEHICULO_ESTADO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 130, -1));

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 130, -1));
        getContentPane().add(txtidvehiculoestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 130, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("DESCRIPCION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 130, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 150, -1));

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 150, -1));

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 150, 20));

        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 150, -1));

        jButton6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 150, -1));

        jButton5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 150, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("VEHICULO_ESTADO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        tabladedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladedatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 680, 120));
        getContentPane().add(Label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 110, 30));

        jButton7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton7.setText("REGRESAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 150, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 750, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // CONEXION MYSQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_renta","root","");

            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_renta","root","");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into VEHICULO_ESTADO values(?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtcodigo.getText().trim());
            pst.setString(3, txtidvehiculoestado.getText().trim());
            pst.setString(4, txtdescripcion.getText().trim());
            

            pst.executeUpdate();

            txtcodigo.setText("");
            txtidvehiculoestado.setText("");
            txtdescripcion.setText("");
           
            Label_status.setText("Registro exitoso");

        } catch (Exception e) {

        }

        //-----------------------------------------------------------------------------------------------------------------------------------------------------//
        // CODIGO VEHICULO ESTADO

        this.model.addRow(new Object [] {
            this.txtcodigo.getText(),this.txtidvehiculoestado.getText(), this.txtdescripcion.getText()
        });
        this.txtcodigo.setText("");
        this.txtidvehiculoestado.setText("");
        this.txtdescripcion.setText("");
  
        txtcodigo.grabFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // CONEXION MYSQL
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_renta","root","");

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_renta", "root", "");//conecta a MYSQL
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into VEHICULO_ESTADO values(?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtcodigo.getText().trim());
            pst.setString(3, txtidvehiculoestado.getText().trim());
            pst.setString(4, txtdescripcion.getText().trim());
            
            pst.executeUpdate();

            txtcodigo.setText("");
            txtidvehiculoestado.setText("");
            txtdescripcion.setText("");
           

            Label_status.setText("Registro exitoso.");

        }catch (Exception e){
            e.printStackTrace();
        }
        //---------------------------------------------------------------------------------------------------//
        //CODIGO VEHICULO ESTADO
        this.txtcodigo.setText("");
        this.txtidvehiculoestado.setText("");
        this.txtdescripcion.setText("");

        txtcodigo.grabFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // CONEXION MYSQL MODIFICAR

        try {
            String ID = txtid.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_renta", "root", "");
            java.sql.PreparedStatement pst = cn.prepareStatement("update VEHICULO_ESTADO set Codigo=?,  ID_VEHICULO_ESTADO=?,  DESCRIPCION=?  where ID = " + ID);

            pst.setString(1, txtcodigo.getText().trim());
            pst.setString(2, txtidvehiculoestado.getText().trim());
            pst.setString(3, txtdescripcion.getText().trim());
            pst.executeUpdate();

            Label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }

        //-----------------------------------------------------------------------------------------------------//
        // CODIGO VEHICULO ESTADO

        String [] datos=new String [3];
        datos[0]=txtcodigo.getText();
        datos[1]=txtidvehiculoestado.getText();
        datos[2]=txtdescripcion.getText();
        

        int i = 0;

        for (int a  = 0; a < tabladedatos.getColumnCount(); a++) {
            model.setValueAt(datos[a],filas, a );
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_renta", "root", "");
            java.sql.PreparedStatement pst = cn.prepareStatement("delete from VEHICULO_ESTADO where ID = ?");

            pst.setString(1, txtid.getText().trim());

            pst.executeUpdate();

            txtcodigo.setText("");
            txtidvehiculoestado.setText("");
            txtdescripcion.setText("");        

            Label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }

        //---------------------------------------------------------------------------------------------------------------//
        //CODIGO VEHICULO ESTADO
        DefaultTableModel modelo = (DefaultTableModel) tabladedatos.getModel();
        int a=tabladedatos.getSelectedRow();
        if (a<0){
            //JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }else{
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro?");
            if (JOptionPane.OK_OPTION == confirmar){
                modelo.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //BOTON BUSCAR
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Proyecto_renta", "root", "");
            java.sql.PreparedStatement pst = cn.prepareStatement("select * from VEHICULO_ESTADO where ID = ?");

            pst.setString(1, txtid.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){

                txtcodigo.setText(rs.getString("Codigo"));
                txtidvehiculoestado.setText(rs.getString("ID_VEHICULO_ESTADO"));
                txtdescripcion.setText(rs.getString("DESCRIPCION"));
                

            } else {
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        menu GN= new menu();
        GN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    
     int filas;
     
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
            java.util.logging.Logger.getLogger(VEHICULO_ESTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEHICULO_ESTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEHICULO_ESTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEHICULO_ESTADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEHICULO_ESTADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladedatos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidvehiculoestado;
    // End of variables declaration//GEN-END:variables
}