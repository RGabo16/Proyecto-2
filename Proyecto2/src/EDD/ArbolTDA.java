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
public class ArbolTDA {
    NodoDoc nodoRaiz;

    public NodoDoc getNodoRaiz() {
        return nodoRaiz;
    }

    public void setNodoRaiz(NodoDoc nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }
    
    public boolean existe(NodoDoc nodo, int busqueda){
        if (nodo == null){
            return false;
        }
        if (nodo.getSize() == busqueda){
            return true;
        }
        else if (nodo.getSize()< busqueda){
            return existe(nodo.getDerecha(), busqueda);
        }else{
            return existe(nodo.getIzquierda(), busqueda);
        }
    }
    
    public void insertar(String name, int size, String type) {
        if (this.nodoRaiz == null) {
            this.nodoRaiz = new NodoDoc( name,  size,  type);
        } else {
            this.insertar(this.nodoRaiz, name,  size,  type);
        }
    }
    private void insertar(NodoDoc nodo,String name, int size, String type ){
       if (size > nodo.getSize()) {
            if (nodo.getDerecha() == null) {
                nodo.setDerecha(new NodoDoc(name,size,type));
            } else {
                this.insertar(nodo.getDerecha(), name,size,type);
            }
        } else {
            if (nodo.getIzquierda() == null) {
                nodo.setIzquierda(new NodoDoc(name,size,type));
            } else {
                this.insertar(nodo.getIzquierda(), name, size ,type);
            }
        }
    }
}
