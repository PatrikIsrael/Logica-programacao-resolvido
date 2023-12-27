//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos números você vai digitar ?");
        int num = sc.nextInt();
        sc.nextLine(); // Limpar buffer do scanner

        int[] numero = new int[num];
        int contador = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("\nDigite o proximo numero " + (i + 1) + ": ");
           numero[i] = sc.nextInt();

           if (numero[i] % 2 == 0){
               System.out.println("Numero par: "+ numero[i]);
               contador++;
           }

        }

        System.out.println("\nQuantidade de números pares: " + contador);
    }
}