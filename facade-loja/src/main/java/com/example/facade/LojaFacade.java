package com.example.facade;

public class LojaFacade {

    private Pagamento pagamento;
    private Estoque estoque;
    private Entrega entrega;

    public LojaFacade() {
        this.pagamento = new Pagamento();
        this.estoque = new Estoque();
        this.entrega = new Entrega();
    }

    public String finalizarCompra() {

        StringBuilder sb = new StringBuilder();

        sb.append(pagamento.processar()).append("\n");
        sb.append(estoque.processar()).append("\n");
        sb.append(entrega.processar());

        return sb.toString();
    }
}