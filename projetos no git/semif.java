import java.util.Scanner;

public class semif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual seu CPF?");
        String cpf = scanner.nextLine();

        System.out.println(cpf);
        System.out.println(idade);
        System.out.println(nome);
    }
}
