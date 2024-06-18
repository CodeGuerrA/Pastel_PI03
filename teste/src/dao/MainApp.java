/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexaoBD.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            // Aqui você pode executar operações com o banco de dados
            String sql = "SELECT * FROM sua_tabela";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                
                while (rs.next()) {
                    // Processar os resultados conforme necessário
                    String nome = rs.getString("nome");
                    double preco = rs.getDouble("preco");
                    System.out.println("Nome: " + nome + ", Preço: " + preco);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}