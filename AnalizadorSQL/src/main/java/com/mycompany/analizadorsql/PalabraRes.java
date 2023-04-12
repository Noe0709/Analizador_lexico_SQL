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
Como su nombre lo indica, es una clase de apoyo que asigna un número de 
identificación o “id” a las palabras reservadas en sí mismas que contiene la lista 
almacenada en la clase principal (Main), su función se puede explicar 
gráficamente como una secuencia de id´s y la palabra reservada a la par */
public class PalabraRes {
        private int id;
    private String palabraReservada;

    public PalabraRes(int id, String palabraReservada) {
        this.id = id;
        this.palabraReservada = palabraReservada;
    }

    public int getId() {
        return id;
    }

    public String getPalabraRes() {
        return palabraReservada;
    }

    @Override
    public String toString() {
        return "Palabra Reservada{" +
                "id=" + id +
                ", palabraReservada='" + palabraReservada + '\'' +
                '}';
    }
}
