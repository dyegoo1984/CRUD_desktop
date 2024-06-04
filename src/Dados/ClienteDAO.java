package Dados;

import Classes.CadastroInformacoesPessoais;
import Classes.Cliente;
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

public class ClienteDAO {
    Connection conn;
    PreparedStatement st;
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/UC15Atividade05","root", "W@gn1989");
            System.out.println("Conexão (Cliente) efetuada com sucesso");
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
    
    public void salvar(Cliente c){
        try{
            
            st = conn.prepareStatement("INSERT INTO CLIENTE(nome, cpf, rg, endereco, telefone, email, vendedorResponsavel, historicoAtendimento) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            
            st.setString(1, c.getDadosPessoais().getNome());
            st.setString(2, c.getDadosPessoais().getCpf());
            st.setString(3, c.getDadosPessoais().getRg());
            st.setString(4, c.getDadosPessoais().getEndereco());
            st.setString(5, c.getDadosPessoais().getTelefone());
            st.setString(6, c.getDadosPessoais().getEmail());
            st.setInt(7, c.getVendedorResponsavel());
            st.setString(8, c.getHistoricoAtendimento());
            
            st.executeUpdate();
                   
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }
        
    }
    
    public void editar(Cliente c){
        try{            
            st = conn.prepareStatement("UPDATE CLIENTE SET nome=?, cpf=?, rg=?, endereco=?, telefone=?, email=?, vendedorResponsavel=?, historicoAtendimento=? WHERE codigoCliente=?");
            
            st.setString(1, c.getDadosPessoais().getNome());
            st.setString(2, c.getDadosPessoais().getCpf());
            st.setString(3, c.getDadosPessoais().getRg());
            st.setString(4, c.getDadosPessoais().getEndereco());
            st.setString(5, c.getDadosPessoais().getTelefone());
            st.setString(6, c.getDadosPessoais().getEmail());
            st.setInt(7, c.getVendedorResponsavel());
            st.setString(8, c.getHistoricoAtendimento());
            st.setInt(9, c.getCodigoCliente());
            
            st.executeUpdate();
                   
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }
       
    }
    
    public Cliente getCliente(int codigoCliente){
        try{
            st = conn.prepareStatement("SELECT * FROM CLIENTE WHERE codigoCliente=?");
            st.setInt(1, codigoCliente);
            ResultSet rs = st.executeQuery();
            
            Cliente c = new Cliente();
            rs.next();
            c.setCodigoCliente(codigoCliente);
            CadastroInformacoesPessoais dadosPessoais = new CadastroInformacoesPessoais();
            dadosPessoais.setNome(rs.getString("nome"));
            dadosPessoais.setCpf(rs.getString("cpf"));
            dadosPessoais.setRg(rs.getString("rg"));
            dadosPessoais.setEndereco(rs.getString("endereco"));
            dadosPessoais.setTelefone(rs.getString("telefone"));
            dadosPessoais.setEmail(rs.getString("email"));
            c.setDadosPessoais(dadosPessoais);
            FuncionarioDAO fd = new FuncionarioDAO();
            c.setVendedorResponsavel(rs.getInt("vendedorResponsavel"));
            c.setHistoricoAtendimento(rs.getString("historicoAtendimento"));
            
            
            return c;
        }
        catch(SQLException ex){
            System.out.println("Pesquisa não localizada: " + ex.getMessage());
            return null;
        }
        
    }
    
    public void excluir(int codigoCliente){
        try{
            st = conn.prepareStatement("DELETE FROM CLIENTE WHERE codigoCliente=?");
            st.setInt(1, codigoCliente);
            st.execute();
            
            System.out.println("Cliente Deletado");
        }
        catch(SQLException ex){
            System.out.println("Erro ao deletar o cliente: " + ex.getMessage());
        }
    }
    
    public List<Cliente> listaClientes(){
        try{
            st = conn.prepareStatement("SELECT * FROM CLIENTE");
            ResultSet rs = st.executeQuery();
            List<Cliente> listaCliente = new ArrayList<>();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setCodigoCliente(rs.getInt("codigoCliente"));
                CadastroInformacoesPessoais dadosPessoais = new CadastroInformacoesPessoais();
                dadosPessoais.setNome(rs.getString("nome"));
                dadosPessoais.setCpf(rs.getString("cpf"));
                dadosPessoais.setRg(rs.getString("rg"));
                dadosPessoais.setEndereco(rs.getString("endereco"));
                dadosPessoais.setTelefone(rs.getString("telefone"));
                dadosPessoais.setEmail(rs.getString("email"));
                c.setDadosPessoais(dadosPessoais);
                FuncionarioDAO fd = new FuncionarioDAO();
                c.setVendedorResponsavel(rs.getInt("vendedorResponsavel"));
                c.setHistoricoAtendimento(rs.getString("historicoAtendimento"));
                
                listaCliente.add(c);
            }
            
            return listaCliente;
        }
        catch(SQLException ex){
            return null;
        }
    }
    
}
