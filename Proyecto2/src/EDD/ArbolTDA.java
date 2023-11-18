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

    
    
    
    public ArbolTDA(){
        nodoRaiz=null;
    }
    
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
            return existe(nodo.getDerecha(), busqueda);
        }else{
            return existe(nodo.getIzquierda(), busqueda);
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
            if (nodo.getDerecha() == null) {
                nodo.setDerecha(new Nodo(new Document(name,size,type)));
            } else {
                this.insertar(nodo.getDerecha(), name,size,type);
            }
        } else {
            if (nodo.getIzquierda() == null) {
                nodo.setIzquierda(new Nodo(new Document(name,size,type)));
            } else {
                this.insertar(nodo.getIzquierda(), name, size ,type);
            }
        }
    }
    
    /**
     * ObtenerFe
     * @param n   
     * @return    
    */
    public int obtenerFe(Nodo n){
        if (n==null)
            return -1;
        else
            return n.getFe();
    }
    
    /**
     * rotacionIzquierda
     * @param n   
     * @return    
    */
    public Nodo rotacionIzquierda(Nodo n){
        Nodo aux=n.getIzquierda();
        n.setIzquierda(aux.getDerecha());
        aux.setDerecha(n);
        n.setFe(Math.max(obtenerFe(n.getIzquierda()), obtenerFe(n.getDerecha()))+1);
        aux.setFe(Math.max(obtenerFe(aux.getIzquierda()), obtenerFe(aux.getDerecha()))+1);
        return aux;
    }
    /**
    * Imprimir inorden
    * @param n 
    */
    private void inorden(Nodo n) {
        Document document = (Document) n.getElement();
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato(); //Imprimir documento
            inorden(n.getDerecha());
        }
    }

    
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
    





    
  
    
}
