/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexaoBD.DatabaseConnection;
import objetos.TableModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MesaDAO {
    public List<TableModel> getAllMesas() {
        List<TableModel> tables = new ArrayList<>();
        String sql = "SELECT * FROM mesas";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                TableModel mesa = new TableModel(
                        rs.getInt("id"),
                        rs.getBoolean("disponivel"),
                        rs.getTimestamp("aberta_em").toLocalDateTime()
                );
                tables.add(mesa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }

    // Outros métodos para inserir, atualizar e deletar mesas
}