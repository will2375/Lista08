package ListaDeProdutos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produtos produtos = new Produtos();

        System.out.println("Cadastro de produto digite 1, Para remover produto digite 2");
        int menu = input.nextInt();



        switch (menu){
            case 1:
                System.out.println("Digite o nome do produto: ");
                String nome = input.next();
                System.out.println("Digite o valor do produto: ");

        }


    }
}
