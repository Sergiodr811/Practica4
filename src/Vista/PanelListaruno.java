
package Vista;

import Controlador.Lista;
import Modelo.CCuenta;
import Modelo.CuentaAhorro;
import Modelo.CuentaCorriente;
import Modelo.CuentaInversion;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class PanelListaruno extends javax.swing.JPanel {

    Lista lista;
    
    public PanelListaruno(Lista list) {
        initComponents();
        this.lista = list;
        
        fieldNumero.setEditable(false);
        fieldSaldo.setEditable(false);
        fieldTitular.setEditable(false);
        fieldTipo.setEditable(false);
        fieldDia.setEditable(false);
        fieldMes.setEditable(false);
        fieldAnio.setEditable(false);
        radioBotonSemestral.setEnabled(false);
        
        
        if(lista.getPosicion() >= lista.getTam()){
            botonSiguiente.setEnabled(false);
        }
        else
        {
            botonSiguiente.setEnabled(true);
        }
        if(lista.getPosicion() == 0){
            botonAnterior.setEnabled(false);
        }
        else{
            botonAnterior.setEnabled(true);
        }
    }

    public void inicializarCampos(){
        Object ob = lista.getNodo(0).getDato();
        
        if(ob instanceof CuentaAhorro){
            setCamposCuentaAhorro(ob);
        }
        else if(ob instanceof CuentaInversion){
            setCamposCuentaInversion(ob);
        }
        else{
            setCamposCuentaCorriente(ob);
        }
        botonAnterior.setEnabled(false);
    }
    
    public void setCamposCuentaAhorro(Object ob){
        labelNombreCuenta.setText("Cuenta Ahorro");
        labelTipo.setText("Nombre del banco:");
        fieldTipo.setVisible(true);
        radioBotonSemestral.setVisible(false);
        
        if(((CCuenta)ob).getTitular() == null){
            fieldTitular.setText("-----------");
            fieldTitular.setBackground(Color.gray);
        }
        else{
            fieldTitular.setText(""+((CCuenta)ob).getTitular());
            fieldTitular.setBackground(Color.white);
        }
        
        fieldNumero.setText(""+((CCuenta)ob).getNumCuenta());
        fieldSaldo.setText(""+((CCuenta)ob).getSaldo());
        fieldTipo.setText(""+((CuentaAhorro)ob).getBanco());
        fieldDia.setText(""+((CCuenta)ob).getFecha().getdia());
        fieldMes.setText(""+((CCuenta)ob).getFecha().getMes());
        fieldAnio.setText(""+((CCuenta)ob).getFecha().getanio());
        
        if(((CuentaAhorro)ob).comprobarMes()){
            botonCalcular.setEnabled(true);
        }
        else{
            botonCalcular.setEnabled(false);
        }
    }
    
    public void setCamposCuentaInversion(Object ob){
        labelNombreCuenta.setText("Cuenta Inversion");
        labelTipo.setText("Nombre de la Sucursal:");
        fieldTipo.setVisible(true);
        radioBotonSemestral.setVisible(false);
        
        if(((CCuenta)ob).getTitular() == null){
            fieldTitular.setText("-----------");
            fieldTitular.setBackground(Color.gray);
        }
        else{
            fieldTitular.setText(""+((CCuenta)ob).getTitular());
            fieldTitular.setBackground(Color.white);
        }
        fieldNumero.setText(""+((CCuenta)ob).getNumCuenta());
        fieldSaldo.setText(""+((CCuenta)ob).getSaldo());
        fieldTipo.setText(""+((CuentaInversion)ob).getSucursal());
        fieldDia.setText(""+((CCuenta)ob).getFecha().getdia());
        fieldMes.setText(""+((CCuenta)ob).getFecha().getMes());
        fieldAnio.setText(""+((CCuenta)ob).getFecha().getanio());
        
        if(((CuentaInversion)ob).comprobarTrimestre()){
            botonCalcular.setEnabled(true);
        }
        else{
            botonCalcular.setEnabled(false);
        }
        
    }
    
    public void setCamposCuentaCorriente(Object ob){
        labelNombreCuenta.setText("Cuenta Corriente");
        labelTipo.setText("Semestral");
        fieldTipo.setVisible(false);
        radioBotonSemestral.setVisible(true);
        if(((CuentaCorriente)ob).isAnual() == true){
            radioBotonSemestral.setSelected(false);
        }
        else{
            radioBotonSemestral.setSelected(true);
        }
        
        if(((CCuenta)ob).getTitular() == null){
            fieldTitular.setText("-----------");
            fieldTitular.setBackground(Color.gray);
        }
        else{
            fieldTitular.setText(""+((CCuenta)ob).getTitular());
            fieldTitular.setBackground(Color.white);
        }
        fieldNumero.setText(""+((CCuenta)ob).getNumCuenta());
        fieldSaldo.setText(""+((CCuenta)ob).getSaldo());
        fieldDia.setText(""+((CCuenta)ob).getFecha().getdia());
        fieldMes.setText(""+((CCuenta)ob).getFecha().getMes());
        fieldAnio.setText(""+((CCuenta)ob).getFecha().getanio());
        
        if(((CuentaCorriente)ob).isAnual())
        {
            if(((CuentaCorriente)ob).comprobarAnual()){
                botonCalcular.setEnabled(true);
            }
            else{
                botonCalcular.setEnabled(false);
            }
        }
        else{
            if(((CuentaCorriente)ob).comprobarSemestral()){
                botonCalcular.setEnabled(true);
            }
            else{
                botonCalcular.setEnabled(false);
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNumero = new javax.swing.JLabel();
        labelTitular = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        radioBotonSemestral = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fieldNumero = new javax.swing.JTextField();
        fieldTitular = new javax.swing.JTextField();
        fieldSaldo = new javax.swing.JTextField();
        fieldTipo = new javax.swing.JTextField();
        fieldDia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldMes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldAnio = new javax.swing.JTextField();
        botonAnterior = new javax.swing.JButton();
        botonCalcular = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        labelNombreCuenta = new javax.swing.JLabel();

        labelNumero.setText("Numero Cuenta:");

        labelTitular.setText("Titular:");

        labelSaldo.setText("Saldo:");

        jLabel1.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(labelTitular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioBotonSemestral)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBotonSemestral)
                    .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        fieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSaldoActionPerformed(evt);
            }
        });

        fieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTipoActionPerformed(evt);
            }
        });

        fieldDia.setText("dd");
        fieldDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDiaActionPerformed(evt);
            }
        });

        jLabel2.setText("/");

        fieldMes.setText("mm");
        fieldMes.setPreferredSize(new java.awt.Dimension(19, 19));

        jLabel3.setText("/");

        fieldAnio.setText("yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldNumero)
                    .addComponent(fieldTitular)
                    .addComponent(fieldSaldo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(fieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(fieldMes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        botonAnterior.setText("Anterior");
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });

        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        labelNombreCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombreCuenta.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDiaActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
       lista.avanzar();
        System.out.println("");
        if(lista.getPosicion() < lista.getTam())
        {
            botonAnterior.setEnabled(true);
            Object ob = lista.getNodo(lista.getPosicion()).getDato();

            if(ob instanceof CuentaAhorro){
                setCamposCuentaAhorro(ob);
            }
            else if(ob instanceof CuentaInversion){
                setCamposCuentaInversion(ob);
            }
            else{
                setCamposCuentaCorriente(ob);
            }
            if(lista.getNodo(lista.getPosicion()+1) == null)
            {
                botonSiguiente.setEnabled(false);
            }
        }
        else{
            lista.retroceder();
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
        lista.retroceder();
        if(lista.getPosicion() >= 0)
        {
            botonSiguiente.setEnabled(true);
            Object ob = lista.getNodo(lista.getPosicion()).getDato();

            if(ob instanceof CuentaAhorro){
                setCamposCuentaAhorro(ob);
            }
            else if(ob instanceof CuentaInversion){
                setCamposCuentaInversion(ob);
            }
            else{
                setCamposCuentaCorriente(ob);
            }
            if(lista.getPosicion() == 0)
            {
                botonAnterior.setEnabled(false);
            }
        }
        else{
            lista.avanzar();
        }
    }//GEN-LAST:event_botonAnteriorActionPerformed

    private void fieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSaldoActionPerformed

    private void fieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTipoActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        Object ob = lista.getNodo(lista.getPosicion()).getDato();
        
        if(ob instanceof CuentaAhorro){
            ((CuentaAhorro)ob).realizarInteres();
            setMensajeCalcular("Se ha realizado un interes del "+((CuentaAhorro)ob).getInteres()+"%");
            setCamposCuentaAhorro(ob);
        }
        else if(ob instanceof CuentaInversion){
            ((CuentaInversion)ob).realizarBenoper();
            if(((CuentaInversion)ob).getBenoper() >= 0){
                setMensajeCalcular("Se ha realizado un beneficio del "+((CuentaInversion)ob).getBenoper()+"%");
            }
            else{
                setMensajeCalcular("Se ha realizado una perdida del "+((CuentaInversion)ob).getBenoper()+"%");
            }
            setCamposCuentaInversion(ob);
        }
        else{
            ((CuentaCorriente)ob).realizarComision();
            setMensajeCalcular("Se ha realizado una comision del "+((CuentaCorriente)ob).getComision()+"%");
            setCamposCuentaCorriente(ob);
        }
    }//GEN-LAST:event_botonCalcularActionPerformed

    
    private void setMensajeCalcular(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Se ha realizado la operacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField fieldAnio;
    private javax.swing.JTextField fieldDia;
    private javax.swing.JTextField fieldMes;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldSaldo;
    private javax.swing.JTextField fieldTipo;
    private javax.swing.JTextField fieldTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombreCuenta;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTitular;
    private javax.swing.JRadioButton radioBotonSemestral;
    // End of variables declaration//GEN-END:variables
}
