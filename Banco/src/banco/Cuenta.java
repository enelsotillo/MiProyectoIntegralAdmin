
package banco;

public class Cuenta {
private String titular;
private double importe;

public Cuenta(String MiNombre, double MiImporte){
    this.titular=MiNombre;
    this.importe=MiImporte;
}
    
public void Ingreso(double MiImporte){
    if(MiImporte>0){
        this.importe+=MiImporte;
    }
}
public void Retirar(double MiImporte){
    if(this.importe-MiImporte<0){
        this.importe=0;
    }else{
        this.importe-=MiImporte;
        
    }
}
@Override
public String toString(){
    return "El titular: "+titular+" tiene un saldo: "+importe;
}
}


