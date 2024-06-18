/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telaTeste1;

import controller.PagamentoController;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import telaTeste1.Servico;

/**
 *
 * @author jvale
 */
public class Pagamento extends javax.swing.JFrame {

   private int idMesa;
    private PagamentoController tableController;
    private String formaPagamentoSelecionada;

    public Pagamento(int idMesa, double subtotal) {
        initComponents();
    
        setInitialValues();
        makeTextFieldsNonFocusable();
        formaPagamentoSelecionada = ""; // Inicialmente nenhuma forma de pagamento selecionada
        MesaTextField3.setText("" + idMesa);
        subtotalTextField.setText(""+subtotal);

    }

    private void setInitialValues() {
        MesaTextField3.setText(String.valueOf(idMesa));
        ServiçoTextField5.setText("10%");
    }

    private void makeTextFieldsNonFocusable() {
        MesaTextField3.setEditable(false);
        MesaTextField3.setFocusable(false);

        TESTETextField6.setEditable(false);
        TESTETextField6.setFocusable(false);

        PagoTextField2.setEditable(false); // Começa não editável

        TrocoTextField4.setEditable(false); // TrocoTextField4 não editável
        TrocoTextField4.setFocusable(false); // TrocoTextField4 não focável
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subtotalTextField1 = new javax.swing.JTextField();
        MesaTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sairPagamento = new javax.swing.JButton();
        subtotalTextField = new javax.swing.JTextField();
        ServiçoTaxa = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        ValorPago = new javax.swing.JLabel();
        Troco = new javax.swing.JLabel();
        FormatodePagamentoPix = new javax.swing.JButton();
        FormatodePagamentoCredito = new javax.swing.JButton();
        FormatodePagamentoDebito = new javax.swing.JButton();
        FormatodePagamentoDinheiro = new javax.swing.JButton();
        PagoTextField2 = new javax.swing.JTextField();
        MesaTextField3 = new javax.swing.JTextField();
        TrocoTextField4 = new javax.swing.JTextField();
        MesaId1 = new javax.swing.JLabel();
        ServiçoTextField5 = new javax.swing.JTextField();
        TESTETextField6 = new javax.swing.JTextField();
        PAGAMENTO1 = new javax.swing.JLabel();
        pagarevoltarServiço = new javax.swing.JButton();

        subtotalTextField1.setBackground(new java.awt.Color(51, 0, 0));
        subtotalTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        subtotalTextField1.setForeground(new java.awt.Color(255, 204, 0));
        subtotalTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalTextField1ActionPerformed(evt);
            }
        });

        MesaTextField4.setBackground(new java.awt.Color(51, 0, 0));
        MesaTextField4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        MesaTextField4.setForeground(new java.awt.Color(255, 204, 0));
        MesaTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("PAGAMENTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel1)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        sairPagamento.setBackground(new java.awt.Color(51, 0, 0));
        sairPagamento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        sairPagamento.setForeground(new java.awt.Color(255, 204, 0));
        sairPagamento.setText("SAIR");
        sairPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairPagamentoActionPerformed(evt);
            }
        });

        subtotalTextField.setBackground(new java.awt.Color(51, 0, 0));
        subtotalTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        subtotalTextField.setForeground(new java.awt.Color(255, 204, 0));
        subtotalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalTextFieldActionPerformed(evt);
            }
        });

        ServiçoTaxa.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        ServiçoTaxa.setForeground(new java.awt.Color(51, 0, 0));
        ServiçoTaxa.setText("Serviço");

        Subtotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Subtotal.setForeground(new java.awt.Color(51, 0, 0));
        Subtotal.setText("TOTAL:");

        ValorPago.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        ValorPago.setForeground(new java.awt.Color(51, 0, 0));
        ValorPago.setText("PAGO:");

        Troco.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Troco.setForeground(new java.awt.Color(51, 0, 0));
        Troco.setText("TROCO:");

        FormatodePagamentoPix.setBackground(new java.awt.Color(51, 0, 0));
        FormatodePagamentoPix.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        FormatodePagamentoPix.setForeground(new java.awt.Color(255, 204, 0));
        FormatodePagamentoPix.setText("PIX");
        FormatodePagamentoPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatodePagamentoPixActionPerformed(evt);
            }
        });

        FormatodePagamentoCredito.setBackground(new java.awt.Color(51, 0, 0));
        FormatodePagamentoCredito.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        FormatodePagamentoCredito.setForeground(new java.awt.Color(255, 204, 0));
        FormatodePagamentoCredito.setText("CRÉDITO");
        FormatodePagamentoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatodePagamentoCreditoActionPerformed(evt);
            }
        });

        FormatodePagamentoDebito.setBackground(new java.awt.Color(51, 0, 0));
        FormatodePagamentoDebito.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        FormatodePagamentoDebito.setForeground(new java.awt.Color(255, 204, 0));
        FormatodePagamentoDebito.setText("DÉBITO");
        FormatodePagamentoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatodePagamentoDebitoActionPerformed(evt);
            }
        });

        FormatodePagamentoDinheiro.setBackground(new java.awt.Color(51, 0, 0));
        FormatodePagamentoDinheiro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        FormatodePagamentoDinheiro.setForeground(new java.awt.Color(255, 204, 0));
        FormatodePagamentoDinheiro.setText("DINHEIRO");
        FormatodePagamentoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatodePagamentoDinheiroActionPerformed(evt);
            }
        });

        PagoTextField2.setBackground(new java.awt.Color(51, 0, 0));
        PagoTextField2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        PagoTextField2.setForeground(new java.awt.Color(255, 204, 0));
        PagoTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoTextField2ActionPerformed(evt);
            }
        });

        MesaTextField3.setBackground(new java.awt.Color(51, 0, 0));
        MesaTextField3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        MesaTextField3.setForeground(new java.awt.Color(255, 204, 0));
        MesaTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaTextField3ActionPerformed(evt);
            }
        });

        TrocoTextField4.setBackground(new java.awt.Color(51, 0, 0));
        TrocoTextField4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        TrocoTextField4.setForeground(new java.awt.Color(255, 204, 0));
        TrocoTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrocoTextField4ActionPerformed(evt);
            }
        });

        MesaId1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        MesaId1.setForeground(new java.awt.Color(51, 0, 0));
        MesaId1.setText("MESA:");

        ServiçoTextField5.setBackground(new java.awt.Color(51, 0, 0));
        ServiçoTextField5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        ServiçoTextField5.setForeground(new java.awt.Color(255, 204, 0));
        ServiçoTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiçoTextField5ActionPerformed(evt);
            }
        });

        TESTETextField6.setBackground(new java.awt.Color(51, 0, 0));
        TESTETextField6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        TESTETextField6.setForeground(new java.awt.Color(255, 204, 0));
        TESTETextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TESTETextField6ActionPerformed(evt);
            }
        });

        PAGAMENTO1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        PAGAMENTO1.setForeground(new java.awt.Color(51, 0, 0));
        PAGAMENTO1.setText("PAGAMENTO");

        pagarevoltarServiço.setBackground(new java.awt.Color(51, 0, 0));
        pagarevoltarServiço.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        pagarevoltarServiço.setForeground(new java.awt.Color(255, 204, 0));
        pagarevoltarServiço.setText("VOLTAR");
        pagarevoltarServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarevoltarServiçoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PAGAMENTO1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Troco, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ValorPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ServiçoTaxa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MesaId1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TESTETextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrocoTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesaTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PagoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiçoTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FormatodePagamentoCredito)
                        .addGap(29, 29, 29)
                        .addComponent(FormatodePagamentoDebito)
                        .addGap(27, 27, 27)
                        .addComponent(FormatodePagamentoPix)
                        .addGap(35, 35, 35)
                        .addComponent(FormatodePagamentoDinheiro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagarevoltarServiço)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(287, 287, 287))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormatodePagamentoPix)
                    .addComponent(FormatodePagamentoCredito)
                    .addComponent(FormatodePagamentoDebito)
                    .addComponent(FormatodePagamentoDinheiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TESTETextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PAGAMENTO1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MesaTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MesaId1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Subtotal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ServiçoTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ServiçoTaxa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PagoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValorPago))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TrocoTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Troco))
                        .addGap(51, 51, 51)
                        .addComponent(pagarevoltarServiço))
                    .addComponent(sairPagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairPagamentoActionPerformed
        dispose();
    }//GEN-LAST:event_sairPagamentoActionPerformed

    private void subtotalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalTextFieldActionPerformed
      
    }//GEN-LAST:event_subtotalTextFieldActionPerformed

    private void FormatodePagamentoPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatodePagamentoPixActionPerformed
        TESTETextField6.setText("Pix");
        formaPagamentoSelecionada = "Pix";
        PagoTextField2.setEditable(true);
        PagoTextField2.setFocusable(true);
        PagoTextField2.setText(""); // Limpa o campo
        // Desabilita a edição do campo de serviço
        ServiçoTextField5.setEditable(false);
        ServiçoTextField5.setFocusable(false);
    }//GEN-LAST:event_FormatodePagamentoPixActionPerformed

    private void FormatodePagamentoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatodePagamentoCreditoActionPerformed
        TESTETextField6.setText("Crédito");
        formaPagamentoSelecionada = "Crédito";
        PagoTextField2.setEditable(true);
        PagoTextField2.setFocusable(true);
        PagoTextField2.setText("");; // Limpa o campo
        // Desabilita a edição do campo de serviço
        ServiçoTextField5.setEditable(false);
        ServiçoTextField5.setFocusable(false);
    }//GEN-LAST:event_FormatodePagamentoCreditoActionPerformed

    private void FormatodePagamentoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatodePagamentoDebitoActionPerformed
        TESTETextField6.setText("Débito");
        formaPagamentoSelecionada = "Débito";
        PagoTextField2.setEditable(true);
        PagoTextField2.setFocusable(true);
        PagoTextField2.setText(""); // Limpa o campo
        // Desabilita a edição do campo de serviço
        ServiçoTextField5.setEditable(false);
        ServiçoTextField5.setFocusable(false);
    }//GEN-LAST:event_FormatodePagamentoDebitoActionPerformed

    private void FormatodePagamentoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatodePagamentoDinheiroActionPerformed
        TESTETextField6.setText("Dinheiro");
        formaPagamentoSelecionada = "Dinheiro";
        PagoTextField2.setEditable(true); // Torna o campo editável para digitar o valor pago
        PagoTextField2.setText("");
        // Desabilita a edição do campo de serviço
        ServiçoTextField5.setEditable(false);
        ServiçoTextField5.setFocusable(false);
    }//GEN-LAST:event_FormatodePagamentoDinheiroActionPerformed

    private void subtotalTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalTextField1ActionPerformed

    private void PagoTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoTextField2ActionPerformed
        try {
            double valorPago = Double.parseDouble(PagoTextField2.getText());
            double subtotal = Double.parseDouble(subtotalTextField.getText());

            // Verifica se o valor pago é menor ou igual ao subtotal
            if (valorPago <= subtotal) {
                JOptionPane.showMessageDialog(this, "O valor pago deve ser maior que o subtotal.", "Erro", JOptionPane.ERROR_MESSAGE);
                PagoTextField2.setText("");
                TrocoTextField4.setText("");
                return; // Encerra o método sem continuar o processamento
            }

            // Atualiza os valores no controlador
            tableController.setSubtotal(subtotal);
            tableController.setValorPago(valorPago);

            // Se a forma de pagamento selecionada for "Dinheiro", permitir o valor pago
            if (formaPagamentoSelecionada.equals("Dinheiro")) {
                double troco = tableController.calcularTroco();
                TrocoTextField4.setText(String.format("%.2f", troco));
            } else {
                // Caso contrário, apenas calcular o total
                double total = tableController.calcularTotal();
                // Se o valor pago é suficiente para cobrir o total, calcula o troco
                if (valorPago >= total) {
                    double troco = valorPago - total;
                    TrocoTextField4.setText(String.format("%.2f", troco));
                } else {
                    JOptionPane.showMessageDialog(this, "O valor pago é insuficiente para cobrir o total.", "Erro", JOptionPane.ERROR_MESSAGE);
                    TrocoTextField4.setText("");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um valor numérico válido para o valor pago.", "Erro", JOptionPane.ERROR_MESSAGE);
            PagoTextField2.setText("");
            TrocoTextField4.setText("");
        }
    }//GEN-LAST:event_PagoTextField2ActionPerformed

    private void MesaTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesaTextField3ActionPerformed

    private void TrocoTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocoTextField4ActionPerformed

    }//GEN-LAST:event_TrocoTextField4ActionPerformed

    private void MesaTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesaTextField4ActionPerformed

    private void ServiçoTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiçoTextField5ActionPerformed

    }//GEN-LAST:event_ServiçoTextField5ActionPerformed

    private void TESTETextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TESTETextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TESTETextField6ActionPerformed

    private void pagarevoltarServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarevoltarServiçoActionPerformed
        // Obter os dados necessários do pagamento
        LocalDate data = LocalDate.now();
        String numeroVenda = MesaTextField3.getText(); // ou outra forma de obter o número da venda
        BigDecimal desconto = new BigDecimal("0.00"); // lógica para obter desconto, se aplicável
        BigDecimal valorPago = new BigDecimal(PagoTextField2.getText()); // valor que foi pago
        String formaPagamento = formaPagamentoSelecionada; // forma de pagamento selecionada

        // Atualizar a tabela Financeira com os dados do pagamento
        Financeiro telaFinanceira = new Financeiro();
        telaFinanceira.atualizarTabela(data, numeroVenda, desconto, valorPago, formaPagamento);

        // Fechar a janela atual (Pagamento)
        dispose();
    }//GEN-LAST:event_pagarevoltarServiçoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               int idMesa = 1; // Replace with actual idMesa value
                double subtotal = 50.0;
                new Pagamento(idMesa, subtotal).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FormatodePagamentoCredito;
    private javax.swing.JButton FormatodePagamentoDebito;
    private javax.swing.JButton FormatodePagamentoDinheiro;
    private javax.swing.JButton FormatodePagamentoPix;
    private javax.swing.JLabel MesaId1;
    private javax.swing.JTextField MesaTextField3;
    private javax.swing.JTextField MesaTextField4;
    private javax.swing.JLabel PAGAMENTO1;
    private javax.swing.JTextField PagoTextField2;
    private javax.swing.JLabel ServiçoTaxa;
    private javax.swing.JTextField ServiçoTextField5;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JTextField TESTETextField6;
    private javax.swing.JLabel Troco;
    private javax.swing.JTextField TrocoTextField4;
    private javax.swing.JLabel ValorPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pagarevoltarServiço;
    private javax.swing.JButton sairPagamento;
    private javax.swing.JTextField subtotalTextField;
    private javax.swing.JTextField subtotalTextField1;
    // End of variables declaration//GEN-END:variables
}
