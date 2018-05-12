package problema3;

public abstract class Entrega {
    public abstract double getValorEntrega(Pedido pedido) throws TipoEntregaInvalida;
}
