public class MainDB {
    public static void main(String[] args) {
        Livro liv = new Livro("O Senhor dos Aneis");
        liv.setAutor("J. R. R. Tolkien");
        liv.setAno(1953);
        
        LivroDAO objDAO = new LivroDAO();
        objDAO.inserir(liv);        
        
    }
}
