package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Repaso1 {
    public static void main(String[] args) {
        // Declaracion de variables
        byte vBy=127;
        short vS=12345;
        int vI=1234567;
        long vL=123456789;
        Float vF=123.45F;
        Double vD=12.43;
        char vC='a';
        boolean vBo=true;
        //Clases envolventes
        Byte eByte=17;
        Short eShort=12345;
        Integer eInt=1234567;
        Long eLong= 12345644L;
        Float eFloat =34.56F;
        Double eDouble = 23344.76;
        Character eChar= 'd';
        Boolean eBoolean=true;
        //convertir un carácter del valor 5 a integer
        int variable = Integer.parseInt("5");
        //Convertit un String con valor 5.7 a Double
        double variableString= Double.parseDouble("5.7");
        System.out.println(variableString);

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir un numero con decimales -> ");
        //double nPorConsola = sc.nextDouble();

        //Convertir un Double a String
        System.out.println("Double convertido a String ->"+eDouble.toString());
        Object o = new Object();
        System.out.println("MetodotoString de o ->"+o.toString());

        //String
        String nombre = "Juan";
        String apellido = "López";
        System.out.println("Nombre completo ->"+nombre + " "+apellido);
        //souf es mas rapido, %s en vez de concadenar con +
        System.out.printf("Nombre completo %s %s",nombre,apellido);
        //Definir edad y sueldo (entero y double)
        int edad = 18;
        double sueldo = 1500.546;
       System.out.printf("Nombre completo %s %s, tiene %d y gana %.2f %n",nombre,apellido,edad,sueldo);

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.indexOf("a"));
        System.out.println(nombre.replace("a","A"));
        System.out.println(nombre.contains("n"));
        System.out.println(nombre.substring(1,3));

        String valores= "1/5/8/10";
        String[]valoresSeparados= valores.split("/");
        System.out.println(Arrays.toString(valoresSeparados));

        //Solicitar una frase y dividirlo por palabras
        String frase=null;
        System.out.println("Escriba una frase ->");
        /*frase = sc.nextLine();
        String []fraseSeparada = frase.split(" ");
        System.out.println(Arrays.toString(fraseSeparada));

         */

        //Fechas
        LocalDate fCumple = LocalDate.of(1989,6,24);
        System.out.println(fCumple);

        //Obtener edad
        System.out.println(Period.between(fCumple,LocalDate.now()).getYears());
        System.out.println(LocalDate.now().plusDays(30));
        System.out.println(LocalDate.now().minusMonths(1).minusDays(6));



    }
}

