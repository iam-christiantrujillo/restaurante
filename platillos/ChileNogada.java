package platillos;
import java.util.ArrayList;

public class ChileNogada extends Platillo{
    private static int precio = 260;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Chile poblano, Carne molida, Almendras, Granos de granada\n");
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

    public ChileNogada(){
        ingredientes.add("Chile poblano");
        ingredientes.add("Carne molida");
        ingredientes.add("Almendras");
        ingredientes.add("Granos de granada");
        
    }

    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Se cree que fueron las madres Agustinas del Convento de Santa Monica, en Puebla, quienes en 1821 crearon los Chiles en Nogada con motivo de celebracion de la Independencia de Mexico y homenaje a Agustin de Iturbide.");
        System.out.println("-------------------------------------\n");
    }
    
    public void mostrarInfo(){
        System.out.println("\t-----> Chile en nogada");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + ChileNogada.getPrecio());
    }
}
