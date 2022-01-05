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
                System.out.println("\nMesero con numero " + contador + ":");
                usermesero.mostrarInfo();
                contador++;
            }
        }
    }

    public static void mostrarVentasM(ArrayList<Mesero> arrMeseros){
        
        if(arrMeseros.size()==0){
            System.out.println("\nNo hay meseros registrados");
        }else{
            int contador = 1;
            for(Mesero usermesero : arrMeseros){
                System.out.println("\nMesero con numero " + contador + ":");
                System.out.println("Nombre: "+usermesero.getNombre());
                System.out.println("Numero de identificacion: "+usermesero.getNumMesero());
                System.out.println("Ventas totales: "+usermesero.getVentasTotales());
                contador++;
            }
        }
    }

    public static void mostrarVentasMesas(ArrayList<Mesa> arrMesas){
        
        if(arrMesas.size()==0){
            System.out.println("\nNo hay meseros registrados");
        }else{
            int contador = 1;
            for(Mesa mesa : arrMesas){
                System.out.println("\nMesa " + contador + ":");
                System.out.println("Numero de mesa: "+mesa.getNumMesa());
                System.out.println("Ventas totales: "+mesa.getVentasTotales());
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
                System.out.println("\nAdmin con numero " + contador + ":");
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

    public static void mostrarMesasO(Set<Mesa> ocupadas){
        for(Mesa mesaO : ocupadas){
            mesaO.verInfo();
        }
    }

    public static void mostrarMesas(ArrayList<Mesa> arrMesas){
        for(Mesa mesa : arrMesas){
            mesa.verInfo();
        }
    }

    public static void mostrarMeserosD(ArrayList<Mesero> meserosR, ArrayList<Mesero> MeserosD, ArrayList<Mesero> MeserosO){
        MeserosD = meserosR;
        MeserosD.removeAll(MeserosO);

        int contador = 1;
        for(Mesero mesero : MeserosD){
            System.out.println("\nMesero con numero " + contador + " disponible:");
            mesero.mostrarInfo();
            contador++;
        }
    }

    public static void crearOrden(ArrayList<Mesa> arrMesas,ArrayList<Mesero> arrMeseros,Set<Mesa> mesasR,  Set<Mesa> disponibles, Set<Mesa> ocupadas, ArrayList<Mesero> meserosR,  ArrayList<Mesero> MeserosD, ArrayList<Mesero> MeserosO){
        disponibles = mesasR;
        disponibles.removeAll(ocupadas);

        MeserosD = meserosR;
        MeserosD.removeAll(MeserosO);

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
                        Pozole.setVentas(pozole.getPrecio());
                        ordenM.getArrOrden().add(pozole);
                        break;
                    case 2: 
                        Mole mole= new Mole();
                        precioTotal+=mole.getPrecio();
                        Mole.setVentas(mole.getPrecio());
                        ordenM.getArrOrden().add(mole);
                        break;
                    case 3: 
                        QuesoRelleno quesoR= new QuesoRelleno();
                        precioTotal+=quesoR.getPrecio();
                        QuesoRelleno.setVentas(quesoR.getPrecio());
                        ordenM.getArrOrden().add(quesoR);
                        break;
                    case 4: 
                        Tamal tamal= new Tamal();
                        precioTotal+=tamal.getPrecio();
                        Tamal.setVentas(tamal.getPrecio());
                        ordenM.getArrOrden().add(tamal);
                        break;
                    case 5: 
                        ChileNogada chile= new ChileNogada();
                        precioTotal+=chile.getPrecio();
                        ChileNogada.setVentas(chile.getPrecio());
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
            MeserosD.get(numMesero-1).setAtendiendo(true);
            ocupadas.add(arrMesas.get(numM-1));
            MeserosO.add(MeserosD.get(numMesero-1));

            arrMesas.get(numM-1).setVentasTotales(precioTotal);
            MeserosD.get(numMesero-1).setVentasTotales(precioTotal);

            arrMesas.get(numM-1).setMeseroACargo(MeserosD.get(numMesero-1));
            arrMesas.get(numM-1).setOrdenMesa(ordenM);


        }
    }

    public static void liberarMesa(ArrayList<Mesa> arrMesas,Set<Mesa> mesasR, Set<Mesa> ocupadas, ArrayList<Mesero> MeserosO){
        Scanner sc = new Scanner(System.in);

        System.out.println("Que numero de mesa quiere liberar?");
        Metodos.mostrarMesasO(ocupadas);
        int numM=sc.nextInt();

        MeserosO.removeIf(mesero -> mesero.getNumMesero()== arrMesas.get(numM-1).getMeseroACargo().getNumMesero());
        arrMesas.get(numM-1).liberarMesa();
        ocupadas.remove(arrMesas.get(numM-1));
        mesasR.add(arrMesas.get(numM-1));
        
       

    }

    public static void modificarMesero(ArrayList<Mesero> arrMeseros){
        Scanner sc = new Scanner(System.in);

        if(arrMeseros.size()==0){
            System.out.println("\nNo hay meseros registrados");
        }else{
            System.out.println("Que numero de mesero quieres modificar?");
            Metodos.mostrarMR(arrMeseros);
            int mesero = sc.nextInt();

            System.out.println("Que atributo quieres modificar?");
            System.out.println("1) Numero de mesero");
            System.out.println("2) Nombre");
            System.out.println("3) Edad");
            System.out.println("4) Sexo");
            System.out.println("5) Telefono");
            int opc=sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Numero de mesero actual: "+arrMeseros.get(mesero-1).getNumMesero());
                    System.out.println("Cual sera el nuevo numero de mesero?");
                    int nuevoN = sc.nextInt();
                    arrMeseros.get(mesero-1).setNumMesero(nuevoN);
                    System.out.println("Modificacion exitosa:");
                    System.out.println("Numero de mesero actual: "+arrMeseros.get(mesero-1).getNumMesero());
                    break;

                case 2:
                    System.out.println("Nombre actual: "+arrMeseros.get(mesero-1).getNombre());
                    System.out.println("Cual sera el nuevo nombre?");
                    String nuevo = sc.nextLine();
                    arrMeseros.get(mesero-1).setNombre(nuevo);
                    System.out.println("Modificacion exitosa:");
                    System.out.println("Nombre actual: "+arrMeseros.get(mesero-1).getNombre());
                    break;

                case 3:
                    System.out.println("Edad actual: "+arrMeseros.get(mesero-1).getEdad());
                    System.out.println("Cual sera la edad nueva?");
                    int nueva = sc.nextInt();
                    arrMeseros.get(mesero-1).setEdad(nueva);
                    System.out.println("Modificacion exitosa:");
                    System.out.println("Edad actual: "+arrMeseros.get(mesero-1).getEdad());
                    break;

                case 4:
                    System.out.println("Sexo actual: "+arrMeseros.get(mesero-1).getSexo());
                    System.out.println("Cual sera el nuevo sexo?");
                    String nuevoS = sc.nextLine();
                    arrMeseros.get(mesero-1).setSexo(nuevoS);
                    System.out.println("Modificacion exitosa:");
                    System.out.println("Sexo actual: "+arrMeseros.get(mesero-1).getSexo());
                    break;

                case 5:
                    System.out.println("Telefono actual: "+arrMeseros.get(mesero-1).getTelefono());
                    System.out.println("Cual sera el nuevo telefono?");
                    long nuevoT = sc.nextInt();
                    arrMeseros.get(mesero-1).setTelefono(nuevoT);
                    System.out.println("Modificacion exitosa:");
                    System.out.println("Telefono actual: "+arrMeseros.get(mesero-1).getTelefono());
                    break;

                default:
                    System.out.println("Opcion no valida");

            }
        }
    }


    public static void verEstadisticas(ArrayList<Integer> arrVentasP,ArrayList<Mesero> arrMeseros){
        
        int total=0;
        for(Integer num : arrVentasP){
            total+=num;
            System.out.println("Numero: "+num);
        }

        if(total==0){
            System.out.println("Aun no hay ventas");
        }else{
            System.out.println("Porcentaje de las ventas de cada platillo");

            System.out.println("Chile en Nogada:");
            System.out.println("Ventas totales: " + arrVentasP.get(0));
            int porcentaje1=(arrVentasP.get(0)*100)/total;
            System.out.println("Porcentaje: " + porcentaje1);

            System.out.println("Mole:");
            System.out.println("Ventas totales: " + arrVentasP.get(1));
            int porcentaje2=(arrVentasP.get(1)*100)/total;
            System.out.println("Porcentaje: " + porcentaje2);

            System.out.println("Pozole:");
            System.out.println("Ventas totales: " + arrVentasP.get(2));
            int porcentaje3=(arrVentasP.get(2)*100)/total;
            System.out.println("Porcentaje: " + porcentaje3);

            System.out.println("Queso relleno:");
            System.out.println("Ventas totales: " + arrVentasP.get(3));
            int porcentaje4=(arrVentasP.get(3)*100)/total;
            System.out.println("Porcentaje: " + porcentaje4);

            System.out.println("Tamal:");
            System.out.println("Ventas totales: " + arrVentasP.get(4));
            int porcentaje5=(arrVentasP.get(4)*100)/total;
            System.out.println("Porcentaje: " + porcentaje5);

            System.out.println("El mesero que ha vendido mas platillos es: ");

        }
    }
}
