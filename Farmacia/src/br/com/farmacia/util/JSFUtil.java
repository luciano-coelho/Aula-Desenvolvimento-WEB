package br.com.farmacia.util;



import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class JSFUtil {

	public static void adicionarMensagemSucesso(String mensagem) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, mensagem);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);
	}
	
	public static void adicionarMensagemErro(String mensagem) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, mensagem);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);
	}
/*
public void efetuaLogin(String descricao){
    
    try {
        
        //1ºPasso - SQL
    	StringBuilder sql = new StringBuilder();
		sql.append("SELECT descricao ");
		Connection conexao = ConnectionFactory.conectar();

		PreparedStatement stmt = conexao.prepareStatement(sql.toString());
		
        stmt.setString(1, descricao);
       
        
        ResultSet resultado = stmt.executeQuery();
        
        if(resultado.next()){
            
            //Usuario Logou
            
            FrmMenu tela = new FrmMenu();
            tela.usuariologado = rs.getString("nome");
            tela.setVisible(true);
             
        
        }else{
            //Dados Incorretos
            JOptionPane.showMessageDialog(null, "Dados Incorretos!");
            FrmLogin telaLogin = new FrmLogin();
            telaLogin.setVisible(true);
        }
        
        
       } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro : " + erro);

    }*/
    
}


