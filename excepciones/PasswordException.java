package excepciones;

public class PasswordException extends Exception{
    public PasswordException(){
        super("La contrasena debe contener por lo menos cuatro caracteres.");
    }
}
