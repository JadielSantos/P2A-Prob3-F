package problema3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private Entrega tipoEntrega;
    private int peso;

    public double getValorTotal() throws TipoEntregaInvalida {
        double valor = 0;
        for (ItemPedido item : getItens()) {
            valor += item.getQuantidade() * item.getProduto().getValor();
        }
        return valor + getValorEntrega();
    }
    
    public int getTotalPeso() {
        int peso = 0;
        for (ItemPedido item : getItens()) {
            peso += item.getQuantidade() * item.getProduto().getPeso();
        }
        return peso;
    }

    public Entrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(Entrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }
    
    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }
    
    public double getValorEntrega() throws TipoEntregaInvalida {
        return tipoEntrega.getValorEntrega(this);
    }
    
    public Pedido() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }

}
