package problema3;

public class PAC implements Entrega {
    
    @Override
    public double getValorEntrega(Pedido pedido) throws TipoEntregaInvalida {
        int peso = pedido.getTotalPeso();
        if  (peso <= 1000) {
            return 10.00;
        } else if (peso <= 2000) {
            return 15.00;
        } else if (peso <= 3000) {
            return 20.00;
        } else if (peso <= 5000) {
            return 30.00;
        } else {
            throw new TipoEntregaInvalida();
        }
    }    
}
