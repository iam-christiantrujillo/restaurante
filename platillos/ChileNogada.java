package platillos;
import java.util.ArrayList;

public class ChileNogada extends Platillo{
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

    public ChileNogada(){
        super(80);
        
        ingredientes.add("Chile poblano");
        ingredientes.add("Carne molida");
        ingredientes.add("Almendras");
        ingredientes.add("Granos de granada");
        
    }
    
    public void mostrarInfo(){
        System.out.println("-----> Chile en nogada");
        System.out.println("Ingredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println(contador + ". " + ingrediente);
        }
        System.out.println("Precio: " + this.getPrecio());
    }
}
