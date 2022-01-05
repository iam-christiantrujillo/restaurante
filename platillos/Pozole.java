package platillos;
import java.util.ArrayList;
import java.util.Scanner;

public class Pozole extends Platillo{
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

    public Pozole(){
        super(50);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de carne quieres en tu pozole?");
        System.out.println("1) De Puerco");
        System.out.println("2) De Res");
        System.out.println("3) De Pollo");
        int tipo=sc.nextInt();
        switch(tipo){
            case 1:
                ingredientes.add("Carne de puerco");
                break;
            case 2:
                ingredientes.add("Carne de res");
                break;
            case 3:
                ingredientes.add("Carne de Pollo");
                break;
        }
        ingredientes.add("Rabanos");
        ingredientes.add("Lechuga");
        ingredientes.add("Maiz");
    }
    
    public void mostrarInfo(){
        System.out.println("-----> Pozole");
        System.out.println("Ingredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println(contador + ". " + ingrediente);
        }
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Ventas: " + Pozole.getVentas());
    }
    
}
