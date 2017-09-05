package Exercicio4;

import java.util.Scanner;

/**
 *
 * @author Evangelino
 */
public class NumeroOcorre {

    static int numero;
    static int aux;
    static int k;

    public static int verificar(int n) {
        if (n == 0) {
            return 0;
        } else if (aux == (n % 10)) {
            k++;
        }
        n = n / 10;
        return verificar(n);

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero = ler.nextInt();
        System.out.println("Digite o numero que quer verificado");
        aux = ler.nextInt();
        verificar(numero);
        System.out.println("Vezes de numeros repetidos e :" + k);
    }
}
