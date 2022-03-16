/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

public class Motor {

    private String fabricante = new String();
    private String potencia = new String();
    private Integer codigo;

    public Motor(String fabricante, String potencia, Integer codigo) {
        /*
         * constructor Motor(): inicializa las variables de la clase Motor con los
         * valores
         * de los parámetros
         * 
         * @param: String fabricante, String potencia, Integer codigo
         */
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }

    public Motor() {
        /*
         * constructor Motor(): inicializa las variables de la clase Motor como nulas
         * 
         * @param: vacío
         */
        this(null, null, null);
    }

    public String getFabricante() {
        /*
         * método para consultar el valor de fabricante
         * 
         * @return: devuelve el valor del atributo fabricante
         */
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        /*
         * método para modificar el valor del atributo fabricante
         * 
         * @param: string fabricante
         */
        this.fabricante = fabricante;
    }

    public String getPotencia() {
        /*
         * método para consultar el valor de potencia
         * 
         * @return: devuelve el valor del atributo potencia
         */
        return potencia;
    }

    public void setPotencia(String potencia) {
        /*
         * método para modificar el valor del atributo potencia
         * 
         * @param: string potencia
         */
        this.potencia = potencia;
    }

    public Integer getCodigo() {
        /*
         * método para consultar el valor de codigo
         * 
         * @return: devuelve el valor del atributo codigo
         */
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        /*
         * método para modificar el valor del atributo codigo
         * 
         * @param: integer codigo
         */
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        /*
         * método toString(): convierte el objeto a String
         * 
         * @return: devuelve un string con los atributos del objeto Motor
         */
        return "Motor [codigo=" + codigo + ", fabricante=" + fabricante + ", potencia=" + potencia + "]";
    }
}
