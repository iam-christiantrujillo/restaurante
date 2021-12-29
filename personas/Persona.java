package personas;
import java.io.Serializable;

public abstract class Persona implements Serializable{
    private String userName;
    private String passW;
    private String nombre;
    private int edad;
    private String sexo;
    private long telefono;

    public String getUserName(){
        return this.userName;
    }

    public String getPassW(){
        return this.passW;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getSexo(){
        return this.sexo;
    }

    public long getTelefono(){
        return this.telefono;
    }

    public Persona(String userName, String passW,String nombre, int edad, String sexo, long telefono){
        this.userName = userName;
        this.passW = passW;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public abstract void crearOrden();
    public abstract void verDispoMesas();
    public abstract void verMesasOcup();
    public abstract void facturar();
    public abstract void verEstadisticas();

    public abstract void mostrarInfo();
}
