package platillos;
import java.util.ArrayList;
import java.util.Scanner;

public class Pozole extends Platillo{
    private static int precio = 136;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Carne al gusto, Rabanos, Lechuga, Maiz, Oregano\n");
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

    public Pozole(){
        Scanner sc = new Scanner(System.in);

        boolean paso = false;

        while(paso!=true){
            System.out.println("\nQue tipo de carne quieres en tu pozole?");
            System.out.println("1) De Puerco");
            System.out.println("2) De Res");
            System.out.println("3) De Pollo");
            int tipo=sc.nextInt();
            switch(tipo){
                case 1:
                    ingredientes.add("Carne de puerco");
                    paso = true;
                    break;
                case 2:
                    ingredientes.add("Carne de res");
                    paso = true;
                    break;
                case 3:
                    ingredientes.add("Carne de Pollo");
                    paso = true;
                    break;
                default:
                    System.out.println("\nOpcion no valida.");
            }
        }
        
        ingredientes.add("Rabanos");
        ingredientes.add("Lechuga");
        ingredientes.add("Maiz");
        ingredientes.add("Oregano");
    }

    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Se cree que el Pozole era consumido desde antes de la conquista, el emperador Moctezuma disfrutaba de un platillo de Pozole ofrendado al dios Xipe Totec, señor de la fertilidad y la regeneracion del maiz y la guerra.");
        System.out.println("-------------------------------------\n");
    }
    
    public void mostrarInfo(){
        System.out.println("\t-----> Pozole");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + Pozole.getPrecio());
    }
    
}
