import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class caixa {

    // ta deixando o valor em reais
    static NumberFormat moeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    // aqui é pra ir mostrando o saldo 
    static void consultarSaldo(double saldo) {
        System.out.println("💰 Seu saldo atual é: " + moeda.format(saldo));
    }
//deposito
    static double depositar(double saldo, Scanner sc) {
        System.out.print("Digite o valor que deseja depositar: ");
        double deposito = sc.nextDouble();

        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Depósito realizado com sucesso! Seu novo saldo é: " + moeda.format(saldo));
        } else {
            System.out.println("Valor inválido. Tente novamente.");
        }
        return saldo;
    }
  // Funçao saque
    static double sacar(double saldo, Scanner sc) {
        System.out.print("Digite o valor que deseja sacar (máx R$ 500,00): ");
        double saque = sc.nextDouble();

        if (saque <= 0) {
            System.out.println("Valor inválido. Tente novamente.");
        } else if (saque > 500) {
            System.out.println("O limite de saque por operação e de R$ 500,00.");
        } else if (saque > saldo) {
            System.out.println("Saldo insuficiente. Seu saldo atual e " + moeda.format(saldo));
        } else {
            saldo -= saque;
            System.out.println("aque realizado com sucesso! Seu novo saldo é: " + moeda.format(saldo));
        }
        return saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        int senhaCorreta = 2007;
        int tentativas = 3;
        boolean acessoLiberado = false;

        // Sistema de senha de 3 tentativas topzera
        while (tentativas > 0) {
            System.out.print("Digite sua senha: ");
            int senhaDigitada = sc.nextInt();

            if (senhaDigitada == senhaCorreta) {
                acessoLiberado = true;
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("senha incorreta! Você ainda tem " + tentativas + " tentativa(s).");
                }
            }
        }

        if (!acessoLiberado) {
            System.out.println("conta bloqueada. Procure sua agência.");
        } else {
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("\n---------- MENU ----------");
                System.out.println("[1] Consultar saldo");
                System.out.println("[2] Depositar dinheiro");
                System.out.println("[3] Sacar dinheiro");
                System.out.println("[4] Sair");
                System.out.println("--------------------------");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        consultarSaldo(saldo);
                        break;
                    case 2:
                        saldo = depositar(saldo, sc);
                        break;
                    case 3:
                        saldo = sacar(saldo, sc);
                        break;
                    case 4:
                        System.out.println("Obrigado por usar nosso caixa eletrônico. Até logo!");
                        break;
                    default:
                        System.out.println("opção inválida. Tente novamente.");
                }
            }
        }

        sc.close();
    }
}