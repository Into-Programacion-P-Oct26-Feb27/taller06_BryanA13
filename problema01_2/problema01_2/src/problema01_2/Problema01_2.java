/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_2;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author MI PC
 */
public class Problema01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("OPERACIONES ARITMÉTICAS");
        System.out.print("Ingrese el primer número: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = entrada.nextDouble();

        
        if (a <= b) {
            System.out.println();
            System.out.println("No es posible realizar la operación: el primer número debe ser mayor que el segundo.");
            return;
        }

        System.out.println("Ingrese la operación.\n"
                + "1 Suma\n"
                + "2 Resta\n"
                + "3 Multiplicación\n"
                + "4 División\n"
                + "5 Módulo\n"
                + "6 Potencia");
        int opcion = entrada.nextInt();

        String nombre;
        double resultado;

        switch (opcion) {
            case 1:
                nombre = "Suma";
                resultado = a + b;
                break;

            case 2:
                nombre = "Resta";
                resultado = a - b;
                break;

            case 3:
                nombre = "Multiplicación";
                resultado = a * b;
                break;

            case 4:
                if (b == 0) {
                    System.out.println("No es posible dividir entre cero.");
                    return;
                }
                nombre = "División";
                resultado = a / b;
                break;

            case 5:
                if (b == 0) {
                    System.out.println("No es posible calcular el módulo entre cero.");
                    return;
                }
                nombre = "Módulo";
                resultado = a % b;
                break;

            case 6:
                nombre = "Potencia";
                resultado = Math.pow(a, b);
                break;

            default:
                System.out.println("La opción ingresada no es válida.");
                return;
        }

        System.out.printf(Locale.US, "\nOPERACIONES ARITMÉTICAS\n\n"
                + "Primer número: %.2f\n"
                + "Segundo número: %.2f\n"
                + "Operación seleccionada: %s\n\n"
                + "Resultado: %.2f\n",
                a, b, nombre, resultado);
    }
    
}
