import java.util.Scanner;

public class SistemaAprovacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---Sistema de Aprovação Escolar---");

        System.out.print("Informe o valor da nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("informe a nota da prova 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) /2;
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
