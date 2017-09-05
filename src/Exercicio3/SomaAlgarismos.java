package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Evangelino
 */
public class SomaAlgarismos {

    public static int somaAlgarismo(int num, int somatorio) {
        if (num < 1) {
            return somatorio;
        }
        somatorio += (num %10);
        return somaAlgarismo(num/10,somatorio);

    }

    public static void main(String[] args) {
        System.out.println("Digite um Numero");
        
        int num = new Scanner(System.in).nextInt();
        int soma = somaAlgarismo(num, 0);
        
        System.out.println("O valor da soma dos algarismos e: "+soma);
    }

}
