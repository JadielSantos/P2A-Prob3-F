package problema3;

public interface Entrega {
    public abstract double getValorEntrega(Pedido pedido) throws TipoEntregaInvalida;
}
