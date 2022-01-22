
package miprimerprograma;
public class Ventas {
    int serie;
    int lote;
    int codigo_producto;
    double valor_venta;
    double iva;
    double impuesto;
    double neto;
    double suma;
//metodo constructor
    public Ventas(){
        serie=00001;
        lote=1;
        codigo_producto=0;
        valor_venta=500;
        iva=0.08;
        impuesto=0.005;
        
        
    }
    public double getmiCantidad(){
        iva=(valor_venta*iva);
        impuesto=(valor_venta*impuesto);
        suma=(valor_venta+impuesto+iva);
        return suma;
    }

    public double getIva() {
        iva=valor_venta*iva;
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getImpuesto() {
        impuesto=impuesto*valor_venta;
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getSuma() {
        suma=(suma+impuesto+iva+valor_venta);
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
    
}
