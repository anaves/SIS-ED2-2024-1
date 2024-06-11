public class Main {
    public static void main(String[] args) {
        Livro obj1 = new Livro("Calculo 1");
        Livro obj2 = new Livro("Estruturas de Dados");
        Livro obj3 = new Livro("Banco de Dados");
        
        // instanciar biblioteca
        Biblioteca bib = new Biblioteca();
        bib.inserir(obj1);
        bib.inserir(obj2);
        bib.inserir(obj2);
        
        bib.listarTodos();
        System.out.println("BUSCA ID");
        Livro obj4 = bib.consultaID(2);
        if (obj4 != null){
            System.err.println(obj4);
        }
        
    }
}
