package ListaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeProdutos {
    String produto;
    String valor;

    public ListaDeProdutos(String produto, String valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public ListaDeProdutos() {    }
    Scanner input = new Scanner(System.in);
    List<ListaDeProdutos> listaDeProdutos = new ArrayList<>();

    public void addproduto() {
        System.out.println("Digite o nome do produto: ");
        produto = input.nextLine();
        System.out.println("Digite o valor: ");
        valor = input.nextLine();

        System.out.println("produto: " + produto + ", do valor R$: " + valor + " adicionado com sucesso.");

        ListaDeProdutos novoProduto = new ListaDeProdutos (produto, valor);
      listaDeProdutos.add(novoProduto);
    }

    public void exibir() {
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println("posição " + i + ": produto: " + listaDeProdutos.get(i).getProduto() + " preço R$: " + listaDeProdutos.get(i).getValor());
        }
    }

    public void excluir() {
        exibir();
        System.out.println("digite o numero da posição do produto que será excluido: ");
        int excluirC = Integer.parseInt(input.nextLine());
        if (excluirC <= listaDeProdutos.size()) {
            listaDeProdutos.remove(excluirC);
            System.out.println("produto excluido");
        } else {
            System.out.println("Candidato inexistente");
        }
    }

    @Override
    public String toString() {
        return "ListaDeProdutos{" +
                "produto='" + produto + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}