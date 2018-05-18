package problema3;

public class PAC implements Entrega {
    
    public static PAC pac;

    private PAC() {
    }
    
    public static PAC getInstance() {
        if (pac == null) {
            pac = new PAC();
        }
        return pac;
    }
    
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
