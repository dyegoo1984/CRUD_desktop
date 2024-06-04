package Classes;

import java.util.ArrayList;
import java.util.List;

/**
* Senac EAD – TDS
* UC15 - Atividade 5
* @author Diego Oliveira
* @version 1.0
* @since Primeira versão
*/

public class Funcionario {
    private int codigoFuncional;
    private CadastroInformacoesPessoais dadosPessoais;
    private String cargo;
    private double remuneracao;
    private int percentualComissao;
    private String statusFuncionario;
    private String historicoFuncionario;
    
    
    protected static List<Funcionario> listaFuncionario = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(int codigoFuncional, CadastroInformacoesPessoais dadosPessoais, String cargo, double remuneracao, int percentualComissao, String statusFuncionario, String historicoFuncionario) {
        this.codigoFuncional = codigoFuncional;
        this.dadosPessoais = dadosPessoais;
        this.cargo = cargo;
        this.remuneracao = remuneracao;
        this.percentualComissao = percentualComissao;
        this.statusFuncionario = statusFuncionario;
        this.historicoFuncionario = historicoFuncionario;
    }

    public Funcionario(CadastroInformacoesPessoais dadosPessoais, String cargo, double remuneracao, int percentualComissao, String statusFuncionario, String historicoFuncionario) {
        this.dadosPessoais = dadosPessoais;
        this.cargo = cargo;
        this.remuneracao = remuneracao;
        this.percentualComissao = percentualComissao;
        this.statusFuncionario = statusFuncionario;
        this.historicoFuncionario = historicoFuncionario;
    }
    
    

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public CadastroInformacoesPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(CadastroInformacoesPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public int getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(int percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public String getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(String statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }

    public String getHistoricoFuncionario() {
        return historicoFuncionario;
    }

    public void setHistoricoFuncionario(String historicoFuncionario) {
        this.historicoFuncionario = historicoFuncionario;
    }

}
