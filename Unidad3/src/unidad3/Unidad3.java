
package unidad3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.util.Spliterators.iterator;

public class Unidad3 {

    public static void main(String[] args) {
    
    Personal Enlace=new Personal();
    int salarios;
    Enlace.setSueldo(500);
    System.out.println(Enlace.getSueldo());
    
    // collection
   
    int elemento;
    List<String> ejemploLista = new ArrayList<String>();
    ejemploLista.add("Juan");
    ejemploLista.add("Pedro");
    ejemploLista.add("Maria");
    
    elemento=ejemploLista.size();
    
    System.out.println(elemento); // cantidad lineas imprime cantidad de elementos
    System.out.println(ejemploLista.get(0)); // selecciona una linea numero 0 primime el elemento 0
    
    // eliminar elementos de la lista
    ejemploLista.remove(0); //elimina el elemento en la posicion 0 por nombre
    //ejemploLista.remove("Juan"); //elimina por nombre elemento
    System.out.println(ejemploLista.get(0)); //imprime solo Pedro
    System.out.println(ejemploLista.get(1)); // imprime solo Maria
    System.out.println(ejemploLista); // imprime [Pedro, Maria] horizontal
   
    for(int i=0; i<=ejemploLista.size()-1;i++){
    System.out.println(ejemploLista.get(i));    //imprime vertical
    // imprime Pedro
    // imprime Maria
   }
    
     Iterator<String>i=ejemploLista.iterator();
        
         while(i.hasNext()){
         System.out.println(i.next());
     }
    
    }
}