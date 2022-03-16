package Practica3;

public class Juguete {

    private String nombre;
    private int precio;
    private int edadRecomendada;

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

    public int getPrecio() {
        /*método getPrecio(): consultar el valor de precio
        @return: devuelve el valor del atributo precio*/
        return precio;
    }

    public void setPrecio(int precio) {
        /*método setPrecio(): modifica el valor del atributo precio 
        @param: int precio*/
        this.precio = precio;
    }

    public int getEdadRecomendada() {
        /*método getEdadRecomendada(): consultar el valor de edadRecomendada
        @return: devuelve el valor del atributo edadRecomendada*/
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        /*método setEdadRecomendada(): modifica el valor del atributo edadRecomendada 
        @param: int edadRecomendada*/
        this.edadRecomendada = edadRecomendada;
    }

    public Juguete() {
        /*constructor Juguete(): inicializa las variables de la clase Juguete como nulas 
        @param:  */
    }

    public Juguete(String nombre, int precio, int edadRecomendada) {
        /*constructor Juguete(): inicializa las variables de la clase Juguete con los valores
         de los parámetros
        @param: String nombre, int precio, int edadRecomendada*/
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }

    @Override
    public String toString() {
        /*método toString(): convierte el objeto a String
        @return: devuelve un string con los atributos del objeto Juguete*/
        return "Juguete [ Nombre: " + nombre + ", Precio: " + precio
                + ", Edad Recomendada: " + edadRecomendada + "]";
    }
}
