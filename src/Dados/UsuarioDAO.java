package Dados;

import Classes.Usuario;
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

public class UsuarioDAO {
    
    Connection conn;
    PreparedStatement st;
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/UC15Atividade05","root", "W@gn1989");
            System.out.println("Conexão (Usuario) efetuada com sucesso");
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
    
    public void salvar(Usuario u){
        try{
            st = conn.prepareStatement("INSERT INTO USUARIO (funcionario, usuario, senha, nivelAcesso) VALUES (?, ?, ?, ?)");
            st.setInt(1, u.getFuncionario());
            st.setString(2, u.getUsuario());
            st.setString(3, u.getSenha());
            st.setInt(4, u.getNivelAcesso());
            
            st.executeUpdate();
            
            
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }
        
    }
    
    public Usuario getUsuario(int funcionario){
        try{
            st = conn.prepareStatement("SELECT * FROM USUARIO WHERE funcionario=?");
            st.setInt(1, funcionario);
            ResultSet rs = st.executeQuery();
            
            Usuario u = new Usuario();
            FuncionarioDAO f = new FuncionarioDAO();
            rs.next();
            u.setCodigoUsuario(rs.getInt("codigoUsuario"));
            u.setFuncionario(rs.getInt("funcionario"));
            u.setNivelAcesso(rs.getInt("nivelAcesso"));
            u.setUsuario(rs.getString("usuario"));
            u.setSenha(rs.getString("senha"));
            
            return u;
        }
        catch(SQLException ex){
            System.out.println("Pesquisa não localizada: " + ex.getMessage());
            return null;
        }
    }
    
    public void alterarSenha(int funcionario, String senha){
        try{
            st = conn.prepareStatement("UPDATE USUARIO SET senha=? WHERE funcionario=?");
            st.setString(1, senha);
            st.setInt(2, funcionario);
            
            st.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }   
    }
    
    public void excluir(int funcionario){
        try{
           
            st = conn.prepareStatement("DELETE FROM USUARIO WHERE funcionario=?");
            st.setInt(1, funcionario);
            st.execute();
            
            System.out.println("Usuário Deletado");
        }
        catch(SQLException ex){
            System.out.println("Erro ao deletar o Usuário: " + ex.getMessage());
        }
    }
    
    public List<Usuario> listaUsuarios(){
        try{
            PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM USUARIO");
            ResultSet rs = stmt.executeQuery();
            List<Usuario> listaUsuario = new ArrayList<>();
            
            while(rs.next()){
                Usuario u = new Usuario();
                FuncionarioDAO f = new FuncionarioDAO();
                u.setCodigoUsuario(rs.getInt(rs.getInt("codigoUsuario")));
                u.setFuncionario(rs.getInt("funcionario"));
                u.setNivelAcesso(rs.getInt("nivelAcesso"));
                u.setUsuario(rs.getString("usuario"));
                u.setSenha(rs.getString("senha"));
                
                listaUsuario.add(u);
            }
            
            return listaUsuario;
        }
        catch(SQLException ex){
            return null;
        }
        
        
    }
    
    public Usuario validar(String a, String b){
            try{
            st = conn.prepareStatement("SELECT * FROM USUARIO WHERE usuario=? AND senha=?");
            st.setString(1, a);
            st.setString(2, b);
            ResultSet rs = st.executeQuery();
            
            Usuario u = new Usuario();
            FuncionarioDAO f = new FuncionarioDAO();
            rs.next();
            u.setCodigoUsuario(rs.getInt("codigoUsuario"));
            u.setFuncionario(rs.getInt("funcionario"));
            u.setNivelAcesso(rs.getInt("nivelAcesso"));
            u.setUsuario(rs.getString("usuario"));
            u.setSenha(rs.getString("senha"));
            
            return u;
        }
        catch(SQLException ex){
            System.out.println("Pesquisa não localizada: " + ex.getMessage());
            return null;
        }
        }
}
