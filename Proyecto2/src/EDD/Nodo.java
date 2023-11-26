/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Luriannys Junco
 */
public class Nodo {
    private Object element;
    private Nodo pNext;
    private Nodo derecha;
    private Nodo izquierda;
    
/**
 * Constructor
 * @param element
 * @param pNext 
 */    
    public Nodo(Object element, Nodo pNext) {
        this.element = element;
        this.pNext = pNext;
        this.derecha=null;
        this.izquierda=null;
    }

    /**
     * Constructor
     * @param element 
     */
    public Nodo(Object element) {
        this.element = element;
        this.pNext = null;
        this.derecha=null;
        this.izquierda=null;

    }

    /**
     * getElement
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * setElement
     * @param element the element to set
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * getpNext
     * @return the pNext
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * setpNext
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
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
