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
public class User {
    private String usuario,tipo ;
    private Lista documentos;
    private User PNext;

    public User(String usuario, String tipo, Lista documentos) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.documentos = documentos;
        this.PNext = null;
    }

    public User(String usuario, String tipo) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.documentos = null;
        this. PNext = null;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Lista getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Lista documentos) {
        this.documentos = documentos;
    }

    public User getPNext() {
        return PNext;
    }

    public void setPNext(User PNext) {
        this.PNext = PNext;
    }
    
    
}
