import java.util.Scanner;
public class atv17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simulação de Caixa Eletrônico ===");
        System.out.print("Digite o valor que deseja sacar: R$ ");
        int valor = sc.nextInt();

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;

        // Cálculo das notas
        if (valor >= 100) {
            nota100 = valor / 100;
            valor = valor % 100;
        }

        if (valor >= 50) {
            nota50 = valor / 50;
            valor = valor % 50;
        }

        if (valor >= 20) {
            nota20 = valor / 20;
            valor = valor % 20;
        }

        if (valor >= 10) {
            nota10 = valor / 10;
            valor = valor % 10;
        }

        if (valor >= 5) {
            nota5 = valor / 5;
            valor = valor % 5;
        }

        if (valor >= 2) {
            nota2 = valor / 2;
            valor = valor % 2;
        }

        System.out.println("\n=== Notas entregues ===");
        if (nota100 > 0) System.out.println(nota100 + " nota(s) de R$100");
        if (nota50 > 0) System.out.println(nota50 + " nota(s) de R$50");
        if (nota20 > 0) System.out.println(nota20 + " nota(s) de R$20");
        if (nota10 > 0) System.out.println(nota10 + " nota(s) de R$10");
        if (nota5 > 0) System.out.println(nota5 + " nota(s) de R$5");
        if (nota2 > 0) System.out.println(nota2 + " nota(s) de R$2");

        if (valor > 0) {
            System.out.println("Valor restante não pode ser sacado (somente notas de 100, 50, 20, 10, 5 e 2).");
        }
    }
}