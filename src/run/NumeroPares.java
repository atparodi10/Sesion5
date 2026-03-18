package run;

import javax.swing.*;

public class NumeroPares {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un número", "LLENA LOS CAMPOS",JOptionPane.QUESTION_MESSAGE));
        int fin = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime otro número", "LLENA LOS CAMPOS",JOptionPane.QUESTION_MESSAGE));

        int i = inicio + 1;
        String texto = "";


        while(i < fin)
        {
            if(i % 2 == 0)
            {
                texto += i+"\n";
                String proceso = "";
                long factorial = 1;
                int j = 1;

                while(j <= i)
                {
                    factorial *= j;
                    proceso += j;

                    if (j < i)
                    {
                        proceso += " * ";
                    }
                    j++;
                }
                texto += "Número: " + i + "\n";
                texto += i + "! = " + proceso + " = " + factorial + "\n\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, texto, "NÚMEROS PARES ENTRE DOS NÚMEROS", JOptionPane.INFORMATION_MESSAGE);
    }
}
