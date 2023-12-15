/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.View;

import br.edu.model.Utilitários;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class JogoView extends javax.swing.JFrame {

    /**
     * Creates new form JogoView
     */
    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    
    int VitoriaDoJogador1 = 0;
    int VitoriaDoJogador2 = 0;
    int PartidasEmpatadas = 0;

    public JogoView() {
        initComponents();
        
         Utilitários u = new Utilitários();
        u.InserirIcone(this);
        
        setLocationRelativeTo(null);
        B1.setContentAreaFilled(false);
        B2.setContentAreaFilled(false);
        B3.setContentAreaFilled(false);
        B4.setContentAreaFilled(false);
        B5.setContentAreaFilled(false);
        B6.setContentAreaFilled(false);
        B7.setContentAreaFilled(false);
        B8.setContentAreaFilled(false);
        B9.setContentAreaFilled(false);
        
        jButton1.setContentAreaFilled(false);
        jButton4.setContentAreaFilled(false);
        jButton5.setContentAreaFilled(false);
        
    }
    
    
    
    public void JogadorAtivo() {
        
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }
        
        JogadorVencedor("X");
        JogadorVencedor("O");
        
    }
    
    
    
    public void JogadorVencedor(String Jogador) {
        
        
        /******************* Verificando Linhas *********************/
        if (B1.getText().equals(Jogador) &&
                B2.getText().equals(Jogador) &&
                B3.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B4.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B6.getText().equals(Jogador)) {
            
            if (B4.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B7.getText().equals(Jogador) &&
                B8.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B7.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        /******************* Verificando Colunas *********************/
        if (B1.getText().equals(Jogador) &&
                B4.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B2.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B8.getText().equals(Jogador)) {
            
            if (B2.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B3.getText().equals(Jogador) &&
                B6.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B3.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        /******************* Verificando Diagonais *********************/
        if (B1.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        if (B3.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
            
            if (B3.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            
        }
        
        
        /******************* Verificando Empate *********************/
        if ( !B1.getText().equals("") &&
                !B2.getText().equals("") &&
                !B3.getText().equals("") &&
                !B4.getText().equals("") &&
                !B5.getText().equals("") &&
                !B6.getText().equals("") &&
                !B7.getText().equals("") &&
                !B8.getText().equals("") &&
                !B9.getText().equals("") ) {
            
            Vencedor("Empate");
        }
        
    }
    
    
    public void Vencedor(String JogadorVencedor) {
        
        if (JogadorVencedor.equals("Jogador 1")) {
            JOptionPane.showMessageDialog(JogoView.this, "Parabéns Jogador 1. Você venceu o Jogo!");
            VitoriaDoJogador1++;
            NumeroDeVitoriasJogador1.setText("Número de Vitórias: " + VitoriaDoJogador1);
            LimparCampos();
        }
        
        
        if (JogadorVencedor.equals("Jogador 2")) {
            JOptionPane.showMessageDialog(JogoView.this, "Parabéns Jogador 2. Você venceu o Jogo!");
            VitoriaDoJogador2++;
            NumeroDeVitoriasJogador2.setText("Número de Vitórias: " + VitoriaDoJogador2);
            LimparCampos();
        }
        
        
        if (JogadorVencedor.equals("Empate")) {
            JOptionPane.showMessageDialog(JogoView.this, "Jogo Empatado! Joguem Novamente!");
            PartidasEmpatadas++;
            NumeroDeEmpates.setText("Número de Empates: " + PartidasEmpatadas);
            LimparCampos();
        }
        
    }
    
    
    public void LimparCampos() {
        
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
        
        Jogador1Ativo = true;
        Jogador2Ativo = false;
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        B9 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NumeroDeVitoriasJogador1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NumeroDeVitoriasJogador2 = new javax.swing.JLabel();
        NumeroDeEmpates = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Zerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        getContentPane().add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 70, 60));

        B1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 70, 60));

        B2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 60, 60));

        B3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 70, 60));

        B4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, 60));

        B5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 60));

        B6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 70, 60));

        B7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 70, 60));

        B8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 60, 60));

        jButton5.setBackground(new java.awt.Color(67, 62, 96));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("VOLTAR");
        jButton5.setBorder(null);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        jButton1.setBackground(new java.awt.Color(67, 62, 96));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AJUDA");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 80, 30));

        jButton4.setBackground(new java.awt.Color(67, 62, 96));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SAIR");
        jButton4.setToolTipText("");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 80, 30));

        jPanel1.setBackground(new java.awt.Color(67, 62, 96));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(67, 62, 96));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informações do Jogo:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jogador 1 ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Simbolo: X");

        NumeroDeVitoriasJogador1.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDeVitoriasJogador1.setText("Número de Vitórias: 0");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jogador 2");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Simbolo: O");

        NumeroDeVitoriasJogador2.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDeVitoriasJogador2.setText("Número de Vitórias: 0");

        NumeroDeEmpates.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDeEmpates.setText("Número de Empates: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(jLabel2)
                            .addComponent(NumeroDeVitoriasJogador1)
                            .addComponent(NumeroDeVitoriasJogador2)
                            .addComponent(NumeroDeEmpates)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumeroDeVitoriasJogador1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(NumeroDeVitoriasJogador2)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(NumeroDeEmpates)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 190, 220));

        jPanel2.setBackground(new java.awt.Color(67, 62, 96));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(67, 62, 96));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Controles do Jogo:");

        Zerar.setText("Zerar");
        Zerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Zerar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Zerar)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 250, 70));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/JogoDaVelhaView.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -11, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if (Jogador1Ativo == true) {
            if(B8.getText().equals("")){
                B8.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B8.getText().equals("")){
                B8.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B8ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
if (Jogador1Ativo == true) {
            if(B1.getText().equals("")){
                B1.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B1.getText().equals("")){
                B1.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        this.dispose();
        new SelectView().setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new TelaDeAjuda1View().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void ZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZerarActionPerformed
        NumeroDeVitoriasJogador1.setText("Número de Vitórias:0");
        NumeroDeVitoriasJogador2.setText("Número de Vitórias:0");
        NumeroDeEmpates.setText("Número de Empates:0");
    }//GEN-LAST:event_ZerarActionPerformed

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        
    }//GEN-LAST:event_B1MouseClicked

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if (Jogador1Ativo == true) {
            if(B2.getText().equals("")){
                B2.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B2.getText().equals("")){
                B2.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if (Jogador1Ativo == true) {
            if(B3.getText().equals("")){
                B3.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B3.getText().equals("")){
                B3.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
       if (Jogador1Ativo == true) {
            if(B4.getText().equals("")){
                B4.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B4.getText().equals("")){
                B4.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (Jogador1Ativo == true) {
            if(B5.getText().equals("")){
                B5.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B5.getText().equals("")){
                B5.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
     if (Jogador1Ativo == true) {
            if(B6.getText().equals("")){
                B6.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B6.getText().equals("")){
                B6.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
      if (Jogador1Ativo == true) {
            if(B7.getText().equals("")){
                B7.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B7.getText().equals("")){
                B7.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
      if (Jogador1Ativo == true) {
            if(B9.getText().equals("")){
                B9.setText("X");
                JogadorAtivo();
            } 
        }   else {
            if(B9.getText().equals("")){
                B9.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(JogoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel NumeroDeEmpates;
    private javax.swing.JLabel NumeroDeVitoriasJogador1;
    private javax.swing.JLabel NumeroDeVitoriasJogador2;
    private javax.swing.JButton Zerar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
