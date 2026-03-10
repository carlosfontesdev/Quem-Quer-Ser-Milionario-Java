package business.dataModel;

import java.util.Objects;

/**
 * Esta Classe armazena informações sobre o jogador
 * Nome, Data de Nascimento, ID
 */
public class Jogador {
    
    /**
     * Variaveis privadas da classe jogador, como o Id, Nome, Data de Nascimento
     */
    private int idJogador;
    private String nomeJogador;
    private String dataNascimento;
     
    /**
     * Construtor para criar um novo jogador
     * @param nomeJogador O nome do jogador
     * @param dataNascimento A data de nascimento formato (DD/MM/AAAA)
     */
    public Jogador( String nomeJogador, String dataNascimento) {
        
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * Serve para obter a data de Nascimento do jogador
     * @return dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }
   
    /**
     * Serve para modificar a data de nasciemnto
     * @param dataNascimento 
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * Serve para ir buscar o ID do jogador
     * @return idJogador
     */
    public int getIdJogador() {
        return idJogador;
    }
    /**
     * Serve para modificar o id do jogador
     * @param idJogador 
     */
    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }
    /**
     * Serve para ir buscar o nome do jogador 
     * @return nomeJogador
     */
    public String getNomeJogador() {
        return nomeJogador;
    }
    /**
     * Serve para modificar o Nome do jogador
     * @param nomeJogador 
     */
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idJogador;
        hash = 41 * hash + Objects.hashCode(this.nomeJogador);
        hash = 41 * hash + Objects.hashCode(this.dataNascimento);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (this.idJogador != other.idJogador) {
            return false;
        }
        if (!Objects.equals(this.nomeJogador, other.nomeJogador)) {
            return false;
        }
        return Objects.equals(this.dataNascimento, other.dataNascimento);
    }
    
    
    
    
    
    
}
