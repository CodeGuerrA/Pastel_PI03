/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import controller.gerenciarPedidos;
import java.util.List;
import objetos.Pedidos;

public class Comandas {

    private gerenciarPedidos gerenciador;

    private int idMesaAtual; // Atributo para armazenar o ID da mesa atual

    public Comandas(gerenciarPedidos gerenciador) {
        this.gerenciador = gerenciador;
        this.idMesaAtual = 0; // Inicializa com 0 ou outro valor padrão, indicando nenhuma mesa selecionada
    }

    public void setIdMesaAtual(int idMesa) {
        this.idMesaAtual = idMesa;
    }

    public int getIdMesaAtual() {
        return idMesaAtual;
    }

    public void adicionarPedido(String nome, Double preco) {
        gerenciador.adicionarPedido(idMesaAtual, nome, preco);
    }

    public void removerPedido(String nome) {
        gerenciador.removerPedido(idMesaAtual, nome);
    }

    public double getSubtotal() {
        return gerenciador.calcularSubtotal(idMesaAtual);
    }

    public List<Pedidos> getPedidos() {
        return gerenciador.getPedidosPorMesa(idMesaAtual);
    }
}
