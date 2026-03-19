package run;

import javax.swing.*;

public class NumeroPares {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un número: ", "INGRESE UN RANGO ENTRE DOS NÚMEROS", JOptionPane.QUESTION_MESSAGE));
        int fin = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime otro número: ", "INGRESE UN RANGO ENTRE DOS NÚMEROS", JOptionPane.QUESTION_MESSAGE));

        String texto = "";
        int i = inicio + 1;

        while(i <= fin)
        {
            if(i % 2 == 0)
            {
                String proceso = "";
                int j = 1;
                long factorial = 1;

                while(j <= i)
                {
                    factorial *= j;
                    proceso += j;

                    if(j < i)
                    {
                        proceso += " * ";
                    }
                    j++;
                }
                texto += "Número: " + i + "\n";
                texto += i + "!" + " = " + proceso + " = " + factorial + "\n\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, texto, "FACTORIAL DE NÚMEROS PARES", JOptionPane.INFORMATION_MESSAGE);
    }
}
