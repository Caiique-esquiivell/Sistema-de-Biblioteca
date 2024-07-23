package biblioteca;

public abstract class Item {

    private String titulo;
    private String autor;
    private Integer anoPublicaçao;

    public Item(String titulo, String autor, Integer anoPublicaçao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicaçao = anoPublicaçao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicaçao() {
        return anoPublicaçao;
    }

    public void setAnoPublicaçao(Integer anoPublicaçao) {
        this.anoPublicaçao = anoPublicaçao;
    }

    public abstract String exibirDetathes();
}
