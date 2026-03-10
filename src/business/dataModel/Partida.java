package business.dataModel;

/**
 *Esta Classe representa uma partida
 * Guarda o nivel do jogador, e o estado dos checkpoints;
 * 
 */
public class Partida {
    private int id;
    private int nivelAtual;
    private boolean checkpoint1;
    private boolean checkpoint2;
    
    /**
     * Construtor da Classe para iniciar uma nova
     * @param nivelAtual Nivel em que o jogador se encontra
     * @param checkpoint1 Indica se o primeiro checkPoint foi alcançado  
     * @param checkpoint2 Indica se o segundo checkPoint foi alcançado  
     */
    public Partida(int nivelAtual, boolean checkpoint1, boolean checkpoint2) {
        this.nivelAtual = nivelAtual;
        this.checkpoint1 = checkpoint1;
        this.checkpoint2 = checkpoint2;
    }
    
    /**
     * Obtem o Id da Partida
     * @return id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Modifica ou define o Id da partida
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Serve para obter o nivel atual da partida
     * @return nivelAtual
     */
    public int getNivelAtual() {
        return nivelAtual;
    }
    
    /**
     * Serve para definir ou modificar o nivel atual da partida
     * @param nivelAtual 
     */
    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }
    
    /**
     * Verifica se o jogador ja passou o primeiro checkpoint
     * @return true se passou e false se ainda não
     */
    public boolean isCheckpoint1() {
        return checkpoint1;
    }
    
    /**
     * Serve para definir ou modificar o estado do primeiro checkpoint
     * @param checkpoint1 
     */
    public void setCheckpoint1(boolean checkpoint1) {
        this.checkpoint1 = checkpoint1;
    }
    
    /**
     * Verifica se o jogador ja passou o segundo checkpoint
     * @return true se passou e false se ainda não
     */
    public boolean isCheckpoint2() {
        return checkpoint2;
    }
    
    /**
     * Serve para definir ou modificar o estado do segundo checkpoint
     * @param checkpoint2 
     */
    public void setCheckpoint2(boolean checkpoint2) {
        this.checkpoint2 = checkpoint2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.id;
        hash = 61 * hash + this.nivelAtual;
        hash = 61 * hash + (this.checkpoint1 ? 1 : 0);
        hash = 61 * hash + (this.checkpoint2 ? 1 : 0);
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
        final Partida other = (Partida) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.nivelAtual != other.nivelAtual) {
            return false;
        }
        if (this.checkpoint1 != other.checkpoint1) {
            return false;
        }
        return this.checkpoint2 == other.checkpoint2;
    }
    
    
    
}
