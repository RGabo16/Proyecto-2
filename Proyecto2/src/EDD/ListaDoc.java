/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Luriannys Junco
 */
public class ListaDoc {
    
    private NodoDoc pFirst;
    private NodoDoc pLast;
    private int size;

    /**
     * Constructor
     */
    public ListaDoc() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    /**
     * Metodo que verifica si la lista esta vacia
     * @return 
     */
    public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    /**
     * Metodo que vacia la lista
     */
    public void empty(){
        this.setpFirst(null);
        this.setpLast(null);
        this.setSize(0);
    }
    
    /**
     * Metodo que agrega un documento al final de la lista
     * @param newDoc 
     */
    public void addAtTheEnd(NodoDoc newDoc){
        if (this.isEmpty()){
            setpFirst(pLast = newDoc);
        } else {
            newDoc.setpNext(getpFirst());
            setpFirst(newDoc);         
        }
        setSize(getSize() + 1);
    }
    
    /**
     * Metodo que elimina un documento al inicio de la lista
     */
    public void DeleteAtTheStart(){
        if(!this.isEmpty()){
            if(getSize() == 1){
                this.empty();
            } else {
                setpFirst(getpFirst().getpNext());
                setSize(getSize() - 1);
            }
        }
    }
    
    /**
     * Metodo que imprime cada nodo de la lista
     */
    public void print(){
        NodoDoc temp = getpFirst();
        if (this.isEmpty()){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
        while(temp != null){
            System.out.println(temp); //Siento que le falta a esta parte
            temp = temp.getpNext();
        }
    }

    /**
     * @return the pFirst
     */
    public NodoDoc getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoDoc pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoDoc getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoDoc pLast) {
        this.pLast = pLast;
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
    
    
}
