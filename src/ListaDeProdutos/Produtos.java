package ListaDeProdutos;

import java.util.ArrayList;
import java.util.List;

public class Produtos {


    int id;
    String produto;
    double valor;

    public Produtos() {
        this.id = id;
        this.produto = produto;
        this.valor = valor;
    }

    public void listagem() {
        List<Produtos> produtos = new ArrayList<>();

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}