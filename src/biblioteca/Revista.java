package biblioteca;

public class Revista extends Item{

    public Revista(String titulo, String autor,  Integer anoPublicaçao) {

        super(titulo, autor, anoPublicaçao);
    }

    @Override
    public String exibirDetathes() {

        return getTitulo()+getAutor()+getAnoPublicaçao();
    }
}
