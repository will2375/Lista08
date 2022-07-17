package ListaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> produtos = new ArrayList<>();
        List<Double>valor = new ArrayList<>();


boolean loop= true;
while (loop){
        System.out.println("Digite '1' para adicionar produto\n '2' para remover produto\n'3' Para mostrar lista \n '4' para sair");
        int opcao= input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do produto");
                String nomep = input.next();
                System.out.println("Digite o preço: ");
                double valorp = input.nextDouble();
                Produtos produto = new Produtos();
                produto.setProduto(nomep);
                produto.setValor(valorp);
                produtos.add(nomep);
                valor.add(valorp);
                break;
            case 2:
                System.out.println("digite o numero do produto para remover: ");
                int remove = input.nextInt();
                produtos.remove(remove);
                valor.remove(remove);
                break;
            case 3:
                System.out.print("Os produtos com os preços são: ");
                for( int i =0; i <produtos.size(); i++){
                    System.out.println(i +" :\n " +produtos.get(i) +" R$:"+  valor.get(i));
                }
            case 4:
                loop = false;
        }
        }
    }
}