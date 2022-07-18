package ListaDeCandidato;

import java.util.Scanner;

public class MainCandidato {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaDeCandidato listaDeCandidato = new ListaDeCandidato();

        boolean loop = true;
        while (loop) {
            System.out.println("Digite '1' para adicionar candidato\n '2' para remover candidato\n'3' Para mostrar candidatos \n '4' para sair");
            int opcao = Integer.parseInt(input.nextLine());

            switch (opcao) {
                case 1:
                    listaDeCandidato.addcandidato();
                    break;
                case 2:
                    listaDeCandidato.excluir();
                case 3:
                    listaDeCandidato.exibir();
                    break;
                case 4:
                    loop = false;
            }
        }
    }
}
