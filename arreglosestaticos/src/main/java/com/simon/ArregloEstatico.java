package com.simon;

public class ArregloEstatico {

    public void informacion() {
        System.out.println("Hola mundo, desde arreglo estático");

        // int es el tipo de dato, Integer es la clase
        
        // 1 bit es 0 o 1
        // 1 byte es 8 bits
        // 1 KiloByte es 1024 Bytes

        // Arreglo de bytes
        byte[] unArregloDeBytes = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(unArregloDeBytes[0]);

        // Arreglo de shorts
        short[] unArregloShort = {10,20,30,40,50};
        System.out.println(unArregloShort[3]);

        // Arreglo de longs - se le puede agregar el L
        long[] unArregloLong = {100L,200L,300L,400L,500L};
        System.out.println(unArregloLong[4]);

        // Arreglo de floats
        float[] unArregloFloat = {1.0f, 2.0f, 3.0f, 4.5f, 6.3f};
        System.out.println(unArregloFloat[0]);

        // Arreglo de double
        double[] unArregloDouble = {1.0,2.0,3.0,4.5,6.3};
        System.out.println(unArregloDouble[0]);

        // Arreglo de booleans
        boolean[] unArregloBooleano = {true, false, false, false, true};
        System.out.println(unArregloBooleano[0]);

        //Arreglo de chars - solo comillas simples
        char[] unArregloChar = {'1', 'a', '@'};
        System.out.println(unArregloChar[2]);

        // Arreglo de Strings - solo comilla doble
        String[] unArregloString = {"Hola","Mundo","Ja"};
        System.out.println(unArregloString[0]);

    }
    
}
