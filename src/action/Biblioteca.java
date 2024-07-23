package action;

import biblioteca.Item;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Item> itens = new ArrayList<>();
    List<Usuario>usuarios = new ArrayList<>();
    List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarItem(Item item){
        itens.add(new Item(item.getTitulo(), item.getAutor(), item.getAnoPublicaçao()) {
            @Override
            public String exibirDetathes() {
                return "";
            }
        });
    }

    public void registrarUsuario(Usuario usuario){
        usuarios.add(new Usuario(usuario.getNome(), usuario.getId()));
    }
    public void listarItens(){
        System.out.println(itens);
    }
    public  void listarUsuarios(){
        System.out.println(usuarios);
    }
    public void listarEmprestimosAtivos(){
        System.out.println();
    }
}
