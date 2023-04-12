/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

/**
 *
 * @author Noe Gomez
 */

/*Como su nombre lo indica construye los tokens en objetos de su mismo tipo para que queden
como atributos del lexema, tl Tipo de Token y el codigo asignado al token, esta logica es parecida a 
la de las clases simbolo y palabra reservada, Tenemos un constructor de tipo Token que recibe como 
parametro el propio lexema y el codigo del token para su posterior uso*/
class Token {
    
    private String lexema;
    private Tipodetoken tipoToken;
    private int id_token;

    public Token(String lexema, Tipodetoken tipoToken, int id_token) {
        this.lexema = lexema;
        this.tipoToken = tipoToken;
        this.id_token = id_token;
    }

    public Tipodetoken getTipoToken() {
        return tipoToken;
    }

    public String getLexema() {
        return lexema;
    }

    public int getId_token() {
        return id_token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "tipoToken=" + tipoToken +
                ", lexema='" + lexema + '\'' +
                ", id_token=" + id_token +
                '}';
    } 
    
}
