/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

/**
 *
 * @author Noe Gomez
 */

/*
Esta tiene exactamente la misma función que la clase PalabraRes, lo único que 
cambia es que, en lugar de asignar un identificador a una palabra reservada, lo 
hace con un símbolo. Ambas funciones tienen un método constructor que recibe 
como parámetro el código de entrada (símbolo en este caso) y el lexema del 
símbolo, también un get, que captura la información proveniente de los atributos 
del objeto cuando este lo llegue a necesitar.
*/
public class Simbolo {
    
    private int id;
    private String simbolo;

    public Simbolo(int id, String simbolo) {
        this.id = id;
        this.simbolo = simbolo;
    }

    public int getId() {
        return id;
    }

    public String getSimbolo() {
        return simbolo;
    }

    @Override
    public String toString() {
        return "Simbolo{" +
                "id=" + id +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }   
    
}
