/*
3- Crie um programa em Java que simule o menu de um restaurante. O programa deve exibir as opções disponíveis para o usuário e permitir que ele escolha os itens que deseja pedir.

Regras do programa:
a) O programa deve exibir um menu com pelo menos 4 opções de pratos e uma opção para sair.
b) O usuário pode escolher quantos itens quiser e, ao final de cada escolha, o programa deve perguntar se deseja pedir mais alguma coisa.
c) Quando o usuário escolher a opção de sair, o programa deve exibir o total do pedido e encerrar.

Exemplo de saída esperada:

===== MENU DO RESTAURANTE =====			
1 - Hambúrguer - R$15.00
2 - Pizza - R$30.00
3 - Salada - R$12.00
4 - Refrigerante - R$5.00
5 - Finalizar pedido

Escolha uma opção: 1
Você adicionou um Hambúrguer ao pedido.

Deseja pedir mais alguma coisa? (S/N): S

===== MENU DO RESTAURANTE =====
1 - Hambúrguer - R$15.00
2 - Pizza - R$30.00
3 - Salada - R$12.00
4 - Refrigerante - R$5.00
5 - Finalizar pedido

Escolha uma opção: 3
Você adicionou uma Salada ao pedido.

Deseja pedir mais alguma coisa? (S/N): N

Total do pedido: R$27.00
Obrigado por comprar conosco!
*/

package pkgdo.pkgwhile;

    import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int conta = 0,pedido = 0;
        String sair = null;
        
        do{
            
            // menu
            System.out.print("===== MENU DO RESTAURANTE =====\n1 - Hambúrguer - R$15.00\n2 - Pizza - R$30.00\n3 - Salada - R$12.00\n4 - Refrigerante - R$5.00\n5 - Finalizar pedido\n\nEscolha uma opção: ");
            pedido = s.nextInt();
            s.nextLine();
                                                                                
            //calculando a conta
            switch (pedido) {
                case 1:
                    System.out.println("Você adicionou um Hambúrguer ao pedido.");
                    conta += 15;
                    break;
                case 2:
                    System.out.println("Você adicionou uma Pizza ao pedido.");
                    conta += 30;
                    break;
                case 3:
                    System.out.println("Você adicionou uma Salada ao pedido.");
                    conta += 12;
                    break;
                case 4:
                    System.out.println("Você adicionou um Refrigerante ao pedido.");
                    conta += 5;
                    break;
                case 5:
                    System.out.println("Finalizando o pedido...\n");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            s.nextLine();

            // sair
            if (pedido != 5) {
                System.out.print("Deseja pedir mais alguma coisa? (S/N): ");
                sair = s.nextLine().toUpperCase();
                System.out.println();
            }
            
        } while (pedido != 5 && !"N".equals(sair));
        
        System.out.println("Total do pedido: R$"+conta+"\nObrigado por comprar conosco!");
        
    }
    
}
