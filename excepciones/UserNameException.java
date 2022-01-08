package excepciones;

public class UserNameException extends Exception{
    public UserNameException(){
        super("El nombre de usuario no puede contener mayusculas y debe contener por lo menos 4 caracteres.");
    }
}
