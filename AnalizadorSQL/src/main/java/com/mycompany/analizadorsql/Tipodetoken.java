/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.analizadorsql;

/**
 *
 * @author Noe Gomez
 */

/*
Esta clase es de tipo enum y se utiliza como apoyo de índice para delimitar 
expresamente los tipos que pueden llegar a ser las cadenas ingresadas en el 
archivo .txt, bien sabemos que tenemos palabras Reservadas, las cuales son 
parte de la gramática de SQL, los identificadores que utilizamos como variables o 
constantes, los Símbolos propios de SQL, las Cadenas que podemos encontrar 
delimitadas por comillas dobles (“ ”) y los Números los valores desde 0 hasta 9 
que pueden producirse en combinación en el archivo que se le manda al inicio */
public enum Tipodetoken {
    RESERVADA, IDENTIFICADOR, SIMBOLO, CADENA, NUMERO;
}
