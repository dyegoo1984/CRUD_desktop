package Telas;

import Classes.Funcionario;
import javax.swing.JOptionPane;

public class EditarCadastroFuncionario extends javax.swing.JFrame {
    
    Funcionario f = new Funcionario();
    
    public EditarCadastroFuncionario(Funcionario f) {
        initComponents();
        this.f = f;
//        txtNome.setText(this.f.getDadosPessoais().getNome());
//        txtCPF.setText(this.f.getDadosPessoais().getCpf());
//        txtRG.setText(this.f.getDadosPessoais().getRg());
//        txtCargo.setText(this.f.getCargo());
//        txtRemuneracao.setText(Double.toString(this.f.getRemuneracao()));
//        txtComissao.setText(Integer.toString(this.f.getPercentualComissao()));
//        txtRua.setText(this.f.getDadosPessoais().getEndereco().getRua());
//        txtNumero.setText(toStringo(this.f.getDadosPessoais().getEndereco().getNumero()));
//        txtComplemento.setText(this.f.getDadosPessoais().getEndereco().getComplemento());
//        txtBairro.setText(this.f.getDadosPessoais().getEndereco().getBairro());
//        txtCEP.setText(this.f.getDadosPessoais().getEndereco().getCep());
//        txtCidade.setText(this.f.getDadosPessoais().getEndereco().getCidade());
//        cbEstado.setSelectedItem(this.f.getDadosPessoais().getEndereco().getEstado());
//        txtTelefone1.setText(this.f.getDadosPessoais().getContato().getTelefone1());
//        txtTelefone2.setText(this.f.getDadosPessoais().getContato().getTelefone2());
//        txtEmail.setText(this.f.getDadosPessoais().getContato().getEmail());
    }

    public EditarCadastroFuncionario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDadosPessoais = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtRemuneracao = new javax.swing.JTextField();
        txtComissao = new javax.swing.JTextField();
        lblComissao = new javax.swing.JLabel();
        lblRemuneracao = new javax.swing.JLabel();
        pnlEndereco = new javax.swing.JPanel();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        pnlContato = new javax.swing.JPanel();
        txtTelefone1 = new javax.swing.JTextField();
        txtTelefone2 = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTelefone1 = new javax.swing.JLabel();
        lblTelefone2 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        checkboxCiente = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Light", 2, 14))); // NOI18N

        lblNome.setText("Nome:");

        lblCPF.setText("CPF:");

        lblRG.setText("RG:");

        lblCargo.setText("Cargo:");

        lblComissao.setText("Comissão: (%)");

        lblRemuneracao.setText("Remuneração:");

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(lblRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRemuneracao)
                            .addComponent(lblCargo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txtRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblComissao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(lblRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComissao)
                    .addComponent(lblRemuneracao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Light", 2, 14))); // NOI18N

        lblRua.setText("Rua:");

        lblNumero.setText("Numero:");

        lblComplemento.setText("Complemento:");

        lblCEP.setText("CEP:");

        lblBairro.setText("Bairro:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lblEstado.setText("Estado:");

        lblCidade.setText("Cidade:");

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBairro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblComplemento))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEnderecoLayout.createSequentialGroup()
                                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(lblComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Light", 2, 14))); // NOI18N

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
                    .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelefone1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(txtTelefone2, javax.swing.GroupLayout.Alignment.LEADING)))
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

        btnSalvar.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 153, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        checkboxCiente.setFont(new java.awt.Font("Cantarell Light", 2, 14)); // NOI18N
        checkboxCiente.setText("\"Estou ciente que deve-se alterar somente os dados necessários\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkboxCiente, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(checkboxCiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        try{
//            if(!checkboxCiente.isSelected()){
//                JOptionPane.showMessageDialog(null, "Confirme que está ciente da importância de alterar somente os dados necessários.");
//            }
//            else{
//                if(!txtNome.getText().isEmpty()){
//                    this.f.getDadosPessoais().setNome(txtNome.getText());
//                }
//                if(!txtCPF.getText().isEmpty()){
//                    this.f.getDadosPessoais().setCpf(txtCPF.getText());
//                }
//                if(!txtRG.getText().isEmpty()){
//                    this.f.getDadosPessoais().setRg(txtRG.getText());
//                }
//                if(!txtCargo.getText().isEmpty()){
//                    this.f.setCargo(txtCargo.getText());
//                }
//                if(!txtRemuneracao.getText().isEmpty()){
//                    this.f.setRemuneracao(Double.parseDouble(txtRemuneracao.getText()));
//                }
//                if(!txtComissao.getText().isEmpty()){
//                    this.f.setPercentualComissao(Integer.parseInt(txtComissao.getText()));
//                }
//                if(!txtRua.getText().isEmpty()){
//                    this.f.getDadosPessoais().getEndereco().setRua(txtRua.getText());
//                }
//                if(!txtNumero.getText().isEmpty()){
//                    this.f.getDadosPessoais().getEndereco().setNumero(Integer.parseInt(txtNumero.getText()));
//                }
//                if(!txtComplemento.getText().isEmpty()){
//                    this.f.getDadosPessoais().getEndereco().setComplemento(txtComplemento.getText());
//                }
//                if(!txtBairro.getText().isEmpty()){
//                    this.f.getDadosPessoais().getEndereco().setBairro(txtBairro.getText());
//                }
//                if(!txtCEP.getText().isEmpty()){
//                    this.f.getDadosPessoais().getEndereco().setCep(txtCEP.getText());
//                }
//                if(!txtCidade.getText().isEmpty()){
//                    this.f.getDadosPessoais().getEndereco().setCidade(txtCidade.getText());
//                }
//                if(cbEstado.getSelectedIndex() != 0){
//                    this.f.getDadosPessoais().getEndereco().setEstado(cbEstado.getSelectedItem().toString());
//                }
//                if(!txtTelefone1.getText().isEmpty()){
//                    this.f.getDadosPessoais().getContato().setTelefone1(txtTelefone1.getText());
//                }
//                if(!txtTelefone2.getText().isEmpty()){
//                    this.f.getDadosPessoais().getContato().setTelefone2(txtTelefone2.getText());
//                }
//                if(!txtEmail.getText().isEmpty()){
//                    this.f.getDadosPessoais().getContato().setEmail(txtEmail.getText());
//                }
//                JOptionPane.showMessageDialog(null, "Ficha Cadastral Atualizada com sucesso!");
//                dispose();
//            }
//        }
//        catch(Exception e){
//            
//        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JCheckBox checkboxCiente;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComissao;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRemuneracao;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTelefone2;
    private javax.swing.JPanel pnlContato;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComissao;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRemuneracao;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone1;
    private javax.swing.JTextField txtTelefone2;
    // End of variables declaration//GEN-END:variables

    private String toStringo(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
