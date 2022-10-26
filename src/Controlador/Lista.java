
package Controlador;

import Modelo.*;

public class Lista <T>{

    private Nodo[] v;
    private int posicion = 0;
    private int tam;
    
    public Lista(int tamaño){
        v = new Nodo[tamaño];
        this.tam = tamaño;
    }
    
    public void insertar(int id, T obj){
        v[encontrarhueco()] = new Nodo(id, obj);
    }
    
    public void insertar(Nodo obj){
        v[encontrarhueco()] = obj;
        
    }
    
    public void avanzar(){
        if(getPosicion() < getTam()){
            setPosicion(getPosicion()+1);
        }
    }
    
    public void retroceder(){
        if(getPosicion() >= 0){
            setPosicion(getPosicion()-1);
        }
    }
    
    public int encontrarhueco(){
        int i;
        
        for(i = 0; i < getV().length; i++){
            if(getV()[i] == null){
                break;
            }
        }
        return i;
    }
    
    public Nodo getNodo(int pos){
        return v[pos];
    }
    
    
    
    public void ordenarLista(){        
        int n = this.v.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                try{
                    if (this.v[j].getNumId() > this.v[j+1].getNumId()) {
                        Nodo temp = this.v[j];
                        this.v[j] = this.v[j+1];
                        this.v[j+1] = temp;
                    }
                }
                catch(NullPointerException e){
                    
                }
            }    
        }
    }

    /**
     * @return the v
     */
    public Nodo[] getV() {
        return v;
    }
    


    /**
     * @param v the v to set
     */
    public void setV(Nodo[] v) {
        this.v = v;
    }

    /**
     * @return the tam
     */
    public int getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(int pos) {
        this.posicion = pos;
    }

}
