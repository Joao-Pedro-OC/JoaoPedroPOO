// 2- Faça um programa que pergunte ao usuário um número e exiba todas as tabuadas desse número de 1 a 10, utilizando do-while.
package pkgdo.pkgwhile;

import javax.swing.JOptionPane;

public class ques2 {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fazer a tabudada."));
        int con = 1;
        
        do {
            System.out.println(num + " + " + con + " = " + (num + con));
            ++con;
        } while (con <= 10);
        
    }
}
