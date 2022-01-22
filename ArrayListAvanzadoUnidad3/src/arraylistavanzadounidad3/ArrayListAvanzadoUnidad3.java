
package arraylistavanzadounidad3;

import java.util.ArrayList;

public class ArrayListAvanzadoUnidad3 {

    public static void main(String[] args) {
    
    ArrayList<String> listado=new ArrayList<String>();
    listado.add("Futbol");
    listado.add("Tenis");
    listado.add("Natacion");
    listado.add("Rugby");
    
    System.out.println("Cantidad es:"+listado.size());
    
    listado.forEach((deporte)->{
       System.out.println(deporte);
    });
// consultar en la lista o en los elementos si existe   
    if(listado.contains("Natacion")){
       System.out.println("Contine Natacion");
        }
    
    listado.remove("Natacion");
    listado.remove(0);
    
    System.out.println("Ahora quedaron la Cantidad: "+listado.size());
    listado.forEach((deporte)->{
       System.out.println(deporte);
    });
       }
 }
