//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas: ");
        int P = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner

        String[] nome = new String[P];
        int[] idade = new int[P];
        double[] altura = new double[P];
        double somaAltura = 0;

        for (int i = 0; i < P; i++) {
            System.out.println("\nDigite o nome da pessoa " + (i + 1) + ": ");
            nome[i] = sc.nextLine();

            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade[i] = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner

            System.out.println("Digite a altura (em metros) da pessoa " + (i + 1) + ": ");
            altura[i] = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer do scanner

            somaAltura += altura[i];
        }

        double mediaAltura = somaAltura / P;
        System.out.println("\nAltura média das pessoas: " + mediaAltura + " metros");

        sc.close();
    }
}
