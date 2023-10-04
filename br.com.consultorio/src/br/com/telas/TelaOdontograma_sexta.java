/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telas;

import java.awt.Color;


/**
 *
 * @author MarioPedro
 */
public class TelaOdontograma_sexta extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaOdontograma_sexta
     */
    public TelaOdontograma_sexta() {
        initComponents();

        setLocation(818, 300);
    
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxCores = new javax.swing.JComboBox<>();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBoxCores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dente bom (Branco)", "D-1 (Azul)", "D-2 (Vermelho)", "D-3 (Verde)", "D-4 (Rosa)", "D-5 (Laranja)", "D-6 (Amarelo)" }));
        comboBoxCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCoresActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxCores, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 27, 150, -1));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Branco/D18-BRANCO-SUPERIOR.png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Branco/D18-BRANCO-MEIO.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Branco/D18-BRANCO-INFERIOR.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 119, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Branco/D18-BRANCO-SUPERIOR parte de cima.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String aux_cores = null;
    private void comboBoxCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCoresActionPerformed

        String corSelecionadaStr = comboBoxCores.getSelectedItem().toString();
        switch (corSelecionadaStr) {
            case "Dente bom (Branco)":

                aux_cores = "branco";
                break;

            case "D-1 (Azul)":

                aux_cores = "azul";
                break;
            case "D-2 (Vermelho)":

                aux_cores = "vermelho";
                break;
            case "D-3 (Verde)":
                aux_cores = "verde";

                break;

            case "D-5 (Laranja)":

                aux_cores = "laranja";
                break;

            case "D-4 (Rosa)":

                aux_cores = "rosa";
                break;

            case "D-6 (Amarelo)":

                aux_cores = "amarelo";

        }
    }//GEN-LAST:event_comboBoxCoresActionPerformed

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        ///Teste para oq os botoes irão fazer quando o cliente clicar
        ///Color corAtual = btn1.getBackground();
        /// JOptionPane.showMessageDialog(null, "Cor do botão 1: " + corAtual.toString());
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (aux_cores.equals("vermelho")) {

            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Vermelho/D18-VERMELHO-SUPERIOR.png")));
        } else if (aux_cores.equals("branco")) {
            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Branco/D18-BRANCO-SUPERIOR.png")));
        } else if (aux_cores.equals("azul")) {
            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Azul/D18-AZUL-SUPERIOR.png")));
        } else if (aux_cores.equals("verde")) {
            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Verde/D18-VERDE-SUPERIOR.png")));
        } else if (aux_cores.equals("laranja")) {
            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Laranja/D18-LARANJA-SUPERIOR.png")));
        } else if (aux_cores.equals("rosa")) {
            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Rosa/D18-ROSA-SUPERIOR.png")));
        } else if (aux_cores.equals("amarelo")) {
            btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Amarelo/D18-AMARELO-SUPERIOR.png")));
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (aux_cores.equals("vermelho")) {

            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Vermelho/D18-VERMELHO-MEIO.png")));
        } else if (aux_cores.equals("branco")) {
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Branco/D18-BRANCO-MEIO.png")));
        } else if (aux_cores.equals("azul")) {
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Azul/D18-AZUL-MEIO.png")));
        } else if (aux_cores.equals("verde")) {
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Verde/D18-VERDE-MEIO.png")));
        } else if (aux_cores.equals("laranja")) {
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Laranja/D18-LARANJA-MEIO.png")));
        } else if (aux_cores.equals("rosa")) {
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Rosa/D18-ROSA-MEIO.png")));
        } else if (aux_cores.equals("amarelo")) {
            btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Amarelo/D18-AMARELO-MEIO.png")));
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (aux_cores.equals("vermelho")) {

            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Vermelho/D18-VERMELHO-INFERIOR.png")));
        } else if (aux_cores.equals("branco")) {
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Branco/D18-BRANCO-INFERIOR.png")));
        } else if (aux_cores.equals("azul")) {
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Azul/D18-AZUL-INFERIOR.png")));
        } else if (aux_cores.equals("verde")) {
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Verde/D18-VERDE-INFERIOR.png")));
        } else if (aux_cores.equals("laranja")) {
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Laranja/D18-LARANJA-INFERIOR.png")));
        } else if (aux_cores.equals("rosa")) {
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Rosa/D18-ROSA-INFERIOR.png")));
        } else if (aux_cores.equals("amarelo")) {
            btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icones/D18/Amarelo/D18-AMARELO-INFERIOR.png")));
        }
    }//GEN-LAST:event_btn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JComboBox<String> comboBoxCores;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
