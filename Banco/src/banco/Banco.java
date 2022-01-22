
package banco;

public class Banco {

    public static void main(String[] args) {

        Cuenta cuentapesos=new Cuenta("Jose",300);
        Cuenta cuentadolares=new Cuenta("Maria",100);
        
        //Ingreso de Dinero a la cuenta
        cuentapesos.Ingreso(1000);
        cuentadolares.Ingreso(200);
        
        //Retiro de cuanta banco
        cuentapesos.Retirar(300);
        cuentadolares.Retirar(301);
        
        // Imprime saldo de cuentas
        //System.out.println(toString());
        System.out.println(cuentapesos);
        System.out.println(cuentadolares);
    }
    
}
