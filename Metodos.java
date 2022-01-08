import java.util.Scanner;

import personas.Administrador;
import personas.Mesero;
import platillos.*;

import java.util.ArrayList;
import java.util.Set;

import excepciones.EdadException;
import excepciones.NombreException;
import excepciones.NumeroMeseroException;
import excepciones.PasswordException;
import excepciones.SexoException;
import excepciones.TelefonoException;
import excepciones.UserNameException;

public class Metodos {
    public static Mesero registrarM(){
        Mesero nuevo = new Mesero();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\nNombre de usuario del Mesero (no mayusculas, por lo menos 4 caracteres):");
            String userName = sc.nextLine();
            nuevo.setUserName(userName);
            System.out.println("Contraseña del Mesero (por lo menos 4 caracteres):");
            String passW = sc.nextLine();
            nuevo.setPassW(passW);
            System.out.println("Numero de Mesero (no letras, 3 digitos):");
            String numM = sc.nextLine();
            nuevo.setNumMesero(numM);
            System.out.println("Nombre del Mesero (no digitos, primera letra mayuscula):");
            String nombre = sc.nextLine();
            nuevo.setNombre(nombre);
            System.out.println("Edad del Mesero (mayor a 0 y menor a 100 años, no letras):");
            String edad = sc.nextLine();
            nuevo.setEdad(edad);
            System.out.println("Sexo del Mesero (M o F):");
            String sexo = sc.nextLine();
            nuevo.setSexo(sexo);
            System.out.println("Telefono del Mesero (10 digitos, no letras):");
            String telefono = sc.nextLine();
            nuevo.setTelefono(telefono);

            
            
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        } catch (NumeroMeseroException e) {
            e.printStackTrace();
        } catch (NombreException e) {
            e.printStackTrace();
        } catch (EdadException e) {
            e.printStackTrace();
        } catch (SexoException e) {
            e.printStackTrace();
        } catch (TelefonoException e) {
            e.printStackTrace();
        }

        return nuevo;
    }

    public static Administrador registrarA(){
        Administrador nuevo = new Administrador();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\nNombre de usuario del Administrador (no mayusculas, por lo menos 4 caracteres):");
            String userName = sc.nextLine();
            nuevo.setUserName(userName);
            System.out.println("Contraseña del Administrador (por lo menos 4 caracteres):");
            String passW = sc.nextLine();
            nuevo.setPassW(passW);
            System.out.println("Nombre del Administrador (no digitos, primera letra mayuscula):");
            String nombre = sc.nextLine();
            nuevo.setNombre(nombre);
            System.out.println("Edad del Administrador (mayor a 0 y menor a 100 años, no letras):");
            String edad = sc.nextLine();
            nuevo.setEdad(edad);
            System.out.println("Sexo del Administrador (M o F):");
            String sexo = sc.nextLine();
            nuevo.setSexo(sexo);
            System.out.println("Telefono del Administrador (10 digitos, no letras):");
            String telefono = sc.nextLine();
            nuevo.setTelefono(telefono);

            
            
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        } catch (NombreException e) {
            e.printStackTrace();
        } catch (EdadException e) {
            e.printStackTrace();
        } catch (SexoException e) {
            e.printStackTrace();
        } catch (TelefonoException e) {
            e.printStackTrace();
        }
        
        return nuevo;
    }

    public static boolean loginM(ArrayList<Mesero> arrMeseros){
        Scanner sc = new Scanner(System.in);
        int intentoN = 0;

        do{
            System.out.println("\nNombre de usuario:");
            String userN = sc.nextLine();
            for(Mesero usermesero : arrMeseros){
                if(usermesero.getUserName().equals(userN)){
                    int intento = 0;
                    do{
                        System.out.println("Contraseña:");
                        String password = sc.nextLine();
                        if(usermesero.getPassW().equals(password)){
                            System.out.println("\nBienvenido " + usermesero.getNombre());
                            return true;
                        }
                        System.out.println("Contraseña incorrecta\n");
                        intento++;
                    }while(intento!=3);
                    return false;
                }
            }
            System.out.println("Usuario no encontrado");
            intentoN++;
        }while(intentoN!=3);
        return false;
    }

    public static boolean loginA(ArrayList<Administrador> arrAdmin){
        Scanner sc = new Scanner(System.in);
        int intentoN = 0;

        do{
            System.out.println("\nNombre de usuario:");
            String userN = sc.nextLine();
            for(Administrador useradmin : arrAdmin){
                if(useradmin.getUserName().equals(userN)){
                    int intento = 0;
                    do{
                        System.out.println("Contraseña:");
                        String password = sc.nextLine();
                        if(useradmin.getPassW().equals(password)){
                            System.out.println("\nBienvenido " + useradmin.getNombre());
                            return true;
                        }
                        System.out.println("Contraseña incorrecta\n");
                        intento++;
                    }while(intento!=3);
                    return false;
                }
            }
            System.out.println("Usuario no encontrado");
            intentoN++;
        }while(intentoN!=3);
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
                System.out.println("Ventas totales: $"+usermesero.getVentasTotales());
                contador++;
            }
        }
    }

    public static void mostrarVentasMesas(ArrayList<Mesa> arrMesas){
        
        if(arrMesas.size()==0){
            System.out.println("\nNo hay mesas registrados");
        }else{
            int contador = 1;
            for(Mesa mesa : arrMesas){
                System.out.println("\nMesa " + contador + ":");
                System.out.println("Numero de mesa: "+mesa.getNumMesa());
                System.out.println("Ventas totales: $"+mesa.getVentasTotales());
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

        if(disponibles.size()==0){
            System.out.println("\nNo hay mesas disponibles");
        }else{
            for(Mesa mesaD : disponibles){
                System.out.println("\n");
                mesaD.verInfo();
            }
        }

    }

    public static void mostrarMesasO(Set<Mesa> ocupadas){

        if(ocupadas.size()==0){
            System.out.println("\nNo hay mesas ocupadas");
        }else{
            for(Mesa mesaO : ocupadas){
                System.out.println("\n");
                mesaO.verInfo();
            }
        }
    }

    public static void mostrarMesas(ArrayList<Mesa> arrMesas){
        for(Mesa mesa : arrMesas){
            System.out.println("\n");
            mesa.verInfo();
        }
    }

    public static void mostrarMeserosD(ArrayList<Mesero> meserosR, ArrayList<Mesero> MeserosD, ArrayList<Mesero> MeserosO){
        MeserosD = meserosR;
        MeserosD.removeAll(MeserosO);

        if(MeserosD.size()==0){
            System.out.println("\nNo hay meseros disponibles");
        }else{
            int contador = 1;
            for(Mesero mesero : MeserosD){
                System.out.println("\nMesero con numero " + contador + " disponible:");
                mesero.mostrarInfo();
                contador++;
            }
        }

    }

    public static void crearOrden(ArrayList<Mesa> arrMesas,ArrayList<Mesero> arrMeseros,Set<Mesa> mesasR,  Set<Mesa> disponibles, Set<Mesa> ocupadas, ArrayList<Mesero> meserosR,  ArrayList<Mesero> MeserosD, ArrayList<Mesero> MeserosO){
        disponibles = mesasR;
        disponibles.removeAll(ocupadas);

        MeserosD = meserosR;
        MeserosD.removeAll(MeserosO);

        if(disponibles.size() == 0 || MeserosD.size()==0){
            System.out.println("\nTodos los meseros o mesas no estan disponibles.");

        }else{
            Scanner sc = new Scanner(System.in);

            System.out.println("\nQue numero de mesa se reservara?");
            Metodos.mostrarMesasD(mesasR, disponibles, ocupadas);
            int numM=sc.nextInt();

            if(numM <= arrMesas.size() && numM !=0){

                if(disponibles.contains(arrMesas.get(numM-1))){
                    System.out.println("\nCual es el numero del mesero que estara a cargo de atender la mesa?");
                    Metodos.mostrarMeserosD(meserosR, MeserosD, MeserosO);
                    int numMesero=sc.nextInt();
                    
                    if(numMesero <= MeserosD.size() && numMesero != 0){
                        
                        System.out.println("\nIngrese la orden");
                        Orden ordenM = new Orden();
        
                        int opc;
                        int precioTotal=0;
                        
                        do{
                            System.out.println("\n------> Menu ");
                            System.out.println("1) Pozole $" + Pozole.getPrecio());
                            Pozole.mostrarIngredientesD();
                            System.out.println("2) Mole $" + Mole.getPrecio());
                            Mole.mostrarIngredientesD();
                            System.out.println("3) Queso Relleno $" + QuesoRelleno.getPrecio());
                            QuesoRelleno.mostrarIngredientesD();
                            System.out.println("4) Tamal $" + Tamal.getPrecio());
                            Tamal.mostrarIngredientesD();
                            System.out.println("5) Chile en Nogada $" + ChileNogada.getPrecio());
                            ChileNogada.mostrarIngredientesD();
                            System.out.println("6) Terminar orden");
                            opc = sc.nextInt();
        
                            switch(opc){
                                case 1: 
                                    Platillo pozole= new Pozole();
                                    pozole.mostrarHistoria();
                                    precioTotal+=Pozole.getPrecio();
                                    Pozole.setVentas(Pozole.getPrecio());
                                    ordenM.getArrOrden().add(pozole);
                                    break;
                                case 2: 
                                    Platillo mole= new Mole();
                                    mole.mostrarHistoria();
                                    precioTotal+=Mole.getPrecio();
                                    Mole.setVentas(Mole.getPrecio());
                                    ordenM.getArrOrden().add(mole);
                                    break;
                                case 3: 
                                    Platillo quesoR= new QuesoRelleno();
                                    quesoR.mostrarHistoria();
                                    precioTotal+=QuesoRelleno.getPrecio();
                                    QuesoRelleno.setVentas(QuesoRelleno.getPrecio());
                                    ordenM.getArrOrden().add(quesoR);
                                    break;
                                case 4: 
                                    Platillo tamal= new Tamal();
                                    tamal.mostrarHistoria();
                                    precioTotal+=Tamal.getPrecio();
                                    Tamal.setVentas(Tamal.getPrecio());
                                    ordenM.getArrOrden().add(tamal);
                                    break;
                                case 5: 
                                    Platillo chile= new ChileNogada();
                                    chile.mostrarHistoria();
                                    precioTotal+=ChileNogada.getPrecio();
                                    ChileNogada.setVentas(ChileNogada.getPrecio());
                                    ordenM.getArrOrden().add(chile);
                                    break;
                                case 6: 
                                    if(ordenM.getArrOrden().size()==0){
                                        System.out.println("\nLo sentimos. Tienes que ordenar algo.");
                                        opc=10;
                                    }else{
                                        System.out.println("\nOrden registrada");
                                    }
                                    break;
                                default:
                                    System.out.println("\nOpcion no valida");
                            }
        
                        }while(opc!=6);
        
        
                        // Ya quedo toda la info que necesitabamos, ahora agregamos toda esta a las propiedades de la mesa a reservar
                        ordenM.setPrecioOrden(precioTotal);
                        arrMesas.get(numM-1).setOcupada(true);
                        MeserosD.get(numMesero-1).setAtendiendo(true);
                        ocupadas.add(arrMesas.get(numM-1));
                        MeserosO.add(MeserosD.get(numMesero-1));
        
                        arrMesas.get(numM-1).setVentasTotales(precioTotal);
                        MeserosD.get(numMesero-1).setVentasTotales(precioTotal);
                        MeserosD.get(numMesero-1).setNumPlatillosV(ordenM.getArrOrden().size());
                        
                        arrMesas.get(numM-1).setMeseroACargo(MeserosD.get(numMesero-1));
                        arrMesas.get(numM-1).setOrdenMesa(ordenM);

                    }else{
                        System.out.println("\nNumero de mesero invalido");
                    }
                }else{
                    System.out.println("\nNumero de mesa no disponible");
                }
            }else{
                System.out.println("\nNumero de mesa invalido");
            }
        }
    }

    public static void liberarMesa(ArrayList<Mesa> arrMesas,Set<Mesa> mesasR, Set<Mesa> ocupadas, ArrayList<Mesero> MeserosO){
        Scanner sc = new Scanner(System.in);

        if(ocupadas.size()!=0){
            System.out.println("\nQue numero de mesa quiere liberar?");
            Metodos.mostrarMesasO(ocupadas);
            int numM=sc.nextInt();

            if(numM <= arrMesas.size() && numM !=0){

                if(ocupadas.contains(arrMesas.get(numM-1))){

                    boolean paso = false;

                    while(paso!=true){
                        System.out.println("\nComo se realizara el pago?");
                        System.out.println("1) Pago en efectivo");
                        System.out.println("2) Pago con tarjeta");
                        int metodo = sc.nextInt();
                        if(metodo==1){
                            System.out.println("\n----------- Factura -----------");
                            System.out.println("Concepto: Restaurante Mexico");
                            System.out.println("Subtotal: $" + arrMesas.get(numM-1).getOrdenMesa().getPrecioOrden());
                            float iva = (arrMesas.get(numM-1).getOrdenMesa().getPrecioOrden() * 16f) / 100f;
                            System.out.println("IVA 16%: $" + iva);
                            int propina = 50;
                            System.out.println("Propina: $" + propina);
                            System.out.println("Metodo de pago: Pago en efectivo");
                            float total = arrMesas.get(numM-1).getOrdenMesa().getPrecioOrden() + iva + propina;
                            System.out.println("Total: $" + total);
                            
                            paso = true;

                        }else if(metodo==2){
                            System.out.println("\nNumero de tarjeta:");
                            long numT = sc.nextLong();
                            System.out.println("NIP:");
                            long nip = sc.nextLong();

                            System.out.println("\n----------- Factura -----------");
                            System.out.println("Concepto: Restaurante Mexico");
                            System.out.println("Subtotal: $" + arrMesas.get(numM-1).getOrdenMesa().getPrecioOrden());
                            float iva = (arrMesas.get(numM-1).getOrdenMesa().getPrecioOrden() * 16f) / 100f;
                            System.out.println("IVA 16%: $" + iva);
                            int propina = 50;
                            System.out.println("Propina: $" + propina);
                            System.out.println("Metodo de pago: Tarjeta de credito");
                            System.out.println("Numero de tarjeta: " + numT);

                            float total = arrMesas.get(numM-1).getOrdenMesa().getPrecioOrden() + iva + propina;
                            System.out.println("Total: $" + total);

                            paso = true;
                        }else{
                            System.out.println("\nOpcion no valida");
                        }
                    }

                    System.out.println("\n-------- Pago exitoso --------");

                    MeserosO.removeIf(mesero -> mesero== arrMesas.get(numM-1).getMeseroACargo());
                    arrMesas.get(numM-1).liberarMesa();
                    ocupadas.remove(arrMesas.get(numM-1));
                    mesasR.add(arrMesas.get(numM-1));  

                }else{
                    System.out.println("\nNumero de mesa no ocupada");
                }
            }else{
                System.out.println("\nNumero de mesa invalido");
            }

        }else{
            System.out.println("\nNo hay mesas ocupadas");
        }

    }

    public static void modificarMesero(ArrayList<Mesero> arrMeseros){
        Scanner sc = new Scanner(System.in);

        if(arrMeseros.size()==0){
            System.out.println("\nNo hay meseros registrados");
        }else{
            System.out.println("\nQue numero de mesero quieres modificar?");
            Metodos.mostrarMR(arrMeseros);
            int mesero = sc.nextInt();

            if(mesero <= arrMeseros.size()){

                System.out.println("\nQue atributo quieres modificar?");
                System.out.println("1) Numero de mesero");
                System.out.println("2) Nombre");
                System.out.println("3) Edad");
                System.out.println("4) Sexo");
                System.out.println("5) Telefono");
                int opc=sc.nextInt();

                switch(opc){
                    case 1:
                        try {
                            System.out.println("\nNumero de mesero actual: "+arrMeseros.get(mesero-1).getNumMesero());
                            System.out.println("\nCual sera el nuevo numero de mesero? (no letras, 3 digitos)");
                            sc.nextLine();
                            String nuevoN = sc.nextLine();
                            arrMeseros.get(mesero-1).setNumMesero(nuevoN);
                            System.out.println("\nModificacion exitosa:");
                            System.out.println("Numero de mesero actual: "+arrMeseros.get(mesero-1).getNumMesero());
                            
                        } catch (NumeroMeseroException e) {
                            e.printStackTrace();
                        }

                        break;

                    case 2:
                        try {
                            System.out.println("\nNombre actual: "+arrMeseros.get(mesero-1).getNombre());
                            System.out.println("\nCual sera el nuevo nombre? (no digitos, primera letra mayuscula)");
                            sc.nextLine();
                            String nuevo = sc.nextLine();
                            arrMeseros.get(mesero-1).setNombre(nuevo);
                            System.out.println("\nModificacion exitosa:");
                            System.out.println("Nombre actual: "+arrMeseros.get(mesero-1).getNombre());
                            
                        } catch (NombreException e) {
                            e.printStackTrace();
                        } 
                        
                        break;

                    case 3:
                        try {
                            System.out.println("\nEdad actual: "+arrMeseros.get(mesero-1).getEdad());
                            System.out.println("\nCual sera la edad nueva? (mayor a 0 y menor a 100 años, no letras)");
                            sc.nextLine();
                            String nueva = sc.nextLine();
                            arrMeseros.get(mesero-1).setEdad(nueva);
                            System.out.println("\nModificacion exitosa:");
                            System.out.println("Edad actual: "+arrMeseros.get(mesero-1).getEdad());
                            
                        } catch (EdadException e) {
                            e.printStackTrace();
                        } 
                        
                        break;

                    case 4:
                        try {
                            System.out.println("\nSexo actual: "+arrMeseros.get(mesero-1).getSexo());
                            System.out.println("\nCual sera el nuevo sexo? (M o F)");
                            sc.nextLine();
                            String nuevoS = sc.nextLine();
                            arrMeseros.get(mesero-1).setSexo(nuevoS);
                            System.out.println("\nModificacion exitosa:");
                            System.out.println("Sexo actual: "+arrMeseros.get(mesero-1).getSexo());
                            
                        } catch (SexoException e) {
                            e.printStackTrace();
                        }
                        
                        break;

                    case 5:
                        try {
                            System.out.println("\nTelefono actual: "+arrMeseros.get(mesero-1).getTelefono());
                            System.out.println("\nCual sera el nuevo telefono? (10 digitos, no letras)");
                            sc.nextLine();
                            String nuevoT = sc.nextLine();
                            arrMeseros.get(mesero-1).setTelefono(nuevoT);
                            System.out.println("\nModificacion exitosa:");
                            System.out.println("Telefono actual: "+arrMeseros.get(mesero-1).getTelefono());
                            
                        } catch (TelefonoException e) {
                            e.printStackTrace();
                        }
                        
                        break;

                    default:
                        System.out.println("\nOpcion no valida");

                }
            }else{
                System.out.println("\nNumero de mesero invalido");
            }
        }
    }


    public static void verEstadisticas(ArrayList<Integer> arrVentasP,ArrayList<Mesero> arrMeseros){
        
        float total=0f;
        for(Integer num : arrVentasP){
            total+=num;
        }

        if(total==0){
            System.out.println("\nAun no hay ventas");
        }else{
            System.out.println("\nVentas totales: $" + total);
            System.out.println("\nPorcentaje de las ventas de cada platillo:");

            System.out.println("\n---> Chile en Nogada:");
            System.out.println("Ventas totales: $" + arrVentasP.get(0));
            float porcentaje1=((arrVentasP.get(0)*100)/total);
            System.out.println("Porcentaje: " + porcentaje1 + "%");

            System.out.println("\n---> Mole:");
            System.out.println("Ventas totales: $" + arrVentasP.get(1));
            float porcentaje2=((arrVentasP.get(1)*100)/total);
            System.out.println("Porcentaje: " + porcentaje2 + "%");

            System.out.println("\n---> Pozole:");
            System.out.println("Ventas totales: $" + arrVentasP.get(2));
            float porcentaje3=((arrVentasP.get(2)*100)/total);
            System.out.println("Porcentaje: " + porcentaje3 + "%");

            System.out.println("\n---> Queso relleno:");
            System.out.println("Ventas totales: $" + arrVentasP.get(3));
            float porcentaje4=((arrVentasP.get(3)*100)/total);
            System.out.println("Porcentaje: " + porcentaje4 + "%");

            System.out.println("\n---> Tamal:");
            System.out.println("Ventas totales: $" + arrVentasP.get(4));
            float porcentaje5=((arrVentasP.get(4)*100)/total);
            System.out.println("Porcentaje: " + porcentaje5 + "%");

            System.out.println("\nEl mesero que ha vendido mas platillos es: ");

            Mesero delMes = arrMeseros.get(0);

            for(Mesero mesero : arrMeseros){
                if(delMes.getNumPlatillosV()<=mesero.getNumPlatillosV()){
                    delMes = mesero;
                }
            }

            System.out.println("\n---> Mesero");
            System.out.println("Numero de id del mesero: " + delMes.getNumMesero());
            System.out.println("Nombre del mesero: " + delMes.getNombre());
            System.out.println("Numero de platillos vendidos: " + delMes.getNumPlatillosV());

        }
    }
}
