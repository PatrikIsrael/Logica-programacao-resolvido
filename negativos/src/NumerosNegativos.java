//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class NumerosNegativos {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos (máximo = 10): ");
        int N = scanner.nextInt();

        if (N > 10 || N <= 0) {
            System.out.println("Número inválido. Deve ser um inteiro positivo menor ou igual a 10.");
            return;
        }

        int[] numeros = new int[N];
        System.out.println("Digite os " + N + " números:");

        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números negativos digitados:");
        for (int i = 0; i < N; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
