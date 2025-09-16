import java.util.Scanner;

public class LeitorDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Leitura da idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Limpar o buffer de entrada
        scanner.nextLine();

        // Leitura do CPF
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        // Exibindo os dados
        System.out.println("\nDados informados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);

        scanner.close();
    }
}
