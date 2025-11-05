import java.util.Scanner;
public class atv18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero");
        int n = sc.nextInt();

        boolean primo = true;

        if (n <= 0){
            primo = false;
        }else{
            for (int i = 2; i <= n / 2; i++){
                if (n% i == 0 ){
                    primo = false;
                    break;
                }
            }
        }
      if (primo) {
          System.out.println("é primo");
      }else{
          System.out.println("nao é primo");
      }
    }
}
