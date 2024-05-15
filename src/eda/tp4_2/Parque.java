package eda.tp4_2;

public class Parque {
    private Registro general;
    private Registro calecita;
    private Registro samba;
    private final int capGeneral=1000;
    private final int capCalecita=100;
    private final int capSamba=200;
    
    public Parque() {
        general = new Registro(capGeneral);
        calecita = new Registro(capCalecita);
        samba = new Registro(capSamba);
    }
    
    //Registro GENERAL del parque
    public void ingresar(int id){
        if(general.estaEnLaFila(id)){
                System.out.println("Ya se encuentra en el Parque.");
        }else if(!general.estaLleno()){
            general.registrar(id);
            System.out.println("INGRESANDO AL PARQUE!");
        }else{
            System.out.println("No se puede ingresar al Parque, se ha alcanzado la capacidad máxima.");
        }
    }
    
    public void salir(int id){
        if(general.estaEnLaFila(id)){
            general.borrar(id);
            if(calecita.estaEnLaFila(id)){
                calecita.borrar(id);
                System.out.println("Saliendo de la calecita");
            }
            if(samba.estaEnLaFila(id)){
                samba.borrar(id);
                System.out.println("Saliendo del samba");
            }
            System.out.println("SALIENDO DEL PARQUE!");
        }else{
            System.out.println("La persona no se encuentra en el Parque");
        }
    }
    
    public void estaEnElParque(int id){
        if(general.estaEnLaFila(id)){
            System.out.println("La persona se encuentra en el Parque");
        }else{
            System.out.println("La persona no se encuentra en el Parque");
        }
    }
    
    
    //Registro de la Calecita
    public void irCalecita(int id){
        if(general.estaEnLaFila(id)){
            if(calecita.estaEnLaFila(id)){
                System.out.println("Ya se encuentra en la fila de la Calecita.");
            }else if(!calecita.estaLleno()){
                calecita.registrar(id);
                System.out.println("Yendo a la calecita");
            }else{
                System.out.println("No se puede ir a la calecita, se ha alcanzado la capacidad máxima del juego.");
            }
        }else{
            System.out.println("La persona no se encuentra en el Parque");
        }
    }
    
    public void salirCalecita(int id){
        if(general.estaEnLaFila(id)){
            if(calecita.estaEnLaFila(id)){
                calecita.borrar(id);
                System.out.println("Saliendo de la calecita");
            }else{
                System.out.println("La persona no se encuentra en la Calecita");
            }
        }else{
            System.out.println("La persona no se encuentra en el Parque");
        }
    }
    
    
    //Registro del Samba
    public void irSamba(int id){
        if(general.estaEnLaFila(id)){
            if(samba.estaEnLaFila(id)){
                System.out.println("Ya se encuentra en la fila del Samba.");
            }else if(!samba.estaLleno()){
                samba.registrar(id);
                System.out.println("Yendo al samba");
            }else{
                System.out.println("No se puede ir al samba, se ha alcanzado la capacidad máxima del juego.");
            }
        }else{
            System.out.println("La persona no se encuentra en el Parque");
        }
    }
    
    public void salirSamba(int id){
        if(general.estaEnLaFila(id)){
            if(samba.estaEnLaFila(id)){
                samba.borrar(id);
                System.out.println("Saliendo del samba");
            }else{
                System.out.println("La persona no se encuentra en el Samba");
            }
        }else{
            System.out.println("La persona no se encuentra en el Parque");
        }
    }
    
    
    //Muestra los Datos del Parque y sus Atracciones
    public void mostrarDatos(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("REGISTRO GENERAL:");
        general.infoReg();
        System.out.println("REGISTRO DE LA CALECITA:");
        calecita.infoReg();
        System.out.println("REGISTRO DEL SAMBA:");
        samba.infoReg();
        System.out.println("-------------------------------------------------------------------");
    }
    
    
    
}
