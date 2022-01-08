package excepciones;

public class TelefonoException extends Exception{
    public TelefonoException(){
        super("El telefono debe contener 10 digitos y no puede contener letras.");
    }
}
