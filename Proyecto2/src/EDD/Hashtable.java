/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author rgabr
 */
public class Hashtable {
    static final int size=101; // se decide de un principio
    private int numElem;
    private User [] tabla;
    
    int key;//se deduce con el valor del usuario entre el size
    int value;//todo lo que tenga el usuario

    public Hashtable(int size, int key, int value) {
        
        this.key = key;
        this.value = value;
    }
    public int index(String clave){
        int i=0,p;
        int d;
        d =transformarCadena(clave);
        p=hash(d);
        
        return p;
    }
    public int transformarCadena(String c){
        int d;
        d=0;
        for (int i =0 ;i< Math.min(10, c.length());i++){
            d=d*27+(int)c.charAt(i);
        }
        if(d<0){
            d=-d;
        }
        return d;
        
    }
    private int hash(int k){
        
        int key=k%size;
        return key;
    }
    public void insertar(int k){
        System.out.println(k+" tiene el hash "+hash(k));
    }

    public int getSize() {
        return size;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
