import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class LivroDAO {
    private ConectaDB conexao;

    public LivroDAO(){
        conexao = new ConectaDB();
    }

    public void inserir(Livro livro){
        // ConectaDB conexao = new ConectaDB();
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

    public LinkedList<Livro> consultarTodos(){
        // ConectaDB conexao = new ConectaDB();
        String sql = "SELECT * FROM livro";
        LinkedList<Livro> lista = new LinkedList<Livro>();
        try{
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            // executar consulta
            ResultSet resultados = pst.executeQuery();
            while (resultados.next()){
                // recuperando dados do banco
                String titulo = resultados.getString("titulo"); 
                String autor = resultados.getString("autor");
                int ano = resultados.getInt("ano");
                int id = resultados.getInt("idLivro");
                // cria objeto java
                Livro obj = new Livro(titulo);
                obj.setAno(ano);
                obj.setAutor(autor);
                obj.setId(id);
                // adiciona na lista
                lista.add(obj);                
            }
            return lista;
        }catch(Exception e){
            System.out.println("Falha na consulta livro: " + e.getMessage());
        }
        return null;
    }

    // IMPLEMENTAR OS METODOS ABAIXO
    public Livro consultar(int id){
        // ConectaDB conexao = new ConectaDB();
        String sql = "SELECT * FROM livro where idLivro = ?";
        // somente vamos criar o objeto se tiver no BD
        Livro livro = null;
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet resultado = pst.executeQuery();
            if (resultado.next()){ // se achar registro no BD
                // recuperando dados do banco
                String titulo = resultado.getString("titulo"); 
                String autor = resultado.getString("autor");
                int ano = resultado.getInt("ano");
                // int id_bd = resultado.getInt("idLivro");
                // criar o objeto livro e popular
                livro = new Livro(titulo);
                livro.setAno(ano);
                livro.setAutor(autor);
                livro.setId(id);
                return livro;
            }else{
                System.out.println("Nao tem registro com id = " + id);
            }
        } catch (Exception e) {
            System.out.println("Falha na consulta: " + e.getMessage());
        } 
        return null;
    }

    // ATIVIDADE PARA 24/06/2024
    public void excluir(int id){
        

    }

    public void alterar(Livro livro){
        


    }


}
