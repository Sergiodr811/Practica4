package Controlador;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha implements Serializable, Comparable {
    
    private Calendar fec= new GregorianCalendar();
    
    public Fecha(int anio, int mes, int dia){
        fec.set(anio, mes, dia);
    }
    
    public int getdia(){
        return fec.get(Calendar.DATE);
    }
    
    public int getMes(){
        return fec.get(Calendar.MONTH);
    }
    
    public int getanio(){
        return fec.get(Calendar.YEAR);
    }
    
    public Calendar getFecha(){
        return fec;
    }

    @Override
    public String toString() {
        return ""+fec.get(Calendar.DATE)+"/"+fec.get(Calendar.MONTH)+"/"+fec.get(Calendar.YEAR); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
