/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Luriannys Junco
 */
public class Document {
    private String name;
    private int size;
    private String type; //Posiblemente un int
    private boolean status;
    private Document derecha;
    private Document izquierda;
    private int fe;

    /**
     * Constructor
     * @param name
     * @param size
     * @param type 
     */
    public Document(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.status = false; //No esta en la cola de impresion
    }

    /**
     * Constructor (por si acaso)
     * @param name
     * @param size
     */
    public Document(String name, int size) {
         this.name = name;
        this.size = size;
        this.type = "";
        this.status = false; //No esta en la cola de impresion
    }

    /**
     * getName
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getSize
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * setSize
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * getType
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * setType
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getStatus
     * @return the status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    } 

    public Document getDerecha() {
        return derecha;
    }

    public void setDerecha(Document derecha) {
        this.derecha = derecha;
    }

    public Document getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Document izquierda) {
        this.izquierda = izquierda;
    }
    
    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }
    
    public void imprimirDoc(Document doc){
        if (doc!= null){
            System.out.println(doc.size);
        }
            
    }
         
       
}
