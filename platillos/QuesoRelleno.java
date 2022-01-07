package platillos;
import java.util.ArrayList;

public class QuesoRelleno extends Platillo{
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

    public QuesoRelleno(){
        super(65);
        ingredientes.add("Picadillo");
        ingredientes.add("Queso de bola holandes");
        
    }
    
    public void mostrarInfo(){
        System.out.println("\t-----> Queso relleno");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + this.getPrecio());
    }
}
