import java.util.Scanner;

import personas.Administrador;
import personas.Mesero;
import platillos.*;

import java.util.ArrayList;
import java.util.Set;

public class Metodos {
    public static Mesero registrarM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de usuario del Mesero:");
        String userName = sc.nextLine();
        System.out.println("Contraseña del Mesero:");
        String passW = sc.nextLine();
        System.out.println("Numero de Mesero:");
        int numM = sc.nextInt();
        System.out.println("Nombre del Mesero:");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Edad del Mesero:");
        int edad = sc.nextInt();
        System.out.println("Sexo del Mesero:");
        sc.nextLine();
        String sexo = sc.nextLine();
        System.out.println("Telefono del Mesero:");
        long telefono = sc.nextLong();
        Mesero mesero = new Mesero(userName, passW,numM, nombre, edad, sexo, telefono);
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

    public static void mostrarMesasD(Set<Mesa> mesasR,  Set<Mesa> disponibles, Set<Mesa> ocupadas){
        disponibles = mesasR;
        disponibles.removeAll(ocupadas);

        for(Mesa mesaD : disponibles){
            mesaD.verInfo();
        }
    }

    public static void mostrarMeserosD(Set<Mesero> meserosR,  Set<Mesero> MeserosD, Set<Mesero> MeserosO){
        MeserosD = meserosR;
        MeserosD.removeAll(MeserosO);

        for(Mesero mesero : MeserosD){
            mesero.mostrarInfo();
        }
    }

    public static void crearOrden(ArrayList<Mesa> arrMesas,ArrayList<Mesero> arrMeseros,Set<Mesa> mesasR,  Set<Mesa> disponibles, Set<Mesa> ocupadas, Set<Mesero> meserosR,  Set<Mesero> MeserosD, Set<Mesero> MeserosO){
        disponibles = mesasR;
        disponibles.removeAll(ocupadas);

        if(disponibles.size() == 0){
            System.out.println("Todas las mesas estan ocupadas");

        }else{
            Scanner sc = new Scanner(System.in);

            System.out.println("Que numero de mesa se reservara?");
            Metodos.mostrarMesasD(mesasR, disponibles, ocupadas);
            int numM=sc.nextInt();

            System.out.println("Cual es el numero del mesero que estara a cargo de atender la mesa?");
            Metodos.mostrarMeserosD(meserosR, MeserosD, MeserosO);
            int numMesero=sc.nextInt();

            System.out.println("Ingrese la orden");
            Orden ordenM = new Orden();

            int opc;
            int precioTotal=0;
            
            do{
                System.out.println("------> Menu ");
                System.out.println("1) Pozole");
                System.out.println("2) Mole");
                System.out.println("3) Queso Relleno");
                System.out.println("4) Tamal");
                System.out.println("5) Chile en Nogada");
                System.out.println("6) Terminar orden");
                opc = sc.nextInt();

                switch(opc){
                    case 1: 
                        Pozole pozole= new Pozole();
                        precioTotal+=pozole.getPrecio();
                        ordenM.getArrOrden().add(pozole);
                        break;
                    case 2: 
                        Mole mole= new Mole();
                        precioTotal+=mole.getPrecio();
                        ordenM.getArrOrden().add(mole);
                        break;
                    case 3: 
                        QuesoRelleno quesoR= new QuesoRelleno();
                        precioTotal+=quesoR.getPrecio();
                        ordenM.getArrOrden().add(quesoR);
                        break;
                    case 4: 
                        Tamal tamal= new Tamal();
                        precioTotal+=tamal.getPrecio();
                        ordenM.getArrOrden().add(tamal);
                        break;
                    case 5: 
                        ChileNogada chile= new ChileNogada();
                        precioTotal+=chile.getPrecio();
                        ordenM.getArrOrden().add(chile);
                        break;
                    case 6: 
                        if(ordenM.getArrOrden().size()==0){
                            System.out.println("Lo sentimos. Tienes que ordenar algo.");
                            opc=10;
                        }else{
                            System.out.println("Orden registrada");
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }

            }while(opc!=6);


            // Ya quedo toda la info que necesitabamos, ahora agregamos toda esta a las propiedades de la mesa a reservar
            arrMesas.get(numM-1).setOcupada(true);
            arrMeseros.get(numMesero-1).setAtendiendo(true);
            ocupadas.add(arrMesas.get(numM-1));
            MeserosO.add(arrMeseros.get(numMesero-1));

            arrMesas.get(numM-1).setVentasTotales(precioTotal);
            arrMeseros.get(numMesero-1).setVentasTotales(precioTotal);

            arrMesas.get(numM-1).setMeseroACargo(arrMeseros.get(numMesero-1));
            arrMesas.get(numM-1).setOrdenMesa(ordenM);

            // NOTA PARA CUANDO REGRESES: Hasta aqui ya logramos crear una mesa y agregarle un mesero y una orden, ya estan todos los atributos 
            // ahora hay que agregar la opcion a los menus para ver si funciona, tambien hay que hacer la data para guardar info de las mesas



        }
    }

}
