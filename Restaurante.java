import java.util.Scanner;

import personas.Administrador;
import personas.Mesero;
import platillos.ChileNogada;
import platillos.Mole;
import platillos.Pozole;
import platillos.QuesoRelleno;
import platillos.Tamal;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;

public class Restaurante{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Mesero> arrMeseros = new ArrayList<Mesero>();
        ArrayList<Administrador> arrAdmin = new ArrayList<Administrador>();
        ArrayList<Mesa> arrMesas = new ArrayList<Mesa>();
        ArrayList<Integer> arrVentasP = new ArrayList<Integer>();
        Set<Mesa> mesasR = new HashSet<Mesa>();
        Set<Mesa> disponibles = new HashSet<Mesa>();
        Set<Mesa> ocupadas = new HashSet<Mesa>();
        ArrayList<Mesero> meserosR = new ArrayList<Mesero>();
        ArrayList<Mesero> MeserosD = new ArrayList<Mesero>();
        ArrayList<Mesero> MeserosO = new ArrayList<Mesero>();

        // Obtenemos informacion de administradores y meseros registrados
        try {
            File archivoA = new File("data/dataAdmin.ser");
            File archivoM = new File("data/dataMesero.ser");
            File archivoMesas = new File("data/dataMesa.ser");
            File archivoPlatillos = new File("data/dataPlatillo.ser");

            // Verificamos si existe el archivo de administradores
            if(archivoA.exists()){
                FileInputStream f = new FileInputStream("data/dataAdmin.ser");
                ObjectInputStream s = new ObjectInputStream(f); 
                ArrayList<?> admins = (ArrayList<?>) s.readObject(); 
                
                for(int i=0; i<admins.size();i++){
                    arrAdmin.add((Administrador) admins.get(i));
                }
                s.close();
                
            }else{
                archivoA.createNewFile();
                Administrador adminDefault = new Administrador("raul123", "hola123","Raul", 20, "M", 5545656776l);
                arrAdmin.add(adminDefault);
            }

            // Verificamos si existe el archivo de meseros
            if(archivoM.exists()){
                FileInputStream f = new FileInputStream("data/dataMesero.ser");
                ObjectInputStream s = new ObjectInputStream(f); 
                ArrayList<?> meseros = (ArrayList<?>) s.readObject(); 
                
                for(int i=0; i<meseros.size();i++){
                    arrMeseros.add((Mesero) meseros.get(i));
                }
                meserosR.addAll(arrMeseros);
                s.close();
                
            }else{
                archivoM.createNewFile(); 
            }

            // Verificamos si existe el archivo de mesas
            if(archivoMesas.exists()){
                FileInputStream f = new FileInputStream("data/dataMesa.ser");
                ObjectInputStream s = new ObjectInputStream(f); 
                ArrayList<?> mesas = (ArrayList<?>) s.readObject(); 
                
                for(int i=0; i<mesas.size();i++){
                    arrMesas.add((Mesa) mesas.get(i));
                }
                mesasR.addAll(arrMesas);
                s.close();
                
            }else{
                archivoMesas.createNewFile(); 
                Mesa mesa1 = new Mesa(1);
                Mesa mesa2 = new Mesa(2);
                Mesa mesa3 = new Mesa(3);
                Mesa mesa4 = new Mesa(4);
                Mesa mesa5 = new Mesa(5);
                arrMesas.add(mesa1);
                arrMesas.add(mesa2);
                arrMesas.add(mesa3);
                arrMesas.add(mesa4);
                arrMesas.add(mesa5);

                mesasR.addAll(arrMesas);
            }

            // Verificamos si existe el archivo de platillos
            if(archivoPlatillos.exists()){
                FileInputStream f = new FileInputStream("data/dataPlatillo.ser");
                ObjectInputStream s = new ObjectInputStream(f); 
                ArrayList<?> ventas = (ArrayList<?>) s.readObject(); 
                
                for(int i=0; i<ventas.size();i++){
                    arrVentasP.add((Integer) ventas.get(i));
                }
                ChileNogada.setVentas(arrVentasP.get(0));
                Mole.setVentas(arrVentasP.get(1));
                Pozole.setVentas(arrVentasP.get(2));
                QuesoRelleno.setVentas(arrVentasP.get(3));
                Tamal.setVentas(arrVentasP.get(4));
                
                s.close();
                
            }else{
                archivoPlatillos.createNewFile(); 
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        // Login 
        boolean acceso = false;
        System.out.println("Que tipo de persona eres?");
        System.out.println("1) Administrador");
        System.out.println("2) Mesero");
        int tipo = sc.nextInt();
        if(tipo==1){
            if(Metodos.loginA(arrAdmin)){
                acceso = true;
               
            }else{
                System.out.println("Intentelo mas tarde. Nombre de usuario o contrasena incorrecta");
            }
        }else if(tipo==2){
            if(Metodos.loginM(arrMeseros)){
                acceso = true;
            }else{
                System.out.println("Intentelo mas tarde. Nombre de usuario o contrasena incorrecta");
            }
        }else{
            System.out.println("Opcion no valida");
        }


        // Menu
        if(acceso){
            if(tipo==1){
                Menus.MenuA(arrMeseros, arrAdmin, arrMesas,mesasR, disponibles, ocupadas, meserosR, MeserosD, MeserosO, arrVentasP);
            }else if(tipo==2){
                Menus.MenuM(arrMeseros, arrAdmin, arrMesas,mesasR, disponibles, ocupadas, meserosR, MeserosD, MeserosO, arrVentasP);
            }
        }

    }
}