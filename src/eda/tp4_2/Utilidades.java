package eda.tp4_2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author urqui
 */
public class Utilidades {
    
    public static void invertirC(Queue c){
        Queue<Integer> finv = new LinkedList<>();
        Queue<Integer> faux = new LinkedList<>();
        int aux;
        
        while(!c.isEmpty()){
            aux=(int) c.poll();
            if(c.isEmpty()){
                finv.add(aux);
                while(!faux.isEmpty()){
                    c.add(faux.poll());
                }
            }else{
                faux.add(aux);
            }
        }
        //Recupera la fila C
        while(!finv.isEmpty()){   
            c.add(finv.poll());
        }
        /*
        System.out.println("Fila Inv");
        mostrarFila(finv);
        System.out.println("Fila Aux");
        mostrarFila(faux);*/
    }
    
    public static void mostrarFila(Queue<Integer> c){
        Queue<Integer> faux = new LinkedList<>();
        Integer aux;
        
        while(!c.isEmpty()){
            aux=c.poll();
            if(c.isEmpty()){
                System.out.println(aux);
            }else{
                System.out.print(aux+" - ");
            }
            faux.add(aux);
        }
        //Recupera la fila C
        while(!faux.isEmpty()){   
            c.add(faux.poll());
        }
    }
    
    //Vuelve la fila aux a la fila original.    
    public static void recuperarFila(Queue<Integer> c,Queue<Integer> faux){
        //Si quedan valoren en la fila Original los lleva a la faux, para conservar el mismo orden.
        while(!c.isEmpty()){   
            faux.add(c.poll());
        }
        //Recupera los valores de la fila Original desde la faux
        while(!faux.isEmpty()){   
            c.add(faux.poll());
        }
    }
    
}
