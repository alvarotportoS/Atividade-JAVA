import java.util.Scanner;
public class atv21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int n2 = scanner.nextInt();

        int resultado = 1;

        for (int i = 0; i < n2; i++) {
            resultado = resultado * n2;
        }

        System.out.println(n1 + " elevado a " + n2 + " = " + resultado);
    }
}
