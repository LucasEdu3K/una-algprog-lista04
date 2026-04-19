import java.util.Scanner;

public class RadarVelocidade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("---Radar de Velocidade---");

        System.out.print("Digite a velocidade do carro:");
        double velocidadeCarro = sc.nextDouble();
        int velocidadeMaxima = 80;

        double multa = (velocidadeCarro - velocidadeMaxima) * 7;

        if (velocidadeCarro > velocidadeMaxima) {
            System.out.println("Valor da multa: " + multa);
        } else {
            System.out.println("Boa Viagem!");
         
        }

        sc.close();


    }
    
}