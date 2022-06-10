package aplication;

import aplication.entites.productBank;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class contaBanco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        productBank productBank;

        System.out.println("*Conta bancaria* ");
        System.out.println("Digite o numero da agencia: ");
        int conta = input.nextInt();
        input.nextLine();
        System.out.println("Digite o nome do titular da conta: ");
        String nome = input.nextLine();

        System.out.println("Vai ter valor inicial? ");
        char responser = input.next().charAt(0);
        if (responser == 's') {

            System.out.println("Deposito inicial: ");
            double valorInicial = input.nextDouble();

            productBank = new productBank(nome, conta, valorInicial);

        } else {

            productBank = new productBank(nome, conta);
        }

        productBank.setNome(nome);
        System.out.println(productBank.getNome());

        productBank.getDepositoInicial();
        System.out.println(productBank);

        System.out.println("digite o valor que queira depositar: ");
        double deposito = input.nextDouble();
        productBank.removid(deposito, deposito);

        System.out.println(productBank);

        System.out.println("Digite o valor de saque: ");

        double saque = input.nextDouble();
        productBank.saque(deposito, saque);

        System.out.println(productBank);

    }

}
