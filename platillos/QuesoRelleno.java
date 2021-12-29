package platillos;
import java.util.ArrayList;

public class QuesoRelleno extends Platillo{
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

    public QuesoRelleno(){
        super(65);
        ingredientes.add("Picadillo");
        ingredientes.add("Queso de bola holandes");
        
    }
    
    public void mostrarInfo(){
        System.out.println("-----> Queso relleno");
        System.out.println("Ingredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println(contador + ". " + ingrediente);
        }
        System.out.println("Precio: " + this.getPrecio());
    }
}
