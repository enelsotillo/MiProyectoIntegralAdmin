
package arreglosumaa.b.c;

import javax.swing.JOptionPane;

public class ArregloSumaABC {

    public static void main(String[] args) {
        int arregloA[]=new int[5];
        int arregloB[]=new int[5];
        int arregloC[]=new int[5];
        int x=0,y=0,n=0;
        String mostrarA=" \t";
        String mostrarB=" \t";
        String mostrarC="  \t";
        String sun="";
       
        for (int i = 0; i < arregloA.length; i++) {
        String A=JOptionPane.showInputDialog(null,"Ingrese Datos Arreglo 'A' ");    
        x=Integer.parseInt(A);
        arregloA[i]=(x);
        mostrarA=mostrarA+x+"   "+"\t";
        System.out.println("Arreglo A: "+x);
        

        }
        JOptionPane.showMessageDialog(null, mostrarA,"Arreglo A ",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("-------------------------------");
        for (int i = 0; i < arregloB.length; i++) {
        String C=JOptionPane.showInputDialog(null,"Ingrese Datos Arreglo 'B' ");    
        y=Integer.parseInt(C);
        arregloB[i]=y;
        mostrarB=mostrarB+y+"   "+"\t";
        System.out.println("Arreglo B: "+y);
        
        }
        JOptionPane.showMessageDialog(null, mostrarB,"Arreglo B ",JOptionPane.INFORMATION_MESSAGE);
        int j=0;
        for (int i = 0; i < arregloC.length; i++) {
            arregloC[j]=arregloA[i]+arregloB[i];
            j++;
            mostrarC=mostrarC+arregloC[i]+"   "+"\t";
            System.out.println("---------------------------");
            System.out.println("Arreglo A "+arregloA[i]+" + B "+arregloB[i]+" = "+arregloC[i]);
        
        }
        for (int i = 0; i < 5; i++) {
            
        sun=sun+"  A:\t "+"\t "+mostrarA+ "    \n B: "+" " +mostrarB+ "\n C: "+" \t"+mostrarC;
        JOptionPane.showMessageDialog(null,sun,"Arreglo C =suma(A+B)",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        }
        
        
    }   
            
            
}
