package atividade.pkg5;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        int temperatura, soma = 0, contador = 0;
        double media;
        Scanner scanner = new Scanner(System.in);
        while (contador < 12) {
            System.out.println("Digite a temperatura " + (contador + 1) + " entre 4 e 10");
            temperatura = scanner.nextInt();
            while (temperatura < 4 || temperatura > 10) {
                System.out.println("Temperatura invalida, digite novamente (entre 4 e 10): ");
                temperatura = scanner.nextInt();
            }
            soma += temperatura;
            contador++;
        }
        media = (double) soma / 12;
        System.out.println("A média de hoje das temperaturas é: " + media);
        scanner.close();
    }

}
