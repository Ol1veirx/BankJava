package application;

import java.util.Scanner;

import entities.CountBank;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CountBank user;

        System.out.print("Insira o numero da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Insira nome do titular: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Is there na initial deposit (s/n)? ");
        char opcao = sc.next().charAt(0);
        if (opcao == 's'){
            System.out.print("Insira o valor inicial do deposito: ");
            double depositoInicial = sc.nextDouble();
            user = new CountBank(numeroDaConta, nomeTitular, depositoInicial);
        } else {
            user = new CountBank(numeroDaConta, nomeTitular);
        }

        System.out.println("Account data: ");
        System.out.println(user);

        System.out.println();
        System.out.print("Insira o valor do depósito: ");
        user.ValorDeposito(sc.nextDouble());
        System.out.println("Data de alteração da conta: ");
        System.out.println(user);

        System.out.println();
        System.out.print("Insira o valor que deseja sacar: ");
        user.ValorSacado(sc.nextDouble());
        System.out.println("Data de alteração da conta: ");
        System.out.println(user);


        sc.close();
    }
}
