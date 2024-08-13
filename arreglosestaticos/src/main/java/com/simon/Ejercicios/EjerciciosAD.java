package com.simon.Ejercicios;

import java.util.ArrayList;

public class EjerciciosAD {

    public void primero() {

        /*
        * 1. Eliminación de duplicados:
        * Escribe un programa que elimine los elementos duplicados de un ArrayList sin
        * usar conjuntos u otras estructuras de datos auxiliares.
        */

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);

        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i+1; j < numeros.size(); j++) {
                
                if (numeros.get(i) == numeros.get(j)) {
                    numeros.remove(j);
                }

            }
        }

        System.out.println(numeros);


    }

    public void segundo() {

        /*
        * 2.Combinación de listas:
        * Crea dos ArrayList y escribe un programa que combine ambos en uno nuevo.
        * Asegúrate de que el nuevo ArrayList no contenga elementos duplicados.
        */

        ArrayList<Integer> primeros = new ArrayList<Integer>();
        primeros.add(1);
        primeros.add(2);
        primeros.add(3);
        primeros.add(4);

        ArrayList<Integer> segundos = new ArrayList<Integer>();
        segundos.add(3);
        segundos.add(4);
        segundos.add(5);
        segundos.add(6);

        System.out.println("Lista 1: " + primeros);
        System.out.println("Lista 2: " + segundos);

        primeros.addAll(segundos);

        System.out.println("Lista en conjunto: " + primeros);

        for (int i = 0; i < primeros.size(); i++) {
            for (int j = i+1; j < primeros.size(); j++) {
                if (primeros.get(i) == primeros.get(j)) {
                    primeros.remove(j);
                }
            }
        }

        System.out.println("Nueva lista: " + primeros);

    }

    public void tercero() {

        /*
        * 3. Fusión de listas ordenadas:
        * Escribe un programa que tome dos ArrayList ordenados de enteros y los fusione
        * en uno nuevo, manteniendo el orden.
        */

        ArrayList<Integer> primeros = new ArrayList<Integer>();
        primeros.add(10);
        primeros.add(12);
        primeros.add(11);
        primeros.add(9);

        ArrayList<Integer> segundos = new ArrayList<Integer>();
        segundos.add(1);
        segundos.add(8);
        segundos.add(100);
        segundos.add(54);

        System.out.println("Lista 1: " + primeros);
        System.out.println("Lista 2: " + segundos);

        primeros.addAll(segundos);

        System.out.println("Lista sin ordenar: " + primeros);

        int auxiliar;

        for (int i = 0; i < primeros.size(); i++) {

            for (int j = i+1; j < primeros.size(); j++) {

                if (primeros.get(i) > primeros.get(j)) {
                    
                    auxiliar = primeros.get(i);
                    primeros.set(i, primeros.get(j));
                    primeros.set(j, auxiliar);
                    
                }
            }
        }

        System.out.println("Lista ordenada: " + primeros);

    }
    
    // https://barcelonageeks.com/unir-dos-arraylists-en-java/#:~:text=Enfoque%3AArrayLists%20se%20puede%20unir%20en%20Java%20con%20la,segunda%20ArrayList%20al%20final%20de%20la%20primera%20ArrayList.

}
