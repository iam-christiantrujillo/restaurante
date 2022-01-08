package platillos;
import java.util.ArrayList;

public class QuesoRelleno extends Platillo{
    private static int precio = 120;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Picadillo, Queso de bola holandes\n");
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

    public QuesoRelleno(){
        ingredientes.add("Picadillo");
        ingredientes.add("Queso de bola holandes");
        
    }

    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Para varios especialistas e historiadores locales, el Queso Relleno es la maxima expresion del arte gastronomico de la region yucateca, es un autentico simbolo del mestizaje y esta considerado por varios un platillo superior a nuestra popular cochinita pibil.");
        System.out.println("-------------------------------------\n");
    }
    
    public void mostrarInfo(){
        System.out.println("\t-----> Queso relleno");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + QuesoRelleno.getPrecio());
    }
}
