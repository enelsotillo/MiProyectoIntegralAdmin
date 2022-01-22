
package polimorfismo5;

public class Bus extends Vehiculo{
    private int peso;
    private int puestos;
    
    //metodo constructor
    public Bus(int mipeso, int mipuesto, String miMatricula, String miMarca, String miModelo){
        super(miMatricula, miMarca, miModelo);
        this.peso=mipeso;
        this.puestos=mipuesto;
        
        
    }

    public int getPeso() {
        return peso;
    }

    public int getPuestos() {
        return puestos;
    }
    
    @Override
    public String MostrarDatos(){
    return "Matricula: "+Matricula+"\nMarca: "+Marca+"\nModelo: "+Modelo+"\nPeso: "+peso+"\nPuestos: "+puestos;
    }
    
}
