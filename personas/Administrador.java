package personas;

public class Administrador extends Persona {

    public Administrador(){

    }

    public Administrador(String userName, String passW,String nombre, int edad, String sexo, long telefono){
        super(userName, passW, nombre, edad, sexo, telefono);
    }

    public void mostrarInfo(){
        System.out.println("--------> Administrador");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Telefeno: "+this.getTelefono());
    }
}
