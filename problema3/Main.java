package problema3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TipoEntregaInvalida {
        Pedido pedido = new Pedido();
        ArrayList<ItemPedido> itens = new ArrayList<>();
        itens.add(new ItemPedido(new Produto("Caneta", 3.5, 159), 1));
        itens.add(new ItemPedido(new Produto("Resma", 200.0, 2241), 1));
        itens.add(new ItemPedido(new Produto("Caderno", 20, 525), 1));
        pedido.setItens(itens);
        pedido.setTipoEntrega(new PAC());
        System.out.println(pedido.getValorEntrega());
        System.out.println(pedido.getValorTotal());
        System.out.println(pedido.getTotalPeso());
        System.out.println("-----------------");
        pedido.setTipoEntrega(new SEDEX());
        System.out.println(pedido.getValorEntrega());
        System.out.println(pedido.getValorTotal());
        System.out.println(pedido.getTotalPeso());
    }
}
