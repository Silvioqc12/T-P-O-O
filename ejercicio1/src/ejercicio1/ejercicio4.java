/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author CARRERA PROFESIONAL
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        do {            
            System.out.println("Hallando Promedios");
            System.out.println("Ingrese la nota A del alumno:");
            int notaA = teclado.nextInt();
            System.out.println("Ingrese la nota B del alumno:");
            int notaB = teclado.nextInt();
            System.out.println("Ingrese la nota C del alumno:");
            int notaC = teclado.nextInt();
            int promedio = (notaA + notaB + notaC) / 3;
            System.out.println("El promedio es: " + promedio);
            System.out.println("¿Desea hallar otro promedio? si -> 1, no->2");
            op = teclado.nextInt();
        } while (op == 1);
        
        
    }
}
