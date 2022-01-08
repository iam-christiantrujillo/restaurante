package excepciones;

public class NombreException extends Exception{
    public NombreException(){
        super("El nombre no puede contener digitos y la primera letra tiene que ser mayuscula.");
    }
}
