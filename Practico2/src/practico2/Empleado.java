
package practico2;
public class Empleado {
    String Nombre;
    String DNI;
    int Edad;
    boolean Casado;
    double Salario;
    
public Empleado(){
        
    }
public Empleado(String Pnombre, String PDNI, double Psalario ){
    Nombre=Pnombre;
    DNI=PDNI;
    Salario=Psalario;
}
public String MiEdad(int PEdad){
    String Categoria=null;
    if(PEdad<21){
        Categoria="Junior";
    }
    if(PEdad>20 && PEdad<35){
        Categoria="Intermedio";
    }
    if(PEdad>34 && PEdad<45){
        Categoria="Señor";
    }
    return Categoria;
}
public void imprimir(){
    System.out.println(Nombre);
    System.out.println(DNI);
}
public double Aumentar(double Porcentaje){
    Salario=Salario*(1+(Porcentaje/100));
    return Salario;
}
}
