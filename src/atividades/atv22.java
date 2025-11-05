package atividades;
import java.util.Scanner;
public class atv22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double n = sc.nextDouble();

        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}