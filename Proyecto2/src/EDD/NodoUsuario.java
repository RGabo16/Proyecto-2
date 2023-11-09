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
public class NodoUsuario {
    String usuario,tipo ;
    ListaDoc documentos;
    NodoUsuario PNext;

    public NodoUsuario(String usuario, String tipo, ListaDoc documentos) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.documentos = documentos;
        this.PNext = null;
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

    public ListaDoc getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ListaDoc documentos) {
        this.documentos = documentos;
    }

    public NodoUsuario getPNext() {
        return PNext;
    }

    public void setPNext(NodoUsuario PNext) {
        this.PNext = PNext;
    }
    
    
}
