
package repasoej1;

public class RepasoEj1 {

    public static void main(String[] args) {
    double[] a = {10,11.95,40,20.10,100.50};
    double prom=0;
    int contador=0;
        for (int i = 0; i < 5; i++) {
            prom+=a[i];
            contador++;
        }
    System.out.println("Promedio");
    System.out.println(prom/5);
    
    System.out.println("Promedio");
    System.out.println(prom/contador);
    }
    
}
