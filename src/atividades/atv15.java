
import java.util.Scanner;
public class atv15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}