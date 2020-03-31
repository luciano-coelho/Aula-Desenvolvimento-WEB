package br.com.farmacia.test;




public class GerarTabela {

	public static void main(String[] args) {

		try {
			HibernateUtil.getSessionFactory();
			System.out.println("Conectado com Sucesso!");
			HibernateUtil.getSessionFactory().close();
		
		} catch (Exception e) {
			System.out.println("Erro:"+e);
			
		}
		
		
		
		


	}

}
