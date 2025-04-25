public abstract class Livro {
    protected String titulo;
    protected String autor;
    protected String isbn;
    protected double preco;

    public Livro(String titulo, String autor, String isbn, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract double calcularPrecoTotal();

    public abstract void exibirDetalhes();
}
