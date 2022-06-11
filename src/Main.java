import model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args) throws Exception {
        List<Produto> produtos =  produtos();
    }

    public static List<Produto> produtos() throws Exception {
        Produto produto = new Produto("oi", BigDecimal.valueOf(5.6));
        Produto produtoo = new Produto("ola", BigDecimal.valueOf(4.6));
        List<Produto>produtos1 = new ArrayList<>();
        produtos1.add(produto);
        produtos1.add(produtoo);
        return produtos1;
    }
}
