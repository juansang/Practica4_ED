package Practica3;

public abstract class Persona {

    private String nombre;
    private String DNI;
    private int edad;

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

    public int getEdad() {
        /*método getEdad(): consultar el valor de edad
        @return: devuelve el valor del atributo edad*/
        return edad;
    }

    public void setEdad(Integer edad) {
        /*método setEdad(): modifica el valor del atributo edad 
        @param: int edad*/
        this.edad = edad;
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

    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona [ Nombre=" + nombre + ", DNI=" + DNI + ", Edad=" + edad + " ]";
    }
}
