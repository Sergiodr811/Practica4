
package Vista;

import Controlador.Lista;
import Controlador.Nodo;
import Modelo.CCuenta;
import Modelo.CuentaCorriente;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class PanelOrdenar extends javax.swing.JPanel {

    Lista lista;
    ArrayList <CCuenta> aux = new ArrayList<>();
    DefaultListModel l = new DefaultListModel();
    
    public PanelOrdenar(Lista <CCuenta> list) {
        initComponents();
        this.lista = list;
        listOrdenada.setModel(l);
        
        
    }
    
    public void rellenarArray(Lista listaV){
        aux.clear();
        
        int i = 0;
        Nodo n = listaV.getNodo(0);
        
        while(n != null){
            aux.add((CCuenta)listaV.getNodo(i).getDato());
            i++;
            n = listaV.getNodo(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listOrdenada = new javax.swing.JList<>();
        botonOrdenarMostrar = new javax.swing.JButton();
        labelBurbuja = new javax.swing.JLabel();
        labelCollection = new javax.swing.JLabel();

        listOrdenada.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listOrdenada);

        botonOrdenarMostrar.setText("Ordenar y Mostrar");
        botonOrdenarMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(botonOrdenarMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(labelBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(botonOrdenarMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOrdenarMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarMostrarActionPerformed
        int tama??o = 100000;
        Lista listaV = new Lista(tama??o);
        
        if(listaV.getV()[0] != null){
            for(int i = 0; i < lista.getV().length;i++){
                listaV.insertar((int)(Math.random()*10+1), lista.getNodo(i));
            }
        }
        
        
        for(int i = 0; i < tama??o - 1;i++){
            listaV.insertar((int)(Math.random()*100000 + 1000), new CuentaCorriente("Prueba", (float)(Math.random()*2000 + 900), 1, 1, 2022, true));
        }
        
        
        rellenarArray(listaV);

        l.removeAllElements();

        long tiempoEmpezarBurbuja = System.nanoTime();
        listaV.ordenarLista();
        double tiempoFinalBurbuja = (double)(System.nanoTime() - tiempoEmpezarBurbuja) / 1000000000;
        
        for(int i = 0; i < tama??o - 1; i++){
            Nodo n = listaV.getNodo(i);
            System.out.println(n.getNumId());
        }
        
        long tiempoEmpezarArray = System.nanoTime();
        Collections.sort(aux);
        double tiempoFinalCollection = (double)(System.nanoTime() - tiempoEmpezarArray) / 1000000000;

        setMensajeOrdenar("Se ha ordenado la lista correctamente");
        
        labelBurbuja.setText("Metodo Burbuja ha tardado " + tiempoFinalBurbuja+ " segundos.");
        labelCollection.setText("Metodo Collection ha tardado " + tiempoFinalCollection + " segundos.");
        
        //JLIst
        for(int i = 0; i < aux.size(); i++){
            l.addElement(aux.get(i));
        }
    }//GEN-LAST:event_botonOrdenarMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOrdenarMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBurbuja;
    private javax.swing.JLabel labelCollection;
    private javax.swing.JList<String> listOrdenada;
    // End of variables declaration//GEN-END:variables

    
    private void setMensajeOrdenar(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Se ha ordenado la lista", JOptionPane.INFORMATION_MESSAGE);
    }
}
