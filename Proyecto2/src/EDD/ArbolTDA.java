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
    private Nodo nodoRaiz;
    private Nodo derecha;
    private Nodo izquierda;

    
    /**
     * existe
     * @param nodo
     * @param busqueda
     * @return 
     */
    public boolean existe(Nodo nodo, int busqueda){
        Document document = (Document) nodo.getElement();
        if (this.getNodoRaiz() == null){
            return false;
        }
        if (document.getSize() == busqueda){
            return true;
        }
        else if (document.getSize() < busqueda){
            return existe(this.getDerecha(), busqueda);
        }else{
            return existe(this.getIzquierda(), busqueda);
        }
    }
    
    /**
     * Insertar
     * @param name
     * @param size
     * @param type 
     */
    public void insertar(String name, int size, String type) {
        if (this.getNodoRaiz() == null) {
            this.setNodoRaiz(new Nodo(new Document(name, size, type)));
        } else {
            this.insertar(this.getNodoRaiz(), name,  size,  type);
        }
    }
    
    /**
     * Insertar
     * @param nodo
     * @param name
     * @param size
     * @param type 
     */
    private void insertar(Nodo nodo,String name, int size, String type){
      Document document = (Document) nodo.getElement();
       if (size > document.getSize()) {
            if (this.getDerecha() == null) {
                this.setDerecha(new Nodo(new Document(name,size,type)));
            } else {
                this.insertar(this.getDerecha(), name,size,type);
            }
        } else {
            if (this.getIzquierda() == null) {
                this.setIzquierda(new Nodo(new Document(name,size,type)));
            } else {
                this.insertar(this.getIzquierda(), name, size ,type);
            }
        }
    }
    
      /**
     * Imprimir inorden
     * @param n 
     */
//    private void inorden(Nodo n) {
//        Document document = (Document) n.getElement();
//        if (n != null) {
//            inorden(this.getIzquierda());
//            n.imprimirDato();
//            inorden(this.getDerecha());
//        }
//    }
    
    /**
     * getNodoRaiz
     * @return 
     */
    public Nodo getNodoRaiz() {
        return nodoRaiz;
    }

    /**
     * setNodoRaiz
     * @param nodoRaiz 
     */
    public void setNodoRaiz(Nodo nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }
    
    /**
     * getDerecha
     * @return the derecha
     */
    public Nodo getDerecha() {
        return derecha;
    }

    /**
     * setDerecha
     * @param derecha the derecha to set
     */
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    /**
     * getIzquierda
     * @return the izquierda
     */
    public Nodo getIzquierda() {
        return izquierda;
    }

    /**
     * setIzquierda
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
  
    
}
