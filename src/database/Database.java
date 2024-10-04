
package database;

import models.Podcast;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author AQUI TEM
 */
public class Database {
    private List<Podcast> podcasts = new ArrayList<>();
    private int nextId = 1;
    
    public Database() {
        podcasts = new ArrayList<>();
    }
    
    public void adicionarPodcast(Podcast podcast) {
        podcast.setId(nextId++);
        podcasts.add(podcast);
        
    }
    
    public void removerPodcast(int id) {
    podcasts.removeIf(p -> p.getId() == id);
    }
    
    public void atualizarPodcast(Podcast podcastAtualizado) {
    for (int i = 0; i < podcasts.size(); i++) {
        if (podcasts.get(i).getId() == podcastAtualizado.getId()) {
            podcasts.set(i, podcastAtualizado);
            return;
        }
    }
}

     public List<Podcast> listarPodcasts() {
        return new ArrayList<>(podcasts);
    }

   public List<Podcast> filtrarPodcastsPorProdutor(String produtor) {
        List<Podcast> filtrados = new ArrayList<>();
        for (Podcast podcast : podcasts) {
            if (podcast.getNomeProdutor().equals(produtor)) {
                filtrados.add(podcast);
            }
        }
        return filtrados;
    }
    public static void main(String[]args){
        
    }
}
