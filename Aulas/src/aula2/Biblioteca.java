
package aula2;

import java.util.ArrayList;


public class Biblioteca {
    
    ArrayList<Livro> Livros = new ArrayList();
    
   
    
    public void adicionarLivro(Livro aux){
        
        Livros.add(aux);        
    }
    
    public void removerLivro(Livro aux){
        Livros.remove(aux);
    }
    
    public void emprestarLivro(String titulo ){
        
        for (Livro Livro : Livros) {
            if(Livro.titulo.equals(titulo)){
                Livro.emprestado = true;
            }
        }
    }
}
