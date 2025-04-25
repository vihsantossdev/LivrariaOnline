public class Ebook extends Livro {
    private double tamanhoEmMb;

    public Ebook(String titulo, String autor, String isbn, double preco, double tamanhoEmMb) {
        super(titulo, autor, isbn, preco);
        this.tamanhoEmMb = tamanhoEmMb;
    }

    @Override
    public double calcularPrecoTotal() {
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("📲 [EBOOK] " + titulo + " - " + autor + " (ISBN: " + isbn + ") - R$ " + preco +
                " 📲 Tamanho: " + tamanhoEmMb + "MB | Total: R$ " + calcularPrecoTotal());
    }
}
