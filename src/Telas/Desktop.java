package Telas;

import Classes.CadastroInformacoesPessoais;
import Classes.Cliente;
import Classes.Funcionario;
import Classes.ItensOrcamento;
import Classes.Orcamento;
import Classes.Usuario;
import Dados.ClienteDAO;
import Dados.Criptografia;
import Dados.FuncionarioDAO;
import Dados.ItensOrcamentoDAO;
import Dados.UsuarioDAO;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Desktop extends javax.swing.JFrame {
    
    private DefaultTableModel tabelaClientes;
    private DefaultTableModel tabelaFuncionarios;
    private DefaultTableModel TabelaUsuarios;
    private DefaultTableModel TabelaOrcamento;
    private DefaultTableModel TabelaValores;
    private int row = -1;
    Cliente cliente = new Cliente();
    ClienteDAO clienteDao = new ClienteDAO();
    Orcamento orcamento = new Orcamento();
    Funcionario funcionario = new Funcionario();
    FuncionarioDAO funcionarioDao = new FuncionarioDAO();
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDao = new UsuarioDAO();
    ItensOrcamento itensOrcamento = new ItensOrcamento();
    ItensOrcamento itemAtualizado = new ItensOrcamento();
    ItensOrcamentoDAO itensOrcamentoDao = new ItensOrcamentoDAO();
    Criptografia c = new Criptografia();

    public Desktop() {
        initComponents();
        CardLayout menu = (CardLayout) pnlAction.getLayout();
        menu.show(pnlAction, "login");
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "inicio");
        
        btnVisualizarCC.setEnabled(false);
        btnEditarCC.setEnabled(false);
        btnAtualizarCC.setEnabled(false);
        btnVisualizarCF.setEnabled(false);
        btnEditarCF.setEnabled(false);
        btnHistoricoCF.setEnabled(false);
        btnOrcamentos1.setEnabled(false);
        btnOrcamentos2.setEnabled(false);
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        lblImagemAbertura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlClientes = new javax.swing.JPanel();
        tpnlClientes = new javax.swing.JTabbedPane();
        pnlCadastrarClientes = new javax.swing.JPanel();
        pnlDadosPessoaisCC = new javax.swing.JPanel();
        lblNomeCC = new javax.swing.JLabel();
        txtNomeCC = new javax.swing.JTextField();
        lblCpfCC = new javax.swing.JLabel();
        txtCpfCC = new javax.swing.JTextField();
        txtRgCC = new javax.swing.JTextField();
        lblRgCC = new javax.swing.JLabel();
        pnlEnderecoCC = new javax.swing.JPanel();
        txtRuaCC = new javax.swing.JTextField();
        lblRuaCC = new javax.swing.JLabel();
        txtNumeroCC = new javax.swing.JTextField();
        lblNumeroCC = new javax.swing.JLabel();
        txtComplementoCC = new javax.swing.JTextField();
        lblComplementoCC = new javax.swing.JLabel();
        txtBairroCC = new javax.swing.JTextField();
        lblBairroCC = new javax.swing.JLabel();
        txtCepCC = new javax.swing.JTextField();
        lblCepCC = new javax.swing.JLabel();
        txtCidadeCC = new javax.swing.JTextField();
        lblCidadeCC = new javax.swing.JLabel();
        lblEstadoCC = new javax.swing.JLabel();
        cbEstadoCC = new javax.swing.JComboBox<>();
        pnlContatoCC = new javax.swing.JPanel();
        txtTelefoneCC = new javax.swing.JTextField();
        lblTelefone1CC = new javax.swing.JLabel();
        txtEmailCC = new javax.swing.JTextField();
        lblEmailCC = new javax.swing.JLabel();
        pnlVendedorCC = new javax.swing.JPanel();
        lblCodigoFuncionalCC = new javax.swing.JLabel();
        txtCodigoFuncionalCC = new javax.swing.JTextField();
        pnlHistoricoCC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistoricoCC = new javax.swing.JTextArea();
        btnSalvarCC = new javax.swing.JButton();
        pnlConsultarClientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsultaClientesCC = new javax.swing.JTable();
        btnEditarCC = new javax.swing.JButton();
        btnVisualizarCC = new javax.swing.JButton();
        btnAtualizarCC = new javax.swing.JButton();
        btnExcluirCC = new javax.swing.JButton();
        pnlOrcamentos = new javax.swing.JPanel();
        tpnlOrcamentos = new javax.swing.JTabbedPane();
        pnlCadastrarOrcamentos = new javax.swing.JPanel();
        pnlCadastroOrcamentoCO = new javax.swing.JPanel();
        txtCodigoClienteCO = new javax.swing.JTextField();
        txtCodigoVendedorCO = new javax.swing.JTextField();
        txtCustoCO = new javax.swing.JTextField();
        txtDataCO = new javax.swing.JTextField();
        lblDataCO = new javax.swing.JLabel();
        lblCodigoClienteCO = new javax.swing.JLabel();
        lblCodigoVendedorCO = new javax.swing.JLabel();
        lblCustoCO = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDetalhesNegociacaoCO = new javax.swing.JTextArea();
        lblDetalhesNegociacaoCO = new javax.swing.JLabel();
        btnSalvarCO = new javax.swing.JButton();
        pnlConsultarOrcamentos = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblOrcamentoCO = new javax.swing.JTable();
        btnVisualizarCO = new javax.swing.JButton();
        btnExcluirCO = new javax.swing.JButton();
        pnlFuncionarios = new javax.swing.JPanel();
        tpnlFuncionarios = new javax.swing.JTabbedPane();
        pnlCadastroFuncionarios = new javax.swing.JPanel();
        pnlDadosPessoaisCF = new javax.swing.JPanel();
        txtNomeCF = new javax.swing.JTextField();
        lblNomeCF = new javax.swing.JLabel();
        txtRgCF = new javax.swing.JTextField();
        txtCpfCF = new javax.swing.JTextField();
        lblRgCF = new javax.swing.JLabel();
        lblCpfCF = new javax.swing.JLabel();
        pnlEnderecoCF = new javax.swing.JPanel();
        txtRuaCF = new javax.swing.JTextField();
        lblRuaCF = new javax.swing.JLabel();
        txtNumeroCF = new javax.swing.JTextField();
        txtComplementoCF = new javax.swing.JTextField();
        lblNumeroCF = new javax.swing.JLabel();
        lblComplementoCF = new javax.swing.JLabel();
        txtCepCF = new javax.swing.JTextField();
        lblCepCF = new javax.swing.JLabel();
        txtBairroCF = new javax.swing.JTextField();
        lblBairroCF = new javax.swing.JLabel();
        txtCidadeCF = new javax.swing.JTextField();
        lblCidadeCF = new javax.swing.JLabel();
        cbEstadoCF = new javax.swing.JComboBox<>();
        lblEstadoCF = new javax.swing.JLabel();
        pnlContatoCF = new javax.swing.JPanel();
        txtTelefoneCF = new javax.swing.JTextField();
        lblTelefoneCF = new javax.swing.JLabel();
        txtEmailCF = new javax.swing.JTextField();
        lblEmailCF = new javax.swing.JLabel();
        pnlDadosProfissionaisCF = new javax.swing.JPanel();
        txtCargoCF = new javax.swing.JTextField();
        txtComissaoCF = new javax.swing.JTextField();
        txtRemuneracaoCF = new javax.swing.JTextField();
        lblCargoCF = new javax.swing.JLabel();
        lblComissaoCF = new javax.swing.JLabel();
        lblRemuneracaoCF = new javax.swing.JLabel();
        pnlHistoricoCF = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtHistoricoCF = new javax.swing.JTextArea();
        btnSalvarCF = new javax.swing.JButton();
        pnlConsultaFuncionarios = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblConsultaFuncionariosCF = new javax.swing.JTable();
        btnVisualizarCF = new javax.swing.JButton();
        btnEditarCF = new javax.swing.JButton();
        btnHistoricoCF = new javax.swing.JButton();
        btnExcluirCF = new javax.swing.JButton();
        pnlManutencao = new javax.swing.JPanel();
        tpnlManutencao = new javax.swing.JTabbedPane();
        pnlManutencaoOrcamento = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNomeItemMO = new javax.swing.JLabel();
        txtNomeItemMO = new javax.swing.JTextField();
        lblUnidadeMO = new javax.swing.JLabel();
        txtUnidadeMO = new javax.swing.JTextField();
        lblValorItemMO = new javax.swing.JLabel();
        txtValorItemMO = new javax.swing.JTextField();
        btnSalvarMO = new javax.swing.JButton();
        btnAtualizarMO = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTabelaValoresMO = new javax.swing.JTable();
        btnExcluirMO = new javax.swing.JButton();
        btnAlterarItemMO = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlCadastrarUsuariosMU = new javax.swing.JPanel();
        lblUsuarioMU = new javax.swing.JLabel();
        txtUsuarioMU = new javax.swing.JTextField();
        lblSenhaMU = new javax.swing.JLabel();
        lblValidaSenhaMU = new javax.swing.JLabel();
        lblNivelAcessoMU = new javax.swing.JLabel();
        cbNivelAcessoMU = new javax.swing.JComboBox<>();
        btnSalvarMU = new javax.swing.JButton();
        lblCodigoFuncionalMU = new javax.swing.JLabel();
        txtCodigoFuncionalMU = new javax.swing.JTextField();
        pfSenhaMU = new javax.swing.JTextField();
        pfValidaSenhaMU = new javax.swing.JTextField();
        btnAlterarSenhaMU = new javax.swing.JButton();
        pnlUsuariosAtivosMU = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUsuariosAtivosMU = new javax.swing.JTable();
        btnExcluirMU = new javax.swing.JButton();
        btnRedefinirSenhaMU = new javax.swing.JButton();
        pnlAction = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        pnlMolduralogin = new javax.swing.JPanel();
        lblUsuarioLogin = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        lblSenhaLogin = new javax.swing.JLabel();
        btnEntrarLogin = new javax.swing.JButton();
        pfSenhaLogin = new javax.swing.JTextField();
        pnlAcesso1 = new javax.swing.JPanel();
        pnlMenu1 = new javax.swing.JPanel();
        btnClientes1 = new javax.swing.JButton();
        btnOrcamentos1 = new javax.swing.JButton();
        btnFuncionarios1 = new javax.swing.JButton();
        btnManutencao1 = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        pnlSaudacaoAcesso1 = new javax.swing.JPanel();
        lblSaudacao1 = new javax.swing.JLabel();
        pnlAcesso2 = new javax.swing.JPanel();
        pnlMenu2 = new javax.swing.JPanel();
        btnClientes2 = new javax.swing.JButton();
        btnOrcamentos2 = new javax.swing.JButton();
        btnSair2 = new javax.swing.JButton();
        pnlSaudacaoAcesso2 = new javax.swing.JPanel();
        lblSaudacao2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo 3.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBody.setLayout(new java.awt.CardLayout());

        pnlInicio.setPreferredSize(new java.awt.Dimension(1000, 573));

        lblImagemAbertura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemAbertura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem fundo2.png"))); // NOI18N
        lblImagemAbertura.setToolTipText("Imagem exemplo: Espaço para imagens ou texto institucional");

        jLabel1.setFont(new java.awt.Font("Cantarell Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Diego dos Santos Oliveira - TDS Senac 2023");

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInicioLayout.createSequentialGroup()
                        .addComponent(lblImagemAbertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagemAbertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pnlBody.add(pnlInicio, "inicio");

        pnlDadosPessoaisCC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblNomeCC.setLabelFor(txtNomeCC);
        lblNomeCC.setText("Nome:");

        lblCpfCC.setLabelFor(txtCpfCC);
        lblCpfCC.setText("CPF:");

        lblRgCC.setLabelFor(txtRgCC);
        lblRgCC.setText("RG:");

        javax.swing.GroupLayout pnlDadosPessoaisCCLayout = new javax.swing.GroupLayout(pnlDadosPessoaisCC);
        pnlDadosPessoaisCC.setLayout(pnlDadosPessoaisCCLayout);
        pnlDadosPessoaisCCLayout.setHorizontalGroup(
            pnlDadosPessoaisCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisCCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosPessoaisCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpfCC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosPessoaisCCLayout.createSequentialGroup()
                        .addComponent(txtCpfCC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRgCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRgCC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDadosPessoaisCCLayout.setVerticalGroup(
            pnlDadosPessoaisCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCC)
                    .addComponent(txtNomeCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosPessoaisCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCC)
                    .addComponent(txtCpfCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRgCC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEnderecoCC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblRuaCC.setLabelFor(txtRuaCC);
        lblRuaCC.setText("Rua:");

        lblNumeroCC.setLabelFor(txtNumeroCC);
        lblNumeroCC.setText("Número:");

        lblComplementoCC.setFont(new java.awt.Font("Cantarell Light", 0, 15)); // NOI18N
        lblComplementoCC.setLabelFor(txtComplementoCC);
        lblComplementoCC.setText("Complemento:");

        lblBairroCC.setLabelFor(txtBairroCC);
        lblBairroCC.setText("Bairro:");

        lblCepCC.setLabelFor(txtCepCC);
        lblCepCC.setText("CEP:");

        lblCidadeCC.setLabelFor(txtCidadeCC);
        lblCidadeCC.setText("Cidade:");

        lblEstadoCC.setText("Estado:");

        cbEstadoCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbEstadoCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEnderecoCCLayout = new javax.swing.GroupLayout(pnlEnderecoCC);
        pnlEnderecoCC.setLayout(pnlEnderecoCCLayout);
        pnlEnderecoCCLayout.setHorizontalGroup(
            pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoCCLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRuaCC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumeroCC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBairroCC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCidadeCC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRuaCC, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoCCLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCidadeCC)
                            .addComponent(txtBairroCC)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEnderecoCCLayout.createSequentialGroup()
                                .addComponent(txtNumeroCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblComplementoCC)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplementoCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoCCLayout.createSequentialGroup()
                                .addComponent(lblEstadoCC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlEnderecoCCLayout.createSequentialGroup()
                                        .addComponent(lblCepCC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCepCC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbEstadoCC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        pnlEnderecoCCLayout.setVerticalGroup(
            pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRuaCC))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroCC)
                    .addComponent(txtComplementoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplementoCC))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairroCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairroCC)
                    .addComponent(txtCepCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCepCC))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadeCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidadeCC)
                    .addComponent(lblEstadoCC)
                    .addComponent(cbEstadoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContatoCC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        txtTelefoneCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneCCActionPerformed(evt);
            }
        });

        lblTelefone1CC.setLabelFor(txtTelefoneCC);
        lblTelefone1CC.setText("Telefone :");

        txtEmailCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCCActionPerformed(evt);
            }
        });

        lblEmailCC.setLabelFor(txtEmailCC);
        lblEmailCC.setText("Email:");

        javax.swing.GroupLayout pnlContatoCCLayout = new javax.swing.GroupLayout(pnlContatoCC);
        pnlContatoCC.setLayout(pnlContatoCCLayout);
        pnlContatoCCLayout.setHorizontalGroup(
            pnlContatoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatoCCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContatoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContatoCCLayout.createSequentialGroup()
                        .addComponent(lblTelefone1CC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneCC, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContatoCCLayout.createSequentialGroup()
                        .addComponent(lblEmailCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailCC, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlContatoCCLayout.setVerticalGroup(
            pnlContatoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatoCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContatoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone1CC))
                .addGap(18, 18, 18)
                .addGroup(pnlContatoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailCC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlVendedorCC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendedor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblCodigoFuncionalCC.setLabelFor(txtCodigoFuncionalCC);
        lblCodigoFuncionalCC.setText("Código Funcional:");

        javax.swing.GroupLayout pnlVendedorCCLayout = new javax.swing.GroupLayout(pnlVendedorCC);
        pnlVendedorCC.setLayout(pnlVendedorCCLayout);
        pnlVendedorCCLayout.setHorizontalGroup(
            pnlVendedorCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendedorCCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigoFuncionalCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoFuncionalCC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVendedorCCLayout.setVerticalGroup(
            pnlVendedorCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendedorCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVendedorCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoFuncionalCC)
                    .addComponent(txtCodigoFuncionalCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHistoricoCC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Histórico do Atendimento:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        txtHistoricoCC.setColumns(20);
        txtHistoricoCC.setRows(5);
        jScrollPane1.setViewportView(txtHistoricoCC);

        javax.swing.GroupLayout pnlHistoricoCCLayout = new javax.swing.GroupLayout(pnlHistoricoCC);
        pnlHistoricoCC.setLayout(pnlHistoricoCCLayout);
        pnlHistoricoCCLayout.setHorizontalGroup(
            pnlHistoricoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHistoricoCCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHistoricoCCLayout.setVerticalGroup(
            pnlHistoricoCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHistoricoCCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnSalvarCC.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSalvarCC.setForeground(new java.awt.Color(0, 153, 0));
        btnSalvarCC.setMnemonic('a');
        btnSalvarCC.setText("Salvar");
        btnSalvarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastrarClientesLayout = new javax.swing.GroupLayout(pnlCadastrarClientes);
        pnlCadastrarClientes.setLayout(pnlCadastrarClientesLayout);
        pnlCadastrarClientesLayout.setHorizontalGroup(
            pnlCadastrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastrarClientesLayout.createSequentialGroup()
                        .addGroup(pnlCadastrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlEnderecoCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlContatoCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlVendedorCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDadosPessoaisCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlHistoricoCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarCC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCadastrarClientesLayout.setVerticalGroup(
            pnlCadastrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCadastrarClientesLayout.createSequentialGroup()
                        .addComponent(pnlDadosPessoaisCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlEnderecoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlContatoCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlVendedorCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlHistoricoCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCC)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        tpnlClientes.addTab("Cadastrar Clientes", pnlCadastrarClientes);

        tblConsultaClientesCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Cliente", "Nome", "Telefone", "Email", "Endereço", "Vendedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsultaClientesCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultaClientesCCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblConsultaClientesCC);

        btnEditarCC.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnEditarCC.setForeground(new java.awt.Color(0, 102, 102));
        btnEditarCC.setMnemonic('E');
        btnEditarCC.setText("Editar");
        btnEditarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCCActionPerformed(evt);
            }
        });

        btnVisualizarCC.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnVisualizarCC.setForeground(new java.awt.Color(0, 102, 102));
        btnVisualizarCC.setMnemonic('z');
        btnVisualizarCC.setText("Visualizar");
        btnVisualizarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarCCActionPerformed(evt);
            }
        });

        btnAtualizarCC.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnAtualizarCC.setForeground(new java.awt.Color(0, 102, 102));
        btnAtualizarCC.setMnemonic('A');
        btnAtualizarCC.setText("Atualizar Atendimento");
        btnAtualizarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCCActionPerformed(evt);
            }
        });

        btnExcluirCC.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnExcluirCC.setForeground(new java.awt.Color(153, 0, 0));
        btnExcluirCC.setMnemonic('x');
        btnExcluirCC.setText("Excluir");
        btnExcluirCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultarClientesLayout = new javax.swing.GroupLayout(pnlConsultarClientes);
        pnlConsultarClientes.setLayout(pnlConsultarClientesLayout);
        pnlConsultarClientesLayout.setHorizontalGroup(
            pnlConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(pnlConsultarClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVisualizarCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCC)))
                .addContainerGap())
        );
        pnlConsultarClientesLayout.setVerticalGroup(
            pnlConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCC)
                    .addComponent(btnAtualizarCC)
                    .addComponent(btnEditarCC)
                    .addComponent(btnVisualizarCC)))
        );

        tpnlClientes.addTab("Consultar Clientes", pnlConsultarClientes);

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlClientes)
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlClientes)
        );

        pnlBody.add(pnlClientes, "clientes");

        pnlOrcamentos.setPreferredSize(new java.awt.Dimension(1000, 624));

        pnlCadastroOrcamentoCO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Orçamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Thin", 2, 15))); // NOI18N

        lblDataCO.setLabelFor(txtDataCO);
        lblDataCO.setText("Data:");

        lblCodigoClienteCO.setLabelFor(txtCodigoClienteCO);
        lblCodigoClienteCO.setText("Código do Cliente");

        lblCodigoVendedorCO.setLabelFor(txtCodigoVendedorCO);
        lblCodigoVendedorCO.setText("Código do Vendedor:");

        lblCustoCO.setLabelFor(txtCustoCO);
        lblCustoCO.setText("Valor da Construção:");

        txtDetalhesNegociacaoCO.setColumns(20);
        txtDetalhesNegociacaoCO.setRows(5);
        txtDetalhesNegociacaoCO.setToolTipText("Informe com detalhes o que foi negociado neste Orçamento");
        jScrollPane8.setViewportView(txtDetalhesNegociacaoCO);

        lblDetalhesNegociacaoCO.setLabelFor(txtDetalhesNegociacaoCO);
        lblDetalhesNegociacaoCO.setText("Detalhes da Negociação:");

        btnSalvarCO.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSalvarCO.setForeground(new java.awt.Color(0, 153, 0));
        btnSalvarCO.setMnemonic('a');
        btnSalvarCO.setText("Salvar");
        btnSalvarCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroOrcamentoCOLayout = new javax.swing.GroupLayout(pnlCadastroOrcamentoCO);
        pnlCadastroOrcamentoCO.setLayout(pnlCadastroOrcamentoCOLayout);
        pnlCadastroOrcamentoCOLayout.setHorizontalGroup(
            pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroOrcamentoCOLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarCO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadastroOrcamentoCOLayout.createSequentialGroup()
                        .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataCO)
                            .addComponent(lblCodigoClienteCO)
                            .addComponent(lblDetalhesNegociacaoCO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlCadastroOrcamentoCOLayout.createSequentialGroup()
                                .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoClienteCO, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtDataCO))
                                .addGap(63, 63, 63)
                                .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodigoVendedorCO)
                                    .addComponent(lblCustoCO))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoVendedorCO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustoCO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane8))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        pnlCadastroOrcamentoCOLayout.setVerticalGroup(
            pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroOrcamentoCOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroOrcamentoCOLayout.createSequentialGroup()
                        .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataCO))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoClienteCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoClienteCO)))
                    .addGroup(pnlCadastroOrcamentoCOLayout.createSequentialGroup()
                        .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustoCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustoCO))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoVendedorCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoVendedorCO))))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroOrcamentoCOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(pnlCadastroOrcamentoCOLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblDetalhesNegociacaoCO, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCO)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCadastrarOrcamentosLayout = new javax.swing.GroupLayout(pnlCadastrarOrcamentos);
        pnlCadastrarOrcamentos.setLayout(pnlCadastrarOrcamentosLayout);
        pnlCadastrarOrcamentosLayout.setHorizontalGroup(
            pnlCadastrarOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarOrcamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroOrcamentoCO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCadastrarOrcamentosLayout.setVerticalGroup(
            pnlCadastrarOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarOrcamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroOrcamentoCO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnlOrcamentos.addTab("Cadastrar Orçamentos", pnlCadastrarOrcamentos);

        tblOrcamentoCO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cliente", "Vendedor", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrcamentoCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrcamentoCOMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblOrcamentoCO);

        btnVisualizarCO.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnVisualizarCO.setForeground(new java.awt.Color(0, 102, 102));
        btnVisualizarCO.setMnemonic('V');
        btnVisualizarCO.setText("Visualizar");
        btnVisualizarCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarCOActionPerformed(evt);
            }
        });

        btnExcluirCO.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnExcluirCO.setForeground(new java.awt.Color(153, 0, 0));
        btnExcluirCO.setMnemonic('E');
        btnExcluirCO.setText("Excluir");
        btnExcluirCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultarOrcamentosLayout = new javax.swing.GroupLayout(pnlConsultarOrcamentos);
        pnlConsultarOrcamentos.setLayout(pnlConsultarOrcamentosLayout);
        pnlConsultarOrcamentosLayout.setHorizontalGroup(
            pnlConsultarOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarOrcamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(pnlConsultarOrcamentosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVisualizarCO)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirCO)))
                .addContainerGap())
        );
        pnlConsultarOrcamentosLayout.setVerticalGroup(
            pnlConsultarOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarOrcamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConsultarOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCO)
                    .addComponent(btnVisualizarCO))
                .addContainerGap())
        );

        tpnlOrcamentos.addTab("Consultar Orçamentos", pnlConsultarOrcamentos);

        javax.swing.GroupLayout pnlOrcamentosLayout = new javax.swing.GroupLayout(pnlOrcamentos);
        pnlOrcamentos.setLayout(pnlOrcamentosLayout);
        pnlOrcamentosLayout.setHorizontalGroup(
            pnlOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlOrcamentos)
        );
        pnlOrcamentosLayout.setVerticalGroup(
            pnlOrcamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlOrcamentos)
        );

        pnlBody.add(pnlOrcamentos, "orcamentos");

        pnlFuncionarios.setPreferredSize(new java.awt.Dimension(1000, 624));

        pnlDadosPessoaisCF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblNomeCF.setLabelFor(txtNomeCF);
        lblNomeCF.setText("Nome:");

        lblRgCF.setLabelFor(txtRgCF);
        lblRgCF.setText("RG:");

        lblCpfCF.setLabelFor(txtCpfCF);
        lblCpfCF.setText("CPF:");

        javax.swing.GroupLayout pnlDadosPessoaisCFLayout = new javax.swing.GroupLayout(pnlDadosPessoaisCF);
        pnlDadosPessoaisCF.setLayout(pnlDadosPessoaisCFLayout);
        pnlDadosPessoaisCFLayout.setHorizontalGroup(
            pnlDadosPessoaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisCFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosPessoaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpfCF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlDadosPessoaisCFLayout.createSequentialGroup()
                        .addComponent(txtCpfCF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRgCF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRgCF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeCF, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDadosPessoaisCFLayout.setVerticalGroup(
            pnlDadosPessoaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisCFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCF))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosPessoaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRgCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRgCF)
                    .addComponent(lblCpfCF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEnderecoCF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblRuaCF.setLabelFor(txtRuaCF);
        lblRuaCF.setText("Rua:");

        lblNumeroCF.setLabelFor(txtNumeroCF);
        lblNumeroCF.setText("Número:");

        lblComplementoCF.setFont(new java.awt.Font("Cantarell Light", 0, 15)); // NOI18N
        lblComplementoCF.setLabelFor(txtComplementoCF);
        lblComplementoCF.setText("Complemento:");

        lblCepCF.setLabelFor(txtCepCF);
        lblCepCF.setText("Cep:");

        lblBairroCF.setLabelFor(txtBairroCF);
        lblBairroCF.setText("Bairro:");

        lblCidadeCF.setLabelFor(txtCidadeCF);
        lblCidadeCF.setText("Cidade:");

        cbEstadoCF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lblEstadoCF.setLabelFor(cbEstadoCF);
        lblEstadoCF.setText("Estado:");

        javax.swing.GroupLayout pnlEnderecoCFLayout = new javax.swing.GroupLayout(pnlEnderecoCF);
        pnlEnderecoCF.setLayout(pnlEnderecoCFLayout);
        pnlEnderecoCFLayout.setHorizontalGroup(
            pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoCFLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRuaCF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumeroCF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBairroCF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCidadeCF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRuaCF, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoCFLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBairroCF)
                            .addGroup(pnlEnderecoCFLayout.createSequentialGroup()
                                .addComponent(txtNumeroCF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblComplementoCF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplementoCF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoCFLayout.createSequentialGroup()
                                .addComponent(lblCepCF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCepCF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlEnderecoCFLayout.createSequentialGroup()
                        .addComponent(txtCidadeCF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEstadoCF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstadoCF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlEnderecoCFLayout.setVerticalGroup(
            pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoCFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuaCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRuaCF))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplementoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroCF)
                    .addComponent(lblComplementoCF))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCepCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCepCF)
                    .addComponent(txtBairroCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairroCF))
                .addGap(18, 18, 18)
                .addGroup(pnlEnderecoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidadeCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidadeCF)
                    .addComponent(cbEstadoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoCF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContatoCF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblTelefoneCF.setLabelFor(txtTelefoneCF);
        lblTelefoneCF.setText("Telefone :");

        lblEmailCF.setLabelFor(txtEmailCF);
        lblEmailCF.setText("Email:");

        javax.swing.GroupLayout pnlContatoCFLayout = new javax.swing.GroupLayout(pnlContatoCF);
        pnlContatoCF.setLayout(pnlContatoCFLayout);
        pnlContatoCFLayout.setHorizontalGroup(
            pnlContatoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContatoCFLayout.createSequentialGroup()
                .addGroup(pnlContatoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContatoCFLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTelefoneCF))
                    .addGroup(pnlContatoCFLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmailCF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContatoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailCF, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneCF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlContatoCFLayout.setVerticalGroup(
            pnlContatoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatoCFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContatoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefoneCF))
                .addGap(18, 18, 18)
                .addGroup(pnlContatoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailCF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosProfissionaisCF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Profissionais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblCargoCF.setLabelFor(txtCargoCF);
        lblCargoCF.setText("Cargo:");

        lblComissaoCF.setLabelFor(txtComissaoCF);
        lblComissaoCF.setText("Comissão: (%)");

        lblRemuneracaoCF.setLabelFor(txtRemuneracaoCF);
        lblRemuneracaoCF.setText("Remuneração:");

        javax.swing.GroupLayout pnlDadosProfissionaisCFLayout = new javax.swing.GroupLayout(pnlDadosProfissionaisCF);
        pnlDadosProfissionaisCF.setLayout(pnlDadosProfissionaisCFLayout);
        pnlDadosProfissionaisCFLayout.setHorizontalGroup(
            pnlDadosProfissionaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosProfissionaisCFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosProfissionaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRemuneracaoCF)
                    .addComponent(lblCargoCF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosProfissionaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCargoCF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosProfissionaisCFLayout.createSequentialGroup()
                        .addComponent(txtRemuneracaoCF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblComissaoCF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComissaoCF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDadosProfissionaisCFLayout.setVerticalGroup(
            pnlDadosProfissionaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosProfissionaisCFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosProfissionaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargoCF))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosProfissionaisCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemuneracaoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRemuneracaoCF)
                    .addComponent(lblComissaoCF)
                    .addComponent(txtComissaoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHistoricoCF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Histórico / Anotações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        txtHistoricoCF.setColumns(20);
        txtHistoricoCF.setRows(5);
        jScrollPane5.setViewportView(txtHistoricoCF);

        javax.swing.GroupLayout pnlHistoricoCFLayout = new javax.swing.GroupLayout(pnlHistoricoCF);
        pnlHistoricoCF.setLayout(pnlHistoricoCFLayout);
        pnlHistoricoCFLayout.setHorizontalGroup(
            pnlHistoricoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHistoricoCFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHistoricoCFLayout.setVerticalGroup(
            pnlHistoricoCFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHistoricoCFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        btnSalvarCF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSalvarCF.setForeground(new java.awt.Color(0, 153, 0));
        btnSalvarCF.setMnemonic('a');
        btnSalvarCF.setText("Salvar");
        btnSalvarCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroFuncionariosLayout = new javax.swing.GroupLayout(pnlCadastroFuncionarios);
        pnlCadastroFuncionarios.setLayout(pnlCadastroFuncionariosLayout);
        pnlCadastroFuncionariosLayout.setHorizontalGroup(
            pnlCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroFuncionariosLayout.createSequentialGroup()
                        .addGroup(pnlCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlDadosPessoaisCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEnderecoCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlContatoCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDadosProfissionaisCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlHistoricoCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroFuncionariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarCF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCadastroFuncionariosLayout.setVerticalGroup(
            pnlCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCadastroFuncionariosLayout.createSequentialGroup()
                        .addComponent(pnlDadosPessoaisCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlEnderecoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlContatoCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDadosProfissionaisCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlHistoricoCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnlFuncionarios.addTab("Cadastrar Funcionários", pnlCadastroFuncionarios);

        tblConsultaFuncionariosCF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Funcional", "Nome", "CPF", "Telefone", "Cargo", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsultaFuncionariosCF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultaFuncionariosCFMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblConsultaFuncionariosCF);

        btnVisualizarCF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnVisualizarCF.setForeground(new java.awt.Color(0, 102, 102));
        btnVisualizarCF.setMnemonic('V');
        btnVisualizarCF.setText("Visualizar");
        btnVisualizarCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarCFActionPerformed(evt);
            }
        });

        btnEditarCF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnEditarCF.setForeground(new java.awt.Color(0, 102, 102));
        btnEditarCF.setMnemonic('E');
        btnEditarCF.setText("Editar");
        btnEditarCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCFActionPerformed(evt);
            }
        });

        btnHistoricoCF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnHistoricoCF.setForeground(new java.awt.Color(0, 102, 102));
        btnHistoricoCF.setMnemonic('A');
        btnHistoricoCF.setText("Atualizar Histórico");
        btnHistoricoCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoCFActionPerformed(evt);
            }
        });

        btnExcluirCF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnExcluirCF.setForeground(new java.awt.Color(153, 0, 0));
        btnExcluirCF.setMnemonic('E');
        btnExcluirCF.setText("Excluir");
        btnExcluirCF.setToolTipText("");
        btnExcluirCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaFuncionariosLayout = new javax.swing.GroupLayout(pnlConsultaFuncionarios);
        pnlConsultaFuncionarios.setLayout(pnlConsultaFuncionariosLayout);
        pnlConsultaFuncionariosLayout.setHorizontalGroup(
            pnlConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(pnlConsultaFuncionariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVisualizarCF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHistoricoCF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCF)))
                .addContainerGap())
        );
        pnlConsultaFuncionariosLayout.setVerticalGroup(
            pnlConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCF)
                    .addComponent(btnHistoricoCF)
                    .addComponent(btnEditarCF)
                    .addComponent(btnVisualizarCF)))
        );

        tpnlFuncionarios.addTab("Consultar Funcionários", pnlConsultaFuncionarios);

        javax.swing.GroupLayout pnlFuncionariosLayout = new javax.swing.GroupLayout(pnlFuncionarios);
        pnlFuncionarios.setLayout(pnlFuncionariosLayout);
        pnlFuncionariosLayout.setHorizontalGroup(
            pnlFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlFuncionarios)
        );
        pnlFuncionariosLayout.setVerticalGroup(
            pnlFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlFuncionarios)
        );

        pnlBody.add(pnlFuncionarios, "funcionarios");

        pnlManutencao.setPreferredSize(new java.awt.Dimension(1000, 624));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar novo Item", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblNomeItemMO.setLabelFor(txtNomeItemMO);
        lblNomeItemMO.setText("Nome:");

        txtNomeItemMO.setNextFocusableComponent(txtUnidadeMO);

        lblUnidadeMO.setLabelFor(txtUnidadeMO);
        lblUnidadeMO.setText("Unidade de medida:");

        txtUnidadeMO.setNextFocusableComponent(txtValorItemMO);

        lblValorItemMO.setLabelFor(txtValorItemMO);
        lblValorItemMO.setText("Valor:");

        txtValorItemMO.setNextFocusableComponent(btnSalvarMO);

        btnSalvarMO.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSalvarMO.setForeground(new java.awt.Color(0, 153, 0));
        btnSalvarMO.setMnemonic('a');
        btnSalvarMO.setText("Salvar");
        btnSalvarMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMOActionPerformed(evt);
            }
        });

        btnAtualizarMO.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnAtualizarMO.setForeground(new java.awt.Color(0, 102, 102));
        btnAtualizarMO.setText("Atualizar");
        btnAtualizarMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvarMO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizarMO))
                    .addComponent(lblNomeItemMO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeItemMO)
                    .addComponent(lblUnidadeMO, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(txtUnidadeMO)
                    .addComponent(lblValorItemMO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorItemMO))
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblNomeItemMO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeItemMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUnidadeMO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnidadeMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValorItemMO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorItemMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarMO)
                    .addComponent(btnAtualizarMO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela de Valores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        tblTabelaValoresMO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Item", "Valor", "Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabelaValoresMO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTabelaValoresMOMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblTabelaValoresMO);

        btnExcluirMO.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnExcluirMO.setForeground(new java.awt.Color(153, 0, 0));
        btnExcluirMO.setMnemonic('E');
        btnExcluirMO.setText("Excluir");
        btnExcluirMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMOActionPerformed(evt);
            }
        });

        btnAlterarItemMO.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnAlterarItemMO.setForeground(new java.awt.Color(0, 102, 102));
        btnAlterarItemMO.setMnemonic('V');
        btnAlterarItemMO.setText("Alterar item");
        btnAlterarItemMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarItemMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlterarItemMO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirMO)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirMO)
                    .addComponent(btnAlterarItemMO))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlManutencaoOrcamentoLayout = new javax.swing.GroupLayout(pnlManutencaoOrcamento);
        pnlManutencaoOrcamento.setLayout(pnlManutencaoOrcamentoLayout);
        pnlManutencaoOrcamentoLayout.setHorizontalGroup(
            pnlManutencaoOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManutencaoOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlManutencaoOrcamentoLayout.setVerticalGroup(
            pnlManutencaoOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManutencaoOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManutencaoOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpnlManutencao.addTab("Manutenção Orçamento", pnlManutencaoOrcamento);

        pnlCadastrarUsuariosMU.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Usuários", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        lblUsuarioMU.setText("Usuário:");

        txtUsuarioMU.setNextFocusableComponent(pfSenhaMU);

        lblSenhaMU.setText("Senha:");

        lblValidaSenhaMU.setText("Repete a Senha:");

        lblNivelAcessoMU.setText("Nível de Acesso:");

        cbNivelAcessoMU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1 - Administrativo", "2 - Comercial" }));
        cbNivelAcessoMU.setDoubleBuffered(true);
        cbNivelAcessoMU.setNextFocusableComponent(txtUsuarioMU);

        btnSalvarMU.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSalvarMU.setForeground(new java.awt.Color(0, 153, 0));
        btnSalvarMU.setMnemonic('a');
        btnSalvarMU.setText("Salvar");
        btnSalvarMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMUActionPerformed(evt);
            }
        });

        lblCodigoFuncionalMU.setLabelFor(txtCodigoFuncionalMU);
        lblCodigoFuncionalMU.setText("Código Funcional:");

        txtCodigoFuncionalMU.setNextFocusableComponent(cbNivelAcessoMU);

        btnAlterarSenhaMU.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnAlterarSenhaMU.setForeground(new java.awt.Color(0, 102, 102));
        btnAlterarSenhaMU.setText("Alterar Senha");
        btnAlterarSenhaMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaMUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastrarUsuariosMULayout = new javax.swing.GroupLayout(pnlCadastrarUsuariosMU);
        pnlCadastrarUsuariosMU.setLayout(pnlCadastrarUsuariosMULayout);
        pnlCadastrarUsuariosMULayout.setHorizontalGroup(
            pnlCadastrarUsuariosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarUsuariosMULayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(pnlCadastrarUsuariosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pfValidaSenhaMU)
                    .addComponent(pfSenhaMU)
                    .addComponent(lblUsuarioMU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSenhaMU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuarioMU, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValidaSenhaMU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNivelAcessoMU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNivelAcessoMU, javax.swing.GroupLayout.Alignment.LEADING, 0, 296, Short.MAX_VALUE)
                    .addComponent(lblCodigoFuncionalMU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoFuncionalMU, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCadastrarUsuariosMULayout.createSequentialGroup()
                        .addComponent(btnSalvarMU, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarSenhaMU)))
                .addGap(106, 106, 106))
        );
        pnlCadastrarUsuariosMULayout.setVerticalGroup(
            pnlCadastrarUsuariosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarUsuariosMULayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblCodigoFuncionalMU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoFuncionalMU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNivelAcessoMU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNivelAcessoMU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsuarioMU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioMU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenhaMU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenhaMU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValidaSenhaMU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfValidaSenhaMU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCadastrarUsuariosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarMU)
                    .addComponent(btnAlterarSenhaMU))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pnlUsuariosAtivosMU.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuários Ativos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N

        tblUsuariosAtivosMU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Funcional", "Usuário", "Nível deAcesso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuariosAtivosMU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosAtivosMUMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblUsuariosAtivosMU);

        btnExcluirMU.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnExcluirMU.setForeground(new java.awt.Color(153, 0, 0));
        btnExcluirMU.setMnemonic('E');
        btnExcluirMU.setText("Excluir");
        btnExcluirMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMUActionPerformed(evt);
            }
        });

        btnRedefinirSenhaMU.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnRedefinirSenhaMU.setForeground(new java.awt.Color(255, 153, 51));
        btnRedefinirSenhaMU.setMnemonic('R');
        btnRedefinirSenhaMU.setText("Redefinir Senha");
        btnRedefinirSenhaMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedefinirSenhaMUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuariosAtivosMULayout = new javax.swing.GroupLayout(pnlUsuariosAtivosMU);
        pnlUsuariosAtivosMU.setLayout(pnlUsuariosAtivosMULayout);
        pnlUsuariosAtivosMULayout.setHorizontalGroup(
            pnlUsuariosAtivosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosAtivosMULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosAtivosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(pnlUsuariosAtivosMULayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRedefinirSenhaMU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirMU)))
                .addContainerGap())
        );
        pnlUsuariosAtivosMULayout.setVerticalGroup(
            pnlUsuariosAtivosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosAtivosMULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsuariosAtivosMULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirMU)
                    .addComponent(btnRedefinirSenhaMU))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarUsuariosMU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUsuariosAtivosMU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastrarUsuariosMU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUsuariosAtivosMU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpnlManutencao.addTab("Manutenção de Usuários", jPanel2);

        javax.swing.GroupLayout pnlManutencaoLayout = new javax.swing.GroupLayout(pnlManutencao);
        pnlManutencao.setLayout(pnlManutencaoLayout);
        pnlManutencaoLayout.setHorizontalGroup(
            pnlManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlManutencao)
        );
        pnlManutencaoLayout.setVerticalGroup(
            pnlManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnlManutencao)
        );

        pnlBody.add(pnlManutencao, "manutencao");

        pnlAction.setLayout(new java.awt.CardLayout());

        pnlMolduralogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N
        pnlMolduralogin.setToolTipText("Informe seu Usuário e sua Senha");

        lblUsuarioLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioLogin.setLabelFor(txtUsuarioLogin);
        lblUsuarioLogin.setText("Usuário:");

        lblSenhaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenhaLogin.setLabelFor(pfSenhaLogin);
        lblSenhaLogin.setText("Senha:");

        btnEntrarLogin.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnEntrarLogin.setForeground(new java.awt.Color(0, 153, 0));
        btnEntrarLogin.setMnemonic('E');
        btnEntrarLogin.setText("Entrar");
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMolduraloginLayout = new javax.swing.GroupLayout(pnlMolduralogin);
        pnlMolduralogin.setLayout(pnlMolduraloginLayout);
        pnlMolduraloginLayout.setHorizontalGroup(
            pnlMolduraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMolduraloginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMolduraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSenhaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(txtUsuarioLogin)
                    .addComponent(pfSenhaLogin))
                .addContainerGap())
        );
        pnlMolduraloginLayout.setVerticalGroup(
            pnlMolduraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMolduraloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenhaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrarLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMolduralogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMolduralogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAction.add(pnlLogin, "login");

        pnlMenu1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15), new java.awt.Color(0, 102, 102))); // NOI18N
        pnlMenu1.setToolTipText("Escolha uma opção no menu");

        btnClientes1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnClientes1.setForeground(new java.awt.Color(0, 102, 102));
        btnClientes1.setMnemonic('C');
        btnClientes1.setText("Clientes");
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });

        btnOrcamentos1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnOrcamentos1.setForeground(new java.awt.Color(0, 102, 102));
        btnOrcamentos1.setMnemonic('O');
        btnOrcamentos1.setText("Orçamentos");
        btnOrcamentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrcamentos1ActionPerformed(evt);
            }
        });

        btnFuncionarios1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnFuncionarios1.setForeground(new java.awt.Color(0, 102, 102));
        btnFuncionarios1.setMnemonic('F');
        btnFuncionarios1.setText("Funcionários");
        btnFuncionarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarios1ActionPerformed(evt);
            }
        });

        btnManutencao1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnManutencao1.setForeground(new java.awt.Color(0, 102, 102));
        btnManutencao1.setMnemonic('M');
        btnManutencao1.setText("Manutenção");
        btnManutencao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManutencao1ActionPerformed(evt);
            }
        });

        btnSair1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSair1.setForeground(new java.awt.Color(153, 0, 0));
        btnSair1.setMnemonic('S');
        btnSair1.setText("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenu1Layout = new javax.swing.GroupLayout(pnlMenu1);
        pnlMenu1.setLayout(pnlMenu1Layout);
        pnlMenu1Layout.setHorizontalGroup(
            pnlMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrcamentos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuncionarios1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnManutencao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenu1Layout.setVerticalGroup(
            pnlMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClientes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrcamentos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFuncionarios1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManutencao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSaudacao1.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        lblSaudacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaudacao1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlSaudacaoAcesso1Layout = new javax.swing.GroupLayout(pnlSaudacaoAcesso1);
        pnlSaudacaoAcesso1.setLayout(pnlSaudacaoAcesso1Layout);
        pnlSaudacaoAcesso1Layout.setHorizontalGroup(
            pnlSaudacaoAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaudacaoAcesso1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaudacao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSaudacaoAcesso1Layout.setVerticalGroup(
            pnlSaudacaoAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaudacaoAcesso1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaudacao1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAcesso1Layout = new javax.swing.GroupLayout(pnlAcesso1);
        pnlAcesso1.setLayout(pnlAcesso1Layout);
        pnlAcesso1Layout.setHorizontalGroup(
            pnlAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcesso1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSaudacaoAcesso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAcesso1Layout.setVerticalGroup(
            pnlAcesso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcesso1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlSaudacaoAcesso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlAction.add(pnlAcesso1, "acesso1");

        pnlMenu2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cantarell Light", 2, 15))); // NOI18N
        pnlMenu2.setToolTipText("Escolha uma opção no menu");

        btnClientes2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnClientes2.setForeground(new java.awt.Color(0, 102, 102));
        btnClientes2.setMnemonic('C');
        btnClientes2.setText("Clientes");
        btnClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes2ActionPerformed(evt);
            }
        });

        btnOrcamentos2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnOrcamentos2.setForeground(new java.awt.Color(0, 102, 102));
        btnOrcamentos2.setMnemonic('O');
        btnOrcamentos2.setText("Orçamentos");
        btnOrcamentos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrcamentos2ActionPerformed(evt);
            }
        });

        btnSair2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnSair2.setForeground(new java.awt.Color(153, 0, 0));
        btnSair2.setMnemonic('S');
        btnSair2.setText("Sair");
        btnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenu2Layout = new javax.swing.GroupLayout(pnlMenu2);
        pnlMenu2.setLayout(pnlMenu2Layout);
        pnlMenu2Layout.setHorizontalGroup(
            pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrcamentos2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnSair2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenu2Layout.setVerticalGroup(
            pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClientes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrcamentos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSaudacao2.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        lblSaudacao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaudacao2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlSaudacaoAcesso2Layout = new javax.swing.GroupLayout(pnlSaudacaoAcesso2);
        pnlSaudacaoAcesso2.setLayout(pnlSaudacaoAcesso2Layout);
        pnlSaudacaoAcesso2Layout.setHorizontalGroup(
            pnlSaudacaoAcesso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaudacaoAcesso2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaudacao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSaudacaoAcesso2Layout.setVerticalGroup(
            pnlSaudacaoAcesso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaudacaoAcesso2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaudacao2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAcesso2Layout = new javax.swing.GroupLayout(pnlAcesso2);
        pnlAcesso2.setLayout(pnlAcesso2Layout);
        pnlAcesso2Layout.setHorizontalGroup(
            pnlAcesso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcesso2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAcesso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSaudacaoAcesso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAcesso2Layout.setVerticalGroup(
            pnlAcesso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcesso2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlSaudacaoAcesso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlAction.add(pnlAcesso2, "acesso2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAction, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "clientes");
        txtCodigoFuncionalCC.setText(String.valueOf(usuario.getFuncionario()));
        showtableClientes();
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnOrcamentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrcamentos1ActionPerformed
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "orcamentos");
//        showtableOrcamento();
    }//GEN-LAST:event_btnOrcamentos1ActionPerformed

    private void btnFuncionarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarios1ActionPerformed
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "funcionarios");
        showtableFuncionarios();
    }//GEN-LAST:event_btnFuncionarios1ActionPerformed

    private void btnManutencao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManutencao1ActionPerformed
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "manutencao");
        showtableValores();
        showtableUsuarios();
        btnAtualizarMO.setEnabled(false);
        btnAlterarSenhaMU.setEnabled(false);
    }//GEN-LAST:event_btnManutencao1ActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        CardLayout menu = (CardLayout) pnlAction.getLayout();
        menu.show(pnlAction, "login");
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "inicio");
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnClientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes2ActionPerformed
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "clientes");
        txtCodigoFuncionalCC.setText(String.valueOf(usuario.getFuncionario()));
        showtableClientes();        
    }//GEN-LAST:event_btnClientes2ActionPerformed

    private void btnOrcamentos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrcamentos2ActionPerformed
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "orcamentos");
//        showtableOrcamento();
    }//GEN-LAST:event_btnOrcamentos2ActionPerformed

    private void btnSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair2ActionPerformed
        CardLayout menu = (CardLayout) pnlAction.getLayout();
        menu.show(pnlAction, "login");
        CardLayout desktop = (CardLayout) pnlBody.getLayout();
        desktop.show(pnlBody, "inicio");
    }//GEN-LAST:event_btnSair2ActionPerformed

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLoginActionPerformed
        try{
            
            String a = txtUsuarioLogin.getText();
            String b = c.getCode(pfSenhaLogin.getText());
                        
            usuarioDao.conectar();
            
            usuario = usuarioDao.validar(a, b);
            
            usuarioDao.desconectar();
                                   
            if(usuario.getNivelAcesso() == 1){
                CardLayout menu = (CardLayout) pnlAction.getLayout();
                menu.show(pnlAction, "acesso1"); 
                funcionarioDao.conectar();
                lblSaudacao1.setText("Usuário: " + funcionarioDao.getFuncionario(usuario.getCodigoUsuario()).getDadosPessoais().getNome());
                funcionarioDao.desconectar();
            }
            else{
                if(usuario.getNivelAcesso() == 2){
                CardLayout menu = (CardLayout) pnlAction.getLayout();
                menu.show(pnlAction, "acesso2");
                funcionarioDao.conectar();
                lblSaudacao2.setText("Usuário: " + funcionarioDao.getFuncionario(usuario.getCodigoUsuario()).getDadosPessoais().getNome());
                funcionarioDao.desconectar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Informe um usuário válido.");
                    }           
            }
            
            txtUsuarioLogin.setText(null);
            pfSenhaLogin.setText(null);
         
       }
       catch(Exception e){
           
       }
    }//GEN-LAST:event_btnEntrarLoginActionPerformed

    private void txtTelefoneCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneCCActionPerformed

    private void txtEmailCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCCActionPerformed

    private void btnSalvarMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMUActionPerformed
        try{
            
            if(txtCodigoFuncionalMU.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Informe o Funcionário que será cadastrado");
            }
            else{
                if(cbNivelAcessoMU.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Informe o nível de acesso");
                }
                else{
                    if(pfSenhaMU.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Digite uma Senha");
                    }
                    else{
                        if(pfValidaSenhaMU.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Repita a Senha");
                        } 
                        else{
                            String alfa = c.getCode(pfSenhaMU.getText());
                            String beta = c.getCode(pfValidaSenhaMU.getText());
                            if(beta.equals(alfa) == false){
                                JOptionPane.showMessageDialog(null, "Senhas não conferem");
                            }
                            else{
                                usuarioDao.conectar();
                                                   
                                usuario.setFuncionario(Integer.parseInt(txtCodigoFuncionalMU.getText()));
                                usuario.setNivelAcesso(cbNivelAcessoMU.getSelectedIndex());
                                usuario.setUsuario(txtUsuarioMU.getText());
                                usuario.setSenha(alfa);
                                
                                usuarioDao.salvar(usuario);
                                usuarioDao.desconectar();
                                
                                txtCodigoFuncionalMU.setText(null);
                                cbNivelAcessoMU.setSelectedItem(0);
                                txtUsuarioMU.setText(null);
                                pfSenhaMU.setText(null);
                                pfValidaSenhaMU.setText(null);


                                showtableUsuarios();
                                JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso");
                                
                            }
                        }
                    }
                }
            }
            
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnSalvarMUActionPerformed

    private void btnSalvarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCCActionPerformed
        try{
            if(txtNomeCC.getText().isEmpty() 
                || txtCpfCC.getText().isEmpty() 
                || txtRgCC.getText().isEmpty() 
                || txtRuaCC.getText().isEmpty() 
                || txtNumeroCC.getText().isEmpty() 
                || txtBairroCC.getText().isEmpty() 
                || txtCepCC.getText().isEmpty() 
                || txtCidadeCC.getText().isEmpty() 
                || cbEstadoCC.getSelectedIndex() == 0
                || txtTelefoneCC.getText().isEmpty()
                || txtEmailCC.getText().isEmpty() 
                || txtCodigoFuncionalCC.getText().isEmpty()
                ){
                JOptionPane.showMessageDialog(null, "Preencha todos os dados obrigatórios!");   
            }
            else{
                Cliente c = new Cliente();
                CadastroInformacoesPessoais dadosPessoais = new CadastroInformacoesPessoais();
                dadosPessoais.setNome(txtNomeCC.getText());
                dadosPessoais.setCpf(txtCpfCC.getText());
                dadosPessoais.setRg(txtRgCC.getText());
                dadosPessoais.setEndereco(txtRuaCC.getText() + " " + txtNumeroCC.getText() + ", " + txtComplementoCC.getText() + ", " + txtBairroCC.getText() + ", " + txtCidadeCC.getText() + " / " + cbEstadoCC.getSelectedItem().toString() + ", Cep - " + txtCepCC.getText());
                dadosPessoais.setTelefone(txtTelefoneCC.getText());
                dadosPessoais.setEmail(txtEmailCC.getText());
                c.setDadosPessoais(dadosPessoais);
                c.setVendedorResponsavel(Integer.parseInt(txtCodigoFuncionalCC.getText()));
                c.setHistoricoAtendimento(txtHistoricoCC.getText());
                
                clienteDao.conectar();
                clienteDao.salvar(c);
                clienteDao.desconectar();
                
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                
                txtNomeCC.setText(null);
                txtCpfCC.setText(null);
                txtRgCC.setText(null);
                txtRuaCC.setText(null);
                txtNumeroCC.setText(null);
                txtComplementoCC.setText(null);
                txtBairroCC.setText(null);
                txtCepCC.setText(null);
                txtCidadeCC.setText(null); 
                cbEstadoCC.setSelectedIndex(0);
                txtTelefoneCC.setText(null);
                txtEmailCC.setText(null);
                txtCodigoFuncionalCC.setText(null);
                txtHistoricoCC.setText(null);
                
                showtableClientes();
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnSalvarCCActionPerformed

    private void btnVisualizarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarCCActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione o cliente que deseja consultar");
            }
            else{
                ConsultaDados ficha = new ConsultaDados();
                Cliente c = new Cliente();
//                ficha.printFichaCadastral(c.consultaFichaCadastral(row));
                ficha.setTitle("Ficha Cadastral Cliente");
                ficha.setLocationRelativeTo(null);
                ficha.pack();
                ficha.setVisible(true);
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnVisualizarCCActionPerformed

    private void tblConsultaClientesCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultaClientesCCMouseClicked
        try{
            row = tblConsultaClientesCC.getSelectedRow();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tblConsultaClientesCCMouseClicked

    private void btnAtualizarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCCActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um cliente");
            }
            else{
//                Cliente c = cliente.selectCliente(row);
//                AtualizarAtendimento aa = new AtualizarAtendimento(c);
//                aa.setTitle("Atualizar histórico de atendimento");
//                aa.setLocationRelativeTo(null);
//                aa.pack();
//                aa.setVisible(true);
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnAtualizarCCActionPerformed

    private void btnExcluirCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCCActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um Cliente");
            }
            else{
                int cliente = (int) tblConsultaClientesCC.getModel().getValueAt(row, 0);
                
                clienteDao.conectar();
                clienteDao.excluir(cliente);
                clienteDao.desconectar();
                
                JOptionPane.showMessageDialog(null, "Cliente Deletado"); 
                
                showtableClientes();
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnExcluirCCActionPerformed

    private void cbEstadoCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoCCActionPerformed

    private void btnEditarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCCActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um cliente");
            }
            else{
//                Cliente c = cliente.selectCliente(row);
//                EditarCadastroCliente ecc = new EditarCadastroCliente(c);
//                ecc.setTitle("Editar Cadastro do Cliente");
//                ecc.setLocationRelativeTo(null);
//                ecc.pack();
//                ecc.setVisible(true);
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnEditarCCActionPerformed

    private void btnSalvarCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCFActionPerformed
        try{
            if(txtNomeCF.getText().isEmpty() 
                || txtCpfCF.getText().isEmpty() 
                || txtRgCF.getText().isEmpty()
                || txtRuaCF.getText().isEmpty()
                || txtNumeroCF.getText().isEmpty()
                || txtBairroCF.getText().isEmpty()
                || txtCepCF.getText().isEmpty()
                || txtCidadeCF.getText().isEmpty()
                || cbEstadoCF.getSelectedIndex() == 0
                || txtTelefoneCF.getText().isEmpty()
                || txtEmailCF.getText().isEmpty()
                || txtCargoCF.getText().isEmpty()
                || txtRemuneracaoCF.getText().isEmpty()
                || txtComissaoCF.getText().isEmpty()
                ){
                JOptionPane.showMessageDialog(null, "Preencha todos os dados obrigatórios!");
               
            }
            else{
                String endereco = (txtRuaCF.getText() + " " + txtNumeroCF.getText() + ", " + txtComplementoCF.getText() + ", " + txtBairroCF.getText() + ", " + txtCidadeCF.getText() + " / " + cbEstadoCF.getSelectedItem().toString() + ", Cep - " + txtCepCF.getText());
               
                CadastroInformacoesPessoais informacoesPessoais = new CadastroInformacoesPessoais(
                        txtNomeCF.getText(), 
                        txtCpfCF.getText(), 
                        txtRgCF.getText(),
                        endereco,
                        txtTelefoneCF.getText(),
                        txtEmailCF.getText()
                );
                Funcionario f = new Funcionario(
                        informacoesPessoais,
                        txtCargoCF.getText(),
                        Double.parseDouble(txtRemuneracaoCF.getText()),
                        Integer.parseInt(txtComissaoCF.getText()), 
                        "Ativo",
                        txtHistoricoCF.getText()
                );
                
                funcionarioDao.conectar();
                funcionarioDao.salvar(f);    
                funcionarioDao.desconectar();

                JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
                
                txtNomeCF.setText(null);
                txtCpfCF.setText(null);
                txtRgCF.setText(null);
                txtRuaCF.setText(null);
                txtNumeroCF.setText(null);
                txtComplementoCF.setText(null);
                txtBairroCF.setText(null);
                txtCepCF.setText(null);
                txtCidadeCF.setText(null);
                cbEstadoCF.setSelectedIndex(0);
                txtTelefoneCF.setText(null);
                txtEmailCF.setText(null);
                txtCargoCF.setText(null);
                txtRemuneracaoCF.setText(null);
                txtComissaoCF.setText(null);
                txtHistoricoCF.setText(null);
                
                showtableFuncionarios();
                
                
            }
           
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnSalvarCFActionPerformed

    private void btnVisualizarCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarCFActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione o Funcionário que deseja consultar");
            }
            else{
                int cf = (int) tblConsultaFuncionariosCF.getModel().getValueAt(row, 0);
                ConsultaDados ficha = new ConsultaDados();
                Funcionario f= new Funcionario();
                ficha.printFichaCadastral(funcionarioDao.fichaCadastral(cf));
                ficha.setTitle("Ficha Cadastral Funcionário");
                ficha.setLocationRelativeTo(null);
                ficha.pack();
                ficha.setVisible(true);
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnVisualizarCFActionPerformed

    private void tblConsultaFuncionariosCFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultaFuncionariosCFMouseClicked
         try{
            row = tblConsultaFuncionariosCF.getSelectedRow();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tblConsultaFuncionariosCFMouseClicked

    private void btnEditarCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCFActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um Funcionário");
            }
            else{
//                Funcionario f = funcionario.selectFuncionario(row);
//                EditarCadastroFuncionario ecf = new EditarCadastroFuncionario(f);
//                ecf.setTitle("Editar Cadastro do Cliente");
//                ecf.setLocationRelativeTo(null);
//                ecf.pack();
//                ecf.setVisible(true);
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnEditarCFActionPerformed

    private void btnHistoricoCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoCFActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um Funcionário"); 
            }
            else{
//                Funcionario f = funcionario.selectFuncionario(row);
//                AtualizarHistorico ah = new AtualizarHistorico(f);
//                ah.setTitle("Atualizar Histórico do Funcionário");
//                ah.setLocationRelativeTo(null);
//                ah.pack();
//                ah.setVisible(true);
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnHistoricoCFActionPerformed

    private void btnExcluirCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCFActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um funcionário");
            }
            else{
                tabelaFuncionarios = (DefaultTableModel) tblConsultaFuncionariosCF.getModel();
                tblConsultaFuncionariosCF.setRowSelectionInterval(row, row);
                tabelaFuncionarios.removeRow(row);
                tblConsultaFuncionariosCF.revalidate();
                tblConsultaFuncionariosCF.repaint();
            
//                funcionario.dropFuncionario(row);
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnExcluirCFActionPerformed

    private void btnSalvarMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMOActionPerformed
        try{
            if(txtNomeItemMO.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Informe o nome do Item");
            }
            else{
                if(txtUnidadeMO.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Informe a unidade de medida deste Item");
                }
                else{
                    if(txtValorItemMO.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Informe o valor deste Item");
                    }
                    else{
                        itensOrcamento.setItem(txtNomeItemMO.getText());
                        itensOrcamento.setUnidade(txtUnidadeMO.getText());
                        itensOrcamento.setValor(Double.parseDouble(txtValorItemMO.getText()));
                        itensOrcamentoDao.conectar();
                        itensOrcamentoDao.salvar(itensOrcamento);
                        itensOrcamentoDao.desconectar();                            
                        JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso!");
                        
                        txtNomeItemMO.setText(null);
                        txtUnidadeMO.setText(null);
                        txtValorItemMO.setText(null);
                        showtableValores();
                    }
                }
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnSalvarMOActionPerformed

    private void btnAlterarItemMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemMOActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um Item"); 
            }
            else{
                itemAtualizado.setCodigoItem((int) tblTabelaValoresMO.getModel().getValueAt(row, 0));
                txtNomeItemMO.setText((String) tblTabelaValoresMO.getModel().getValueAt(row, 1));
                txtUnidadeMO.setText((String) tblTabelaValoresMO.getModel().getValueAt(row, 3));
                txtValorItemMO.setText(((Double) tblTabelaValoresMO.getModel().getValueAt(row, 2)).toString());
                
                btnSalvarMO.setEnabled(false);
                btnAtualizarMO.setEnabled(true);
                                
                
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnAlterarItemMOActionPerformed

    private void tblTabelaValoresMOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTabelaValoresMOMouseClicked
        try{
            row = tblTabelaValoresMO.getSelectedRow();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tblTabelaValoresMOMouseClicked

    private void btnExcluirMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMOActionPerformed
         try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um Item");
            }
            else{
                
                int item = (int) tblTabelaValoresMO.getModel().getValueAt(row, 0);
                
                itensOrcamentoDao.conectar();
                itensOrcamentoDao.excluir(item);
                itensOrcamentoDao.desconectar();
                
               JOptionPane.showMessageDialog(null, "Item Deletado"); 
               showtableValores();
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnExcluirMOActionPerformed

    private void btnSalvarCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCOActionPerformed
//        try{
//            if(txtDataCO.getText().isEmpty()){
//                JOptionPane.showMessageDialog(null, "Informe a data");
//            }
//            else{
//                if(txtCustoCO.getText().isEmpty()){
//                    JOptionPane.showMessageDialog(null, "Informe o valor da construção");
//                }
//                else{
//                    if(txtCodigoClienteCO.getText().isEmpty()){
//                        JOptionPane.showMessageDialog(null, "Informe o código do Cliente");
//                    }
//                    else{
//                        if(txtCodigoVendedorCO.getText().isEmpty()){
//                            JOptionPane.showMessageDialog(null, "Informe o código do Vendedor");
//                        }
//                        else{
//                            if(txtDetalhesNegociacaoCO.getText().isEmpty()){
//                                JOptionPane.showMessageDialog(null, "Informe com detalhes o que foi negociado neste Orçamento");
//                            }
//                            else{
//                                orcamento.cadastraOrcamento(txtDataCO.getText(), 
//                                        cliente.selectCliente(Integer.parseInt(txtCodigoClienteCO.getText()) - 1), 
//                                        funcionario.selectFuncionario(Integer.parseInt(txtCodigoVendedorCO.getText()) - 1), 
//                                        txtDetalhesNegociacaoCO.getText(), 
//                                        Double.parseDouble(txtCustoCO.getText()));
//                                
//                                JOptionPane.showMessageDialog(null, "Orçamento cadastrado com sucesso!");
//                                txtDataCO.setText(null);
//                                txtCodigoClienteCO.setText(null);
//                                txtCodigoVendedorCO.setText(null);
//                                txtCustoCO.setText(null);
//                                txtDetalhesNegociacaoCO.setText(null);
//                                showtableOrcamento();
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        catch(Exception e){
//            
//        }
    }//GEN-LAST:event_btnSalvarCOActionPerformed

    private void btnVisualizarCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarCOActionPerformed
//        try{
//            if(row == -1){
//                JOptionPane.showMessageDialog(null, "Selecione o orçamento que deseja consultar");
//            }
//            else{
//                ConsultaDados ficha = new ConsultaDados();
//                Orcamento o = new Orcamento();
//                ficha.printFichaCadastral(o.consultaOrcamento(row));
//                ficha.setTitle("Detalhes Orçamento");
//                ficha.setLocationRelativeTo(null);
//                ficha.pack();
//                ficha.setVisible(true);
//            }
//        }catch(Exception e){
//            
//        }
    }//GEN-LAST:event_btnVisualizarCOActionPerformed

    private void tblOrcamentoCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrcamentoCOMouseClicked
         try{
            row = tblOrcamentoCO.getSelectedRow();
        }catch(Exception e){
            
        }                        
    }//GEN-LAST:event_tblOrcamentoCOMouseClicked

    private void btnExcluirCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCOActionPerformed
//        try{
//            if(row == -1){
//                JOptionPane.showMessageDialog(null, "Selecione um orcamento");
//            }
//            else{
//                TabelaOrcamento = (DefaultTableModel) tblOrcamentoCO.getModel();
//                tblOrcamentoCO.setRowSelectionInterval(row, row);
//                TabelaOrcamento.removeRow(row);
//                tblOrcamentoCO.revalidate();
//                tblOrcamentoCO.repaint();
//            
//                orcamento.dropOrcamento(row);
//            }
//        }
//        catch(Exception e){
//            
//        }
    }//GEN-LAST:event_btnExcluirCOActionPerformed

    private void btnExcluirMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMUActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um usuario");
            }
            else{
                int funcionario = (int) tblUsuariosAtivosMU.getModel().getValueAt(row, 0);
                
                usuarioDao.conectar();
                usuarioDao.excluir(funcionario);
                usuarioDao.desconectar();
                
                JOptionPane.showMessageDialog(null, "Usuario Deletado"); 
                
                showtableUsuarios();
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnExcluirMUActionPerformed

    private void tblUsuariosAtivosMUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosAtivosMUMouseClicked
         try{
            row = tblUsuariosAtivosMU.getSelectedRow();
        }catch(Exception e){
            
        }            
    }//GEN-LAST:event_tblUsuariosAtivosMUMouseClicked

    private void btnAtualizarMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarMOActionPerformed
        try{
            if(txtNomeItemMO.getText() == null || txtUnidadeMO.getText() == null || txtValorItemMO.getText() == null){
                JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos!"); 
            }
            else{
                itemAtualizado.setItem(txtNomeItemMO.getText());
                itemAtualizado.setUnidade(txtUnidadeMO.getText());
                itemAtualizado.setValor(Double.parseDouble(txtValorItemMO.getText()));
                
                itensOrcamentoDao.conectar();
                itensOrcamentoDao.editar(itemAtualizado);
                itensOrcamentoDao.desconectar();
                
                JOptionPane.showMessageDialog(null, "Item Atualizado"); 
                showtableValores();
                txtNomeItemMO.setText(null);
                txtUnidadeMO.setText(null);
                txtValorItemMO.setText(null);
                btnSalvarMO.setEnabled(true);
                btnAtualizarMO.setEnabled(false);
                
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnAtualizarMOActionPerformed

    private void btnRedefinirSenhaMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedefinirSenhaMUActionPerformed
        try{
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Selecione um usuário");
            }
            else{
                btnAlterarSenhaMU.setEnabled(true);
                btnSalvarMU.setEnabled(false);
                usuario.setFuncionario((int) tblUsuariosAtivosMU.getModel().getValueAt(row, 0));
                usuario.setUsuario((String) tblUsuariosAtivosMU.getModel().getValueAt(row, 1));
                usuario.setNivelAcesso((int) tblUsuariosAtivosMU.getModel().getValueAt(row, 2));
                
                txtCodigoFuncionalMU.setText(Integer.toString(usuario.getFuncionario()));
                txtCodigoFuncionalMU.setEnabled(false);
                cbNivelAcessoMU.setSelectedIndex(usuario.getNivelAcesso());
                cbNivelAcessoMU.setEnabled(false);
                txtUsuarioMU.setText(usuario.getUsuario());
                txtUsuarioMU.setEnabled(false);
            }
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnRedefinirSenhaMUActionPerformed

    private void btnAlterarSenhaMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaMUActionPerformed
        try{
            if(pfSenhaMU.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Digite uma Senha");
                    }
                    else{
                        if(pfValidaSenhaMU.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Repita a Senha");
                        } 
                        else{
                            String alfa = c.getCode(pfSenhaMU.getText());
                            String beta = c.getCode(pfValidaSenhaMU.getText());
                            if(beta.equals(alfa) == false){
                                JOptionPane.showMessageDialog(null, "Senhas não conferem");
                            }
                            else{
                                usuarioDao.conectar();
                                usuarioDao.alterarSenha(usuario.getFuncionario(), c.getCode(pfSenhaMU.getText()));
                                usuarioDao.desconectar();
                                
                                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
                            }
                        }
                    }
            btnAlterarSenhaMU.setEnabled(false);
            btnSalvarMU.setEnabled(true);
            txtCodigoFuncionalMU.setText(null);
            txtCodigoFuncionalMU.setEnabled(true);
            cbNivelAcessoMU.setSelectedIndex(0);
            cbNivelAcessoMU.setEnabled(true);
            txtUsuarioMU.setText(null);
            txtUsuarioMU.setEnabled(true);
            pfSenhaMU.setText(null);
            pfValidaSenhaMU.setText(null);
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnAlterarSenhaMUActionPerformed

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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }
    
    public void showtableClientes(){
        clienteDao.conectar();
        
        List<Cliente> listaCliente = clienteDao.listaClientes();
        tabelaClientes = (DefaultTableModel) tblConsultaClientesCC.getModel();
        tabelaClientes.setRowCount(0);
        tblConsultaClientesCC.setRowSorter(new TableRowSorter(tabelaClientes));
        
        for(Cliente c : listaCliente){
            tabelaClientes.addRow(new Object[]{
                c.getCodigoCliente(),
                c.getDadosPessoais().getNome(),
                c.getDadosPessoais().getTelefone(),
                c.getDadosPessoais().getEmail(),
                c.getDadosPessoais().getEndereco(),
                c.getVendedorResponsavel()
            });
        }
        clienteDao.desconectar();

    }
    
    public void showtableOrcamento(){
//        List<Orcamento> listaOrcamento = Orcamento.getListaOrcamento(row);
//        TabelaOrcamento = (DefaultTableModel) tblOrcamentoCO.getModel();
//        TabelaOrcamento.setRowCount(0);
//        
//        for(Orcamento o : listaOrcamento){
//            TabelaOrcamento.addRow(new Object[]{
//                o.getData(),
//                o.getCliente().getDadosPessoais().getNome(),
//                o.getVendedor().getDadosPessoais().getNome(),
//                o.getCusto()
//            });
//        }
    }
    
    public void showtableFuncionarios(){
        funcionarioDao.conectar();
        
        List<Funcionario> listaFuncionario = funcionarioDao.listaFuncionarios();
        tabelaFuncionarios = (DefaultTableModel) tblConsultaFuncionariosCF.getModel();
        tabelaFuncionarios.setRowCount(0);
        tblConsultaFuncionariosCF.setRowSorter(new TableRowSorter(tabelaFuncionarios));
        
        for(Funcionario f : listaFuncionario){
            tabelaFuncionarios.addRow(new Object[]{
                f.getCodigoFuncional(),
                f.getDadosPessoais().getNome(),
                f.getDadosPessoais().getCpf(),
                f.getDadosPessoais().getTelefone(),
                f.getCargo(),
                f.getStatusFuncionario()
            });
        }
        
        funcionarioDao.desconectar();
        
  
    }
    public void showtableValores(){
        itensOrcamentoDao.conectar();
        List<ItensOrcamento> listaItens = itensOrcamentoDao.listaItens();
        TabelaValores = (DefaultTableModel) tblTabelaValoresMO.getModel();
        TabelaValores.setRowCount(0);
        
        for(ItensOrcamento io : listaItens){
            TabelaValores.addRow(new Object[]{
                io.getCodigoItem(),
                io.getItem(),
                io.getValor(),
                io.getUnidade()
            });
            
        }
        itensOrcamentoDao.desconectar();
        
    }
    
    public void showtableUsuarios(){
        usuarioDao.conectar();
        List<Usuario> listaUsuario = usuarioDao.listaUsuarios();
        TabelaUsuarios = (DefaultTableModel) tblUsuariosAtivosMU.getModel();
        TabelaUsuarios.setRowCount(0);
        tblUsuariosAtivosMU.setRowSorter(new TableRowSorter(TabelaUsuarios));
        
        for(Usuario u : listaUsuario){
            TabelaUsuarios.addRow(new Object[]{
                u.getFuncionario(),
                u.getUsuario(),
                u.getNivelAcesso()
            });
        }
        
        usuarioDao.desconectar();
    }
    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarItemMO;
    private javax.swing.JButton btnAlterarSenhaMU;
    private javax.swing.JButton btnAtualizarCC;
    private javax.swing.JButton btnAtualizarMO;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnClientes2;
    private javax.swing.JButton btnEditarCC;
    private javax.swing.JButton btnEditarCF;
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JButton btnExcluirCC;
    private javax.swing.JButton btnExcluirCF;
    private javax.swing.JButton btnExcluirCO;
    private javax.swing.JButton btnExcluirMO;
    private javax.swing.JButton btnExcluirMU;
    private javax.swing.JButton btnFuncionarios1;
    private javax.swing.JButton btnHistoricoCF;
    private javax.swing.JButton btnManutencao1;
    private javax.swing.JButton btnOrcamentos1;
    private javax.swing.JButton btnOrcamentos2;
    private javax.swing.JButton btnRedefinirSenhaMU;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSair2;
    private javax.swing.JButton btnSalvarCC;
    private javax.swing.JButton btnSalvarCF;
    private javax.swing.JButton btnSalvarCO;
    private javax.swing.JButton btnSalvarMO;
    private javax.swing.JButton btnSalvarMU;
    private javax.swing.JButton btnVisualizarCC;
    private javax.swing.JButton btnVisualizarCF;
    private javax.swing.JButton btnVisualizarCO;
    private javax.swing.JComboBox<String> cbEstadoCC;
    private javax.swing.JComboBox<String> cbEstadoCF;
    private javax.swing.JComboBox<String> cbNivelAcessoMU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblBairroCC;
    private javax.swing.JLabel lblBairroCF;
    private javax.swing.JLabel lblCargoCF;
    private javax.swing.JLabel lblCepCC;
    private javax.swing.JLabel lblCepCF;
    private javax.swing.JLabel lblCidadeCC;
    private javax.swing.JLabel lblCidadeCF;
    private javax.swing.JLabel lblCodigoClienteCO;
    private javax.swing.JLabel lblCodigoFuncionalCC;
    private javax.swing.JLabel lblCodigoFuncionalMU;
    private javax.swing.JLabel lblCodigoVendedorCO;
    private javax.swing.JLabel lblComissaoCF;
    private javax.swing.JLabel lblComplementoCC;
    private javax.swing.JLabel lblComplementoCF;
    private javax.swing.JLabel lblCpfCC;
    private javax.swing.JLabel lblCpfCF;
    private javax.swing.JLabel lblCustoCO;
    private javax.swing.JLabel lblDataCO;
    private javax.swing.JLabel lblDetalhesNegociacaoCO;
    private javax.swing.JLabel lblEmailCC;
    private javax.swing.JLabel lblEmailCF;
    private javax.swing.JLabel lblEstadoCC;
    private javax.swing.JLabel lblEstadoCF;
    private javax.swing.JLabel lblImagemAbertura;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNivelAcessoMU;
    private javax.swing.JLabel lblNomeCC;
    private javax.swing.JLabel lblNomeCF;
    private javax.swing.JLabel lblNomeItemMO;
    private javax.swing.JLabel lblNumeroCC;
    private javax.swing.JLabel lblNumeroCF;
    private javax.swing.JLabel lblRemuneracaoCF;
    private javax.swing.JLabel lblRgCC;
    private javax.swing.JLabel lblRgCF;
    private javax.swing.JLabel lblRuaCC;
    private javax.swing.JLabel lblRuaCF;
    private javax.swing.JLabel lblSaudacao1;
    private javax.swing.JLabel lblSaudacao2;
    private javax.swing.JLabel lblSenhaLogin;
    private javax.swing.JLabel lblSenhaMU;
    private javax.swing.JLabel lblTelefone1CC;
    private javax.swing.JLabel lblTelefoneCF;
    private javax.swing.JLabel lblUnidadeMO;
    private javax.swing.JLabel lblUsuarioLogin;
    private javax.swing.JLabel lblUsuarioMU;
    private javax.swing.JLabel lblValidaSenhaMU;
    private javax.swing.JLabel lblValorItemMO;
    private javax.swing.JTextField pfSenhaLogin;
    private javax.swing.JTextField pfSenhaMU;
    private javax.swing.JTextField pfValidaSenhaMU;
    private javax.swing.JPanel pnlAcesso1;
    private javax.swing.JPanel pnlAcesso2;
    private javax.swing.JPanel pnlAction;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlCadastrarClientes;
    private javax.swing.JPanel pnlCadastrarOrcamentos;
    private javax.swing.JPanel pnlCadastrarUsuariosMU;
    private javax.swing.JPanel pnlCadastroFuncionarios;
    private javax.swing.JPanel pnlCadastroOrcamentoCO;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlConsultaFuncionarios;
    private javax.swing.JPanel pnlConsultarClientes;
    private javax.swing.JPanel pnlConsultarOrcamentos;
    private javax.swing.JPanel pnlContatoCC;
    private javax.swing.JPanel pnlContatoCF;
    private javax.swing.JPanel pnlDadosPessoaisCC;
    private javax.swing.JPanel pnlDadosPessoaisCF;
    private javax.swing.JPanel pnlDadosProfissionaisCF;
    private javax.swing.JPanel pnlEnderecoCC;
    private javax.swing.JPanel pnlEnderecoCF;
    private javax.swing.JPanel pnlFuncionarios;
    private javax.swing.JPanel pnlHistoricoCC;
    private javax.swing.JPanel pnlHistoricoCF;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlManutencao;
    private javax.swing.JPanel pnlManutencaoOrcamento;
    private javax.swing.JPanel pnlMenu1;
    private javax.swing.JPanel pnlMenu2;
    private javax.swing.JPanel pnlMolduralogin;
    private javax.swing.JPanel pnlOrcamentos;
    private javax.swing.JPanel pnlSaudacaoAcesso1;
    private javax.swing.JPanel pnlSaudacaoAcesso2;
    private javax.swing.JPanel pnlUsuariosAtivosMU;
    private javax.swing.JPanel pnlVendedorCC;
    private javax.swing.JTable tblConsultaClientesCC;
    private javax.swing.JTable tblConsultaFuncionariosCF;
    private javax.swing.JTable tblOrcamentoCO;
    private javax.swing.JTable tblTabelaValoresMO;
    private javax.swing.JTable tblUsuariosAtivosMU;
    private javax.swing.JTabbedPane tpnlClientes;
    private javax.swing.JTabbedPane tpnlFuncionarios;
    private javax.swing.JTabbedPane tpnlManutencao;
    private javax.swing.JTabbedPane tpnlOrcamentos;
    private javax.swing.JTextField txtBairroCC;
    private javax.swing.JTextField txtBairroCF;
    private javax.swing.JTextField txtCargoCF;
    private javax.swing.JTextField txtCepCC;
    private javax.swing.JTextField txtCepCF;
    private javax.swing.JTextField txtCidadeCC;
    private javax.swing.JTextField txtCidadeCF;
    private javax.swing.JTextField txtCodigoClienteCO;
    private javax.swing.JTextField txtCodigoFuncionalCC;
    private javax.swing.JTextField txtCodigoFuncionalMU;
    private javax.swing.JTextField txtCodigoVendedorCO;
    private javax.swing.JTextField txtComissaoCF;
    private javax.swing.JTextField txtComplementoCC;
    private javax.swing.JTextField txtComplementoCF;
    private javax.swing.JTextField txtCpfCC;
    private javax.swing.JTextField txtCpfCF;
    private javax.swing.JTextField txtCustoCO;
    private javax.swing.JTextField txtDataCO;
    private javax.swing.JTextArea txtDetalhesNegociacaoCO;
    private javax.swing.JTextField txtEmailCC;
    private javax.swing.JTextField txtEmailCF;
    private javax.swing.JTextArea txtHistoricoCC;
    private javax.swing.JTextArea txtHistoricoCF;
    private javax.swing.JTextField txtNomeCC;
    private javax.swing.JTextField txtNomeCF;
    private javax.swing.JTextField txtNomeItemMO;
    private javax.swing.JTextField txtNumeroCC;
    private javax.swing.JTextField txtNumeroCF;
    private javax.swing.JTextField txtRemuneracaoCF;
    private javax.swing.JTextField txtRgCC;
    private javax.swing.JTextField txtRgCF;
    private javax.swing.JTextField txtRuaCC;
    private javax.swing.JTextField txtRuaCF;
    private javax.swing.JTextField txtTelefoneCC;
    private javax.swing.JTextField txtTelefoneCF;
    private javax.swing.JTextField txtUnidadeMO;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JTextField txtUsuarioMU;
    private javax.swing.JTextField txtValorItemMO;
    // End of variables declaration//GEN-END:variables
}


