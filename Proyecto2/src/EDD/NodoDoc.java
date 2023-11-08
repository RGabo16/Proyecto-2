/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Luriannys Junco
 */
public class NodoDoc {
    private String name;
    private int size;
    private String type; //Posiblemente un int
    private NodoDoc pNext;
    private boolean status;
    private NodoDoc derecha,izquierda;

    /**
     * Constructor
     * @param name
     * @param size
     * @param type 
     */
    public NodoDoc(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.pNext = null;
        this.status = false; //No esta en la cola de impresion
    }

    /**
     * Constructor (por si acaso)
     * @param name
     * @param size
     */
    public NodoDoc(String name, int size) {
         this.name = name;
        this.size = size;
        this.type = "";
        this.pNext = null;
        this.status = false; //No esta en la cola de impresion
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the pNext
     */
    public NodoDoc getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoDoc pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    public NodoDoc getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoDoc derecha) {
        this.derecha = derecha;
    }

    public NodoDoc getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoDoc izquierda) {
        this.izquierda = izquierda;
    }
    
         
       
}
