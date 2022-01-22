
package iteratorunidad3;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUnidad3 {

    public static void main(String[] args) {

        ArrayList<String>Listado=new ArrayList<String>();
        Listado.add("Futbol");
        Listado.add("Tenis");
        Listado.add("Natación");
        Listado.add("Rugby");
        
        System.out.println("Proceso Terminado");
       
        Iterator<String> deportes = Listado.iterator();
 //           deportes.next();
            while(deportes.hasNext()){
            System.out.println(deportes.next());
            
        }
        
    }
    
}
