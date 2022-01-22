
package practico2;
public class Practico2 {
    public static void main(String[] args) {
       Empleado emp1=new Empleado("Enel Sotillo","96020831",40000);
       System.out.println(emp1.MiEdad(19));
       emp1.imprimir();
       System.out.println(emp1.Aumentar(50));
    }
    
}
