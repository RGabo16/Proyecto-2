/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import EDD.ArbolTDA;
import EDD.Document;
import interfaces.MainMenu;

/**
 *
 * @author Luriannys Junco
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MainMenu m = new MainMenu();
        m.setVisible(true);
        
        ArbolTDA arbolito= new ArbolTDA();
        arbolito.Vacio();
        Document doc = new Document("R",10,"Alta");
        Document doc1 = new Document("R",11,"Alta");
        Document doc2 = new Document("R",9,"Alta");
         Document doc3 = new Document("R",8,"Alta");

        arbolito.insertar(doc);
        arbolito.insertar(doc);
        System.out.println( arbolito.existe(arbolito.getNodoRaiz(),10));
        arbolito.insertar(doc1);
        arbolito.insertar(doc2);
        arbolito.insertar(doc3);
        arbolito.inorden(arbolito.getNodoRaiz());
        
        
    }
    
}
