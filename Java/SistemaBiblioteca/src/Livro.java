public class Livro {
    // Atributos
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private static int contador = 0;

    // Construtor
    public Livro(String titulo) {
        this.setTitulo(titulo);
        contador += 1;
        this.setId(contador);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        titulo = titulo.toUpperCase();
        this.titulo = titulo;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + "]";
    }
    
    
}
