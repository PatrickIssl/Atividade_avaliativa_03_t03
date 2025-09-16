]import java.util.Scanner;

public class comif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 para multiplicação, 2 para divisão, 3 para soma, 4 para subtração");
        float tipo = scanner.nextFloat();

        System.out.println("Digite o valor A:");
        float numa = scanner.nextFloat();

        System.out.println("Digite o valor B:");
        float numb = scanner.nextFloat();

        float resultado;

        if (tipo == 1) {
            resultado = numa * numb;
            System.out.println(resultado);
        } else if (tipo == 2) {
            if (numb == 0) {
                System.out.println("Não pode fazer resultado por 0");
            } else {
                resultado = numa / numb;
                System.out.println(resultado);
            }
        } else if (tipo == 3) {
            resultado = numa + numb;
            System.out.println(resultado);
        } else if (tipo == 4) {
            resultado = numa - numb;
            System.out.println(resultado);
        } else {
            System.out.println("Erro seu pia de merda");
        }
    }
}
