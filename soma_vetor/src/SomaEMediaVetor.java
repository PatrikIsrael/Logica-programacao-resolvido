//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Scanner;

public class SomaEMediaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números reais: ");
        int N = scanner.nextInt();

        double[] numeros = new double[N];
        double soma = 0;

        System.out.println("Digite os " + N + " números:");

        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        System.out.println("Elementos do vetor:");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        double media = soma / N;
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);

        scanner.close();
    }
}
