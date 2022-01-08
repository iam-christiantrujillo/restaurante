package personas;
import excepciones.*;


public class Mesero extends Persona {
    private int numMesero;
    private boolean atendiendo = false;
    private int ventasTotales=0;
    private int numPlatillosV=0;

    public Mesero(){

    }
    
    public Mesero(String userName, String passW,int numMesero,String nombre, int edad, String sexo, long telefono){
        super(userName, passW, nombre, edad, sexo, telefono);
        this.numMesero=numMesero;
    }

    public int getNumMesero(){
        return numMesero;
    }

    public void setNumMesero(String nuevo) throws NumeroMeseroException{
        int number;
        if(nuevo.length()!=3){
            throw new NumeroMeseroException();
        }else{
            try {
                number = Integer.parseInt(nuevo);
                this.numMesero=number;
            } catch (NumberFormatException e) {
                throw new NumeroMeseroException();
            }
        }
        
    }

    public boolean getAtendiendo(){
        return atendiendo;
    }

    public void setAtendiendo(boolean cambio){
        this.atendiendo = cambio;
    }

    public int getVentasTotales(){
        return ventasTotales;
    }

    public void setVentasTotales(int aSumar){
        this.ventasTotales+=aSumar;
    }

    public int getNumPlatillosV(){
        return numPlatillosV;
    }

    public void setNumPlatillosV(int aSumar){
        this.numPlatillosV+=aSumar;
    }

    public void mostrarInfo(){
        System.out.println("--------> Mesero");
        System.out.println("Numero de identificacion: "+this.getNumMesero());
        System.out.println("Ventas totales: $"+this.getVentasTotales());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Telefeno: "+this.getTelefono());
        System.out.println("Atendiendo mesa: "+this.getAtendiendo());
    }
}
