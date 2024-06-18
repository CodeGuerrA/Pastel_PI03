package objetos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinanceiroModel {

    private LocalDate data;
    private String numeroVenda;
    private BigDecimal desconto;
    private BigDecimal valorCompra;
    private String formaPagamento;

    // Construtor vazio (default)
    public FinanceiroModel() {
    }

    // Construtor com todos os atributos
    public FinanceiroModel(LocalDate data, String numeroVenda, BigDecimal desconto, BigDecimal valorCompra, String formaPagamento) {
        this.data = data;
        this.numeroVenda = numeroVenda;
        this.desconto = desconto;
        this.valorCompra = valorCompra;
        this.formaPagamento = formaPagamento;
    }

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(String numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "FinanceiroModel{"
                + "data=" + data
                + ", numeroVenda='" + numeroVenda + '\''
                + ", desconto=" + desconto
                + ", valorCompra=" + valorCompra
                + ", formaPagamento='" + formaPagamento + '\''
                + '}';
    }
}
