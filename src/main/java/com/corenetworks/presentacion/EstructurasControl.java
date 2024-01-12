package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.util.Scanner;

public class EstructurasControl {
    public static void main(String[] args) {
        //las estructuras de control son condicionales(if, else y swich)y bucles(for,while,for each,do while)
        //if -- si la cantidad es mayor a 100 el descuento es 3%, si es menor a 100 1%
        int cantidad = 80;
        if (cantidad > 100) {
            System.out.println("tiene descuento del 3%");
        } else {
            System.out.println("Tiene un descuentos del 1%");
        }
        //Declara fecha de pedido del 3 de enero de 2024
        LocalDate fPedido = LocalDate.of(2024, 1, 3);
        //mostrar antes si la fecha es antes del dia de hoy
        //mostrar despues si la fecha es despues del dia de hoy
        if (fPedido.isBefore(LocalDate.now())) {
            System.out.println("antes");
        } else {
            System.out.println("posterior");
        }

        //La letras E es Ejecucuion, la W esperando, laF terminando en caso de que no sean esas letras, invalido
        String eProces = "F";
        switch (eProces.toLowerCase()) {
            case "e":
                System.out.println("Ejecución");
                break;
            case "f":
                System.out.println("Terminado");
                break;
            case "w":
                System.out.println("Esperando");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
//mostrar por consola descendentemente del 10 al 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //sumar kos numeros introducidos por consola hasta que el usuario introduzca un 0
       /* int suma = 0;
        int num;
        Scanner sc = new Scanner(System.in);

        // Ciclo hasta que se introduce un 0
        do {
            System.out.print("Introduce un número (marca 0 para salir): ");
            num = sc.nextInt();

            // Sumar el número a la suma total
            suma += num;

        } while (num != 0);

        // Mostrar la suma total
        System.out.println("La suma total es: " + suma);


int suma =0;
int num =0;
Scanner sc = new Scanner(System.in);
while (true){
    System.out.println("ingrese un numero (0 para salir)");
    num = sc.nextInt();
            suma+=num;
    if(num==0){
        break;
    }
}
        System.out.println("La suma total es: " + suma);

        */

int[]numeros = {3,2,5,8,10};
//decir si un numero existe ene el Array y recibirlo por consola
        //hacerlo con un foreach
        Scanner sC = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numeroB = sC.nextInt();

        // Utilizando un bucle foreach para buscar el número
        boolean encontrado = false;
        for (int elemento : numeros) {
            if (elemento == numeroB) {
                System.out.println("Numero encontrado");
                break;
            }
        }
    }
    }


