package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import objetos.TableModel;

public class gerenciarMesas {

    private List<TableModel> tables; // Lista de objetos TableModel para representar as mesas
    private int idMesas; // Variável para armazenar o ID da mesa atualmente selecionada

    public int getIdMesas() {
        return idMesas;
    }

    public gerenciarMesas(int idMesas) {
        this.tables = new ArrayList<>(); // Inicializa a lista de mesas
        // Cria 16 mesas inicialmente disponíveis e as adiciona à lista
        for (int i = 1; i <= 16; i++) {
            tables.add(new TableModel(i, true, null));
        }
    }

    // Retorna todas as mesas disponíveis
    public List<TableModel> getAllAvailableTables() {
        List<TableModel> availableTables = new ArrayList<>();
        for (TableModel table : tables) {
            if (table.isAvailable()) {
                availableTables.add(table);
            }
        }
        return availableTables;
    }

    // Abre uma mesa com o ID especificado
    public void openTable(int tableId) {
        for (TableModel table : tables) {
            if (table.getTableId() == tableId && table.isAvailable()) {
                table.setAvailable(false); // Marca a mesa como ocupada
                table.setOpenedAt(LocalDateTime.now()); // Define o horário de abertura da mesa
                System.out.println("Mesa " + tableId + " ocupada às " + table.getOpenedAt());
                idMesas = tableId; // Define o ID da mesa atualmente selecionada
                return;
            }
        }
        System.out.println("Mesa " + tableId + " não está disponível ou já está ocupada.");
    }

    // Verifica se uma mesa com o ID especificado está disponível
    public boolean isTableAvailable(int tableId) {
        for (TableModel table : tables) {
            if (table.getTableId() == tableId && table.isAvailable()) {
                return true; // Retorna verdadeiro se a mesa está disponível
            }
        }
        return false; // Retorna falso se a mesa não está disponível
    }

    // Fecha uma mesa com o ID especificado
    public void closeTable(int tableId) {
        for (TableModel table : tables) {
            if (table.getTableId() == tableId &&!table.isAvailable()) {
                table.setAvailable(true); // Marca a mesa como disponível
                table.setOpenedAt(null); // Limpa o horário de abertura da mesa
                System.out.println("Mesa " + tableId + " fechada.");
                return;
            }
        }
        System.out.println("Mesa " + tableId + " não está ocupada.");
    }

    // Encontra e retorna o objeto TableModel correspondente ao ID especificado
    public TableModel findTableById(int tableId) {
        for (TableModel table : tables) {
            if (table.getTableId() == tableId) {
                return table; // Retorna o objeto TableModel se encontrado
            }
        }
        return null; // Retorna nulo se o ID da mesa não for encontrado
    }

    // Retorna todas as mesas
    public List<TableModel> getAllTables() {
        return tables;
    }

    // Atualiza o status de uma mesa com o ID especificado
    public void setTableStatus(int tableId, boolean isAvailable) {
        TableModel table = findTableById(tableId);
        if (table!= null) {
            table.setAvailable(isAvailable);
        }
    }
}