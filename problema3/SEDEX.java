package problema3;

public class SEDEX implements Entrega {

    @Override
    public double getValorEntrega(Pedido pedido) {
        int peso = pedido.getTotalPeso();
        if  (peso <= 500) {
            return 12.50;
        } else if (peso <= 750) {
            return 20.00;
        } else if (peso <= 1200) {
            return 30.00;
        } else if (peso <= 2000) {
            return 45.00;
        } else {
            return 45.00 + (Math.ceil((peso - 2000) / 100.0) * 1.5);
        }
    }    
}
