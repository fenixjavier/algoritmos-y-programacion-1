/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author UNSAdA
 */
public class Calculadora {

    // Constructor
    //
    public Calculadora() {
        double num1, num2 = 0;
        int op = 1;

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la operación que desea realizar: ");
            System.out.println("0. Salir");
            System.out.println("1. (+) Suma");
            System.out.println("2. (-) Resta");
            System.out.println("3. (*) Multiplicación");
            System.out.println("4. (/) División");
            op = in.nextInt();

            // Salir del bucle
            if (op == 0) {
                break;
            }

            System.out.print("Ingrese el primer número: ");
            num1 = in.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            num2 = in.nextDouble();

            switch (op) {
                case 1:
                    System.out.println("Resultado de la suma: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + mult(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado de la división: " + div(num1, num2));
                    break;
                default:
                    System.out.println("El número de operación ingresado no es correcto.");
                    break;
            }
        }

        System.out.println("Adiós!");
        in.close();
    }

    // Suma
    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    // Resta
    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplicación
    public double mult(double num1, double num2) {
        return num1 * num2;
    }

    // División
    public double div(double num1, double num2) {
        return num1 / num2;
    }
}
