package ListaDeCandidato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCandidato {
    String matricula;
    double nota;




    public ListaDeCandidato() {    }


    public ListaDeCandidato(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }
    Scanner input = new Scanner(System.in);
    List<ListaDeCandidato> listaDeCandidatoes = new ArrayList<>();
    public void addcandidato() {
        System.out.println("Digite a matricula do candidato: ");
        matricula = input.next();
        System.out.println("Digite a nota: ");
        nota = input.nextDouble();

        System.out.println("Candidato da matricula: " + matricula + ", da nota: " + nota + " adicionado com sucesso.");

        ListaDeCandidato novoCandidato = new ListaDeCandidato(matricula, nota);
        listaDeCandidatoes.add(novoCandidato);
    }

    public void exibir() {
        for (int i = 0; i < listaDeCandidatoes.size(); i++) {
            System.out.println("posição " + i + ": candidato: " + listaDeCandidatoes.get(i).getMatricula() + " nota: " + listaDeCandidatoes.get(i).getNota());
        }
    }

    public void excluir() {
        exibir();
        System.out.print("digite o numero da posição do candidato que será excluido: ");
        int excluirC = input.nextInt();
        if (excluirC <= listaDeCandidatoes.size()) {
            listaDeCandidatoes.remove(excluirC);
            System.out.println("Candidato excluido");
        } else {
            System.out.println("Candidato inexistente");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

