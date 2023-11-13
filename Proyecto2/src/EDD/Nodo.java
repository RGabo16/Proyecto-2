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

    public Nodo(Object element, Nodo pNext) {
        this.element = element;
        this.pNext = pNext;
    }

    /**
     * Constructor
     * @param element 
     */
    public Nodo(Object element) {
        this.element = element;
        this.pNext = null;
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
    
    
    
}
