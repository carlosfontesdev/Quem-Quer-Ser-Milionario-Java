package business.dataModel;



/**
 *Esta Classe armazena informações Sobre as opcoes de cada pergunta
 * Guarda o texto da opção, guarda numa variavel boolean se esta certo ou errado e o Id
 * 
 */
public class Opcao {
    int idOpcao;
    String texto;
    boolean resposta;
    
    /**
     * Construtor para criar uma Opção
     * @param idOpcao
     * @param texto O conteudo em forma de texto da opção
     * @param resposta Booleano que indica se está certo ou errado
     */
    public Opcao(int idOpcao, String texto, boolean resposta) {
        this.idOpcao = idOpcao;
        this.texto = texto;
        this.resposta = resposta;
    }

    
    /**
     * Obtem o Id da opção
     * @return idOpcao
     */
    public int getIdOpcao() {
        return idOpcao;
    }
    
    /**
     * Modifica ou define o Id da Opção
     * @param idOpcao 
     */
    public void setIdOpcao(int idOpcao) {
        this.idOpcao = idOpcao;
    }
    
    /**
     * Serve para obter o texto da opção
     * @return texto. String com o conteudo
     */
    public String getTexto() {
        return texto;
    }
    
    /**
     * Serve para definir ou modificar o texto da opção.
     * @param texto 
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /**
     * Serve para verificar se a opção está correta
     * @return true se a opção é correta ou false se não for
     */
    public boolean getResposta() {
        return resposta;
    }
    
    /**
     * Serve para definir ou modificar o estado da resposta
     * @param resposta 
     */
    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public String toString() {
        return  texto ;
    }
    
   
    
    
}
