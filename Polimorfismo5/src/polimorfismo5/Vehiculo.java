
package polimorfismo5;

public class Vehiculo {
    protected String Matricula;
    protected String Marca;
    protected String Modelo;
    
 // metodo construtor
    public Vehiculo(String miMatricula, String miMarca, String miModelo){
        this.Matricula=miMatricula;
        this.Marca=miMarca;
        this.Modelo=miModelo;
        
        
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }
    
    public String MostrarDatos(){
       return "Matricula: "+Matricula+"\nMarca: "+Marca+"\nModelo: "+Modelo; 
    }
    
}