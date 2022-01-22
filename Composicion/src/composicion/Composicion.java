
package composicion;

import composicion.Persona.domicilio;

public class Composicion {

    public static void main(String[] args) {
        domicilio direccion = null;
        Medico mm = new Medico("Enel","Sotillo",45,3000.00,"Bahia Blanca",1,"1","Floresta","Capital");
//        direccion.setCalle("Bahia Blanca 1012");
//        direccion.setLocalidad("Caba");
//        direccion.setProvincia("Capital");
        mm.getApellido();
    }
    
}
