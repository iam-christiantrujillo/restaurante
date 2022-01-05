package platillos;
import java.io.Serializable;

public abstract class Platillo implements Serializable{
    private int precio;

    public Platillo(int precio){
        
        this.precio=precio;
    }


    public int getPrecio(){
        return this.precio;
    }

    public abstract void mostrarInfo();
}
