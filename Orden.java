import java.util.ArrayList;
import platillos.Platillo;
import java.io.Serializable;

public class Orden implements Serializable{
    private ArrayList<Platillo> arrOrden = new ArrayList<Platillo>();

    public ArrayList<Platillo> getArrOrden(){
        return arrOrden;
    }

    public void mostrarInfo(){
        System.out.println("-----> Orden");
        for(Platillo plato : arrOrden){
            plato.mostrarInfo();
        }
    }

}
