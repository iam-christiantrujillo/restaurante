import java.util.Scanner;

import personas.Administrador;
import personas.Mesero;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Menus {
    public static void MenuA(ArrayList<Mesero> arrMeseros, ArrayList<Administrador> arrAdmin, ArrayList<Mesa> arrMesas,Set<Mesa> mesasR, Set<Mesa> disponibles, Set<Mesa> ocupadas, Set<Mesero> meserosR , Set<Mesero> MeserosD, Set<Mesero> MeserosO){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("1) Registrar persona");
            System.out.println("2) Ver personas registradas");
            System.out.println("3) Salir y guardar cambios");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Que tipo de persona quieres registrar?");
                    System.out.println("1) Administrador");
                    System.out.println("2) Mesero");
                    int num=sc.nextInt();

                    if(num==1){
                        arrAdmin.add(Metodos.registrarA());
                    }else if(num==2){
                        arrMeseros.add(Metodos.registrarM());
                    }else{
                        System.out.println("Opcion no valida");
                    }

                    break;

                case 2:
                    System.out.println("\n--------------> Administradores\n");
                    Metodos.mostrarAR(arrAdmin);
                    System.out.println("\n--------------> Meseros\n");
                    Metodos.mostrarMR(arrMeseros);
                    break;

                case 3:
                    try {
                        FileOutputStream f = new FileOutputStream("data/dataAdmin.ser");
                        ObjectOutputStream s = new ObjectOutputStream(f);
                        s.writeObject(arrAdmin);
                       
                        s.close();

                        FileOutputStream f2 = new FileOutputStream("data/dataMesero.ser");
                        ObjectOutputStream s2 = new ObjectOutputStream(f2);
                        s2.writeObject(arrMeseros);
                       
                        s2.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }

        }while(opc!=3);
    }

    public static void MenuM(ArrayList<Mesero> arrMeseros, ArrayList<Administrador> arrAdmin, ArrayList<Mesa> arrMesas,Set<Mesa> mesasR, Set<Mesa> disponibles, Set<Mesa> ocupadas, Set<Mesero> meserosR, Set<Mesero> MeserosD, Set<Mesero> MeserosO ){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("1) Ver personas registradas");
            System.out.println("2) Crear Orden");
            System.out.println("3) Salir");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("\n--------------> Administradores\n");
                    Metodos.mostrarAR(arrAdmin);
                    System.out.println("\n--------------> Meseros\n");
                    Metodos.mostrarMR(arrMeseros);
                    break;

                case 2:
                    
                    break;

                case 3:
                    try {
                        FileOutputStream f = new FileOutputStream("data/dataAdmin.ser");
                        ObjectOutputStream s = new ObjectOutputStream(f);
                        s.writeObject(arrAdmin);
                       
                        s.close();

                        FileOutputStream f2 = new FileOutputStream("data/dataMesero.ser");
                        ObjectOutputStream s2 = new ObjectOutputStream(f2);
                        s2.writeObject(arrMeseros);
                       
                        s2.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }

        }while(opc!=3);
    }
}
