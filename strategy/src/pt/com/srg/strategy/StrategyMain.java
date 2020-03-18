package pt.com.srg.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Pagamento pagamento = new CartaoDeCredito();
        PagamentoConta pagamentoConta = new PagamentoConta(pagamento,200.0);
        System.out.println("Sua taxa de pagamento é: "+pagamentoConta.pagarComTaxa());
    }
}

class PagamentoConta {

    private Pagamento pagamento;
    private double valor;

    public PagamentoConta(Pagamento pagamento, double valor) {
        this.pagamento = pagamento;
        this.valor = valor;
    }

    public double pagarComTaxa() {
        return pagamento.pagarComTaxa(valor);
    }
}

interface Pagamento {
    double pagarComTaxa(double valorCompra);
}

class Cartao implements Pagamento {
    @Override
    public double pagarComTaxa(double valorCompra) {
        return 8.0 * valorCompra;
    }
}

class PayPal implements Pagamento {
    @Override
    public double pagarComTaxa(double valorCompra) {
        return 2.0 * valorCompra;
    }
}

class CartaoDeCredito implements Pagamento {
    @Override
    public double pagarComTaxa(double valorCompra) {
        return 5.0 * valorCompra;
    }
}