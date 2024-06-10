import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Livro> dados;

    public Biblioteca(){
        dados = new LinkedList<Livro>();
    }

    public void inserir(Livro livro){
        if (dados.contains(livro)){
            System.out.println(livro + " ja existe");
        }else{
            dados.add(livro);
        }
    }

    public void listarTodos(){
        System.out.println("ID\tTitulo");
        for (Livro livro : dados) {
            String aux = livro.getId() + "\t" + livro.getTitulo();
            System.out.println(aux);
        }
    }

    public Livro consultaID(int id){
        // for (int i = 0; i < dados.size(); i++) {
        //     Livro livro =  dados.get(i);
        // }
        for (Livro livro : dados) {
            if (livro.getId()==id){
                return livro;
            }
        }
        System.out.println(id+" nao cadastrado");
        return null;
    }

}
