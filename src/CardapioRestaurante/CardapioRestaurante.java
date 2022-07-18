package CardapioRestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardapioRestaurante {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<String> prato = new ArrayList<>();
            ArrayList<String> ingrediente = new ArrayList<>();


            boolean loop = true;
            while (loop) {
                System.out.println("Digite '1' para adicionar prato\n '2' para remover prato\n'3' Para mostrar pratos \n '4' para sair");
                int opcao = Integer.parseInt(input.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do prato: ");
                        String pratoN = input.nextLine();
                        prato.add(pratoN);
                        System.out.print("Digite os ingredientes: ");
                        String ingredientesP = input.nextLine();
                        ingrediente.add(ingredientesP);
                        break;
                    case 2:
                        System.out.println("digite a posição do prato: ");
                        int remove = input.nextInt();
                        prato.remove(remove);
                        ingrediente.remove(remove);
                        System.out.println("removido com Sucesso");
                        break;
                    case 3:
                        System.out.print("Os pratos são: ");
                        for (int i = 0; i < prato.size(); i++) {
                            System.out.println(i + " :\nprato: " + prato.get(i));
                        }
                        break;
                    case 4:
                        loop = false;

                    default:
                        System.out.println("opçao invalida");
                }
            }
        }
    }
