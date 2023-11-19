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
    public boolean existe(Document doc, int busqueda){
//        Document document = (Document) nodo.getElement();
        if (this.getNodoRaiz() == null){
            return false;
        }
        if (doc.getSize() == busqueda){
            return true;
        }
        else if (doc.getSize() < busqueda){
            return existe(doc.getDerecha(), busqueda);
        }else{
            return existe(doc.getIzquierda(), busqueda);
        }
    }
    
    /**
     * Insertar
     * @param doc
     * @param name
     * @param size
     * @param type 
     */
    public void insertar(Document doc) {
        if (this.getNodoRaiz() == null) {
            this.setNodoRaiz(doc);
        } else {
            this.insertar(this.getNodoRaiz(), doc);
        }
    }
    
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
    
      private Document insertar(Document Raizdoc,Document doc){
         Document nodopadre=Raizdoc;
       if (doc.getSize()> Raizdoc.getSize()) {
            if (Raizdoc.getDerecha() == null) {
                Raizdoc.setDerecha(doc);
            } else {
               Raizdoc.setDerecha(insertar(Raizdoc.getDerecha(),doc));
                if (obtenerFe(Raizdoc.getDerecha())- obtenerFe(Raizdoc.getIzquierda())==2);
                    if (doc.getSize()>Raizdoc.getDerecha().getSize()){
                        nodopadre=rotacionDerecha(Raizdoc);
                    }else{
                        nodopadre=rotacionDobleDerecha(Raizdoc);
                    }          
            }
        } else if(doc.getSize()< Raizdoc.getSize()){
            if (Raizdoc.getIzquierda() == null) {
                Raizdoc.setIzquierda(doc);
            } else {
                Raizdoc.setIzquierda(insertar(Raizdoc.getIzquierda(),doc));
                if (obtenerFe(Raizdoc.getIzquierda())- obtenerFe(Raizdoc.getDerecha())==2);
                    if (doc.getSize()>Raizdoc.getIzquierda().getSize()){
                        nodopadre=rotacionIzquierda(Raizdoc);
                    }else{
                        nodopadre=rotacionDobleIzquierda(Raizdoc);
                    }                      
            }
        }else{
            System.out.println("Documento repetido!!!");
        }
        
       return nodopadre;
    }
    
   
    /**
     * ObtenerFe
     * @param doc   
     * @return    
    */
    public int obtenerFe(Document doc){
        if (doc==null)
            return -1;
        else
            return doc.getFe();
    }
    
    /**
     * rotacionIzquierda
     * @param n   
     * @return    
    */
    public Document rotacionIzquierda(Document n){
        Document aux=n.getIzquierda();
        n.setIzquierda(aux.getDerecha());
        aux.setDerecha(n);
        n.setFe(Math.max(obtenerFe(n.getIzquierda()), obtenerFe(n.getDerecha()))+1);
        aux.setFe(Math.max(obtenerFe(aux.getIzquierda()), obtenerFe(aux.getDerecha()))+1);
        return aux;
    }
    
    /**
     * rotacionDerecha
     * @param n   
     * @return    
    */
    public Document rotacionDerecha(Document n){
        Document aux=n.getDerecha();
        n.setDerecha(aux.getIzquierda());
        aux.setIzquierda(n);
        n.setFe(Math.max(obtenerFe(n.getIzquierda()), obtenerFe(n.getDerecha()))+1);
        aux.setFe(Math.max(obtenerFe(aux.getIzquierda()), obtenerFe(aux.getDerecha()))+1);
        return aux;
    }
    
     /**
     * rotacionDobleIzquierda
     * @param n   
     * @return    
    */
    public Document rotacionDobleIzquierda(Document n){
        Document aux;
        n.setIzquierda(rotacionDerecha(n.getIzquierda()));
        aux=rotacionIzquierda(n);
        return aux;
    }
    
    /**
     * rotacionDobleDerecha
     * @param n   
     * @return    
    */
    public Document rotacionDobleDerecha(Document n){
        Document aux;
        n.setDerecha(rotacionIzquierda(n.getDerecha()));
        aux=rotacionDerecha(n);
        return aux;
    }
    
    /**
    * Imprimir inorden
    * @param n 
    */
//    private void inorden(Nodo n) {
//        Document document = (Document) n.getElement();
//        if (n != null) {
//            inorden(n.getIzquierda());
//            n.imprimirDato(); //Imprimir documento
//            inorden(n.getDerecha());
//        }
//    }

    
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
    





    
  
    
}
