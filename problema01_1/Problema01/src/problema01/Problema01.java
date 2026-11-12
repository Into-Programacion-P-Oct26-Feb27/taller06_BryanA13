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

        int opcion;

        System.out.println("OPERACIONES ARITMETICAS");
        System.out.print("Ingrese el primer número: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = entrada.nextDouble();

        if (a <= b) {
            System.out.println();
            System.out.println("No es posible realizar la operación: el primer número debe ser mayor que el segundo.");
            return;
        }

        System.out.println("Ingrese la operacion.\n"
                + "1 suma\n"
                + "2 resta\n"
                + "3 multiplicacion\n"
                + "4 division\n"
                + "5 modulo\n"
                + "6 potencia");
        opcion = entrada.nextInt();

        String nombre;
        double resultado;

        switch (opcion) {
            case 1:
                nombre = "suma";
                resultado = a + b;
                break;

            case 2:
                nombre = "resta";
                resultado = a - b;
                break;

            case 3:
                nombre = "multiplicacion";
                resultado = a * b;
                break;

            case 4:
                if (b == 0) {
                    System.out.println("No es posible dividir entre cero.");
                    return;
                }
                nombre = "division";
                resultado = a / b;
                break;

            case 5:
                if (b == 0) {
                    System.out.println("No es posible calcular el módulo entre cero.");
                    return;
                }
                nombre = "modulo";
                resultado = a % b;
                break;

            case 6:
                nombre = "potencia";
                resultado = Math.pow(a, b);
                break;

            default:
                System.out.println("Ninguna de las opciones anteriores es correcta");
                return;
        }

        System.out.printf("%nOPERACIONES ARITMETICAS\n\n"
                + "Primer numero: %.2f\n"
                + "Segundo numero: %.2f\n"
                + "Operacion seleccionada: %s\n\n"
                + "Resultado: %.2f\n",
                a, b, nombre, resultado);
    }

}
