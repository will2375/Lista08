package ListaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> produtosList = new ArrayList<>();


boolean loop= true;
while (loop){
        System.out.println("Digite '1' para adicionar produto\n '2' para remover produto\n'3' Para sair");
        int opcao= input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do produto");
                String nomep = input.next();
                System.out.println("Digite o valor: ");
                double valorp = input.nextDouble();
                Produtos produtos = new Produtos();
                produtos.setValor(valorp);
                produtos.setProduto(nomep);
                produtosList.add(nomep);
                produtosList.add(String.valueOf(valorp));
                break;
            case 2:
                System.out.println("digite o numero do produto para remover: ");
                int remove = input.nextInt();
                System.out.println("Digite o numero do valor para remover: ");
                int remove2 = input.nextInt();
                produtosList.remove(remove);
                produtosList.remove(remove2);
                break;
            case 3:
                System.out.println("Os produtos com os preços são: ");
                for( int i =0; i <produtosList.size(); i++){
                    System.out.println(i +" : " +produtosList.get(i));
                }
            case 4:
                loop = false;
        }
        }
    }
}