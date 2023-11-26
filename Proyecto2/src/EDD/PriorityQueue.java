/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Luriannys Junco
 */
public class PriorityQueue {
    private Cola []table;
    private int maxPriority;
    
    public PriorityQueue(int n) throws Exception{
        if (n<1){
            throw new Exception ("Error en prioridad: " + n);
        }
        maxPriority = n;
        table = new Cola [maxPriority + 1];
        for (int i = 0; i <= maxPriority; i++){
            table[i] = new Cola();
        }
    }
}
