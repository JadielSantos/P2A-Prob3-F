package problema3;

public class Motoboy implements Entrega {

    public static Motoboy motoboy;

    private Motoboy() {
    }

    public static Motoboy getInstance() {
        if (motoboy == null) {
            motoboy = new Motoboy();
        }
        return motoboy;
    }
    
    @Override
    public double getValorEntrega(Pedido pedido) throws TipoEntregaInvalida {
        int peso = pedido.getTotalPeso();
        if (peso <= 25000 && pedido.getItens().size() <= 30) {
            return 7.0;
        } else {
            throw new TipoEntregaInvalida();
        }
    }
}
