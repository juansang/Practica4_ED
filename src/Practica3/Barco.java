/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

import java.util.Date;

public class Barco implements ISonido {

    private String nombre = new String();
    private Date fechaConstruccion;
    private Integer numCamarotes;
    private Motor motor;

    public Barco(String nombre, Date fechaConstruccion, Integer numCamarotes, String fabricante, String potencia,
            Integer codigo) {
        /*
         * constructor Barco(): inicializa las variables de la clase Barco con los
         * valores
         * de los parámetros
         * 
         * @param: String nombre, Date fechaConstruccion, Integer numCamarotes, String
         * fabricante, String potencia, Integer codigo
         */
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
        this.motor = new Motor(fabricante, potencia, codigo);
    }

    public Barco() {
        /*
         * constructor Barco(): inicializa las variables de la clase Barco como nulas
         * 
         * @param: vacío
         */
        this.motor = new Motor();
    }

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

    public Date getFechaConstruccion() {
        /*
         * método para consultar el valor de fechaConstruccion
         * 
         * @return: devuelve el valor del atributo fechaConstruccion
         */
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        /*
         * método para modificar el valor del atributo fechaConstruccion
         * 
         * @param: date fechaConstruccion
         */
        this.fechaConstruccion = fechaConstruccion;
    }

    public Integer getNumCamarotes() {
        /*
         * método para consultar el valor de numCamarotes
         * 
         * @return: devuelve el valor del atributo numCamarotes
         */
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        /*
         * método para modificar el valor del atributo numCamarotes
         * 
         * @param: integer numCamarotes
         */
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        /*
         * método toString(): convierte el objeto a String
         * 
         * @return: devuelve un string con los atributos del objeto Barco
         */
        return "Barco [fechaConstruccion=" + fechaConstruccion + ", motor=" + motor + ", nombre=" + nombre
                + ", numCamarotes=" + numCamarotes + "]";
    }

    @Override
    public void sonido() {
        System.out.print(this.getNombre() + " hace SUUUUUUUU");
    }
}
