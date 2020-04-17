package com.livro.capitulo3.crudjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ContatoCrudJDBC {
	
	public void salvar (Contato contato) {
		Connection conexao = this.gerarConexao();
		
		PreparedStatement insereSt = null;
		
		String sql = "insert into contato(nome,telefone,email,dt_card,obs) values(?,?,?,?,?)";
			try{
				insereSt = conexao.prepareStatement(sql);
				insereSt.setString(1, contato.getNome());
				insereSt.setString(2, contato.getTelefone());
				insereSt.setString(3, contato.getEmail());
				insereSt.setDate(4, contato.getDataCadastro());
				insereSt.setString(5, contato.getObservacao());
				insereSt.executeUpdate();
			
					
			}catch(SQLException e) {
				System.out.println("Erro ao incluir contato. Mensagem: "+ e.getMessage());
			}finally {
				try {
					insereSt.close();
					conexao.close();
				}catch(Throwable e) {
					System.out.println("Erro ao fechar operações de inserção.Mensagem: "+e.getMessage());
				}
				
			}
				
	}
	public void atualizar (Contato contato) {};
	public void excluir (Contato contato) {};
	public List<Contato> listar(Contato contato){};
	public Contato buscaContato (int valor) {};
	public Connection gerarConexao() {}
	
	public static void main(String[] args) {
		s
	}
	
	

}
