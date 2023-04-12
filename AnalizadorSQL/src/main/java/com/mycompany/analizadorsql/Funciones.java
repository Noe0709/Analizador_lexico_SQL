/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

/**
 *
 * @author Noe Gomez
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*^INICIALMENTE SE IMPORTAN LIBRERIAS PARA SU USO COMO IO, PARA NUMEROS Y ARRAYLIST Y LIST PARA ARRAYS.

En esta clase se reciben como parámetros argumentos para su ejecución. 
Contiene los índices lógicos internos del programa; separación de los lexemas, la 
identificación de cada token, y la generación de los caracteres reconocidos que se 
deberán desplegar al final del procesamiento */


class AllFuntions {
    static Main main = new Main();
    public static List<String> cadenas = new ArrayList<>();
    static boolean esComentario = false;
    public static List<Token> tokens = new ArrayList<>();
    public static List<Tokens_CResume> resumen = new ArrayList<>();
    /*La función de leer archivo va a recibir la dirección física del archivo de entrada, 
    separa por número de líneas y lee el archivo para que cada línea que contenga la 
    entrada sea almacenada en una lista de cadenas  */
    public void leerArchivo(String direccionArchivo) {
        String cadena;

        FileReader archivo;
        BufferedReader lector;

        try {
            archivo = new FileReader(direccionArchivo);
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);

                while ((cadena = lector.readLine()) != null) {
                    main.lineas_riel.add(cadena);
                }

            } else {
                System.out.println("El archivo no se encuentra listo para leerse");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Va a recibir en parámetro la línea de archivo que se encarga de desglosar e identificar los lexemas esto en 
    base a las reglas de SQL, en pocas palabras cada vez que se pasa por acá se 
    esta separando los identificadores, las palabras reservadas, los símbolos, los 
    números y las cadenas. Esta también pasa por alto los comentarios que puedan 
    /*ser introducidos en el archivo como la línea comentada (--) o bien en bloque para que luego se guarden correctamente dentro de un array.
    */
    public void separacion_Lexemas(String linea) {
        String cadena = "";
        String caracter;
        boolean separar = false;
        boolean esCadena = false;
        String comentario = "";
        int cont = 0;
        int contResetCont = 0;
        for (int x = 0; x < linea.length(); x++) {
            caracter = String.valueOf(linea.charAt(x));

            if(caracter.equals("-") && (x+1 != linea.length())){
                comentario =  caracter + linea.charAt(x+1);
                if(comentario.equals("--")){
                    break;
                }
            }

            if(caracter.equals("/") && (x+1 != linea.length())){
                comentario =  caracter + linea.charAt(x+1);
                if(comentario.equals("/*")){
                    esComentario = true;
                }
            }

            if(caracter.equals("*") && (x+1 != linea.length())){
                comentario =  caracter + linea.charAt(x+1);
                if(comentario.equals("*/")){
                    esComentario = false;
                    x = x + 2;
                    try {
                        caracter = String.valueOf(linea.charAt(x));
                    }catch (Exception e){
                        break;
                    }
                }
            }

            if (!esComentario) {

                if (linea.charAt(x) == '\'') {
                    esCadena = true;
                }

                if (esCadena) {
                    if (!cadena.equals("") && cont == 0) {
                        cadenas.add(cadena);
                        cadena = "";
                    }
                    cadena = cadena + caracter;
                    if ((cont != 0) && (linea.charAt(x) == '\'')) {
                        cadenas.add(cadena);
                        cadena = "";
                        contResetCont++;
                        esCadena = false;
                    }
                    cont++;
                    if (contResetCont == 1) {
                        contResetCont = 0;
                        cont = 0;
                    }
                } else {
                    if (!caracter.equals(" ")) {
                        for (int z = 0; z < main.simbolos.size(); z++) {
                            if (caracter.equals(main.simbolos.get(z).getSimbolo())) {
                                if (!cadena.equals("")) {
                                    cadenas.add(cadena);
                                    cadena = "";
                                }
                                cadenas.add(caracter);
                                separar = false;
                                break;
                            }
                            separar = true;
                        }

                        if (separar) {

                            cadena = cadena + caracter;

                            separar = false;
                        }
                    } else {
                        if (!cadena.equals("") && !cadena.equals(" ")) {
                            cadenas.add(cadena);
                            cadena = "";
                        }
                    }
                }
            }
        }
        if (!cadena.equals("")) {
            cadenas.add(cadena);
            cadena = "";
        }
      
    }

    /*
    Es la encargada de asignar a cada token los lexemas que se extraen de la primera función para separarlos, también les asigna 
    un código cuando sea el caso de necesitarlos tanto para los símbolos como para 
    las palabras reservadas. También puede identificar los errores que pueden surgir 
    en la fase del análisis léxico, específicamente cuando se ingresa un carácter que 
    no se conoce o que no es aceptado por la gramática */
    
    
    public void TokensIdentificar(){
        boolean esNumero = false;
        boolean esSimbolo = false;
        boolean esReservada = false;
        boolean esCadena = false;
        int x;
        int m;
        for(x = 0; x < cadenas.size(); x++){

            if(cadenas.get(x).charAt(0) == '0' || cadenas.get(x).charAt(0) == '1' || cadenas.get(x).charAt(0) == '2'
                    || cadenas.get(x).charAt(0) == '3' || cadenas.get(x).charAt(0) == '4' || cadenas.get(x).charAt(0) == '5'
                    || cadenas.get(x).charAt(0) == '6' || cadenas.get(x).charAt(0) == '7' || cadenas.get(x).charAt(0) == '8'
                    || cadenas.get(x).charAt(0) == '9' ){
                tokens.add(new Token(cadenas.get(x), Tipodetoken.NUMERO, 0));
                esNumero = true;
            }

            if (!esNumero){
                for(m = 0; m < main.simbolos.size(); m++){
                    if(cadenas.get(x).equals(main.simbolos.get(m).getSimbolo())){
                        tokens.add(new Token(cadenas.get(x), Tipodetoken.SIMBOLO, main.simbolos.get(m).getId()));
                        esSimbolo = true;
                    }
                }
                if(!esSimbolo){
                    if(cadenas.get(x).charAt(0) == '\''){
                        tokens.add(new Token(cadenas.get(x), Tipodetoken.CADENA, 0));
                        esCadena = true;
                    }
                    if(!esCadena){
                        for(m = 0; m < main.pReservadas.size(); m++){
                            if(cadenas.get(x).toUpperCase().equals(main.pReservadas.get(m).getPalabraRes())){
                                tokens.add(new Token(cadenas.get(x), Tipodetoken.RESERVADA, main.pReservadas.get(m).getId()));
                                esReservada = true;
                            }
                        }
                        if (!esReservada){
                            tokens.add(new Token(cadenas.get(x), Tipodetoken.IDENTIFICADOR, 0));
                        }
                    }
                }
            }
            esNumero = false;
            esSimbolo = false;
            esCadena = false;
            esReservada = false;
        }
    }

    public void resumenReconocido(){
        boolean Bandera1 = true;
        boolean agregado = false;
        for(int x = 0; x < cadenas.size(); x++){
            if(Bandera1){
                resumen.add(new Tokens_CResume(1, cadenas.get(x)));
            }
            if(!Bandera1){
                for(int m = 0; m < resumen.size(); m++){
                    if (cadenas.get(x).equalsIgnoreCase(resumen.get(m).getLexemaToken())){
                        resumen.get(m).setCantidad(resumen.get(m).getCantidad()+1);
                        agregado = true;
                    }
                }
                if(!agregado){
                    resumen.add(new Tokens_CResume(1, cadenas.get(x)));
                }
            }
            agregado = false;
            Bandera1 = false;
        }
    }
}
