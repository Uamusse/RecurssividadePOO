// .....
package Exercicio1;

import javax.swing.JOptionPane;

public class InteiroParaBinario {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduz um numero decimal"
                + ""));
        decimalBinario(num);
    }

    private static void decimalBinario(int num) {
        if (num > 0) {
            decimalBinario(num / 2);
//            JOptionPane.showMessageDialog(null, num % 2 + "  ");
            System.out.print(num % 2 + "  ");

        }
    }

}
