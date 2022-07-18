package ListaDeCandidato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainCandidato {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> matricula = new ArrayList<>();
        List<Double> nota = new ArrayList<>();


        boolean loop = true;
        while (loop) {
            System.out.println("Digite '1' para adicionar candidato\n '2' para remover candidato\n'3' Para mostrar candidatos \n '4' para sair");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a matricula do candidato: ");
                    int matriculaC = input.nextInt();
                    System.out.println("Digite a nota: ");
                    double notaC = input.nextDouble();
                    matricula.add(matriculaC);
                    nota.add(notaC);
                    break;
                case 2:
                    System.out.println("digite a posição da matricula do candidato: ");
                    int remove = input.nextInt();
                    matricula.remove(remove);
                    nota.remove(remove);
                    System.out.println("removido com Sucesso");
                    break;
                case 3:
                    System.out.print("Os Candidatos com as notas são: ");
                    for (int i = 0; i < matricula.size(); i++) {
                        System.out.println(i + " :\nCandidato: " + matricula.get(i) + " nota:" + nota.get(i));
                    }
                    break;
                case 4:
                    loop = false;
            }
        }
    }
}
