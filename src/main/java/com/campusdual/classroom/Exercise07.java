package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {

        sumFirstNaturalNumbers(5);
        showFirstNaturalNumbers(15);

    }


    // ESTE  NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {

    }


    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros " + num + " números positivos es: " + suma);

    }


    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Estos son primeros " + num + "números positivos " );
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
