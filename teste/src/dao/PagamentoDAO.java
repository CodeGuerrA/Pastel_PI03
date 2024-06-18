/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexaoBD.DatabaseConnection;
import objetos.PagamentoModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PagamentoDAO {
    public List<PagamentoModel> getAllPagamentos() {
        List<PagamentoModel> pagamentos = new ArrayList<>();
        String sql = "SELECT * FROM pagamentos";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                PagamentoModel pagamento = new PagamentoModel(rs.getDouble("valor"), rs.getDouble("subtotal"), rs.getString("metodo_pagamento"));
                pagamentos.add(pagamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pagamentos;
    }

    public void addPagamento(PagamentoModel pagamento) {
        String sql = "INSERT INTO pagamentos (valor, subtotal, metodo_pagamento) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, pagamento.getValorPago());
            stmt.setDouble(2, pagamento.getSubtotal());
            stmt.setString(3, pagamento.getFormaPagamento());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Outros métodos para atualizar e deletar pagamentos
}