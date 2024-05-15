package eda.tp4_2;

import java.util.LinkedList;
import java.util.Queue;

public class Registro {
    private Queue<Integer> fid;
    private int capacidad;

    public Registro(int capacidad) {
        fid = new LinkedList<>();
        this.capacidad = capacidad;
    }
    
    public boolean estaLleno(){
        return fid.size()>=capacidad;
    }
    
    public boolean estaEnLaFila(int buscar){
        Queue<Integer> faux = new LinkedList<>();
        
        while(!fid.isEmpty()){
            if(fid.peek()==buscar){
                Utilidades.recuperarFila(fid,faux);
                return true;
            }else{
                faux.add(fid.poll());
            }
        }
        Utilidades.recuperarFila(fid,faux);
        return false;
    }
    
    public void registrar(int id){
        fid.add(id);
    }
    
    public void borrar(int id){
        fid.remove(id);
    }
    
    public void infoReg(){
        System.out.println("-Capacidad: "+fid.size()+" de "+capacidad);
        if(fid.isEmpty()){
            System.out.println("-No hay personas en la fila.");
        }else{
            System.out.print("-Personas en la fila -> ");
            Utilidades.mostrarFila(fid);
        }
    }
}
