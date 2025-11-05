import java.util.Scanner;
public class atv23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de termos");
        int n = sc.nextInt();
        int a = 0,b = 1;

        System.out.println("Fibonacci");

        for (int i = 1;i <= n; i++){
            System.out.println(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
