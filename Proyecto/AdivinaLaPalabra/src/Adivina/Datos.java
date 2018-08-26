/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adivina;

import javax.swing.JOptionPane;

public class Datos {

    static String palabra = "LINUX";
    String descripcion = "SOFTWARE DE SISTEMA";

    public String getDescripcion() {
        return descripcion;
    }

    static char palabraarg[] = palabra.toCharArray(); //Arreglo En Palabra
    static char palabraAllenar[] = new char[palabraarg.length];//arreglo vacio que se llenara con las letras
    static char posicion[] = new char[palabraarg.length];//guarda la posicion de las letras a buscar
    static int intentos = 0;

    public static int getPosicion() {

        return posicion.length;
    }

    public String getPalabraa2() {

        String resultado = String.valueOf(palabraAllenar);
        return resultado;
    }
    static int tamaño = palabra.length();

    public void letras(char letra) {

        int encontrado = 0;

        for (int i = 0; i < palabraarg.length; i++) {
            char temp = palabraarg[i];
            if (letra == temp) {

                palabraAllenar[i] = letra;
                posicion[i] = 1;
                encontrado = 1;

            } else {
                if (posicion[i] != 1) {
                    palabraAllenar[i] = '.';
                    posicion[i] = 0;

                }

            }

        }
        if (encontrado == 0) {
            intentos += 1;

            if (intentos >= 6) {
                JOptionPane.showMessageDialog(null, "Perdiste!" + " Intentos = " + intentos);
            } else {
                JOptionPane.showMessageDialog(null, "Número De Intentos = " + intentos);
            }
        } else {
            if ((intentos <= 6)) {
                int suma = 0;
                for (int i = 0; i < posicion.length; i++) {
                    suma += posicion[i];

                }
                if (suma == posicion.length) {
                    JOptionPane.showMessageDialog(null, "Ganaste!" + " Intentos = " + intentos);
                }
            }
        }

    }
}