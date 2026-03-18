package run;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // int num = 0;
        try
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un número: ", "Tabla de multiplicación", JOptionPane.INFORMATION_MESSAGE));
            String Tabla = "Tabla de multiplicacion";
            for(int i = 1; i <= 12; i++)
            {
                Tabla += "\n " + i + " * " + num + " = " + (num*i);
            }

            JOptionPane.showMessageDialog(null,Tabla, "Tabla de multiplicación", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR AL INGRESAR UN NÚMERO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
}
