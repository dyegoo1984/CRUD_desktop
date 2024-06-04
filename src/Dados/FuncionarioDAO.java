package Dados;

import Classes.CadastroInformacoesPessoais;
import Classes.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* Senac EAD – TDS
* UC15 - Atividade 5
* @author Diego Oliveira
* @version 1.0
* @since Primeira versão
*/

public class FuncionarioDAO {
    Connection conn;
    PreparedStatement st;
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/UC15Atividade05","root", "W@gn1989");
            System.out.println("Conexão (Funcionario) efetuada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
    
    public void desconectar(){
        try {
            conn.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
            
        }
    }
    
    public void salvar(Funcionario f){
        try{
            
            st = conn.prepareStatement("INSERT INTO FUNCIONARIO(nome, cpf, rg, endereco, telefone, email, cargo, remuneracao, percentualComissao, statusFuncionario, historicoFuncionario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            st.setString(1, f.getDadosPessoais().getNome());
            st.setString(2, f.getDadosPessoais().getCpf());
            st.setString(3, f.getDadosPessoais().getRg());
            st.setString(4, f.getDadosPessoais().getEndereco());
            st.setString(5, f.getDadosPessoais().getTelefone());
            st.setString(6, f.getDadosPessoais().getEmail());
            st.setString(7, f.getCargo());
            st.setDouble(8, f.getRemuneracao());
            st.setInt(9, f.getPercentualComissao());
            st.setString(10, f.getStatusFuncionario());
            st.setString(11, f.getHistoricoFuncionario());
            
            st.executeUpdate();
                   
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }
        
    }
    
    public void editar(Funcionario f){
        try{
            
            st = conn.prepareStatement("UPDATE FUNCIONARIO SET nome=?, cpf=?, rg=?, endereco=?, telefone=?, email=?, cargo=?, remuneracao=?, percentualComissao=?, statusFuncionario=?, historicoFuncionario=? WHERE codigoFuncional=?");
            
            st.setString(1, f.getDadosPessoais().getNome());
            st.setString(2, f.getDadosPessoais().getCpf());
            st.setString(3, f.getDadosPessoais().getRg());
            st.setString(4, f.getDadosPessoais().getEndereco());
            st.setString(5, f.getDadosPessoais().getTelefone());
            st.setString(6, f.getDadosPessoais().getEmail());
            st.setString(7, f.getCargo());
            st.setDouble(8, f.getRemuneracao());
            st.setInt(9, f.getPercentualComissao());
            st.setString(10, f.getStatusFuncionario());
            st.setString(11, f.getHistoricoFuncionario());
            st.setInt(12, f.getCodigoFuncional());
            
            st.executeUpdate();
                   
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }
        
    }
    
    public Funcionario getFuncionario(int codigoFuncional){
        try{
           
            st = conn.prepareStatement("SELECT * FROM FUNCIONARIO WHERE codigoFuncional=?");
            st.setInt(1, codigoFuncional);
            ResultSet rs = st.executeQuery();

            Funcionario f = new Funcionario();
            CadastroInformacoesPessoais dadosPessoais = new CadastroInformacoesPessoais();
            rs.next();
            f.setCodigoFuncional(rs.getInt("codigoFuncional"));            
            dadosPessoais.setNome(rs.getString("nome"));
            dadosPessoais.setCpf(rs.getString("cpf"));
            dadosPessoais.setRg(rs.getString("rg"));
            dadosPessoais.setEndereco(rs.getString("endereco"));
            dadosPessoais.setTelefone(rs.getString("telefone"));
            dadosPessoais.setEmail(rs.getString("email"));
            f.setDadosPessoais(dadosPessoais);
            f.setCargo(rs.getString("cargo"));
            f.setRemuneracao(rs.getFloat("remuneracao"));
            f.setPercentualComissao(rs.getInt("percentualComissao"));
            f.setStatusFuncionario("statusFuncionario");
            f.setHistoricoFuncionario("historicoFuncionario"); 
           
           return f;
        }
        catch(SQLException ex){
            System.out.println("Pesquisa não localizada: " + ex.getMessage());
            return null;
        }
               
        
    }
    
    public void excluir(int codigoFuncional){
        try{
           
            st = conn.prepareStatement("DELETE FROM FUNCIONARIO WHERE codigoFuncional=?");
            st.setInt(1, codigoFuncional);
            st.execute();
            
            System.out.println("Funcionário Deletado");
        }
        catch(SQLException ex){
            System.out.println("Erro ao deletar o funcionário: " + ex.getMessage());
        }
    }
    
    public List<Funcionario> listaFuncionarios(){
        try{
            
            PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM FUNCIONARIO");
            ResultSet rs = stmt.executeQuery();
            List<Funcionario> listaFuncionario = new ArrayList<>();
            
            while(rs.next()){
                Funcionario f = new Funcionario();
                f.setCodigoFuncional(rs.getInt("codigoFuncional"));
                CadastroInformacoesPessoais dadosPessoais = new CadastroInformacoesPessoais();
                dadosPessoais.setNome(rs.getString("nome"));
                dadosPessoais.setCpf(rs.getString("cpf"));
                dadosPessoais.setRg(rs.getString("rg"));
                dadosPessoais.setEndereco(rs.getString("endereco"));
                dadosPessoais.setTelefone(rs.getString("telefone"));
                dadosPessoais.setEmail(rs.getString("email"));
                f.setDadosPessoais(dadosPessoais);
                f.setCargo(rs.getString("cargo"));
                f.setRemuneracao(rs.getFloat("remuneracao"));
                f.setPercentualComissao(rs.getInt("percentualComissao"));
                f.setStatusFuncionario(rs.getString("statusFuncionario"));
                f.setHistoricoFuncionario(rs.getString("historicoFuncionario")); 

                listaFuncionario.add(f);
            }
            
            return listaFuncionario;
        }
        catch(SQLException ex){
            return null;
        }
       
    }
    
    public String fichaCadastral(int codigoFuncional){
            try{
                st = conn.prepareStatement("SELECT * FROM FUNCIONARIO WHERE codigoFuncional=?");
                st.setInt(1, codigoFuncional);
                ResultSet rs = st.executeQuery(); 
                
                Funcionario f = new Funcionario();
                CadastroInformacoesPessoais dadosPessoais = new CadastroInformacoesPessoais();
                rs.next();
                f.setCodigoFuncional(rs.getInt("codigoFuncional"));            
                dadosPessoais.setNome(rs.getString("nome"));
                dadosPessoais.setCpf(rs.getString("cpf"));
                dadosPessoais.setRg(rs.getString("rg"));
                dadosPessoais.setEndereco(rs.getString("endereco"));
                dadosPessoais.setTelefone(rs.getString("telefone"));
                dadosPessoais.setEmail(rs.getString("email"));
                f.setDadosPessoais(dadosPessoais);
                f.setCargo(rs.getString("cargo"));
                f.setRemuneracao(rs.getFloat("remuneracao"));
                f.setPercentualComissao(rs.getInt("percentualComissao"));
                f.setStatusFuncionario("statusFuncionario");
                f.setHistoricoFuncionario("historicoFuncionario"); 
                
                String cadastro = " FICHA CADASTRAL " +
                        "\n Código Funcional - " + f.getCodigoFuncional() + "\n" +
                        "\n Dados Pessoais: \n" +
                        "\n      Nome - " + f.getDadosPessoais().getNome() +
                        "\n       CPF - " + f.getDadosPessoais().getCpf() +
                        "\n        RG - " + f.getDadosPessoais().getRg() +
                        "\n  Endereço - " + f.getDadosPessoais().getEndereco() + 
                        "\n  Telefone - " + f.getDadosPessoais().getTelefone() +
                        "\n     Email - " + f.getDadosPessoais().getEmail() + "\n" +
                        "\n Dados Profissionais: \n" +
                        "\n        Cargo - " + f.getCargo() +
                        "\n  Remuneração - " + f.getRemuneracao() +
                        "\n     Comissão - " + f.getPercentualComissao() + " %" +
                        "\n    Histórico - \n" + f.getHistoricoFuncionario();
                
                return cadastro;
            }
            catch(SQLException ex){
                 return null;
            }
        }
}
