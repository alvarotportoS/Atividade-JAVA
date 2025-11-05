import java.sql.SQLOutput;
import java.util.Scanner;

public class atv7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("o numero " + n1 + " é maior que o numero " + n2);
        }
        else if (n2 == n1) {
            System.out.println("Os dois numeros sao iguais");
        }
        else  {
            System.out.println("o numero" + n2 + "é maior que o numero" + n1 );
        }
    }
}
