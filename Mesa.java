import personas.Mesero;
import java.io.Serializable;

public class Mesa implements Serializable{
    // asociada a un mesero y una orden
    private int numMesa;
    private boolean ocupada = false;
    private Mesero meseroACargo;
    private Orden ordenMesa;
    private int ventasTotales=0;

    public Mesa(int numMesa){
        this.numMesa= numMesa;
        
    }

    public int getNumMesa(){
        return numMesa;
    }

    public boolean getOcupada(){
        return ocupada;
    }

    public void setOcupada(boolean cambio){
        this.ocupada=cambio;
    }

    public Mesero getMeseroACargo(){
        return meseroACargo;
    }

    public void setMeseroACargo(Mesero nuevo){
        this.meseroACargo=nuevo;
    }

    public Orden getOrdenMesa(){
        return ordenMesa;
    }

    public void setOrdenMesa(Orden nueva){
        this.ordenMesa=nueva;
    }

    public int getVentasTotales(){
        return ventasTotales;
    }

    public void setVentasTotales(int aSumar){
        this.ventasTotales+=aSumar;
    }

    public void liberarMesa(){
        this.ocupada=false;
        this.meseroACargo.setAtendiendo(false);
        this.meseroACargo=null;
        this.ordenMesa=null;
    }

    public void verInfo(){
        System.out.println("-----> Mesa");
        System.out.println("Numero de mesa: "+this.getNumMesa());
        System.out.println("Ventas totales: $"+this.getVentasTotales());
        System.out.println("Ocupada: "+this.getOcupada());
        if(this.getOcupada()==true){
            System.out.println("Mesero a cargo: "+this.getMeseroACargo().getNombre());
            ordenMesa.mostrarInfo();
        }
    }



}
