
package controllers;

import models.Podcast;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AQUI TEM
 */
public class PodcastController {
    private List<Podcast> podcasts;

    public PodcastController() {
        podcasts = new ArrayList<>();
    }

    public void adicionarPodcast(Podcast podcast) {
        podcasts.add(podcast);
    }

    public List<Podcast> listarPodcasts() {
        return podcasts;
    }

    public List<Podcast> filtrarPorProdutor(String produtor) {
        List<Podcast> filtrados = new ArrayList<>();
        for (Podcast p : podcasts) {
            if (p.getNomeProdutor().equalsIgnoreCase(produtor)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}
