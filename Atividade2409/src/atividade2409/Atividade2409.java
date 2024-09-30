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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double notaA1 = obterNota(scanner, "A1 (máx 30)");
        double notaA2 = obterNota(scanner, "A2 (máx 30)");
        double notaA3 = obterNota(scanner, "A3 (máx 40)");
        
        double total = notaA1 + notaA2 + notaA3;

        System.out.println("\nResultados:");
        System.out.printf("Nota A1: %.2f\n", notaA1);
        System.out.printf("Nota A2: %.2f\n", notaA2);
        System.out.printf("Nota A3: %.2f\n", notaA3);
        System.out.printf("Total: %.2f\n", total);
       
        scanner.close();
    }

    private static double obterNota(Scanner scanner, String tipo) {
        double nota;
        while (true) {
            System.out.print("Digite a nota da " + tipo + ": ");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (tipo.equals("A1 (máx 30)") && (nota < 0 || nota > 30)) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 30.");
                } else if (tipo.equals("A2 (máx 30)") && (nota < 0 || nota > 30)) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 30.");
                } else if (tipo.equals("A3 (máx 40)") && (nota < 0 || nota > 40)) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 40.");
                } else {
                    break; // Saia do loop se a nota for válida
                }
            } else {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }