//Unidad 2 ejercicio 4
package unidad2;
public class Perro {
    String nombre;
    String raza;
    double altura;
    
    //metodos constructor
    public Perro(String Pnombre, String Praza, double Paltura){
     nombre=Pnombre;
     raza=Praza;
     altura=Paltura;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //metodos
    public void ladrar(){
        
    }
    public void caminar(){
        
    }
    public void saltar(){
        
    }
    public void recobrar(){
        
    }
    public String ToSring(){
        String mgs=" nombre "+nombre+" raza "+raza+" altura "+altura;
        return mgs;
    }
}
