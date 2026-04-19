import java.util.Scanner;

public class AnalisadorTriangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("---Analisador de Triângulos---");

        System.out.print("Digite o tamanho do lado 1:");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o tamanho do lado 2:");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o tamanho do lado 3:");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
            System.out.print("É um triangulo");

            if (lado1 == lado2 && lado2 == lado3){
                System.out.print(" Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.print(" Isósceles");
            } else {
                System.out.print(" Escaleno");
            }

        } else {
            System.out.println("Não é um triangulo!");
        }

        sc.close();

    }

    
}