package ListaDeProdutos;

import java.util.Scanner;

public class ListaDeProdutos {
    String produto;
    double valor;

    public ListaDeProdutos(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public ListaDeProdutos() {

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