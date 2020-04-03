package com.idesi.sobre;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculos objCalculos = new Calculos();

        int opcion;
        double num1;
        double num2;
        double num3;
        boolean play = true;

        while (play) {

            System.out.println("Calculos Matemáticos\n"
                    + "1. Sumar dos numeros\n"
                    + "2. Sumar tres numeros\n"
                    + "3. Raíz cuadrada de un número\n"
                    + "4. Potencia de un numero elevado a otro numero.\n"
                    + "5. Promedio de los 3 numeros\n"
                    + "6. Salir del sistema\n"
                    + "Elige una opcion");

            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero: ");
                    num1 = in.nextDouble();
                    System.out.println("Ingresa otro numero: ");
                    num2 = in.nextDouble();
                    objCalculos.leer_datos(num1, num2);
                    System.out.println("El resultado es: " + objCalculos.sumar_dos() + "\n");
                    break;
                case 2:
                    System.out.println("Ingresa un numero: ");
                    num1 = in.nextDouble();
                    System.out.println("Ingresa otro numero: ");
                    num2 = in.nextDouble();
                    System.out.println("Ingresa otro numero: ");
                    num3 = in.nextDouble();
                    objCalculos.leer_datos(num1, num2, num3);
                    System.out.println("El resultado es: " + objCalculos.sumar_tres() + "\n");
                    break;
                case 3:
                    System.out.println("Ingresa el numero: ");
                    num1 = in.nextDouble();
                    objCalculos.leer_datos(num1);
                    System.out.println("El resultado es: " + objCalculos.calcular_raiz_cuadrada() + "\n");
                    break;
                case 4:
                    System.out.println("Ingresa un numero: ");
                    num1 = in.nextDouble();
                    System.out.println("Ingresa su potencia: ");
                    num2 = in.nextDouble();
                    objCalculos.leer_datos(num1, num2);
                    System.out.println("El resultado es: " + objCalculos.calcular_potencia() + "\n");
                    break;
                case 5:
                    System.out.println("Ingresa un numero: ");
                    num1 = in.nextDouble();
                    System.out.println("Ingresa otro numero: ");
                    num2 = in.nextDouble();
                    System.out.println("Ingresa otro numero: ");
                    num3 = in.nextDouble();
                    objCalculos.leer_datos(num1, num2, num3);
                    System.out.println("El resultado es: " + objCalculos.calcular_promedio() + "\n");
                    break;
                case 6:
                    System.out.println("¡Ten un muy buen dia!");
                    play = false;
                    break;

            }
        }
    }
}
