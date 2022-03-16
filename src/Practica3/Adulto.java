package Practica3;

public class Adulto extends Persona {

    private String NSS;
    private String direccion;

    public String getNSS() {
        /*método getNSS(): consultar el valor de NSS
        @return: devuelve el valor del atributo NSS*/
        return NSS;
    }

    public void setNSS(String NSS) {
        /*método setNSS(): modifica el valor del atributo NSS 
        @param: String NSS*/
        this.NSS = NSS;
    }

    public String getDireccion() {
        /*método getDireccion(): consultar el valor de direccion
        @return: devuelve el valor del atributo direccion*/
        return direccion;
    }

    public void setDireccion(String direccion) {
        /*metodo setDireccion(): modifica el valor del atributo Direccion 
        @param: String Direccion*/
        this.direccion = direccion;
    }

    public Adulto() {
        /*constructor Adulto(): inicializa las variables de la clase Adulto como nulas
        @param: */
    }

    public Adulto(String NSS, String direccion,String nombre, String DNI, int edad){
        /*constructor Adulto(): inicializa las variables de la clase Adulto con los valores 
         de los parámetros
        @param: String NSS, String direccion ,String nombre, String DNI, int edad */
        super(nombre,DNI,edad);
        this.NSS = NSS;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        /*método toString(): convierte el objeto a String
        @return: devuelve un string con los atributos del objeto Adulto*/
        return "Adulto [ NSS: " + NSS + ", Direccion: " + direccion + "]";
    }
}




