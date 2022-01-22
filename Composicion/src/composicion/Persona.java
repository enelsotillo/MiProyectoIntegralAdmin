
package composicion;

public class Persona {

public String nombre;
public String apellido;
public int edad;
public double sueldo;
// metodo constructor
public Persona(String minombre, String miApellido, int miEdad, double miSueldo){
    this.nombre=minombre;
    this.apellido=miApellido;
    this.edad=miEdad;
    this.sueldo=miSueldo;
    
    //cargar datos
    minombre="Enel";
    miApellido="Sotillo";
    miEdad=45;
    miSueldo=10.000;
    
    
}

// getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

public class domicilio{
    public String calle;
    public int piso;
    public String Dpto;
    public String localidad;
    public String provincia;

public domicilio(String micalle, int mipiso, String miDpto, String milocalidad, String miprovincia ){
    this.calle=micalle;
    this.piso=mipiso;
    this.Dpto=miDpto;
    this.localidad=milocalidad;
    this.provincia=miprovincia;
    
    //cargar datos
    micalle="Bacacay 3715";
    mipiso=1;
    miDpto="01";
    milocalidad="Floresta";
    miprovincia="Ciudad Autonoma de Buenos Aires";
}    
//getters y setters

        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public int getPiso() {
            return piso;
        }

        public void setPiso(int piso) {
            this.piso = piso;
        }

        public String getDpto() {
            return Dpto;
        }

        public void setDpto(String Dpto) {
            this.Dpto = Dpto;
        }

        public String getLocalidad() {
            return localidad;
        }

        public void setLocalidad(String localidad) {
            this.localidad = localidad;
        }

        public String getProvincia() {
            return provincia;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }
        

}


}
