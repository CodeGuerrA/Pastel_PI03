package objetos;

import java.time.LocalDateTime;

public class TableModel {
    private int tableId; // Identificador da mesa
    private boolean available; // Indica se a mesa está disponível (true) ou ocupada (false)
    private LocalDateTime openedAt; // Data e hora de abertura da mesa

    // Construtor para inicializar os atributos da mesa
    public TableModel(int tableId, boolean available, LocalDateTime openedAt) {
        this.tableId = tableId; // Inicializa o identificador da mesa com o valor passado como parâmetro
        this.available = available; // Inicializa a disponibilidade da mesa com o valor passado como parâmetro
        this.openedAt = openedAt; // Inicializa a data e hora de abertura da mesa com o valor passado como parâmetro
    }

    // Getter para obter o identificador da mesa
    public int getTableId() {
        return tableId;
    }

    // Setter para definir o identificador da mesa
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    // Método para verificar se a mesa está disponível
    public boolean isAvailable() {
        return available;
    }

    // Setter para definir a disponibilidade da mesa
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getter para obter a data e hora de abertura da mesa
    public LocalDateTime getOpenedAt() {
        return openedAt;
    }

    // Setter para definir a data e hora de abertura da mesa
    public void setOpenedAt(LocalDateTime openedAt) {
        this.openedAt = openedAt;
    }

    // Método para retornar a cor da mesa com base na disponibilidade
    public String getTableColor() {
        if (available) {
            return "Green"; // Mesa livre, cor verde
        } else {
            return "Red"; // Mesa ocupada, cor vermelha
        }
    }
}