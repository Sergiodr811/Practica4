
package Modelo;

import Controlador.*;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class CuentaAhorro extends CCuenta implements Serializable, IFecha{
    private int interes;
    private String banco;
    
    
    public CuentaAhorro(){
        
    }
    
    public CuentaAhorro(String tit, float sal, int dia, int mes, int anio, String nombreB){
        super(tit, sal, dia, mes, anio);
        this.banco = nombreB;
        this.interes = (int)Math.random()*10;
    }
    
    public boolean comprobarMes(){
        return super.getFecha().getdia() == dia();
    }
    
    public void realizarInteres(){
        
        super.setSaldo((float) (super.getSaldo() + (super.getSaldo()* this.interes / 100)));
    }
    

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    public String toString(){
        return super.toString()+" (CuentaAhorro)";
    }

    @Override
    public int dia() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(DIA_DEL_MES);
    }

    @Override
    public int mes() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(MES_DEL_AÑO)+1;
    }

    @Override
    public int anio() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(AÑO);
    }
}
