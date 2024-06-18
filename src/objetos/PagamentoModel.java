package objetos;

public class PagamentoModel {

    private int idMesa; // Adicionamos o atributo idMesa

    private double subtotal;
    private double valorPago;
    private String formaPagamento;

    public PagamentoModel(double subtotal, double valorPago, String formaPagamento) {
        this.subtotal = subtotal;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    // Getter e Setter para idMesa
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
}

