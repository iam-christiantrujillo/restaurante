package platillos;
import java.io.Serializable;

public abstract class Platillo implements Serializable{

    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Los platos tipicos Mexicanos son una de las gastronomias mas fuertes, variadas y que conservan muchos elementos de las Civilizaciones Antiguas.");
        System.out.println("-------------------------------------\n");
    }

    public abstract void mostrarInfo();
}
