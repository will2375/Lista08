package ListaDeCandidato;

public class ListaDeCandidato {
    int matricula;
    double nota;

    public ListaDeCandidato(int matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }
    public ListaDeCandidato(){

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
