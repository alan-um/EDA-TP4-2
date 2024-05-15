package eda.tp4_2;

import java.util.Scanner;

public class EDATP4_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Parque p=new Parque();
        
        menu(p);
        System.out.println("Saliendo....");
        
    }

    private static void menu(Parque p) {
        Scanner leer = new Scanner(System.in);
        boolean salir=false;
        while(!salir){
            mGeneral();
            switch(leer.nextInt()){
                case 1 -> {
                    System.out.println("Ingrese el Id:");
                    p.ingresar(leer.nextInt());
                }
                case 2 -> mAtracciones(p);
                case 3 -> {
                    System.out.println("Ingrese el Id de la persona a buscar:");
                    p.estaEnElParque(leer.nextInt());
                }
                case 4 -> {
                    System.out.println("Ingrese el Id:");
                    p.salir(leer.nextInt());
                }
                case 5 -> p.mostrarDatos();
                case 6 -> salir=true;
            }
        }
    }
    
    private static void mGeneral() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------MENU--------------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1- Ingresar al Parque");
        System.out.println("2- Ir a una Atraccion");
        System.out.println("3- Buscar a una persona");
        System.out.println("4- Salir del Parque");
        System.out.println("5- Mostrar info del Parque");
        System.out.println("6- Finalizar");
    }
    
    private static void mAtracciones(Parque p) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1- Ir a la Calecita");
        System.out.println("2- Ir al Samba");
        System.out.println("3- Volver");
        switch(leer.nextInt()){
            case 1 -> {
                System.out.println("Ingrese el Id:");
                p.irCalecita(leer.nextInt());
            }
            case 2 -> {
                System.out.println("Ingrese el Id:");
                p.irSamba(leer.nextInt());
            }
            case 3 -> {
            }
        }
    }
    
}
