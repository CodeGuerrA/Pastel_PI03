package controller;

import java.util.ArrayList;
import java.util.List;
import objetos.Pedidos;

public class gerenciarPedidos {
    private List<Pedidos>[] pedidosPorMesa; // Array de listas para armazenar os pedidos por mesa

    // Construtor da classe

    public gerenciarPedidos(int numMesas) {
        // Inicializa o array de listas com base no número de mesas
        pedidosPorMesa = new List[numMesas + 1]; // +1 para indexar de 1 até numMesas
        
        for (int i = 1; i <= numMesas; i++) {
            pedidosPorMesa[i] = new ArrayList<>(); // Cada mesa tem sua própria lista de pedidos
        }
    }

    // Método para adicionar um novo pedido à lista da mesa especificada
    public void adicionarPedido(int idMesa, String nome, Double preco) {
        // Verifica se o nome e o preço do pedido são válidos
        if (nome == null || nome.trim().isEmpty() || preco == null || preco <= 0) {
            throw new IllegalArgumentException("Nome do pedido e preço devem ser válidos.");
        }

        // Cria um novo objeto Pedido com as informações fornecidas
        Pedidos novoPedido = new Pedidos(nome.trim(), preco, idMesa);
        pedidosPorMesa[idMesa].add(novoPedido); // Adiciona o novo pedido à lista da mesa
        System.out.println("Pedido adicionado para a mesa " + idMesa + ". Tamanho da lista: " + pedidosPorMesa[idMesa].size());
    }

    // Método para remover um pedido da lista da mesa especificada
    public void removerPedido(int idMesa, String nome) {
        // Verifica se o nome do pedido é válido
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do pedido deve ser válido.");
        }

        // Obtém a lista de pedidos da mesa específica
        List<Pedidos> pedidosDaMesa = pedidosPorMesa[idMesa];
        
        // Itera sobre a lista de pedidos da mesa usando um iterator para poder remover itens durante a iteração
        for (int i = 0; i < pedidosDaMesa.size(); i++) {
            Pedidos pedidoAtual = pedidosDaMesa.get(i);
            // Verifica se o pedido atual possui o mesmo nome fornecido
            if (pedidoAtual.getItens().equals(nome.trim())) {
                pedidosDaMesa.remove(i); // Remove o pedido da lista da mesa
                System.out.println("Pedido removido para a mesa " + idMesa + ". Tamanho da lista: " + pedidosDaMesa.size());
                return;
            }
        }

        // Se não encontrou o pedido para remover
        System.out.println("Pedido não encontrado para a mesa " + idMesa + ". Tamanho da lista: " + pedidosDaMesa.size());
    }

    // Método para calcular o subtotal dos pedidos para uma determinada mesa
    public double calcularSubtotal(int idMesa) {
        double subtotal = 0.0;
        // Obtém a lista de pedidos da mesa específica
        List<Pedidos> pedidosDaMesa = pedidosPorMesa[idMesa];
        
        // Itera sobre a lista de pedidos da mesa
        for (Pedidos pedido : pedidosDaMesa) {
            subtotal += pedido.getValores(); // Adiciona o valor do pedido ao subtotal
        }
        return subtotal; // Retorna o subtotal calculado
    }

    // Método para retornar a lista de todos os pedidos de uma determinada mesa
    public List<Pedidos> getPedidosPorMesa(int idMesa) {
        return pedidosPorMesa[idMesa];
    }
}
