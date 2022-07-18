package ListaDeProdutos;

import java.util.Scanner;

public class MainProdutos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();
        boolean loop = true;
        while (loop) {
            System.out.println("Digite '1' para adicionar produto\n '2' para remover produto\n'3' Para mostrar lista \n '4' para sair");
            int opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    listaDeProdutos.addproduto();
                    break;
                case 2:
                   listaDeProdutos.excluir();
                case 3:
                  listaDeProdutos.exibir();
                    break;
                case 4:
                    loop = false;
            }
        }
    }
}