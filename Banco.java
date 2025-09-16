import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(localeBR);

        int senhaCorreta = 3266;
        int n = 0;
        int saldo = 0;
        int deposito = 0;
        int saque = 0;
        int saquediario = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua senha (máximo 3 tentativas):");
            int senha = scanner.nextInt();

            if (senha != senhaCorreta) {
                System.out.println("Senha incorreta. Tente novamente.");
            } else {
                while (n != 4) {
                    System.out.println("\n1. Consultar Saldo\n2. Depositar Dinheiro\n3. Sacar Dinheiro\n4. Sair");
                    n = scanner.nextInt();

                    if (n == 1) {
                        System.out.println("Seu saldo atual é: " + formatoMoeda.format(saldo));
                    }

                    if (n == 2) {
                        System.out.println("Digite a quantia para depósito:");
                        deposito = scanner.nextInt();
                        if (deposito < 0) {
                            System.out.println("Não é possível depositar valores negativos.");
                        } else {
                            saldo += deposito;
                            System.out.println("Depósito de " + formatoMoeda.format(deposito) + " realizado com sucesso.");
                        }
                    }

                    if (n == 3) {
                        if (saldo == 0) {
                            System.out.println("Você não possui saldo para saque.");
                        } else {
                            System.out.println("Digite a quantia desejada para saque:");
                            saque = scanner.nextInt();

                            if (saque > 500) {
                                System.out.println("O valor máximo de saque é R$500. Operação cancelada.");
                            } else if (saque > saldo || saquediario + saque > 500) {
                                System.out.println("Saldo insuficiente ou você ultrapassou o limite diário de R$500.");
                            } else {
                                saldo -= saque;
                                saquediario += saque;
                                System.out.println("Saque de " + formatoMoeda.format(saque) + " realizado com sucesso.");
                            }
                        }
                    }

                    if (n == 4) {
                        System.out.println("Saindo.");
                        break;
                    }

                    if (n > 4 || n < 1) {
                        System.out.println("Digite uma opção válida.");
                    }
                }
                break;
            }
        }

        scanner.close();
    }
}
