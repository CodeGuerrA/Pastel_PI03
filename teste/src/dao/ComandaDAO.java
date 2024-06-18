/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexaoBD.DatabaseConnection;
import objetos.Comandas;
import controller.gerenciarMesas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComandaDAO {
    public List<Comandas> getAllComandas() {
        List<Comandas> comandas = new ArrayList<>();
        String sql = "SELECT * FROM comandas";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            while (rs.next()) {
                gerenciarMesas mesa = new gerenciarMesas(rs.getInt("id_mesa"));
                Comandas comanda = new Comandas(rs.getFloat("valor_total"), mesa);
                comandas.add(comanda);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comandas;
    }

    public void addComanda(Comandas comanda) {
        String sql = "INSERT INTO comandas (valor_total, id_mesa) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setFloat(1, comanda.getValorTotal());
            stmt.setInt(2, comanda.getMesa().getIdMesas()); // Assumindo que gerenciarMesas tem getIdMesas()
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Outros métodos para atualizar e deletar comandas
}