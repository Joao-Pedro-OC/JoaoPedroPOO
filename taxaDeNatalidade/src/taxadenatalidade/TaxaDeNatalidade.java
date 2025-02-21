package taxadenatalidade;

import javax.swing.JOptionPane;

public class TaxaDeNatalidade {

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que deseja ver:\n1 - Taxa de natalidade\n2 - Taxa de mortalidade"));
        switch (x) {
            case 1:
                int habitantes = Integer.parseInt(JOptionPane.showInputDialog("Quantos habitantes existem?"));
                int criançasNacidas = Integer.parseInt(JOptionPane.showInputDialog("Quantas crianças nasceram?"));
                JOptionPane.showMessageDialog(null, "A taxa de natalidade é de: " + (criançasNacidas * 1000) / habitantes);
                break;
            case 2:
                habitantes = Integer.parseInt(JOptionPane.showInputDialog("Quantos habitantes existem?"));
                int óbitos = Integer.parseInt(JOptionPane.showInputDialog("Quantos óbitos ocoreram?"));
                JOptionPane.showMessageDialog(null, "A taxa de mortalidade é de: " + (óbitos * 1000) / habitantes);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não existe essa opição.");
                break;
        }
    }
    
}
