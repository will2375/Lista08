package ListaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Produtos {
Scanner input = new Scanner(System.in);

    String produto;
    double valor;

    public Produtos(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public Produtos() {

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