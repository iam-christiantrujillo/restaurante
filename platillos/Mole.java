package platillos;
import java.util.ArrayList;
import java.util.Scanner;

public class Mole extends Platillo{
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

    public Mole(){
        super(70);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres arroz en tu mole?");
        System.out.println("1) Si");
        System.out.println("2) No");
        
        int tipo=sc.nextInt();
        if (tipo==1){
            ingredientes.add("Arroz");
        }
        ingredientes.add("Pollo");
        ingredientes.add("Chile ancho");
        ingredientes.add("Chile mulato");
        ingredientes.add("Chile pasilla");
    }
    
    public void mostrarInfo(){
        System.out.println("-----> Mole");
        System.out.println("Ingredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println(contador + ". " + ingrediente);
        }
        System.out.println("Precio: " + this.getPrecio());
    }
}
