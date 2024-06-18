/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import objetos.FinanceiroModel;

public class FinanceiroController {

    private List<FinanceiroModel> listaFinanceiro = new ArrayList<>();
    
    public FinanceiroController() {
        this.listaFinanceiro = new ArrayList<>();
    }
    
    
    // Método para adicionar um novo FinaneceiroModel à lista
    public void adicionarFinaneceiro(LocalDate data, String numeroVenda, BigDecimal desconto, BigDecimal valorCompra, String formaPagamento) {
        FinanceiroModel novoFinaneceiro = new FinanceiroModel(data, numeroVenda, desconto, valorCompra, formaPagamento);
        listaFinanceiro.add(novoFinaneceiro);
    }

    // Método para buscar um FinaneceiroModel pelo número da venda
    public FinanceiroModel buscarPorNumeroVenda(String numeroVenda) {
        for (FinanceiroModel finaneceiro : listaFinanceiro) {
            if (finaneceiro.getNumeroVenda().equals(numeroVenda)) {
                return finaneceiro;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Método para atualizar um FinaneceiroModel existente
    public boolean atualizarFinaneceiro(String numeroVenda, LocalDate newData, BigDecimal newDesconto, BigDecimal newValorCompra, String newFormaPagamento) {
        for (FinanceiroModel finaneceiro : listaFinanceiro) {
            if (finaneceiro.getNumeroVenda().equals(numeroVenda)) {
                finaneceiro.setData(newData);
                finaneceiro.setDesconto(newDesconto);
                finaneceiro.setValorCompra(newValorCompra);
                finaneceiro.setFormaPagamento(newFormaPagamento);
                return true; // Retorna true se atualizar com sucesso
            }
        }
        return false; // Retorna false se não encontrar o finaneceiro para atualizar
    }

    // Método para deletar um FinaneceiroModel pelo número da venda
    public boolean deletarFinaneceiro(String numeroVenda) {
        for (FinanceiroModel finaneceiro : listaFinanceiro) {
            if (finaneceiro.getNumeroVenda().equals(numeroVenda)) {
                listaFinanceiro.remove(finaneceiro);
                return true; // Retorna true se deletar com sucesso
            }
        }
        return false; // Retorna false se não encontrar o finaneceiro para deletar
    }

    // Método para listar todos os FinaneceiroModel
    public List<FinanceiroModel> listarFinaneceiros() {
        return listaFinanceiro;
    }
}
