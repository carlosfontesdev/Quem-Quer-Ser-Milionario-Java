package business.dataModel;

import java.util.ArrayList;

/**
 * Esta Classe armazena informações sobre uma pergunta do jogo
 * Guarda o texto da pergunta, o nivel de dificuldade e uma lista de opções associadas a cada pergunta
 */
public class Pergunta {

    private int idPergunta;
    private String texto;
    private int dificuldade;
    private ArrayList<Opcao> opcao;
    
    /**
     * Construtor da classe pergunta
     * Inicializa uma lista de opções como vazia
     * @param idPergunta Identificador unico da pergunta
     * @param texto Uma string com o texto da pergunta
     * @param dificuldade O nivel de dificuldade de cada pergunta
     */
    public Pergunta(int idPergunta, String texto, int dificuldade) {
        this.idPergunta = idPergunta;
        this.texto = texto;
        this.dificuldade = dificuldade;
        this.opcao = new ArrayList<>();

    }
    
    /**
     * Serve para retornar uma lista de opções associadas a uma pergunta
     * @return opcao (ArrayList)
     */
    public ArrayList<Opcao> getOpcao() {
        return opcao;
    }
    
    /**
     * Adiciona uma opção de resposta de uma certa pergunta na lista de opções se ainda não estiver.
     * @param o
     * @return true se a opção foi adicionada , false se a opção ja existir
     */
    public boolean adicionarOpcao(Opcao o) {
        if (!opcao.contains(o)) {
            opcao.add(o);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Obtem o Id da pergunta
     * @return idPergunta
     */
    public int getIdPergunta() {
        return idPergunta;
    }
    
    /**
     * Modifica ou defini o Id da pergunta
     * @param idPergunta 
     */
    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }
    
    /**
     * Serve para obter o texto da pergunta
     * @return texto. String com o conteudo
     */
    public String getTexto() {
        return texto;
    }
    
    /**
     * Serve para definir ou modificar o texto da pergunta
     * @param texto 
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /**
     * Serve para obter o nivel de dificuldade da pergunta
     * @return dificuldade
     */
    public int getDificuldade() {
        return dificuldade;
    }
    
    /**
     * Serve para modificar ou definir o nivel de dificuldade da pergunta
     * @param dificuldade 
     */
    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

}
