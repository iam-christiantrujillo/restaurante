package excepciones;

public class NumeroMeseroException extends Exception{
    public NumeroMeseroException(){
        super("El numero del mesero no puede contener letras y debe tener 3 digitos.");
    }
}
