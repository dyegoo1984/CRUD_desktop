package Dados;

import Classes.ItensOrcamento;
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

public class ItensOrcamentoDAO {
    Connection conn;
    PreparedStatement st;
    Conexao dataBase = new Conexao();
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/UC15Atividade05","root", "W@gn1989");
            System.out.println("Conexão (Itens Orçamento) efetuada com sucesso");
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
    
    public void salvar(ItensOrcamento io){
        try{
            st = conn.prepareStatement("INSERT INTO ITENS_ORCAMENTO (item, unidade, valor) VALUES (?, ?, ?)");
            
            st.setString(1, io.getItem());
            st.setString(2, io.getUnidade());
            st.setDouble(3, io.getValor());
            
            st.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }
    }
    
    public void editar(ItensOrcamento itemAtualizado){
        try{
            st = conn.prepareStatement("UPDATE ITENS_ORCAMENTO SET item=?, unidade=?, valor=? WHERE codigoItem=?");
            st.setString(1, itemAtualizado.getItem());
            st.setString(2, itemAtualizado.getUnidade());
            st.setDouble(3, itemAtualizado.getValor());
            st.setInt(4, itemAtualizado.getCodigoItem());
            
            
            st.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("Erro ao Salvar: " + ex.getMessage());
        }
    }
    
    public ItensOrcamento buscarItem(int codigoItem){
        try{
            st = conn.prepareStatement("SELECT * FROM ITENS_ORCAMENTO WHERE codigoItem=?");
            st.setInt(1, codigoItem);
            ResultSet rs = st.executeQuery();
            
            ItensOrcamento io = new ItensOrcamento();
            io.setCodigoItem(rs.getInt("codigoItem"));
            io.setItem(rs.getString("item"));
            io.setUnidade(rs.getString("unidade"));
            io.setValor(rs.getDouble("valor"));
            
            return io;
        }
        catch(SQLException ex){
            return null;
        }
      
    }
    
    public void excluir(int codigoItem){
        try{
            st = conn.prepareStatement("DELETE FROM ITENS_ORCAMENTO WHERE codigoItem=?");
            st.setInt(1, codigoItem);
            st.execute();
            
            System.out.println("Item Deletado");
        }
        catch(SQLException ex){
            System.out.println("Erro ao deletar o Item: " + ex.getMessage());
        }
    }
    
    public List<ItensOrcamento> listaItens(){
        try{
            st = conn.prepareStatement("SELECT * FROM ITENS_ORCAMENTO");
            ResultSet rs = st.executeQuery();
            List<ItensOrcamento> listaItem = new ArrayList<>();
            
            while(rs.next()){
                ItensOrcamento io = new ItensOrcamento();
                io.setCodigoItem(rs.getInt("codigoItem"));
                io.setItem(rs.getString("item"));
                io.setUnidade(rs.getString("unidade"));
                io.setValor(rs.getDouble("valor"));
                
                listaItem.add(io);
            }
            
            return listaItem;
        }
        catch(SQLException ex){
            return null;
        }
    }    
}
