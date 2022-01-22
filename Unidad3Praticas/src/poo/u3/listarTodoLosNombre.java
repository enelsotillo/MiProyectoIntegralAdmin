
package poo.u3;

public class listarTodoLosNombre {
 String texto1="Avispa";    
 String texto2="Aviso";  
 
public void MilistarTodoLosNombre(){
    int y=0;
    int i=0;
    int j=0;
    boolean bandera=true;
    
    if(texto1.length()>texto2.length()){
        for(i=0;i<texto1.length();i++){
            for(y=0;y<texto2.length();y++){
           // if(texto1.charAt(i)==((texto2.charAt(y)))){
                bandera=true;
                System.out.println("Cadena1: "+i+" es igual a la Cadena2 "+(texto1.charAt(i)==texto2.charAt(y))+""+bandera); 
          //      if((i)<texto2.length()){
                   bandera=false;
                   System.out.println("Cadena 2 no tiene letra "+(i)+" "+bandera+"");
                    }
               }
        
        
    }
}
}

 
    

