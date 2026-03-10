package business.dataModel;

/**
 *
 * @author formando
 */
public class RondaJogo {
    private int idRondaJogo;
    private boolean ajuda50_50;
    private boolean ajudaMudarPergunta;
    private String premio;

    public RondaJogo(boolean ajuda50_50, boolean ajudaMudarPergunta, String premio) {
        this.ajuda50_50 = ajuda50_50;
        this.ajudaMudarPergunta = ajudaMudarPergunta;
        this.premio = premio;
    }
    public RondaJogo(){
        
    }

    public int getIdRondaJogo() {
        return idRondaJogo;
    }

    public void setIdRondaJogo(int idRondaJogo) {
        this.idRondaJogo = idRondaJogo;
    }

    public boolean isAjuda50_50() {
        return ajuda50_50;
    }

    public void setAjuda50_50(boolean ajuda50_50) {
        this.ajuda50_50 = ajuda50_50;
    }

    public boolean isAjudaMudarPergunta() {
        return ajudaMudarPergunta;
    }

    public void setAjudaMudarPergunta(boolean ajudaMudarPergunta) {
        this.ajudaMudarPergunta = ajudaMudarPergunta;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idRondaJogo;
        hash = 29 * hash + (this.ajuda50_50 ? 1 : 0);
        hash = 29 * hash + (this.ajudaMudarPergunta ? 1 : 0);
        
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
        final RondaJogo other = (RondaJogo) obj;
        if (this.idRondaJogo != other.idRondaJogo) {
            return false;
        }
        if (this.ajuda50_50 != other.ajuda50_50) {
            return false;
        }
        if (this.ajudaMudarPergunta != other.ajudaMudarPergunta) {
            return false;
        }
        return this.premio == other.premio;
    }
    
    
    
}
