package model;
import java.math.BigDecimal;

public class Produto {
    private String descricao;
    private BigDecimal precoVenda;

    public Produto(String descricao, BigDecimal precoVenda) throws Exception {
        if (descricao.equals("")) {
           throw new Exception("Descrição vazia.");
        }

        if (precoVenda.compareTo(BigDecimal.ZERO) < 0) {
            throw new Exception("Valor maior que zero");
        }
        this.descricao = descricao;
        this.precoVenda = precoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }
}
