package problema3;

public class RetiradaLocal extends Entrega {

    @Override
    public double getValorEntrega(Pedido pedido) throws TipoEntregaInvalida {
        return 0.0;
    }
}
