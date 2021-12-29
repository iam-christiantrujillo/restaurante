import java.util.Scanner;

import personas.Administrador;
import personas.Mesero;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;

public class Restaurante{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Mesero> arrMeseros = new ArrayList<Mesero>();
        ArrayList<Administrador> arrAdmin = new ArrayList<Administrador>();

        try {
            File archivoA = new File("data/dataAdmin.ser");
            File archivoM = new File("data/dataMesero.ser");
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
            if(archivoM.exists()){
                FileInputStream f = new FileInputStream("data/dataMesero.ser");
                ObjectInputStream s = new ObjectInputStream(f); 
                ArrayList<?> meseros = (ArrayList<?>) s.readObject(); 
                
                for(int i=0; i<meseros.size();i++){
                    arrMeseros.add((Mesero) meseros.get(i));
                }
                s.close();
                
            }else{
                archivoM.createNewFile();
                
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
               
            }
        }else if(tipo==2){
            if(Metodos.loginM(arrMeseros)){
                acceso = true;
            }
        }else{
            System.out.println("Opcion no valida");
        }


        // Menu
        if(acceso){
            if(tipo==1){
                Menus.MenuA(arrMeseros, arrAdmin);
            }else if(tipo==2){
                Menus.MenuM(arrMeseros, arrAdmin);
            }
        }

    }
}