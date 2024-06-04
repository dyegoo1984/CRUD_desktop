package Classes;

/**
* Senac EAD – TDS
* UC15 - Atividade 5
* @author Diego Oliveira
* @version 1.0
* @since Primeira versão
*/

public class ItensOrcamento {
    private int codigoItem;
    private String item, unidade;
    private double valor;

    public ItensOrcamento() {
    }

    public ItensOrcamento(int codigoItem, String item, String unidade, double valor) {
        this.codigoItem = codigoItem;
        this.item = item;
        this.unidade = unidade;
        this.valor = valor;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    

}
