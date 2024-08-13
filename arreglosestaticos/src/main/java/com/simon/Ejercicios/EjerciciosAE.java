package com.simon.Ejercicios;

public class EjerciciosAE {

    public void primero() {
        /*
         * Dado un arreglo de 11 números enteros, encuentra la suma de los elementos
         * en posiciones pares del arreglo
         */

        int[] numeros = new int[11];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;
        numeros[10] = 10;

        int suma = 0;

        for (int i = 0; i < numeros.length; i=i+2) {
            System.out.println(numeros[i]);
            suma+=numeros[i];
        }

        System.out.println("La suma de los pares es: " + suma);

    }

    public void segundo() {
        /*
         * Encuentra el valor máximo y mínimo en un arreglo de 10 números
         * sin usar las funciones max o min de java
         */

         int[] numeros = {20,2,3,4,5,6,7,8,9,10};

         int min = 0;
         int max = 0;

         min = numeros[0];
         max = numeros[0];

         for (int i = 0; i < numeros.length; i++) {
            if (min > numeros[i]) {
                min = numeros[i];
            }

            if (max < numeros[i]) {
                max = numeros[i];
            }
         }

         System.out.println("El número menor es: " + min);
         System.out.println("El número mayor es: " + max);

    }
    
    public void tercero() {

        /*
         * Dado un arreglo de caracteres, determina si es palindromo o no (ana, oso, etc.)
         */

         char[] palindromo = {'r', 'a', 'y', 'e', 'r'};
         boolean esPalindromo = true;

         for (int i = 0, j = palindromo.length - 1; i < j; i++, j--) {
            
            if (palindromo[i] != palindromo[j]) {
                esPalindromo = false;
                break;
            }

         }

         if (esPalindromo) {
            System.out.println("Si es palindromo");
         } else {
            System.out.println("No es palíndromo");
         }

    }

    public void terceroDos() {

        char[] palindromo = {'a', 'm', 'o', 'r'};

        char[] nuevo = new char[palindromo.length];

        int j = 0;

        boolean esPalindromo = true;

        for (int i = palindromo.length - 1; i >= 0; i--) {
            nuevo[j] = palindromo[i];
            j++;
        }

        System.out.println("Nuevo-----");
        for (char c : nuevo) {
            System.out.print(c);
        }

        System.out.println("\nOriginal----");
        for (char c : palindromo) {
            System.out.print(c);
        }

        for (int i = 0; i < nuevo.length; i++) {
            
            if (palindromo[i] != nuevo[i]) {
                esPalindromo = false;
            } else {
                esPalindromo = true;
            }

        }

        if (esPalindromo) {
            System.out.println("\nSi es palíndromo");
        } else {
            System.out.println("\nNo es palíndromo");
        }

        

    }

    public void cuarto() {

        /*
         * Encuentra si hay elementos duplicados en un arreglo y muestre cuales son
         * Un arreglo de enteros de 8 items
         */

         int[] numero = {1,2,3,4,5,6,4,2};
         boolean repetidos = false;

         for (int i = 0; i < numero.length; i++) {

            for (int j = i+1; j < numero.length; j++) {
                
                if (numero[i] == numero[j]) {
                    System.out.println("El número repetido es: " + numero[i]);
                    repetidos = true;
                }

            }
            
        }
        
        if (repetidos == false) {
            System.out.println("No hay repetidos.");
        }

    }

}
