/*
 * Faça um método recursivo que realize a multiplicação entre 
 * dois números inteiros, sem utilizar o operador de multiplicação (*).
 */
package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author Evangelino
 */
public class MultiplicacaoSemOperador {

    public static void main(String[] args) {
        int nmr1;
        int nmr2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        nmr1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        nmr2 = sc.nextInt();
        System.out.println(multiplicaSemOperador(nmr1, nmr2));
    }

    public static int multiplicaSemOperador(int numero1, int numero2) {
        for (int i = 0; i < numero2; i++) {
            numero1++;
        }
        return numero1;
//        return (int) Math.pow(numero1, numero2);
        
    }

}
