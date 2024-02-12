package dam1.programacion.tema06.ejercicios_strings_i;

import static dam1.programacion.tema06.ejercicios_strings_i.Ejercicios_Strings_I.utils.kbd;
import java.util.Scanner;

/**
 *
 * @author RJNewbyte
 */
public class Ejercicios_Strings_I {

    public static class utils {

        private static final Scanner entradaTeclado = new Scanner(System.in);

        public static Scanner kbd() {
            return entradaTeclado;
        }
    }

    public static void main(String[] args) {
        /**
         * 1. Leer una frase de máximo 80 caracteres y escribirla
         * progresivamente es decir si la frase es: “ciervo”, el programa debe
         * imprimir
         */
        System.out.println("----Ejercicio 01----");
        String frase;
        do {
            System.out.println("Introduzca una frase menor de 80 char: ");
            frase = kbd().nextLine();
        } while (frase.length() >= 80);

        for (int i = 1; i < frase.length() + 1; i++) {
            System.out.println(frase.substring(0, i));
        }
        /**
         * Ejemplo creando un array desde un String
         */
//        char[] arrayFrase = frase.toCharArray();
//        String nuevaFrase="";
//        for (int i = 0; i < arrayFrase.length; i++) {
//            nuevaFrase+=arrayFrase[i];
//            System.out.println(nuevaFrase);
//        }

        /**
         * 2. Dada una frase de no más de 80 caracteres hacer un programa que
         * busque cuántas mayúsculas y minúsculas tiene y lo imprima.
         */
        System.out.println("\n----Ejercicio 02----");
        int may = 0;
        int min = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLowerCase(frase.charAt(i))) {
                min++;
            }
            if (Character.isUpperCase(frase.charAt(i))) {
                may++;
            }
        }
        System.out.println("\nLa frase consta de:\n\t\t    " + may + " mayúsculas.\n\t\t    " + min + " minúsculas.");

        /**
         * 3. Programa que lea una frase y una palabra y que nos diga la
         * posición de dicha palabra en la frase y si no la encuentra devuelva
         * un cero.
         */
        System.out.println("\n----Ejercicio 03----");
        System.out.println("Introduce una palabra a buscar en la frase anterior:");
        String palabra = kbd().nextLine();
        int indexOf = frase.indexOf(palabra);
        if (indexOf == -1) {
            System.out.println(0);
        } else {
            System.out.println("La palabra que busca empieza en la posición " + indexOf);
        }

        /**
         * 4. Leer una cadena de hasta 80 caracteres y pasarla en función de una
         * variable de opción a mayúsculas ó a minúsculas e imprimir la cadena
         * resultante.
         */
        System.out.println("\n----Ejercicio 04----");
        System.out.println("¿Quiere pasar la frase a mayúsculas o minúsculas?");
        System.out.println("Mayúsculas (0) | Minúsculas (1)");
        int opcion = kbd().nextInt();
        kbd().nextLine();//clean
        if (opcion == 0) {
            System.out.println(frase.toUpperCase());
        } else {
            System.out.println(frase.toLowerCase());
        }

        /**
         * 5. Leer una frase por teclado (máximo 80 car) y construir otras dos
         * cadenas de forma que una contenga los caracteres en posición par y la
         * otra los caracteres en posición impar.
         */
        System.out.println("\n----Ejercicio 05----");
        String cadenaPar = "";
        String cadenaImpar = "";
//        for (int i = 0; i < frase.length(); i++) {
//            if (i % 2 == 0) {
//                cadenaPar = cadenaPar.concat(String.valueOf(frase.charAt(i)));
//            } else {
//                cadenaImpar = 
//                        cadenaImpar.concat(String.valueOf(frase.charAt(i)));
//            }
//        }
//        System.out.println("Esta es la frase resultante de posiciones PARES:");
//        System.out.println(cadenaPar);
//        System.out.println("Esta es la frase resultante de posiciones IMPARES:");
//        System.out.println(cadenaImpar);

        String marcador = "";
        for (int i = 0; i < frase.length(); i++) {
            if ((i + 1) % 2 == 0) {//Sumo 1 al índice para corregir el inicio en 0.
                cadenaPar += frase.charAt(i);
                marcador += "P";
            } else {
                cadenaImpar += frase.charAt(i);
                marcador += "I";
            }
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Marcador:       " + marcador);
        System.out.println("Cadena par:     " + cadenaPar);
        System.out.println("Cadena impar:   " + cadenaImpar);

        /**
         * 6. Leer una frase por teclado (máximo 80) y a continuación escribir
         * cuantas vocales, consonantes y caracteres numéricos posee.
         */
        System.out.println("\n----Ejercicio 06----");
        int vocal = 0;
        int consonante = 0;
        int numero = 0;

        for (int i = 0; i < frase.length(); i++) {
            char posicion = frase.charAt(i);

            if (Character.isDigit(posicion)) {
                numero++;
            } else if (Character.isLetter(posicion)) {
                if ((String.valueOf(posicion)).matches("[aeiouAEIOU]")) {
                    vocal++;
                } else {
                    consonante++;
                }
            }

        }

        System.out.println("Número de vocales: " + vocal);
        System.out.println("Número de consonantes: " + consonante);
        System.out.println("Número de números: " + numero);

        /**
         * 7. Leer una frase por teclado y escribir a continuación cuántas
         * mayúsculas, minúsculas y números contiene.
         */
        System.out.println("\n----Ejercicio 07----");
        char posicion;
        may = 0;
        min = 0;
        numero = 0;
        for (int i = 0; i < frase.length(); i++) {
            if ((Character.isUpperCase(frase.charAt(i)))) {
                may++;
            }
            if ((Character.isLowerCase(frase.charAt(i)))) {
                min++;
            }
            if ((Character.isDigit(frase.charAt(i)))) {
                numero++;
            }
        }

        System.out.println("Número de mayúsculas: " + may);
        System.out.println("Número de minúsculas: " + min);
        System.out.println("Número de números: " + numero);

        /**
         * 8. Leer una frase filtrándola a que todos sus caracteres sean
         * mayúsculas
         *
         * - una vez filtrada y dado un número entre 1 y 10
         *
         * - haga un cifrado de la frase (denominado cifrado CESAR) del modo
         * siguiente:
         *
         * + si el número por ejemplo es 3
         *
         * - transforme la frase de manera que cada carácter se transforme en 3
         * códigos ASCII más
         *
         * es decir : Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
         */
        System.out.println("\n----Ejercicio 08----");
        System.out.println("La frase definada es:");
        System.out.println(frase);

        System.out.println("Introduzda cun numero entre 1-10:");
        numero = kbd().nextInt();
        kbd().nextLine();//clear buffer

        frase = frase.toUpperCase();//la pasamos a mayúsculas
        System.out.println("\n----------EJEMPLO----------");
        System.out.println("PROGRAMACION - SURJUDPDFLRQ\n");

        String codificada = "";
        for (int i = 0; i < frase.length(); i++) {
            codificada += (char) (((int) (frase.charAt(i)) + numero));
        }
        System.out.println(codificada);

        /**
         * 9. Escribir un programa que lea códigos de personas de 8 caracteres
         * de modo que:
         *
         * - los cuatro primeros sean numéricos y contenidos entre 1990-1995 (un
         * año)
         *
         * - el quinto carácter sea solo (H ó M) sexo
         *
         * - el sexto un número que representa el curso 1 ó 2
         *
         * - los caracteres séptimo y octavo pueden tener cualquier valor.
         *
         * Deben rechazarse los códigos que no cumplan estas condiciones, la
         * finalización de entrada de códigos se produce cuando se introduce el
         * código “00000000”.
         *
         * Al final el programa debe sacar un informe indicando cuántos hombres
         * y mujeres hay matriculados en primero y segundo y cuántos códigos
         * correctos han sido leídos.
         */
        System.out.println("\n----Ejercicio 09----");

        boolean salir = false;
        String code = "";
        int correctCode = 0;
        int hPrimero = 0;
        int hSegundo = 0;
        int mPrimero = 0;
        int mSegundo = 0;

        do {
            System.out.println("Introduzca un nuevo código de persona");
            System.out.println("00000000 - para salir");
            code = kbd().nextLine();
            if (code.equals("00000000")) {
                salir = true;
            } else {
                if (code.matches("(199[0-5])[HM][12].{2}")) {
                    correctCode++;
                    if ((code.charAt(4) == 'H') && (code.charAt(5) == '1')) {
                        hPrimero++;
                    }
                    if ((code.charAt(4) == 'H') && (code.charAt(5) == '2')) {
                        hSegundo++;
                    }
                    if ((code.charAt(4) == 'M') && (code.charAt(5) == '1')) {
                        mPrimero++;
                    }
                    if ((code.charAt(4) == 'M') && (code.charAt(5) == '2')) {
                        mSegundo++;
                    }
                }
            }

        } while (!salir);
        System.out.println("Códigos correctos: " + correctCode);
        System.out.println("Hombres en primero: " + hPrimero);
        System.out.println("Hombres en segundo: " + hSegundo);
        System.out.println("Mujeres en primero: " + mPrimero);
        System.out.println("Mujeres en segundo: " + mSegundo);
    }
}
