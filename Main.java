import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota;
		float media;
		String nome;

		for(int n=1; n <=3; n++) {
			media = 0;
			System.out.println("Nome: ");
			nome = scanner.nextLine();

			for (int i=1 ; i <= 3 ; i++ ) {
				System.out.println("Nota " + i + ": ");
				nota = scanner.nextFloat();
				media += nota;
				scanner.nextLine();
			}
			media = media / 3;
			System.out.println("Sua média: " + media);

			if(media >=7) {
				System.out.println("Status: Aprovado");
			} else {
				System.out.println("Status: Reprovado");
			}
			System.out.println("");
		}
	}
}