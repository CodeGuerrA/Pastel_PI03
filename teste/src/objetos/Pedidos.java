package objetos;

public class Pedidos {

    private String itens; // Nome dos itens do pedido
    private Double valores; // Valor dos itens do pedido

    // Construtor para inicializar os atributos da classe
    public Pedidos(String itens, Double valores, int idMesas) {
        this.itens = itens; // Inicializa o nome dos itens do pedido com o valor passado como parâmetro
        this.valores = valores; // Inicializa o valor dos itens do pedido com o valor passado como parâmetro

    }

    // Getter para obter o nome dos itens do pedido
    public String getItens() {
        return itens;
    }

    // Setter para definir o nome dos itens do pedido
    public void setItens(String itens) {
        this.itens = itens;
    }

    // Getter para obter o valor dos itens do pedido
    public Double getValores() {
        return valores;
    }

    // Setter para definir o valor dos itens do pedido
    public void setValores(Double valores) {
        this.valores = valores;
    }

    // Sobrescrita do método toString para representar os dados do pedido como uma string
    @Override
    public String toString() {
        return "Pedido{"
                + "itens='" + itens + '\''
                + ", valores=" + valores
                + '}';
    }
}
