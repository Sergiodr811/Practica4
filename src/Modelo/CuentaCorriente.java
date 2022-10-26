
package Modelo;

import Controlador.*;
import static Modelo.IFecha.AÑO;
import static Modelo.IFecha.DIA_DEL_MES;
import static Modelo.IFecha.MES_DEL_AÑO;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class CuentaCorriente extends CCuenta implements Serializable, IFecha{
    private int comision;
    private boolean anual;
    
    public CuentaCorriente(){
        
    }
    
    public CuentaCorriente(String tit, float sal, int dia, int mes, int anio, boolean an){
        super(tit, sal, dia, mes, anio);
        this.comision = 20; //(int)Math.random()*100;
        this.anual = an;
    }
    
    public boolean comprobarAnual(){
        return super.getFecha().getMes() == mes();
    }
    
    public boolean comprobarSemestral(){
        return super.getFecha().getMes() >= (mes()+6);
    }
    
    public void realizarComision(){
        super.setSaldo((float) (super.getSaldo() + (super.getSaldo()* this.comision / 100)));
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public boolean isAnual() {
        return anual;
    }

    public void setAnual(boolean anual) {
        this.anual = anual;
    }
    
    public String toString(){
        return super.toString()+" (CuentaCorriente)";
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
