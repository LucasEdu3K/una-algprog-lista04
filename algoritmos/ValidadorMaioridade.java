import java.util.Scanner;

public class ValidadorMaioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Validador de Maioridade ---");

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado: Usuário menor de idade");
        }

        sc.close();
    }
}