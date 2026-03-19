package run;

import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        int fin = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un número: ", "INGRESE UN RANGO", JOptionPane.QUESTION_MESSAGE));

        int a = 0;
        int b = 1;
        String texto = a + "\n" + b + "\n";

        for(int i = 1; i <= fin; i++)
        {
            int c = a + b;

            texto += c + "\n";
            a = b;
            b = c;

        }
        JOptionPane.showMessageDialog(null, texto, "SERIE FIBONACCI", JOptionPane.INFORMATION_MESSAGE);
    }
}
