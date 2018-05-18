package problema3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TipoEntregaInvalida {
        Pedido pedido = new Pedido();
        ArrayList<ItemPedido> itens = new ArrayList<>();
        itens.add(new ItemPedido(new Produto("Caneta", 3.5, 1), 32));
        itens.add(new ItemPedido(new Produto("Resma", 200.0, 1), 1));
        itens.add(new ItemPedido(new Produto("Caderno", 20, 24000), 1));        
        pedido.setItens(itens);
        pedido.setTipoEntrega(PAC.getInstance());
        System.out.println(pedido.getValorEntrega());
        System.out.println(pedido.getValorTotal());
        System.out.println(pedido.getTotalPeso());
        
        System.out.println("-----------------");
        pedido.setTipoEntrega(SEDEX.getInstance());
        System.out.println(pedido.getValorEntrega());
        System.out.println(pedido.getValorTotal());
        System.out.println(pedido.getTotalPeso());
        
        System.out.println("-----------------");
        pedido.setTipoEntrega(Motoboy.getInstance());
        System.out.println(pedido.getValorEntrega());
        System.out.println(pedido.getValorTotal());
        System.out.println(pedido.getTotalPeso());
    }
}
