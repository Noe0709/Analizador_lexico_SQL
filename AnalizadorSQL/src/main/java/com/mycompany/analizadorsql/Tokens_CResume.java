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
Esta clase se convierte en una de apoyo ya que guarda en un array (lista) la 
cantidad de tokens de un mismo lexema, para poder generar el resumen final que 
podemos observar cuando ejecutamos el programa. Tiene un constructor 
Tokens_CResume que utilizamos para construir los objetos de la clase recibiendo 
la cantidad de veces que el token aparece como un parámetro juntamente con el 
lexema del propio token. También tenemos los métodos get y set que se utiliza 
para obtener y actualizar la información respectivamente del objeto */

class Tokens_CResume {
        private int cantidad = 0;
    private String lexemaToken;

    public Tokens_CResume(int cantidad, String lexemaToken) {
        this.cantidad = cantidad;
        this.lexemaToken = lexemaToken;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLexemaToken() {
        return lexemaToken;
    }

    @Override
    public String toString() {
        return "ResumenCantidadTokens{" +
                "cantidad=" + cantidad +
                ", lexemaToken='" + lexemaToken + '\'' +
                '}';
    }
}
