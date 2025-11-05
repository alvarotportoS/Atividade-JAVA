package atividades;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero inteiro");
        int n2 = sc.nextInt();
        System.out.println("Digite o operador");
        char op = sc.next().charAt(0);


        if (op == '+') {
            System.out.println("Resultado: " + (n1 + n2));
        }
        else if (op == '-') {
            System.out.println("Resultado: " + (n2 - n1));
        }
        else if (op == '*') {
            System.out.println("Resultado: " + (n1 * n2));
        }
        else if (op == '/') {
            System.out.println("Resultado: " + (n1 / n2));
        }
    }
}
