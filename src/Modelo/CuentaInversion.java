
package Modelo;

import Controlador.*;
import static Modelo.IFecha.AÑO;
import static Modelo.IFecha.DIA_DEL_MES;
import static Modelo.IFecha.MES_DEL_AÑO;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class CuentaInversion extends CCuenta implements Serializable, IFecha{
    private float Benoper;
    private String sucursal;
    
    public CuentaInversion(){
    }
    
    public CuentaInversion(String tit, float sal, int dia, int mes, int anio, String nombreS){
        super(tit, sal, dia, mes, anio);
        this.sucursal = nombreS;
        this.Benoper = generarBenoper();
    }

    public float generarBenoper(){
        return Benoper = (int)Math.random()*(-11-11+1)+11;
    }
    
    public void realizarBenoper(){
        if(this.Benoper < 0)
        {
            this.Benoper = this.Benoper * (-1);
            super.setSaldo((float) (super.getSaldo() - (super.getSaldo() * this.Benoper / 100)));
        }
        else{
            super.setSaldo((float) (super.getSaldo() + (super.getSaldo() * this.Benoper / 100)));
        }
    }
    
    public boolean comprobarTrimestre(){
        return super.getFecha().getMes() >= (mes()+3);
    }
    
    public float getBenoper() {
        return Benoper;
    }

    public void setBenoper(float Benoper) {
        this.Benoper = Benoper;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    public String toString(){
        return super.toString()+" (CuentaInversion)";
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
