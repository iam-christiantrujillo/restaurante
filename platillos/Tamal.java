package platillos;
import java.util.ArrayList;
import java.util.Scanner;

public class Tamal extends Platillo{
    private static int precio = 80;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Carne al gusto, Masa de tamal\n");
    }

    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

    public static int getPrecio(){
        return precio;
    }

    public static int getVentas(){
        return ventas;
    }

    public static void setVentas(int aSumar){
        ventas += aSumar;
    }

    public Tamal(){
        
        Scanner sc = new Scanner(System.in);
        boolean paso = false;

        while(paso != true){
            System.out.println("\nQue tipo de carne quieres en tu tamal?");
            System.out.println("1) Carne en salsa verde");
            System.out.println("2) Carne en salsa roja");
            System.out.println("3) Tinga de pollo");
            int tipo=sc.nextInt();
            switch(tipo){
                case 1:
                    ingredientes.add("Carne en salsa verde");
                    paso = true;
                    break;
                case 2:
                    ingredientes.add("Carne en salsa roja");
                    paso = true;
                    break;
                case 3:
                    ingredientes.add("Tinga de pollo");
                    paso = true;
                    break;
                default:
                    System.out.println("\nOpcion no valida");
            }
        }
        ingredientes.add("Masa de tamal");
    }

    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("El Tamal es un platillo que se remonta a la epoca prehispanica de Mexico, se dice que eran un alimento para las grandes fiestas, tambien se preparaban para agradecer la fertilidad de la tierra, en cualquier evento social y como ofrenda a los muertos.");
        System.out.println("-------------------------------------\n");
    }
    
    public void mostrarInfo(){
        System.out.println("\t-----> Tamal");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + Tamal.getPrecio());
    }
}
