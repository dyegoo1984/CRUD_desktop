package Telas;

import Classes.Cliente;
import javax.swing.JOptionPane;

public class EditarCadastroCliente extends javax.swing.JFrame {
    
    private Cliente c = new Cliente();
    
    public EditarCadastroCliente(Cliente c){
        initComponents();
        this.c = c;
//        txtNome.setText(this.c.getDadosPessoais().getNome());
//        txtCPF.setText(this.c.getDadosPessoais().getCpf());
//        txtRG.setText(this.c.getDadosPessoais().getRg());
//        txtRua.setText(this.c.getDadosPessoais().getEndereco().getRua());
//        txtNumero.setText(toString(this.c.getDadosPessoais().getEndereco().getNumero()));
//        txtComplemento.setText(this.c.getDadosPessoais().getEndereco().getComplemento());
//        txtBairro.setText(this.c.getDadosPessoais().getEndereco().getBairro());
//        txtCEP.setText(this.c.getDadosPessoais().getEndereco().getCep());
//        txtCidade.setText(this.c.getDadosPessoais().getEndereco().getCidade());
//        cbEstado.setSelectedItem(this.c.getDadosPessoais().getEndereco().getEstado());
//        txtTelefone1.setText(this.c.getDadosPessoais().getContato().getTelefone1());
//        txtTelefone2.setText(this.c.getDadosPessoais().getContato().getTelefone2());
//        txtEmail.setText(this.c.getDadosPessoais().getContato().getEmail());
    }

    public EditarCadastroCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBody = new javax.swing.JPanel();
        pnlDadosPessoais = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        pnlEndereco = new javax.swing.JPanel();
        txtRua = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        pnlContato = new javax.swing.JPanel();
        txtTelefone1 = new javax.swing.JTextField();
        lblTelefone1 = new javax.swing.JLabel();
        txtTelefone2 = new javax.swing.JTextField();
        lblTelefone2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        checkboxCiente = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBody.setToolTipText("Altere os dados necessários e clique em \"Salvar\"");

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Light", 2, 14))); // NOI18N

        lblNome.setText("Nome:");

        lblRG.setText("RG:");

        lblCPF.setText("CPF:");

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRG)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Light", 2, 14))); // NOI18N

        lblRua.setText("Rua:");

        lblNumero.setText("Número:");

        lblComplemento.setText("Complemento:");

        lblCep.setText("CEP:");

        lblBairro.setText("Bairro:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lblEstado.setText("Estado:");

        lblCidade.setText("Cidade:");

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCep))
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEstado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCEP)))
                    .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(lblCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Light", 0, 14))); // NOI18N

        lblTelefone1.setText("Telefone 1:");

        lblTelefone2.setText("Telefone 2:");

        lblEmail.setText("Email:");

        javax.swing.GroupLayout pnlContatoLayout = new javax.swing.GroupLayout(pnlContato);
        pnlContato.setLayout(pnlContatoLayout);
        pnlContatoLayout.setHorizontalGroup(
            pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContatoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefone2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTelefone2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(txtTelefone1)))
                .addContainerGap())
        );
        pnlContatoLayout.setVerticalGroup(
            pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkboxCiente.setFont(new java.awt.Font("Cantarell Light", 2, 14)); // NOI18N
        checkboxCiente.setText("\"Estou ciente que deve-se alterar somente os dados necessários\"");
        checkboxCiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxCienteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkboxCiente, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(checkboxCiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxCienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxCienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxCienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try{
//            if(!checkboxCiente.isSelected()){
//                JOptionPane.showMessageDialog(null, "Confirme que está ciente da importância de alterar somente os dados necessários.");
//            }
//            else{
//                if(!txtNome.getText().isEmpty()){
//                    this.c.getDadosPessoais().setNome(txtNome.getText());
//                }
//                if(!txtCPF.getText().isEmpty()){
//                    this.c.getDadosPessoais().setCpf(txtCPF.getText());
//                }
//                if(!txtRG.getText().isEmpty()){
//                    this.c.getDadosPessoais().setRg(txtRG.getText());
//                }
//                if(!txtRua.getText().isEmpty()){
//                    this.c.getDadosPessoais().getEndereco().setRua(txtRua.getText());
//                }
//                if(!txtNumero.getText().isEmpty()){
//                    this.c.getDadosPessoais().getEndereco().setNumero(Integer.parseInt(txtNumero.getText()));
//                }
//                if(!txtComplemento.getText().isEmpty()){
//                    this.c.getDadosPessoais().getEndereco().setComplemento(txtComplemento.getText());
//                }
//                if(!txtBairro.getText().isEmpty()){
//                    this.c.getDadosPessoais().getEndereco().setBairro(txtBairro.getText());
//                }
//                if(!txtCEP.getText().isEmpty()){
//                    this.c.getDadosPessoais().getEndereco().setCep(txtCEP.getText());
//                }
//                if(!txtCidade.getText().isEmpty()){
//                    this.c.getDadosPessoais().getEndereco().setCidade(txtCidade.getText());
//                }
//                if(cbEstado.getSelectedIndex() != 0){
//                    this.c.getDadosPessoais().getEndereco().setEstado(cbEstado.getSelectedItem().toString());
//                }
//                if(!txtTelefone1.getText().isEmpty()){
//                    this.c.getDadosPessoais().getContato().setTelefone1(txtTelefone1.getText());
//                }
//                if(!txtTelefone2.getText().isEmpty()){
//                    this.c.getDadosPessoais().getContato().setTelefone2(txtTelefone2.getText());
//                }
//                if(!txtEmail.getText().isEmpty()){
//                    this.c.getDadosPessoais().getContato().setEmail(txtEmail.getText());
//                }
//                JOptionPane.showMessageDialog(null, "Ficha Cadastral Atualizada com sucesso!");
//                dispose();
//            }
//        }
//        catch(Exception e){
//            
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JCheckBox checkboxCiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTelefone2;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlContato;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone1;
    private javax.swing.JTextField txtTelefone2;
    // End of variables declaration//GEN-END:variables

    private String toString(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
