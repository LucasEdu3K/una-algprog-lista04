import java.util.Scanner;


public class ParouImpar {
    public static void main(String[] args) {

        System.out.println("---Verificador PAR ou ÍMPAR---");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O nunmero é PAR");
        } else {
            System.out.println("O numero é IMPAR");
        }

        sc.close();
        
    }
}