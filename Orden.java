import java.util.ArrayList;
import platillos.Platillo;
import java.io.Serializable;

public class Orden implements Serializable{
    private ArrayList<Platillo> arrOrden = new ArrayList<Platillo>();
    private int precioOrden =0;

    public ArrayList<Platillo> getArrOrden(){
        return arrOrden;
    }

    public int getPrecioOrden(){
        return precioOrden;
    }

    public void setPrecioOrden(int total){
        this.precioOrden=total;
    }

    public void mostrarInfo(){
        System.out.println("\n------------ Orden -----------\n");
        for(Platillo plato : arrOrden){
           
            plato.mostrarInfo();
            System.out.println("\n");
        }
        System.out.println("------------------------------");
    }

}
