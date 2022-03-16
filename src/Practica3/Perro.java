/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

public class Perro extends Mascota {
    
    private String raza = new String();

    public Perro(String raza,String nombre,int edad ) {
        /*
         * constructor Perro(): inicializa las variables de la clase Perro con los
         * valores
         * de los parámetros
         * 
         * @param: String raza
         */
        super(nombre,edad);
        this.raza = raza;
    }

    public Perro() {
        /*
         * constructor Perro(): inicializa las variables de la clase Perro como nulas
         * 
         * @param: vacío
         */
    }

    public String getRaza() {
        /*
         * método para consultar el valor de raza
         * 
         * @return: devuelve el valor del atributo raza
         */
        return raza;
    }

    public void setRaza(String raza) {
        /*
         * método para modificar el valor del atributo raza
         * 
         * @param: string raza
         */
        this.raza = raza;
    }

    @Override
    public String toString() {
        /*
         * método toString(): convierte el objeto a String
         * 
         * @return: devuelve un string con los atributos del objeto Perrro
         */
        return "Perro [raza=" + raza + ", nombre=" + super.getNombre() + ", edad" + super.getEdad() + "]";
    }
    
    @Override
    public void sonido() {
        System.out.print(this.getNombre() + " dice woof woof");
    }
}
