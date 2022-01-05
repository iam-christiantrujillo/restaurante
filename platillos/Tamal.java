package platillos;
import java.util.ArrayList;
import java.util.Scanner;

public class Tamal extends Platillo{
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

    public static int getVentas(){
        return ventas;
    }

    public static void setVentas(int aSumar){
        ventas += aSumar;
    }

    public Tamal(){
        super(40);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de carne quieres en tu tamal?");
        System.out.println("1) Carne en salsa verde");
        System.out.println("2) Carne en salsa roja");
        System.out.println("3) Tinga de pollo");
        int tipo=sc.nextInt();
        switch(tipo){
            case 1:
                ingredientes.add("Carne en salsa verde");
                break;
            case 2:
                ingredientes.add("Carne en salsa roja");
                break;
            case 3:
                ingredientes.add("Tinga de pollo");
                break;
        }
        ingredientes.add("Masa");
    }
    
    public void mostrarInfo(){
        System.out.println("-----> Tamal");
        System.out.println("Ingredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println(contador + ". " + ingrediente);
        }
        System.out.println("Precio: " + this.getPrecio());
    }
}
