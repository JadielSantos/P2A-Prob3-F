package problema3;

public class RetiradaLocal implements Entrega {

    public static RetiradaLocal retiradaLocal;

    private RetiradaLocal() {
    }
    
    public static RetiradaLocal getInstance() {
        if (retiradaLocal == null) {
            retiradaLocal = new RetiradaLocal();
        }
        return retiradaLocal;
    }
    
    @Override
    public double getValorEntrega(Pedido pedido) throws TipoEntregaInvalida {
        return 0.0;
    }
}
