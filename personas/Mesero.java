package personas;


public class Mesero extends Persona {
    
    public Mesero(String userName, String passW,String nombre, int edad, String sexo, long telefono){
        super(userName, passW, nombre, edad, sexo, telefono);
    }

    public  void crearOrden(){

    }
    public  void verDispoMesas(){

    }
    public  void verMesasOcup(){

    }
    public  void facturar(){

    }
    public  void verEstadisticas(){

    }

    public void mostrarInfo(){
        System.out.println("--------> Mesero");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Telefeno: "+this.getTelefono());
    }
}
