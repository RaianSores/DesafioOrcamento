package model;

import java.math.BigDecimal;

public class ItemOrcamento {
    private BigDecimal valorUnitario;
    private BigDecimal quantidade;
    private Produto produto;

    public ItemOrcamento(BigDecimal valorUnitario, BigDecimal quantidade, Produto produto) {
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public String getProduto() {
        return produto.getDescricao();
    }

    public BigDecimal total(){
        return valorUnitario.multiply(quantidade);
    }
}
