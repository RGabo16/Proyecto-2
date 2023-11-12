package resources;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.PrintWriter;
import javax.swing.JOptionPane;
import EDD.Lista;
//import EDD.NodoDoc;
/**
 *
 * @author Luriannys Junco
 */
public class ManejoArchivo {

//      No creo que sea necesario este metodo
//    /**
//     * Escribir archivo csv
//     *
//     * @param clientes
//     */
//    public void write_csv(ListaDoc clientes) {
//        String clientes_actuales = "";
//        if (!clientes.isEmpty()) {
//            NodoDoc temp = clientes.getpFirst(); //cambiar el tipo de nodo en la lista
//            for (int i = 0; i < clientes.getSize(); i++) {
//                clientes_actuales = temp.getName() + "," + temp.getType() + "/n";
//                temp = temp.getpNext();
//            }
//        }
//        try {
//            PrintWriter pw = new PrintWriter("test\\cliente.csv");
//            //Borrar toda la informacion y colocar nueva
//            pw.print(clientes_actuales);
//            // Agregar informacion manteniendo la anterior
//            pw.append("Luri, 30345893");
//            pw.append("\n");
//            //Cerrar archivo
//            pw.close();
//            JOptionPane.showMessageDialog(null, "Guardado exitoso");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }

    /**
     * Leer archivo csv
     * @return 
     */
    public Lista read_csv() {
        Lista clientes = new Lista();
        String line;
        String clientes_csv = "";
        String path = "test//clientes.csv";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        clientes_csv += line + "\n";
                    }
                }
                if (!"".equals(clientes_csv)) {
                    String[] clientes_split = clientes_csv.split("\n");
                    for (int i = 0; i < clientes_split.length; i++) {
                        String[] cliente = clientes_split[i].split(",");
                        clientes.addAtTheEnd(cliente[0]); //agregar user y type en String
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return clientes;
    }

}
