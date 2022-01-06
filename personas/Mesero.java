package personas;


public class Mesero extends Persona {
    private int numMesero;
    private boolean atendiendo = false;
    private int ventasTotales=0;
    private int numPlatillosV=0;
    
    public Mesero(String userName, String passW,int numMesero,String nombre, int edad, String sexo, long telefono){
        super(userName, passW, nombre, edad, sexo, telefono);
        this.numMesero=numMesero;
    }

    public int getNumMesero(){
        return numMesero;
    }

    public void setNumMesero(int nuevo){
        this.numMesero=nuevo;
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

    public  void crearOrden(){

    }
    public  void verDispoMesas(){

    }
    public  void verMesasOcup(){

    }
    public  void facturar(){

    }
    public  void verEstadisticas(){

    }

    public void mostrarInfo(){
        System.out.println("--------> Mesero");
        System.out.println("Numero de identificacion: "+this.getNumMesero());
        System.out.println("Ventas totales: "+this.getVentasTotales());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Telefeno: "+this.getTelefono());
        System.out.println("Atendiendo mesa: "+this.getAtendiendo());
    }
}
