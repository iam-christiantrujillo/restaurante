import java.util.ArrayList;
import platillos.Platillo;

public class Orden {
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
