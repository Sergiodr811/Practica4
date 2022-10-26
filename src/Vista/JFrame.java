
package Vista;

import Controlador.*;
import Modelo.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame {
    
    private Lista lista = new <CCuenta> Lista(100000);
    
    public JFrame() {
        initComponents();
        /*lista.insertar((int)(Math.random()*lista.getTam()+1), new CuentaCorriente("Sergio",3000,3, 10, 2002, true));
        lista.insertar((int)(Math.random()*lista.getTam()+1), new CuentaAhorro("Pedro",3000,17, 4, 2002, "BBVA"));
        lista.insertar((int)(Math.random()*lista.getTam()+1), new CuentaInversion("Sara",3000,3, 11, 2002, "FVDD"));
        lista.insertar((int)(Math.random()*lista.getTam()+1), new CuentaCorriente("Juan",2000,3, 4, 2002, false));
        lista.insertar((int)(Math.random()*lista.getTam()+1), new CuentaAhorro("Mario",3000,3, 4, 2002, "CAIXA"));
        */
        labelError.setVisible(false);
    }
    
    public Lista getLista(){
        return this.lista;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuConectar = new javax.swing.JMenu();
        ItemCargar = new javax.swing.JMenuItem();
        ItemGuardar = new javax.swing.JMenuItem();
        MenuInsertar = new javax.swing.JMenu();
        ItemCuentaAhorro = new javax.swing.JMenuItem();
        ItemCuentaInversion = new javax.swing.JMenuItem();
        ItemCuentaCorriente = new javax.swing.JMenuItem();
        MenuListar = new javax.swing.JMenu();
        ItemListarTodos = new javax.swing.JMenuItem();
        ItemListar1a1 = new javax.swing.JMenuItem();
        MenuOrdenar = new javax.swing.JMenu();
        ItemOrdenar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Practica 4");

        labelError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 0, 0));
        labelError.setText("NO HAY DATOS EN LA LISTA");

        MenuConectar.setText("Conectar");
        MenuConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuConectarMouseClicked(evt);
            }
        });

        ItemCargar.setText("Cargar");
        ItemCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemCargarMouseClicked(evt);
            }
        });
        ItemCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCargarActionPerformed(evt);
            }
        });
        MenuConectar.add(ItemCargar);

        ItemGuardar.setText("Guardar");
        ItemGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemGuardarMouseClicked(evt);
            }
        });
        ItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGuardarActionPerformed(evt);
            }
        });
        MenuConectar.add(ItemGuardar);

        jMenuBar1.add(MenuConectar);

        MenuInsertar.setText("Insertar");

        ItemCuentaAhorro.setText("Cuenta Ahorro");
        ItemCuentaAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCuentaAhorroActionPerformed(evt);
            }
        });
        MenuInsertar.add(ItemCuentaAhorro);

        ItemCuentaInversion.setText("Cuenta Inversion");
        ItemCuentaInversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCuentaInversionActionPerformed(evt);
            }
        });
        MenuInsertar.add(ItemCuentaInversion);

        ItemCuentaCorriente.setText("Cuenta Corriente");
        ItemCuentaCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCuentaCorrienteActionPerformed(evt);
            }
        });
        MenuInsertar.add(ItemCuentaCorriente);

        jMenuBar1.add(MenuInsertar);

        MenuListar.setText("Listar");

        ItemListarTodos.setText("Listar Todos");
        ItemListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListarTodosActionPerformed(evt);
            }
        });
        MenuListar.add(ItemListarTodos);

        ItemListar1a1.setText("Listar 1 a 1");
        ItemListar1a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListar1a1ActionPerformed(evt);
            }
        });
        MenuListar.add(ItemListar1a1);

        jMenuBar1.add(MenuListar);

        MenuOrdenar.setText("Ordenar");
        MenuOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuOrdenarMouseClicked(evt);
            }
        });

        ItemOrdenar.setText("Ordenar Lista");
        ItemOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemOrdenarActionPerformed(evt);
            }
        });
        MenuOrdenar.add(ItemOrdenar);

        jMenuBar1.add(MenuOrdenar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListarTodosActionPerformed
        if(lista.getNodo(0) != null)
        {
            labelError.setVisible(false);
            this.setContentPane(panelListarTodos);
            panelListarTodos.rellenarArray();
            panelListarTodos.vaciarArray();
            pack();
        }
        else{
            labelError.setVisible(true);
        }
        
        
        this.setContentPane(panelListarTodos);
        pack();
    }//GEN-LAST:event_ItemListarTodosActionPerformed

    private void ItemCuentaAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCuentaAhorroActionPerformed
        this.setContentPane(panelCA);
        pack();
    }//GEN-LAST:event_ItemCuentaAhorroActionPerformed

    private void ItemCuentaInversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCuentaInversionActionPerformed
        this.setContentPane(panelCI);
        pack();
    }//GEN-LAST:event_ItemCuentaInversionActionPerformed

    private void ItemCuentaCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCuentaCorrienteActionPerformed
        this.setContentPane(panelCC);
        pack();
    }//GEN-LAST:event_ItemCuentaCorrienteActionPerformed

    private void ItemListar1a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListar1a1ActionPerformed
        if(lista.getNodo(0) != null)
        {
            labelError.setVisible(false);
            this.setContentPane(panelListaruno);
            panelListaruno.inicializarCampos();
            pack();
        }
        else{
            labelError.setVisible(true);
        }
        
    }//GEN-LAST:event_ItemListar1a1ActionPerformed

    private void ItemCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCargarActionPerformed
        boolean seguir = true;
        try{    
            File fichero = new File("datosL.dat");
            FileInputStream f_entrada = new FileInputStream(fichero);
            ObjectInputStream entrada = new ObjectInputStream(f_entrada);
            
            while(seguir){
                this.getLista().insertar((Nodo)entrada.readObject());
            }
            entrada.close();
        }        
        catch(EOFException ex){
            System.out.println("Se han guardado los datos");
            seguir = false;
            setMensajeExito("Datos cargados correctamente");
        } 
        catch (FileNotFoundException ex) {
            setMensajeError("No se encuentra el archivo");
        }
        catch (IOException ex) {
            ex.printStackTrace();
            setMensajeError("No se puede leer el archivo");
            
        }
        catch (ClassNotFoundException ex) { 
            setMensajeError("El objeto leido no es compatible");
        }

        
    }//GEN-LAST:event_ItemCargarActionPerformed

    private void ItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGuardarActionPerformed
        try{
            FileOutputStream f_salida = new FileOutputStream("datosL.dat");
            ObjectOutputStream salida = new ObjectOutputStream(f_salida);
            
            for(int i = 0; i < this.getLista().getTam()-1; i++){
                this.getLista().setPosicion(0);
               if(this.getLista().getNodo(i) == null){
                   break;
               }
               else{
                   salida.writeObject(this.getLista().getNodo(i));
               }
            }
            salida.close();
            setMensajeExito("Datos guardados correctamente");
        } catch (FileNotFoundException ex) {
            setMensajeError("No se encuentra el archivo");
        }
        catch (IOException ex) {
            ex.printStackTrace();
            setMensajeError("No se puede leer el archivo");
        }
    }//GEN-LAST:event_ItemGuardarActionPerformed

    private void MenuConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuConectarMouseClicked

    }//GEN-LAST:event_MenuConectarMouseClicked

    private void ItemGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemGuardarMouseClicked
        
    }//GEN-LAST:event_ItemGuardarMouseClicked

    private void ItemCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemCargarMouseClicked
        
    }//GEN-LAST:event_ItemCargarMouseClicked

    private void MenuOrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuOrdenarMouseClicked
        
    }//GEN-LAST:event_MenuOrdenarMouseClicked

    private void ItemOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemOrdenarActionPerformed
        this.setContentPane(panelOrdenar);
        pack();
    }//GEN-LAST:event_ItemOrdenarActionPerformed

    
    
    private void setMensajeExito(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Operacion realizada con exito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void setMensajeError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Error en la introduccion de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    
    private final PanelCAhorro panelCA = new PanelCAhorro(lista);
    private final PanelCInversion panelCI = new PanelCInversion(lista);
    private final PanelCCorriente panelCC = new PanelCCorriente(lista);
    private final PanelListarTodos panelListarTodos = new PanelListarTodos(lista);
    private final PanelListaruno panelListaruno = new PanelListaruno(lista);
    private final PanelOrdenar panelOrdenar = new PanelOrdenar(lista);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemCargar;
    private javax.swing.JMenuItem ItemCuentaAhorro;
    private javax.swing.JMenuItem ItemCuentaCorriente;
    private javax.swing.JMenuItem ItemCuentaInversion;
    private javax.swing.JMenuItem ItemGuardar;
    private javax.swing.JMenuItem ItemListar1a1;
    private javax.swing.JMenuItem ItemListarTodos;
    private javax.swing.JMenuItem ItemOrdenar;
    private javax.swing.JMenu MenuConectar;
    private javax.swing.JMenu MenuInsertar;
    private javax.swing.JMenu MenuListar;
    private javax.swing.JMenu MenuOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelError;
    // End of variables declaration//GEN-END:variables
}
