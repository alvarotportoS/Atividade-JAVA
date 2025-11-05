package atividades;
import java.util.Scanner;
public class atv6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero qualquer");
        int n1 = sc.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("O numero é par");
        } else if (n1 % 2 == 1) {
            System.out.println("O numero é impar");
        }
    }
}
