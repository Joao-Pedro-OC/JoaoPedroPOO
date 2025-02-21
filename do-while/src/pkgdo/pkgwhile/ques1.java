
// 1 - Considere uma população inicial de 1000 habitantes e uma taxa de crescimento de 2% ao ano. Utilize do-while para calcular quantos anos serão necessários para a população ultrapassar 5000 habitantes.

package pkgdo.pkgwhile;

public class ques1 {
    
    public static void main(String[] args) {
        
        int população = 1000, anos = 0;
        
        do {
            população += população * 0.02;
            ++anos;
        } while (população < 5000);
        
        System.out.println("Para a populacao vai ter 5000 habitantes depois de " + anos + " anos.");
    }
    
}
