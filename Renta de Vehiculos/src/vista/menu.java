/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Mantenimientos.MantenimientoEstadoVehiculo;
import Mantenimientos.MantenimientoMarcasyTipo;
import Mantenimientos.MantenimientoVehiculo;
import Mantenimientos.MatenimientoClientes;
import RENTA_VEHICULOS.Detalle_Renta;
import RENTA_VEHICULOS.Tipo_vehiculo;
import RENTA_VEHICULOS.VEHICULO_ESTADO;
import RENTA_VEHICULOS.Validaciones;
import RENTA_VEHICULOS.Vehiculos;
import Recibo.recibo_renta_vehiculo;
import modelo.Usuarios;

/**
 *
 */
public class menu extends javax.swing.JFrame {

    Usuarios mod;

    public menu() {
        initComponents();
    }

    menu(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        if (mod.getIdTipo() == 1) {
            menuMantenimientos.setVisible(true);
            menuRENTAS.setVisible(true);
            SALIR.setVisible(true);
            VALIDACIONES.setVisible(true);
            RECIBO.setVisible(true);
            
        } else {
           RECIBO.setVisible(true);
           SALIR.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMantenimientos = new javax.swing.JMenu();
        Mantenimientocliente = new javax.swing.JMenuItem();
        MantenimientoMarcaytipo = new javax.swing.JMenuItem();
        mantevehiculos = new javax.swing.JCheckBoxMenuItem();
        manteestadovehiculo = new javax.swing.JCheckBoxMenuItem();
        menuRENTAS = new javax.swing.JMenu();
        detallederenta = new javax.swing.JMenuItem();
        tipodevehiculo = new javax.swing.JCheckBoxMenuItem();
        vehiculoss = new javax.swing.JCheckBoxMenuItem();
        estadodelvehiculo = new javax.swing.JCheckBoxMenuItem();
        VALIDACIONES = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        RECIBO = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        SALIR = new javax.swing.JMenu();
        Salirdelsistema = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        menuMantenimientos.setText("MANTENIMIENTOS");

        Mantenimientocliente.setText("Mantenimiento Cliente");
        Mantenimientocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoclienteActionPerformed(evt);
            }
        });
        menuMantenimientos.add(Mantenimientocliente);

        MantenimientoMarcaytipo.setText("Mantenimiento Marca y Tipo");
        MantenimientoMarcaytipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoMarcaytipoActionPerformed(evt);
            }
        });
        menuMantenimientos.add(MantenimientoMarcaytipo);

        mantevehiculos.setSelected(true);
        mantevehiculos.setText("Mantenimiento Vehiculo");
        mantevehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantevehiculosActionPerformed(evt);
            }
        });
        menuMantenimientos.add(mantevehiculos);

        manteestadovehiculo.setSelected(true);
        manteestadovehiculo.setText("Mantenimiento Estado de Vehiculo");
        manteestadovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manteestadovehiculoActionPerformed(evt);
            }
        });
        menuMantenimientos.add(manteestadovehiculo);

        jMenuBar1.add(menuMantenimientos);

        menuRENTAS.setText("RENTAS");

        detallederenta.setText("Detalle_Renta");
        detallederenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallederentaActionPerformed(evt);
            }
        });
        menuRENTAS.add(detallederenta);

        tipodevehiculo.setSelected(true);
        tipodevehiculo.setText("Tipo Vehiculo");
        tipodevehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodevehiculoActionPerformed(evt);
            }
        });
        menuRENTAS.add(tipodevehiculo);

        vehiculoss.setSelected(true);
        vehiculoss.setText("Vehiculo");
        vehiculoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculossActionPerformed(evt);
            }
        });
        menuRENTAS.add(vehiculoss);

        estadodelvehiculo.setSelected(true);
        estadodelvehiculo.setText("Estado_Vehiculo");
        estadodelvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadodelvehiculoActionPerformed(evt);
            }
        });
        menuRENTAS.add(estadodelvehiculo);

        jMenuBar1.add(menuRENTAS);

        VALIDACIONES.setText("VALIDACIONES");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Validaciones");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        VALIDACIONES.add(jCheckBoxMenuItem1);

        jMenuBar1.add(VALIDACIONES);

        RECIBO.setText("RECIBO");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Recibo");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        RECIBO.add(jCheckBoxMenuItem2);

        jMenuBar1.add(RECIBO);

        SALIR.setText("SALIR");

        Salirdelsistema.setSelected(true);
        Salirdelsistema.setText("Salir del Sistema");
        Salirdelsistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirdelsistemaActionPerformed(evt);
            }
        });
        SALIR.add(Salirdelsistema);

        jMenuBar1.add(SALIR);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenimientoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoclienteActionPerformed
        // 
         MatenimientoClientes frm = new MatenimientoClientes();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_MantenimientoclienteActionPerformed

    private void MantenimientoMarcaytipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoMarcaytipoActionPerformed
        // TODO add your handling code here:
         MantenimientoMarcasyTipo frm = new MantenimientoMarcasyTipo();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_MantenimientoMarcaytipoActionPerformed

    private void mantevehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantevehiculosActionPerformed
        // TODO add your handling code here:
        MantenimientoVehiculo frm = new MantenimientoVehiculo();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_mantevehiculosActionPerformed

    private void SalirdelsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirdelsistemaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirdelsistemaActionPerformed

    private void manteestadovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manteestadovehiculoActionPerformed
        // TODO add your handling code here:
        MantenimientoEstadoVehiculo frm = new MantenimientoEstadoVehiculo();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_manteestadovehiculoActionPerformed

    private void detallederentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallederentaActionPerformed
        // TODO add your handling code here:
        Detalle_Renta frm = new Detalle_Renta();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_detallederentaActionPerformed

    private void tipodevehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodevehiculoActionPerformed
        // TODO add your handling code here:
        Tipo_vehiculo frm = new Tipo_vehiculo();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_tipodevehiculoActionPerformed

    private void vehiculossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculossActionPerformed
        // TODO add your handling code here:
         Vehiculos frm = new Vehiculos();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_vehiculossActionPerformed

    private void estadodelvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadodelvehiculoActionPerformed
        // TODO add your handling code here:
        VEHICULO_ESTADO frm = new VEHICULO_ESTADO();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_estadodelvehiculoActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        
         recibo_renta_vehiculo frm = new recibo_renta_vehiculo();
         frm.setVisible(true);        
         this.setVisible(false);        
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        Validaciones frm = new Validaciones();
         frm.setVisible(true);        
         this.setVisible(false);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MantenimientoMarcaytipo;
    private javax.swing.JMenuItem Mantenimientocliente;
    private javax.swing.JMenu RECIBO;
    private javax.swing.JMenu SALIR;
    private javax.swing.JCheckBoxMenuItem Salirdelsistema;
    private javax.swing.JMenu VALIDACIONES;
    private javax.swing.JMenuItem detallederenta;
    private javax.swing.JCheckBoxMenuItem estadodelvehiculo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBoxMenuItem manteestadovehiculo;
    private javax.swing.JCheckBoxMenuItem mantevehiculos;
    private javax.swing.JMenu menuMantenimientos;
    private javax.swing.JMenu menuRENTAS;
    private javax.swing.JCheckBoxMenuItem tipodevehiculo;
    private javax.swing.JCheckBoxMenuItem vehiculoss;
    // End of variables declaration//GEN-END:variables
}
