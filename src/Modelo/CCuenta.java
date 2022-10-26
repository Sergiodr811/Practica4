
package Modelo;

import java.io.*;
import Controlador.*;

public class CCuenta implements Serializable, Comparable{
    private int numCuenta;
    private transient String titular;
    private float saldo;
    private int saldoMin;
    private Fecha fecha;
    
    public CCuenta (){
        this.numCuenta = (int) Math.random() * 100;
        this.titular = "";
        this.saldo = 0;
        this.saldoMin = 900;
    }
    
    public CCuenta(String tit, float sal, int dia, int mes, int anio){
        this.numCuenta = (int)(Math.random()*100+1);
        this.titular = tit;
        this.saldo = sal;
        this.fecha = new Fecha(anio, mes, dia);
    }
    
    public boolean comprobarSaldo(float sal){
        return (sal >= saldoMin);
    }


    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(int saldoMin) {
        this.saldoMin = saldoMin;
    }

    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    public String toString(){
        return getNumCuenta()+", "+getTitular()+", "+getSaldo()+" ";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
