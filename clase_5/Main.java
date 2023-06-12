package clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //ejercio calculadora indice de masa corpopral

        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = cargaDatos.next();
        System.out.println("Ingrese su peso en KG: ");
        double peso = cargaDatos.nextDouble();
        System.out.println("Ingrese su altura en MTS 1,70: ");
        double altura = cargaDatos.nextDouble();


        //double peso = 90;
        //double altura = 1.68;

        double indiceMasaCorporal = Math.round(peso / (altura * altura));

        System.out.println( " Tu indice de masa Corporal es: " + indiceMasaCorporal);

        //Mayor a 30 --> Obesidad
        if(indiceMasaCorporal >= 30){
            System.out.println("Hola " + nombre + " Tu indice de masa Corporal es: "+ indiceMasaCorporal + " Estas Obeso");
        }
        //entre 25 y 30 sobrepeso
        if(indiceMasaCorporal >25 && indiceMasaCorporal < 30){
            System.out.println("Hola " + nombre + " Tu indice de masa Corporal es: "+ indiceMasaCorporal + " Estas en sobrepeso");
        }
        //entre 18.5 a 25 normal
        if(indiceMasaCorporal >18.5 && indiceMasaCorporal < 25){
            System.out.println("Hola " + nombre + " Tu indice de masa Corporal es: "+ indiceMasaCorporal + " Su Peso es Normal");
        }

        //menor a 18.6 debajo de lo normal
        if(indiceMasaCorporal <= 18.6 ){
            System.out.println("Hola " + nombre + " Tu indice de masa Corporal es: "+ indiceMasaCorporal + " Su peso es inferior al normal");
        }


       /* String nombre = "Duberney";
        Integer nroEquipo = 1;
        String texto = "hola soy " + nombre + " del equipo " + nroEquipo;
        System.out.println(texto);
  */

        //operadores y estructuras de contron
    /*    System.out.println("Que edad tienes: ");

        Scanner cargaDatos = new Scanner(System.in);
        Integer edad = cargaDatos.nextInt();

        if(edad >= 18){
            System.out.println("Si es mayor de edad tienes: " + edad );
        }else{
            System.out.println("Es menor de edad tienes: " + edad );
        }
        */

        //operadores logicos
    /*
    Integer edad = 20;
    Boolean esMayor = edad >= 18 && edad < 70;
    Boolean esMayor2 = (edad < 18 || edad >= 70);

    System.out.println(esMayor);
    System.out.println(esMayor2);
    */



    }
}
