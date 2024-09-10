package screen.screen.sound.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "artista_id")  // Chave estrangeira para o artista
    private Artista artista;

    private Date ano;

    public Musica(String nomeMusica) {
        this.titulo = nomeMusica;
    }

    public Musica() { }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Artista='" + artista.getNome() + '\'' +
                ", música=" + titulo + '\'' +
                ", ano=" + ano;
    }
}
