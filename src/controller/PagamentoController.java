package controller;

import java.time.LocalTime;
import objetos.PagamentoModel;

public class PagamentoController {

    private PagamentoModel model;
    private double taxaServicoGarcomPercentual;
    private gerenciarPedidos pedidosManager;
    private gerenciarMesas mesasManager; // Adicionar uma instância de gerenciarMesas

    public PagamentoController(int numMesas) {
        this.model = new PagamentoModel(0.0, 0.0, "");
        this.taxaServicoGarcomPercentual = 0.10;
        this.pedidosManager = new gerenciarPedidos(numMesas);
        this.mesasManager = new gerenciarMesas(numMesas); // Inicializar o gerenciarMesas com numMesas
    }

    // Métodos getter e setter
    public void setSubtotal(double subtotal) {
        model.setSubtotal(subtotal);
    }

    public void setValorPago(double valorPago) {
        model.setValorPago(valorPago);
    }

    public void setFormaPagamento(String formaPagamento) {
        model.setFormaPagamento(formaPagamento);
    }

    public void setTableStatus(int tableId, boolean isAvailable) {
        mesasManager.setTableStatus(tableId, isAvailable); // Corrigido para chamar o método correto
    }

    public double calcularTaxaServicoGarcom() {
        double subtotalPedidos = pedidosManager.calcularSubtotal(model.getIdMesa());
        return subtotalPedidos * taxaServicoGarcomPercentual;
    }

    public double calcularSubtotalComTaxaServico() {
        double subtotal = pedidosManager.calcularSubtotal(model.getIdMesa());
        double taxaServicoGarcom = calcularTaxaServicoGarcom();
        return subtotal + taxaServicoGarcom;
    }

    public double calcularTotal() {
        double subtotal = calcularSubtotalComTaxaServico();
        double descontoNoturno = subtotal * 0.05;
        double total = subtotal - descontoNoturno;

        LocalTime agora = LocalTime.now();
        if (agora.getHour() == 1) {
            total -= total * 0.05;
        }

        return total;
    }

    public double calcularTroco() {
        double total = calcularTotal();
        return model.getValorPago() - total;
    }

    public void realizarPagamento(String mesa) {
        double totalPagar = calcularTotal();
        double troco = calcularTroco();

        System.out.println("Pagamento realizado para mesa " + mesa);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("Valor pago: " + model.getValorPago());
        System.out.println("Troco: " + troco);
    }

    public double getSubtotal() {
        return model.getSubtotal();
    }
}
