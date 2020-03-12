/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author frede
 */
public class ConectaBanco {
    
    public Statement stm; // responsável por preparar e realizar pesquisas
    public ResultSet rs; // responsável por armazenar o resultado de uma pesquisa passada para o Statement
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/sistemavideoaula";
    private String usuario = "postgres";
    private String senha = "1234";
    public Connection conn; // responsável por realizar a conexão com o banco

    
    public void conectar(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão: " + e.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
    }
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Fechar Conexão: " + e.getMessage());
        }
    }
    
}
