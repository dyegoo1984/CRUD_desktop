package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* Senac EAD – TDS
* UC15 - Atividade 5
* @author Diego Oliveira
* @version 1.0
* @since Primeira versão
*/

public class Conexao {
    
    Connection conn;
        
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/UC15Atividade05","root", "W@gn1989");
            System.out.println("Conexão efetuada com sucesso");
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
}
