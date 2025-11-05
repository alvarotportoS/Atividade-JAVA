
import java.util.Scanner;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if(n > 0){
            System.out.print("O número " + n + " é positivo!");
        }else if(n < 0){
            System.out.print("O número " + n + " é negativo!");
        }else{
            System.out.print("O número " + n + " é zero!");
        }

    }
}