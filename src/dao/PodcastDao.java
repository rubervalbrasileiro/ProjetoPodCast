
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import models.Podcast;
import views.Login;
/**
 *
 * @author Familia Brasileiro
 */
public class PodcastDao {
    // Método para inserir um novo podcast no banco de dados
    public boolean inserirPodcast(Podcast podcast) {
        String sql = "INSERT INTO podcasts (nomeProdutor, nomeEpisodio, numeroEpisodio, duracao, url) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            ConexaoBD conexaoBD = new ConexaoBD();
            conn = conexaoBD.conectar(); // Obtém a conexão
            if (conn != null) {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, podcast.getNomeProdutor());
                stmt.setString(2, podcast.getNomeEpsodio());
                stmt.setInt(3, podcast.getNumeroEpisodio());
                stmt.setInt(4, podcast.getDuracao());
                stmt.setString(5, podcast.getUrl());

                int rowsAffected = stmt.executeUpdate();
                return rowsAffected > 0;
            } else {
                System.out.println("Falha ao conectar ao banco de dados.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }
    public static void main(String[]args){
        
        System.out.println("olá");
        Login login = new Login();
        login.setVisible(true);
    }
}
