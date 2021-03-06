package platillos;
import java.util.ArrayList;
import java.util.Scanner;

public class Mole extends Platillo{
    private static int precio = 180;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Pollo, Chile ancho, Chile mulato, Chile pasilla\n");
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

    public Mole(){
        Scanner sc = new Scanner(System.in);
        boolean paso = false;

        while(paso != true){
            System.out.println("\nQuieres arroz en tu mole?");
            System.out.println("1) Si");
            System.out.println("2) No");
        
            int tipo=sc.nextInt();
            if (tipo==1){
                ingredientes.add("Arroz");
                paso=true;
            }else if(tipo==2){
                paso=true;
            }else{
                System.out.println("\nOpcion no valida");
            }
        }

        ingredientes.add("Pollo");
        ingredientes.add("Chile ancho");
        ingredientes.add("Chile mulato");
        ingredientes.add("Chile pasilla");
    }

    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Se cree que el Mole fue creado en el Convento de Santa Rosa en el año 1681 por Sor Andrea de la Asuncion. Segun cuentan en el convento, la monja creo el mole con inspiracion divina.");
        System.out.println("-------------------------------------\n");
    }
    
    public void mostrarInfo(){
        System.out.println("\t-----> Mole");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + Mole.getPrecio());
    }
}
