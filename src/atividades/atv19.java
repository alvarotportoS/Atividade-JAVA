package atividades;
import java.util.Random;
import java.util.Scanner;
public class atv19 {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(10) + 1; // número de 1 a 10

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número (1 a 10): ");
        int palpite = scanner.nextInt();

        if (palpite == n) {
            System.out.println("Acertou! O número era " + n);
        } else {
            System.out.println("Errou! O número era " + n);
        }

    }
}
