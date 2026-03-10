/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.dataModel;

import java.awt.Color;
import java.sql.SQLException;
import javax.crypto.AEADBadTagException;
import persistence.LigacaoBD;

/**
 *
 * @author formando
 */
public class Services {
    private Pergunta perguntaAtual;
    private LigacaoBD ligacao = new LigacaoBD();
    private Opcao opcao;
    private int indicePremio = -1;
    //Criar um objeto da classe rondaJogo para conseguir ir buscar o prémio
    private RondaJogo rondaJogo = new RondaJogo(false, false, "0");
    private Partida partida = new Partida(0, true, true);
    
    //Método para ir buscar uma pergunta
    public Pergunta pergunta(int nivelJogo)
    {
        partida.setNivelAtual(nivelJogo);
        
        try{
            //Insere na variavel PerguntaAtual a pergunta correspondete ao nivel atual
            perguntaAtual = ligacao.buscarPergunta(nivelJogo);
            
            
            
        } catch (Exception e) {
            System.out.println("Nao funcionou!! " + e.getMessage());
        }   
        
        return perguntaAtual;
    }
     //Método para preencher o objeto opcao com a respetiva pergunta
    public void opcao(Pergunta p){
        //Vai á base de dados buscar as opcoes correspondentes á pergunta que esta na variavel perguntaAtual
        try{
            ligacao.buscarOpcoes(p);
        }catch (Exception e){
            System.out.println("Nao conseguiu ir buscar as opçoes"+e.getMessage());
        }
        
    }
    
    //Método para validar uma resposta
    public boolean validarResposta(int indice ){
        Opcao op = perguntaAtual.getOpcao().get(indice);
        
        if(op.getResposta()){
            return true;
        }
        return false;
    }
    
    //Método que devolve o indice do prémio
    public int indicePremio(){
        
        indicePremio=indicePremio+1;
        return indicePremio;
    }
    
    //Método para guardar o prémio em que o utilizador vai
    public void guardarPremio(String  premio){
        rondaJogo.setPremio(premio);
    }
    
    //Método para mostrar o premio quando o utilizador faz GameOver
    public String mostrarPremio (){
        return rondaJogo.getPremio();
    }
    
    //Método que verifica se o nome ja existe na Base de Dados 
    public boolean nomeExiste (String nome) throws SQLException{
        //Se o nome já existir o método retorna True
        if (ligacao.verificarNome(nome)) {
            return true;
        }   
        return false;
    }
    
    //Este método permite inserir um jogador ao usar um objeto da classe LigacaBD 
    public void inserirJogador(String nome, String data) throws SQLException{
        Jogador jogador=new Jogador(nome, data);
        ligacao.executarInsercaoJogador(jogador);
    }
    
    //Método que valida se o nome a data estão corretos para inserir na Base de Dados
    public String validarEInserirJogador(String nome, String data) {
    try {
        // 1. Verifica se os campos estão vazios
        if (nome.isEmpty() || data.isEmpty()) {
            return "Tem que preencher todos os campos!";
        }

        // 2. Validação do Nome (não pode conter números)
        if (nome.matches(".*\\d.*")) {
            return "O nome não pode conter números!";
        }

        // 3. Validação do Formato da Data (Regex)
        // Aqui usamos o padrão 2 dígitos / 2 dígitos / 4 dígitos
        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return "Formato de data incorreto!\nPor favor, use o formato: DD/MM/AAAA";
        }

        // 4. Verifica se o nome já existe na BD
        if (nomeExiste(nome)) {
            return "Esse nome de jogador já existe na Base de Dados";
        }

       
        
        inserirJogador(nome, data);

        return ""; // Retorna String vazia para indicar SUCESSO

    } catch (SQLException e) {
        return "Erro ao ligar à Base de Dados: " + e.getMessage();
    } catch (Exception e) {
        return "Ocorreu um erro inesperado: " + e.getMessage();
    }
}

    //Método para dar pergunta da Ajuda de Trocar a pergunta
    public Pergunta perguntaAjuda(int nivelJogo){
         rondaJogo.setAjudaMudarPergunta(true);
        try{
            //Insere na variavel PerguntaAtual a pergunta correspondete ao nivel atual
            perguntaAtual = ligacao.buscarPerguntaAjuda(nivelJogo,perguntaAtual.getIdPergunta());
            
            
            
        } catch (Exception e) {
            System.out.println("Nao funcionou!! " + e.getMessage());
        }   
        
        return perguntaAtual;
}
}
