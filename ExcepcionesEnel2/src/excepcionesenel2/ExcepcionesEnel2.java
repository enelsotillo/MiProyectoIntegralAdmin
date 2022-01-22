
package excepcionesenel2;

public class ExcepcionesEnel2 {

    public static void main(String[] args) {
        int i=0;
        String[] palabras={"Hola","como","estas"};
        while(i<palabras.length){
            try{
                System.out.println(palabras[i]);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error Array fuera de rango");
            }
            finally{
                System.out.println("finally");
            }
        }
        
    }
    
}
