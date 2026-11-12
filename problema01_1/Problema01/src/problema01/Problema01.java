/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("OPERACIONES ARITMÉTICAS\n");
        System.out.print("Ingrese el primer número:\n ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el segundo número:\n ");
        double b = entrada.nextDouble();

        if (a <= b) {
            System.out.println();
            System.out.println("No es posible realizar la operación: el primer número debe ser mayor que el segundo.");
        } else {
            System.out.println("Ingrese la operación.\n"
                    + "1 Suma\n"
                    + "2 Resta\n"
                    + "3 Multiplicación\n"
                    + "4 División\n"
                    + "5 Módulo\n"
                    + "6 Potencia");
            int opcion = entrada.nextInt();

            String nombre = "";
            double resultado = 0;
            boolean calculado = true;

            if (opcion == 1) {
                nombre = "Suma";
                resultado = a + b;
            } else if (opcion == 2) {
                nombre = "Resta";
                resultado = a - b;
            } else if (opcion == 3) {
                nombre = "Multiplicación";
                resultado = a * b;
            } else if (opcion == 4) {
                if (b == 0) {
                    System.out.println("No es posible dividir entre cero.");
                    calculado = false;
                } else {
                    nombre = "División";
                    resultado = a / b;
                }
            } else if (opcion == 5) {
                if (b == 0) {
                    System.out.println("No es posible calcular el módulo entre cero.");
                    calculado = false;
                } else {
                    nombre = "Módulo";
                    resultado = a % b;
                }
            } else if (opcion == 6) {
                nombre = "Potencia";
                resultado = Math.pow(a, b);
            } else {
                System.out.println("La opción ingresada no es válida.");
                calculado = false;
            }

            if (calculado) {
                System.out.printf(Locale.US, "\nOPERACIONES ARITMÉTICAS\n\n"
                        + "Primer número: %.2f\n"
                        + "Segundo número: %.2f\n"
                        + "Operación seleccionada: %s\n\n"
                        + "Resultado: %.2f\n",
                        a, b, nombre, resultado);
            }
        }
    }

}
