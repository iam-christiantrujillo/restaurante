package excepciones;

public class EdadException extends Exception{
    public EdadException(){
        super("La edad debe ser mayor a 0 y menor a 100 años y no puede contener letras.");
    }
}
