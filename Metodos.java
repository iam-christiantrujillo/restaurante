import java.util.Scanner;

import personas.Administrador;
import personas.Mesero;

import java.util.ArrayList;

public class Metodos {
    public static Mesero registrarM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de usuario del Mesero:");
        String userName = sc.nextLine();
        System.out.println("Contraseña del Mesero:");
        String passW = sc.nextLine();
        System.out.println("Nombre del Mesero:");
        String nombre = sc.nextLine();
        System.out.println("Edad del Mesero:");
        int edad = sc.nextInt();
        System.out.println("Sexo del Mesero:");
        sc.nextLine();
        String sexo = sc.nextLine();
        System.out.println("Telefono del Mesero:");
        long telefono = sc.nextLong();
        Mesero mesero = new Mesero(userName, passW, nombre, edad, sexo, telefono);
        return mesero;
    }

    public static Administrador registrarA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de usuario del Administrador:");
        String userName = sc.nextLine();
        System.out.println("Contraseña del Administrador:");
        String passW = sc.nextLine();
        System.out.println("Nombre del Administrador:");
        String nombre = sc.nextLine();
        System.out.println("Edad del Administrador:");
        int edad = sc.nextInt();
        System.out.println("Sexo del Administrador:");
        sc.nextLine();
        String sexo = sc.nextLine();
        System.out.println("Telefono del Administrador:");
        long telefono = sc.nextLong();
        Administrador admin = new Administrador(userName, passW, nombre, edad, sexo, telefono);
        return admin;
    }

    public static boolean loginM(ArrayList<Mesero> arrMeseros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de usuario:");
        String userN = sc.nextLine();

        for(Mesero usermesero : arrMeseros){
            if(usermesero.getUserName().equals(userN)){
                int intento = 0;
                do{
                    System.out.println("Contraseña:");
                    String password = sc.nextLine();
                    if(usermesero.getPassW().equals(password)){
                        System.out.println("Bienvenido " + usermesero.getNombre());
                        return true;
                    }
                    System.out.println("Contraseña incorrecta");
                    intento++;
                }while(intento!=3);
                return false;
            }
        }
        return false;
    }

    public static boolean loginA(ArrayList<Administrador> arrAdmin){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de usuario:");
        String userN = sc.nextLine();

        for(Administrador useradmin : arrAdmin){
            if(useradmin.getUserName().equals(userN)){
                int intento = 0;
                do{
                    System.out.println("Contraseña:");
                    String password = sc.nextLine();
                    if(useradmin.getPassW().equals(password)){
                        System.out.println("Bienvenido " + useradmin.getNombre());
                        return true;
                    }
                    System.out.println("Contraseña incorrecta");
                    intento++;
                }while(intento!=3);
                return false;
            }
        }
        return false;
    }

    public static void mostrarMR(ArrayList<Mesero> arrMeseros){
        
        if(arrMeseros.size()==0){
            System.out.println("\nNo hay meseros registrados");
        }else{
            int contador = 1;
            for(Mesero usermesero : arrMeseros){
                System.out.println("\nMesero " + contador + ":");
                usermesero.mostrarInfo();
                contador++;
            }
        }
    }

    public static void mostrarAR(ArrayList<Administrador> arrAdmin){
        
        if(arrAdmin.size()==0){
            System.out.println("\nNo hay administradores registrados");
        }else{
            int contador = 1;
            for(Administrador admin : arrAdmin){
                System.out.println("\nAdmin " + contador + ":");
                admin.mostrarInfo();
                contador++;
            }
        }
    }

    

}
