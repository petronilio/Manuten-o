/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloCidades;

/**
 *
 * @author frede
 */
public class ControleCidade {
    
    ConectaBanco conexao = new ConectaBanco();
    
    public void inserirCidade(ModeloCidades modeloCidades){
        conexao.conectar();
        
        String sql = "insert into cidade ("
                        + "nome_cidades,"
                        + "id_estado)"
                        + "values("
                        + "?,?)";
        
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            
            pst.setString(1, modeloCidades.getNome());
            pst.setInt(2, modeloCidades.getCod_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cidade cadastrada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Incluir: " + e.getMessage());
        }
        conexao.desconectar();
    }
    
    public void excluirCidade(ModeloCidades modeloCidades){
        conexao.conectar();
        
        String sql = "delete from cidade where id_cidade = ?";
        
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            
            pst.setInt(1, modeloCidades.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cidade Excluída com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + e.getMessage());
        }
        conexao.desconectar();
    }
    
    public void alterarCidade(ModeloCidades modeloCidades){
        conexao.conectar();
        
        String sql = "update cidade set nome_cidades = ?, id_estado = ? where id_cidade = ?";
        
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            
            pst.setString(1, modeloCidades.getNome());
            pst.setInt(2, modeloCidades.getCod_estado());
            pst.setInt(3, modeloCidades.getCod());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Cidade Alterada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar: " + e.getMessage());
        }
        conexao.desconectar();
    }
    
}
