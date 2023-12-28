//Fazer um programa que inicie com todos os dez quartos vazios, e depois
//leia uma quantidade N representando o número de estudantes que vão
//alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
//N estudantes. Para cada registro de aluguel, informar o nome e email do
//estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
//que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
//um relatório de todas ocupações do pensionato, por ordem de quarto,
//conforme exemplo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        cadastro[] vet = new cadastro [10];

        System.out.println("Digite o número de quartos alugados: ");
        int n = sc.nextInt();

         for (int i=1; i<=n; i++){
             System.out.println();
             System.out.println("Cadastro #" + i + ":");
             System.out.println("Nome: ");
             sc.nextLine();
             String name = sc.nextLine();
             System.out.println("Digite seu email: ");
             String email = sc.nextLine();
             System.out.println("Quarto: ");
             int quarto = sc.nextInt();
             vet[quarto] = new cadastro (name, email);
         }
        System.out.println("Quartos ocupados: ");
        for(int i=0; i<10; i++){
            if( vet[i] != null) {
                System.out.println( i + ": " + vet[i]);

            }

        }
        sc.close();
    }

}