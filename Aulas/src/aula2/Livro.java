
package aula2;


public class Livro {
    public String titulo;
    public int ano;
    public String nomeDaEditora;
    public Autor autor; 
    boolean emprestado;

    public Livro(String titulo, int ano, String nomeDaEditora, Autor autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.nomeDaEditora = nomeDaEditora;
        this.autor = autor;
    }
    
    
}
