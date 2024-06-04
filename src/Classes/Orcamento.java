package Classes;


/**
* Senac EAD – TDS
* UC15 - Atividade 5
* @author Diego Oliveira
* @version 1.0
* @since Primeira versão
*/

public class Orcamento {
    private int numeroOrcamento;
    private String data;
    private Cliente cliente;
    private Funcionario vendedor;
    private String detalhes;
    private double custo;

    public Orcamento() {
    }

    public Orcamento(int numeroOrcamento, String data, Cliente cliente, Funcionario vendedor, String detalhes, double custo) {
        this.numeroOrcamento = numeroOrcamento;
        this.data = data;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.detalhes = detalhes;
        this.custo = custo;
    }

    public int getNumeroOrcamento() {
        return numeroOrcamento;
    }

    public void setNumeroOrcamento(int numeroOrcamento) {
        this.numeroOrcamento = numeroOrcamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
    
}
