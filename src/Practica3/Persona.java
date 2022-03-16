package Practica3;

public abstract class Persona {

    private String nombre;
    private String DNI;
    private int altura;

    public String getNombre() {
        /*método getNombre(): consultar el valor de nombre
        @return: devuelve el valor del atributo nombre*/
        return nombre;
    }

    public void setNombre(String nombre) {
        /*método setNombre(): modifica el valor del atributo nombre 
        @param: String nombre*/
        this.nombre = nombre;
    }

    public int getAltura() {
        /*método getAltura(): consultar el valor de altura
        @return: devuelve el valor del atributo altura*/
        return altura;
    }

    public void setAltura(Integer altura) {
        /*método setAltura(): modifica el valor del atributo altura 
        @param: int altura*/
        this.altura = altura;
    }

    public String getDNI() {
        /*método getDNI(): consultar el valor de DNI
        @return: devuelve el valor del atributo DNI*/
        return DNI;
    }

    public void setDNI(String DNI) {
        /*método setDNI(): modifica el valor del atributo DNI 
        @param: String DNI*/
        this.DNI = DNI;
    }

    public Persona(String nombre, String DNI, int altura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.altura = altura;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona [ Nombre=" + nombre + ", DNI=" + DNI + ", Altura=" + altura + " ]";
    }
}
