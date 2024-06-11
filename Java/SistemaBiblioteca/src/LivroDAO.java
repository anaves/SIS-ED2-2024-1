import java.sql.PreparedStatement;

public class LivroDAO {
    public void inserir(Livro livro){
        ConectaDB conexao = new ConectaDB();
        String sql = "INSERT INTO livro(titulo, autor, ano) values(?,?,?)";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setString(1, livro.getTitulo());
            pst.setString(2, livro.getAutor());
            pst.setInt(3, livro.getAno());
            pst.execute();
            System.out.println("insercao ok: "+livro);
        } catch (Exception e) {
            System.out.println("Falha na insercao: "+ e.getMessage());            
        }
    }
}
