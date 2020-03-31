package br.com.farmacia.test;

/*
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;*/



public class ProdutoDAOteste {
	
	/*
	public static void main(String[] args) {
		
		
		
		
		try {
			
			Produtos p = new Produtos();
			p.setCodigo(2);
			p.setDescricao("Cataflan");
			p.setPreco(15.75);
			p.setQuantidade(2L);
			
			Fornecedores f = new Fornecedores();
			f.setCodigo(10);
			p.setFornecedores(f);
			
			
			ProdutoDAO dao = new ProdutoDAO();
			dao.editar(p);
			
			System.out.println("editado" + p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
}
		
		/*try {
			
			ProdutoDAO fdao = new ProdutoDAO();
			ArrayList<Produtos> lista = fdao.listar();
			
			for (Produtos p : lista){
				System.out.println("Código do Produto: " + p.getCodigo());
				System.out.println("Descrição do Produto: " + p.getDescricao());
				System.out.println("Valor do Produto: " + p.getPreco());
				System.out.println("Quantidade: " + p.getQuantidade());
				System.out.println("Código do Fornecedor: " + p.getFornecedores().getCodigo());
				System.out.println("Descrição do Fornecedor: " + p.getFornecedores().getDescricao());
				System.out.println("");
			}
			
			lista = fdao.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	
	 
		/*
		try {
			Produtos p1 = new Produtos();
			p1.setDescricao("Teste");
			p1.setPreco(4.99);
			p1.setQuantidade(12L);
			
			Fornecedores f = new Fornecedores();
			f.setCodigo(5);
			p1.setFornecedores(f);
			
			
			
			ProdutoDAO fdao = new ProdutoDAO();
			
			fdao.salvar(p1);
			
			System.out.println("Salvo");
			
		} catch (SQLException e) {
			System.out.println("erro: " + e);
			e.printStackTrace();
		}
	}*/

