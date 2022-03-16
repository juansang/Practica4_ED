/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

public abstract class Mascota implements ISonido {
    
    public String nombre = new String();
    public Integer edad;

    public String getNombre() {
        /*
         * método para consultar el valor de nombre
         * 
         * @return: devuelve el valor del atributo nombre
         */
        return nombre;
    }

    public void setNombre(String nombre) {
        /*
         * método para modificar el valor del atributo nombre
         * 
         * @param: string nombre
         */
        this.nombre = nombre;
    }

    public Integer getEdad() {
        /*
         * método para consultar el valor de edad
         * 
         * @return: devuelve el valor del atributo edad
         */
        return edad;
    }

    public void setEdad(Integer edad) {
        /*
         * método para modificar el valor del atributo edad
         * 
         * @param: integer edad
         */
        this.edad = edad;
    }
    
     public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Mascota() {
    }
}