
package excepcionesenel;

public class ExcepcionesEnel {

    public static void main(String[] args) {
        int a, b, c;
        try{
        a=10;
        b=0;
        c=0;
        c=a/b;
        System.out.println("Resultado es:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Error Division por cero");
        }
        
    }
    
}
