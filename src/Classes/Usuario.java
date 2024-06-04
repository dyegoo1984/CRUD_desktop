package Classes;

/**
* Senac EAD – TDS
* UC15 - Atividade 5
* @author Diego Oliveira
* @version 1.0
* @since Primeira versão
*/

public class Usuario {
    private int codigoUsuario;
    private int funcionario;
    private String usuario;
    private String senha;
    private int nivelAcesso;

    public Usuario() {
    }

    public Usuario(int codigoUsuario, int funcionario, String usuario, String senha, int nivelAcesso) {
        this.codigoUsuario = codigoUsuario;
        this.funcionario = funcionario;
        this.usuario = usuario;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    

}
