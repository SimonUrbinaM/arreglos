package com.simon;

import java.util.ArrayList;
import java.util.Collections;

public class ArregloDinamico {

    public void informacion() {

        // La lista puede resivir de cualquier tipo
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tesla");
        cars.add("Camaro");
        System.out.println(cars); // Default: método .toString

        // Acceder a un elemento de la lista
        System.out.println(cars.get(0));

        // Cambiar el valor de un ítem
        cars.set(0, "Camaro");
        System.out.println(cars);
        System.out.println(cars.get(0));

        // Eliminar un elemento
        cars.remove(2);
        cars.remove("Camaro"); // Solo elimina el primer "Camaro"
        System.out.println(cars + "/");

        // Eliminar todo
        // cars.clear();
        // System.out.println(cars);

        // Tamaño de la lista
        System.out.println(cars.size());

        // Recorrer la lista con un for
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Recorrer con foreach
        for (String car : cars) {
            System.out.println(car);
        }

        // Organizar la lista
        Collections.sort(cars);
        System.out.println("Lista ordenada: ");
        for (String i : cars) {
            System.out.print(i + '/');
        }


    }
    
}
