package CardapioRestaurante;

import ListaDeProdutos.ListaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardapioRestaurante {

    String prato;
    String ingredientes;

    public CardapioRestaurante(String prato, String ingredientes) {
        this.prato = prato;
        this.ingredientes = ingredientes;
    }
    public  CardapioRestaurante(){}

    Scanner input = new Scanner(System.in);

    List <CardapioRestaurante> pratos = new ArrayList<>();

    public void addprato() {
        System.out.println("Digite o nome do prato: ");
        prato = input.nextLine();
        System.out.println("Digite os ingredientes: ");
        ingredientes = input.nextLine();

        System.out.println("prato: " + prato + ", com os ingredientes: " + ingredientes + " adicionado com sucesso.");

        CardapioRestaurante novoPrato = new CardapioRestaurante (prato, ingredientes);
        pratos.add(novoPrato);
    }

    public void exibir() {
        for (int i = 0; i < pratos.size(); i++) {
            System.out.println("posição " + i + ": prato: " + pratos.get(i).getPrato() + " ingredientes: " + pratos.get(i).getIngredientes());
        }
    }

    public void excluir() {
        exibir();
        System.out.println("digite o numero da posição do prato que será excluido: ");
        int excluirC = Integer.parseInt(input.nextLine());
        if (excluirC <= pratos.size()) {
            pratos.remove(excluirC);
            System.out.println("prato excluido");
        } else {
            System.out.println("prato inexistente");
        }
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}

