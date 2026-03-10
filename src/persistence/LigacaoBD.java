package persistence;

import business.dataModel.Jogador;
import business.dataModel.Opcao;
import business.dataModel.Pergunta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LigacaoBD {

    private String baseDados = "efa0125_01_projeto_java";
    private String servidor = "62.28.39.135";
    private String user = "efa0125";
    private String password = "123.Abc";
    private String stringConnection = "jdbc:mysql://" + servidor + ":3306/" + baseDados;

    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    public LigacaoBD() {
        try {
            con = DriverManager.getConnection(stringConnection, user, password);
            st = con.createStatement();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    // Método responsável por fazer uma consulta á base de dados
    private ResultSet getConsulta(String sql) throws SQLException {
        rs = st.executeQuery(sql);
        return rs;
    }

    //Método responsável por inserir dados na Base de Dados
    private int setDados(String sql) throws SQLException {
        return st.executeUpdate(sql);
    }

    //Método para inserir nome do jogador na Base de Dados
    public boolean executarInsercaoJogador(Jogador jogador) throws SQLException {
        String sql = "Insert into jogador() VALUES (default,'" + jogador.getNomeJogador() + "','" + jogador.getDataNascimento() + "')";

        return setDados(sql) > 0;
    }

    //Método para ir buscar uma pergunta á  Base de Dados
    public Pergunta buscarPergunta(int dificuldade) throws SQLException {

        String sql = "Select * from pergunta WHERE dificuldade= '" + dificuldade + "'"+"ORDER BY RAND()";
        rs = getConsulta(sql);
        while (rs.next()) {
            Pergunta p = new Pergunta(rs.getInt("id"), rs.getString("texto"), rs.getInt("dificuldade"));
           return p;
        }
        return null;   
    }
    
    //Método para ir buscar uma lista de opcoes á base de dados
    public void buscarOpcoes(Pergunta p) throws SQLException {

        String sql = "Select * from opcao where pergunta_id= " + p.getIdPergunta() +" ORDER BY RAND()";
        rs = getConsulta(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String texto = rs.getString("texto");
            boolean resposta = rs.getBoolean("resposta");

            Opcao o = new Opcao(id, texto, resposta);
            p.adicionarOpcao(o);

        }
    }

    //Método para ir buscar uma pergunta á Base de Dados para a Ajuda
    public Pergunta buscarPerguntaAjuda(int dificuldade, int idPergunta) throws SQLException{
        String sql = "Select * from pergunta WHERE dificuldade= '"+ dificuldade + "'"+"And id != '"+idPergunta+"'";
        rs = getConsulta(sql);
        while(rs.next()){
            Pergunta p = new Pergunta(rs.getInt("id"), rs.getString("texto"), rs.getInt("dificuldade"));
            return p;
        }
        return null;
    }
    
    //Método para verificar se o nome já existe na Base de Dados
    public Boolean verificarNome(String nome) throws SQLException {
        String sql = "Select * from jogador where nome_jogador = '" + nome + "'";
        rs = getConsulta(sql);
        while (rs.next()) {
 
            return true;
 
        }
        return false;
    }

    //Método para encerrar a ligação á Base de Dados
    public void closeDBConnections() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
