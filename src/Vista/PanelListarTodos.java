/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.Lista;
import Controlador.Nodo;
import Modelo.CCuenta;
import Modelo.CuentaAhorro;
import Modelo.CuentaInversion;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PanelListarTodos extends javax.swing.JPanel {

    Lista lista;
    ArrayList <CCuenta> aux = new ArrayList<>();
    DefaultListModel l = new DefaultListModel();
    
    public PanelListarTodos(Lista list) {
        initComponents();
        this.lista = list;
        listTodos.setModel(l);
    }
    
    public void rellenarArray(){
        aux.clear();
        
        int i = 0;
        Nodo n = lista.getV()[0];
        
        while(n != null){
            aux.add((CCuenta)lista.getV()[i].getDato());
            i++;
            n = lista.getV()[i];
        }
    }
    
    public void vaciarArray(){
        l.removeAllElements();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listTodos = new javax.swing.JList<>();
        botonListar = new javax.swing.JButton();

        listTodos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTodos);

        botonListar.setText("Mostrar Cuentas");
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        l.removeAllElements();
        
        for(int i = 0; i < aux.size(); i++){
            l.addElement(aux.get(i));
        }
    }//GEN-LAST:event_botonListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTodos;
    // End of variables declaration//GEN-END:variables
}
