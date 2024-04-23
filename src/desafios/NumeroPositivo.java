package desafios;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] arks) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numeroPositivo = leitura.nextInt();

        if (numeroPositivo >= 1) {
            System.out.println("O Numero é Positivo");
        } else if (numeroPositivo <= -1) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("Numero invelido");
        }

    }
}
