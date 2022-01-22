
package arraylistunidad3;

import java.util.ArrayList;

public class ArrayListUnidad3 {

    public static void main(String[] args) {   
    ArrayList<Integer> numeros=new ArrayList<Integer>();
    numeros.add(25);
    numeros.add(1);
    numeros.add(38);
    numeros.add(-4);
    numeros.add(600);
    
    System.out.println("Cantida de filas es: "+ numeros.size());
    System.out.println("numeros es: "+ numeros.get(2));
    for(int i=0;i<5;i++){
        
        System.out.println(numeros.get(i));
    }
    
    }
    
}
