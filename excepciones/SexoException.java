package excepciones;

public class SexoException extends Exception{
    public SexoException(){
        super("El formato del sexo debe ser un caracter M o F, escrito en mayuscula y no puede ser un numero.");
    }
}