package platillos;
import java.util.ArrayList;

public class ChileNogada extends Platillo{
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
