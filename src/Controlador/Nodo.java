
package Controlador;

import Modelo.*;
import java.io.Serializable;

public class Nodo<T> implements Serializable, Comparable <Nodo>{
    private T dato;
    private int numId;
    
    public Nodo(int id, T object){
        this.dato = object;
        this.numId = id;
    }


    public T getDato() {
        return dato;
    }


    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the numId
     */
    public int getNumId() {
        return numId;
    }

    /**
     * @param numId the numId to set
     */
    public void setNumId(int numId) {
        this.numId = numId;
    }

    @Override
    public int compareTo(Nodo o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
