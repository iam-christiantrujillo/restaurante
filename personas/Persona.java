package personas;
import java.io.Serializable;
import excepciones.*;

public abstract class Persona implements Serializable{
    private String userName;
    private String passW;
    private String nombre;
    private int edad;
    private String sexo;
    private long telefono;

    public void setUserName(String nuevo) throws UserNameException{
        if(nuevo.length()<4){
            throw new UserNameException();
        }else{
            for(int i=0; i<nuevo.length();i++){
                if(nuevo.charAt(i)!=Character.toLowerCase(nuevo.charAt(i))){
                    throw new UserNameException();
                }
            }
            this.userName=nuevo;
        }
    }

    public String getUserName(){
        return this.userName;
    }

    public void setPassW( String pass) throws PasswordException{
        if(pass.length()<4){
            throw new PasswordException();
        }else{
            this.passW = pass;
        }
    }

    public String getPassW(){
        return this.passW;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nuevo) throws NombreException{
        char[] chars = nuevo.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                throw new NombreException();
            }
        }
        if(nuevo.charAt(0)!=Character.toUpperCase(nuevo.charAt(0))){
            throw new NombreException();
        }else{
            this.nombre=nuevo;
        }
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(String nueva) throws EdadException{
        int number;
        try {
            number = Integer.parseInt(nueva);
            if(number==0 || number>=100){
                throw new EdadException();
            }else{
                this.edad=number;
            }
        } catch (NumberFormatException e) {
            throw new EdadException();
        }
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String nuevo) throws SexoException{
        if(nuevo.length()!=1){
            System.out.println("No tien solo un cracter");
            throw new SexoException();
        }else if(nuevo.charAt(0)!=Character.toUpperCase(nuevo.charAt(0))){
            System.out.println("El primer carcater no es mayuscula");
            throw new SexoException();
        }else if(nuevo.charAt(0) == 'M' || nuevo.charAt(0) == 'F'){
            
            this.sexo=nuevo;
        }else{
            System.out.println("No es M o F");
            throw new SexoException();
        }
        
    }

    public long getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String nuevo) throws TelefonoException{
        long number;
        try {
            if(nuevo.length()!=10){
                throw new TelefonoException();
            }else{
                number = Long.parseLong(nuevo);
                this.telefono=number;
            }
        } catch (NumberFormatException e) {
            throw new TelefonoException();
        }
    }

    public Persona(){

    }

    public Persona(String userName, String passW,String nombre, int edad, String sexo, long telefono){
        this.userName = userName;
        this.passW = passW;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public abstract void mostrarInfo();
}
