package model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Orcamento {
    private List<ItemOrcamento> itens;
    private Date data = new Date();

    public Orcamento() {

    }

    public void vendeItem(ItemOrcamento itemOrcamento) {
        if(Objects.isNull(itemOrcamento)){
            throw new IllegalArgumentException("Não pode ser Null.");
        }
    }

    private boolean isaBoolean(ItemOrcamento itemOrcamento) {
        return itemOrcamento == null;
    }


    public BigDecimal total() {
        BigDecimal total = BigDecimal.ZERO;
        for (ItemOrcamento item : itens
        ) {
            total.add(item.total());
        }
        return total;
    }

    public int quantidade() {
        return itens.size();
    }

    public List<ItemOrcamento> getItens() {
        return itens;
    }

    public Date getData() {
        return data;
    }
}
