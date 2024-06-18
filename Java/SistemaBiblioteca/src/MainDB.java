import java.util.LinkedList;

public class MainDB {
    public static void main(String[] args) {
        // Livro liv = new Livro("O Senhor dos Aneis");
        // liv.setAutor("J. R. R. Tolkien");
        // liv.setAno(1953);
        
        LivroDAO objDAO = new LivroDAO();
        // objDAO.inserir(liv);        
        LinkedList<Livro> dados = objDAO.consultarTodos();
        System.out.println(dados);
        Livro liv = objDAO.consultar(4);
        System.out.println(liv);
    }
}
