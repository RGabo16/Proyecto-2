/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import java.util.Objects;

/**
 *
 * @author rgabr
 */
public class User {
    private String usuario;
    private String tipo ;
    private Lista documentos;
    private User pNext;
    private int num;
    
    
    

    /**
     * Constructor
     * @param usuario
     * @param tipo
     * @param documentos 
     */
    public User(String usuario, String tipo, Lista documentos) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.documentos = documentos;
        this.pNext = null;
    }

    /**
     * Constructor
     * @param usuario
     * @param tipo 
     */
    public User(String usuario, String tipo) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.documentos = null;
        this. pNext = null;
        this.num=0;
    }
    
    /**
     * getUsuario
     * @return 
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * setUsuario
     * @param usuario 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * getTipo
     * @return 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * setTipo
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * getDocumentos
     * @return 
     */
    public Lista getDocumentos() {
        return documentos;
    }

    /**
     * setDocumentos
     * @param documentos 
     */
    public void setDocumentos(Lista documentos) {
        this.documentos = documentos;
    }

    /**
     * getPNext
     * @return 
     */
    public User getPNext() {
        return pNext;
    }

    /**
     * setPNext
     * @param PNext 
     */
    public void setPNext(User PNext) {
        this.pNext = PNext;
    }
    
    
}
