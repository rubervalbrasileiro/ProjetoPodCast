
package models;

/**
 *
 * @author AQUI TEM
 */
public class Podcast {
    private int id;
    private String nomeProdutor;
    private String nomeEpsodio;
    private int numeroEpisodio;
    private int duracao; // em minutos
    private String url;

    public Podcast() {
    }

    public Podcast(int id, String nomeProdutor, String nomeEpsodio, int numeroEpisodio, int duracao, String url) {
        this.id = id;
        this.nomeProdutor = nomeProdutor;
        this.nomeEpsodio = nomeEpsodio;
        this.numeroEpisodio = numeroEpisodio;
        this.duracao = duracao;
        this.url = url;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProdutor() {
        return nomeProdutor;
    }

    public void setNomeProdutor(String nomeProdutor) {
        this.nomeProdutor = nomeProdutor;
    }

    public String getNomeEpsodio() {
        return nomeEpsodio;
    }

    public void setNomeEpsodio(String nomeEpsodio) {
        this.nomeEpsodio = nomeEpsodio;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
