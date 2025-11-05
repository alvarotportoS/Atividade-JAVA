import java.util.Scanner;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int n1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int n2 = sc.nextInt();

        System.out.println("Digite a terceira nota: ");
        int n3 = sc.nextInt();

        double media = (n1 + n2 + n3) / 3 ;

        System.out.println("A media das notas é: " + media);
    }
}
