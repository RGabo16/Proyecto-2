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
    private Document nodoRaiz;
    
    
    public ArbolTDA(){
        nodoRaiz=null;
    }
    
    /**
     * Vaciar
     */
    public void vaciar() {
	nodoRaiz = null;
    }
    /**
     * Vacio
     * @return 
     */
    public boolean Vacio() {
	return nodoRaiz == null;
    }
    
    /**
     * existe
     * @param doc
     * @param busqueda
     * @return 
     */
   
        /**
    * Imprimir inorden
    * @param n 
    */
    public void inorden(Document n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDoc(n);
            inorden(n.getDerecha());
        }
    }

    
    /**
     * getNodoRaiz
     * @return 
     */
    public Document getNodoRaiz() {
        return nodoRaiz;
    }

    /**
     * setNodoRaiz
     * @param nodoRaiz 
     */
    public void setNodoRaiz(Document nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }
    
    /**
     * Insertar
     * @param doc
     * @param name
     * @param size
     * @param type 
     */
    
    
    /**
     * Insertar
     * @param nodo
     * @param name
     * @param size
     * @param type 
     */
//    private void insertar(Nodo nodo,String name, int size, String type){
//      Document document = (Document) nodo.getElement();
//       if (size > document.getSize()) {
//            if (nodo.getDerecha() == null) {
//                nodo.setDerecha(new Nodo(new Document(name,size,type)));
//            } else {
//                this.insertar(nodo.getDerecha(), name,size,type);
//                if (obtenerFe(nodo.getDerecha())- obtenerFe(nodo.getIzquierda())==2);
//                    if (size<nodo.getDerecha())
//            }
//        } else {
//            if (nodo.getIzquierda() == null) {
//                nodo.setIzquierda(new Nodo(new Document(name,size,type)));
//            } else {
//                this.insertar(nodo.getIzquierda(), name, size ,type);
//            }
//        }
//    }
        
      
      
   
    /**
     * ObtenerFe
     * @param doc   
     * @return    
    */

    
    /**
     * rotacionIzquierda
     * @param n   
     * @return    
    */
//    public Document rotacionDerecha(Document n){
//        Document aux=n.getIzquierda();
//        Document temp=aux.getDerecha();
//        n.setIzquierda(temp);
//        aux.setDerecha(n);
//        n.setFe(Math.max(obtenerFe(n.getIzquierda()), obtenerFe(n.getDerecha()))+1);
//        aux.setFe(Math.max(obtenerFe(aux.getIzquierda()), obtenerFe(aux.getDerecha()))+1);
//        return aux;
    }
    
    /**
     * rotacionDerecha
     * @param n   
     * @return    
    */
    

  
     /**
     * rotacionDobleIzquierda
     * @param n   
     * @return    
    */
//    public Document rotacionDobleIzquierda(Document n){
//        Document aux;
//        n.setIzquierda(rotacionDerecha(n.getIzquierda()));
//        aux=rotacionIzquierda(n);
//        return aux;
//    }
//    
//    /**
//     * rotacionDobleDerecha
//     * @param n   
//     * @return    
//    */
//    public Document rotacionDobleDerecha(Document n){
//        Document aux;
//        n.setDerecha(rotacionIzquierda(n.getDerecha()));
//        aux=rotacionDerecha(n);
//        return aux;
//    }
    

//    public boolean eliminar(Document d){
//        Document aux=this.getNodoRaiz();
//        Document padre=this.getNodoRaiz();
//        boolean izquierda = true;
//    }
//    

