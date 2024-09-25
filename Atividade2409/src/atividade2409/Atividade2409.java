/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2409;

/**
 *
 * @author 823145059
 */
import java.util.Scanner;
public class Atividade2409 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
       
        double notaA1, notaA2, notaA3, total;
       
        System.out.print("Digite a nota da A1 (máx 30): ");
        notaA1 = scanner.nextDouble();
        while (notaA1 < 0 || notaA1 > 30) {
            System.out.print("Nota inválida! Digite a nota da A1 (máx 30): ");
            notaA1 = scanner.nextDouble();
        }

        System.out.print("Digite a nota da A2 (máx 30): ");
        notaA2 = scanner.nextDouble();
        while (notaA2 < 0 || notaA2 > 30) {
            System.out.print("Nota inválida! Digite a nota da A2 (máx 30): ");
            notaA2 = scanner.nextDouble();
        }

        System.out.print("Digite a nota da A3 (máx 40): ");
        notaA3 = scanner.nextDouble();
        while (notaA3 < 0 || notaA3 > 40) {
            System.out.print("Nota inválida! Digite a nota da A3 (máx 40): ");
            notaA3 = scanner.nextDouble();
        }

        total = notaA1 + notaA2 + notaA3;

        System.out.println("\nResultados:");
        System.out.printf("Nota A1: %.2f\n", notaA1);
        System.out.printf("Nota A2: %.2f\n", notaA2);
        System.out.printf("Nota A3: %.2f\n", notaA3);
        System.out.printf("Total: %.2f\n", total);
       
        scanner.close();
    }
}