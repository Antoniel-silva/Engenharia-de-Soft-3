// classe para RepositorioDePosts

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDePosts {
    private String filePath;

    public RepositorioDePosts(String filePath) {
        this.filePath = filePath;
    }

    public void salvarPost(Post post) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + post.getAutor().getNome() + "\n");
            writer.write("Data: " + post.getData() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Post> lerPosts() {
        // Implemente a leitura dos posts a partir do arquivo, se necessário.
        // Retorna uma lista de posts lidos.
        return new ArrayList<>();
    }
}


//Atualizando a classe Post para usar RepositorioDePosts para salvar os posts

import java.util.Date;

public class Post {
    private int id;
    private String texto;
    private Autor autor;
    private Date data;
    private int quantidadeDeLikes;
    private String filePath; // Caminho do arquivo - responsabilidade extra

    public Post(int id, String texto, Autor autor, Date data, String filePath) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
        this.data = new Date(data.getTime());
        this.quantidadeDeLikes = 0;
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public Autor getAutor() {
        return autor;
    }

    public Date getData() {
        return new Date(data.getTime());
    }

    public int getQuantidadeDeLikes() {
        return quantidadeDeLikes;
    }

    // Responsabilidade extra: Manipulação de Arquivo
    public void salvar() {
        RepositorioDePosts repositorio = new RepositorioDePosts(filePath);
        repositorio.salvarPost(this);
    }
}

// classe de teste para demonstrar como instanciar autores, posts, salvar e ler posts em um arquivo:

public class TestePosts {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "Nome do Autor", "email@example.com");
        Post post = new Post(1, "Texto do Post", autor, new Date(), "posts.txt");

        // Salvar o post no arquivo
        post.salvar();

        // Ler posts do arquivo (implemente a lógica em RepositorioDePosts)
        RepositorioDePosts repositorio = new RepositorioDePosts("posts.txt");
        List<Post> posts = repositorio.lerPosts();

        // Exibir posts lidos
        for (Post p : posts) {
            System.out.println("ID: " + p.getId());
            System.out.println("Texto: " + p.getTexto());
            System.out.println("Autor: " + p.getAutor().getNome());
            System.out.println("Data: " + p.getData());
            System.out.println("Quantidade de Likes: " + p.getQuantidadeDeLikes());
            System.out.println();
        }
    }
}

