/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("PEAJE \"BUENA VÍA\"");
        System.out.print("Ingrese el nombre del propietario: ");
        String propietario = entrada.nextLine();

        System.out.println("Tipos de vehículo:\n"
                + "1 Vehículo liviano particular\n"
                + "2 Vehículo grande particular\n"
                + "3 Taxi\n"
                + "4 Bus urbano");
        System.out.print("Ingrese el tipo de vehículo: ");
        int tipo = entrada.nextInt();

        String descripcion;
        double porcentaje;
        double valorFijo;

        switch (tipo) {
            case 1:
                descripcion = "Vehículo liviano particular";
                porcentaje = 0.01;
                valorFijo = 2.00;
                break;
                
            case 2:
                descripcion = "Vehículo grande particular";
                porcentaje = 0.02;
                valorFijo = 2.50;
                break;
                
            case 3:
                descripcion = "Taxi";
                porcentaje = 0.04;
                valorFijo = 1.50;
                break;
                
            case 4:
                descripcion = "Bus urbano";
                porcentaje = 0.05;
                valorFijo = 2.20;
                break;
                
            default:
                System.out.println("El tipo de vehículo ingresado no es válido.");
                return;
        }

        System.out.print("Ingrese el avalúo comercial del vehículo: ");
        double avaluo = entrada.nextDouble();

        double valorBase = avaluo * porcentaje / 100 + valorFijo;

        double recargo = 0;
        if ((tipo == 1 || tipo == 2) && avaluo > 30000) {
            recargo = 1.50;
        }

        double total = valorBase + recargo;

        System.out.printf(Locale.US, "%nPeaje \"Buena Vía\"%n"
                + "Propietario: %s%n"
                + "Tipo: %s%n"
                + "    Avalúo: $%.2f%n"
                + "    Valor base del peaje: $%.2f%n"
                + "    Recargo: $%.2f%n%n"
                + "    Total a cancelar: $%.2f%n",
                propietario, descripcion, avaluo, valorBase, recargo, total);
    }
    }
    
