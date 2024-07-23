package biblioteca;

public class Livro extends  Item{

    public Livro(String titulo, String autor, Integer anoPublicaçao) {
        super(titulo, autor, anoPublicaçao);
    }

    @Override
    public String exibirDetathes() {
        return getTitulo()+getAutor()+getAnoPublicaçao();
    }



}
