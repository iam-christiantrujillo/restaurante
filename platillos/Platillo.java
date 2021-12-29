package platillos;
import java.util.ArrayList;

public abstract class Platillo {
    private int precio;

    public Platillo(int precio){
        
        this.precio=precio;
    }


    public int getPrecio(){
        return this.precio;
    }

    public abstract void mostrarInfo();
}
