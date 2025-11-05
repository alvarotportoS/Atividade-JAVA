import java.util.Scanner;
public class atv9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1-Converter de celsius para fahrenheit");
        System.out.println("2-Converter de fahrenheit para celsius");
        System.out.println("Digite a opção escolhida ");
        int opcao = sc.nextInt();

        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();

        double resultado;

        if (opcao == 1) {
            resultado = (temp * 9 / 5) + 32;
            System.out.println(temp + "°C = " + resultado + " °F");
        } else if (opcao == 2) {
            resultado = (temp - 32) + 5 / 9;
            System.out.println(temp + "°F = " + resultado + " °C");
        } else {
            System.out.println("Opção inválida!");
        }

    }
}
