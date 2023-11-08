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
}
