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

public class Cliente {
    private int codigoCliente;
    private CadastroInformacoesPessoais dadosPessoais;
    private int vendedorResponsavel;
    private String historicoAtendimento;
    
    protected static List<Cliente> listaCliente = new ArrayList<>();

    public Cliente() {
    }
  
    public Cliente(int codigoCliente, CadastroInformacoesPessoais dadosPessoais, int vendedorResponsavel, String historicoAtendimento) {
        this.codigoCliente = codigoCliente;
        this.dadosPessoais = dadosPessoais;
        this.vendedorResponsavel = vendedorResponsavel;
        this.historicoAtendimento = historicoAtendimento;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public CadastroInformacoesPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(CadastroInformacoesPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public int getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(int vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public String getHistoricoAtendimento() {
        return historicoAtendimento;
    }

    public void setHistoricoAtendimento(String historicoAtendimento) {
        this.historicoAtendimento = historicoAtendimento;
    }

}
