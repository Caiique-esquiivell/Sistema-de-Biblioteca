package application;

import action.Usuario;
import biblioteca.Livro;
import biblioteca.Revista;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas informações abaixo.");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu ID de 4 digitos: ");
        int id = sc.nextInt();
        sc.nextLine();
        Usuario usuario = new Usuario(nome,id);

        System.out.println("Olá " + usuario.toString());
        System.out.print("Dejesa adicionar um livro ou revista: ");
        String repost = sc.nextLine();

        if (repost.equalsIgnoreCase("Sim")){
            System.out.print("Você deseja adicionar uma revista ou um livro. ");
            String revLiv = sc.nextLine();
            if (revLiv.equalsIgnoreCase("livro")){
                System.out.println("Digite as informações do livro abaixo: ");
                System.out.println("Titulo do livro: ");
                String titulo = sc.nextLine();
                System.out.println("Nome do autor do livro: ");
                String autor = sc.nextLine();
                System.out.println("ano de publicação do livro: ");
                int anoPublicacao = sc.nextInt();
                Livro livro = new Livro(titulo,autor,anoPublicacao);
                System.out.println(livro.exibirDetathes());
            }
            else {
                System.out.println("Digite as informações da revista abaixo. ");
                System.out.print("Titulo do revista: ");
                String titulo = sc.nextLine();
                System.out.print("Nome dos autores da revista: ");
                String autor = sc.nextLine();
                System.out.print("ano de publicação da revista: ");
                int anoPublicacao = sc.nextInt();
                Revista revista = new Revista(titulo,autor,anoPublicacao);
                System.out.println(revista.exibirDetathes());
            }


        }


        sc.close();
    }
}