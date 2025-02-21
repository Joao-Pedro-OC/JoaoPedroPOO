package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação que deseja reaizar:\n1 - adição\n2 - subtração\n3 - multiplicação\n4 - divisão"));
        switch (operacao) {
            case 1:
                int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro número"));
                int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o segundo número"));
                int res = n1 + n2;
                JOptionPane.showMessageDialog(null, "O resultado da soma de " + n1 + " e " + n2 + " é " + res);
                break;
                
            case 2:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro número"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o segundo número"));
                res = n1 - n2;
                JOptionPane.showMessageDialog(null, "O resultado da subritação de " + n1 + " e " + n2 + " é " + res);
                break;
            
            case 3:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro número"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o segundo número"));
                res = n1 * n2;
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação de " + n1 + " e " + n2 + " é " + res);
                break;
            
            case 4:
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro número"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o segundo número"));
                res = n1 / n2;
                JOptionPane.showMessageDialog(null, "O resultado da divisão de " + n1 + " e " + n2 + " é " + res);
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Não existe essa operação.");
                break;
        }
    }
    
}
