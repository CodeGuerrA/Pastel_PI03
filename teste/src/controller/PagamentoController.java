package controller;

import java.time.LocalTime;
import objetos.PagamentoModel;

public class PagamentoController {

    private PagamentoModel model;
    private double taxaServicoGarcomPercentual;
    private gerenciarPedidos pedidosManager; // Use the correct class name

    public PagamentoController(int numMesas) {
        this.model = new PagamentoModel(0.0, 0.0, "");
        this.taxaServicoGarcomPercentual = 0.10;
        this.pedidosManager = new gerenciarPedidos(numMesas); // Inicializa com o número de mesas
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

    public double calcularTaxaServicoGarcom() {
        // Obtém o subtotal dos pedidos da mesa
        double subtotalPedidos = pedidosManager.calcularSubtotal(model.getIdMesa());
        return subtotalPedidos * taxaServicoGarcomPercentual;
    }

    public double calcularSubtotalComTaxaServico() {
        double subtotal = pedidosManager.calcularSubtotal(model.getIdMesa());
        double taxaServicoGarcom = calcularTaxaServicoGarcom();
        return subtotal + taxaServicoGarcom;
    }

    public double calcularTotal() {
        double total = calcularSubtotalComTaxaServico();
        // Verificar se é 1 hora da manhã
        LocalTime agora = LocalTime.now();
        if (agora.getHour() == 1) {
            // Aplicar desconto de 5%
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
        // Lógica para realizar o pagamento
        System.out.println("Pagamento realizado para mesa " + mesa);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("Valor pago: " + model.getValorPago());
        System.out.println("Troco: " + troco);
    }

    public double getSubtotal() {
        return model.getSubtotal(); // Implement the getSubtotal() method
    }
}