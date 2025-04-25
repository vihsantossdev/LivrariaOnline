public class LivroFisico extends Livro {
    private double peso;
    private double frete;

    public LivroFisico(String titulo, String autor, String isbn, double preco, double peso, double frete) {
        super(titulo, autor, isbn, preco);
        this.peso = peso;
        this.frete = frete;
    }

    @Override
    public double calcularPrecoTotal() {
        return preco + frete;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("📦 [FÍSICO] " + titulo + " - " + autor + " (ISBN: " + isbn + ") - R$ " + preco +
                " 📦 Peso: " + peso + "kg | Frete: R$ " + frete + " | Total: R$ " + calcularPrecoTotal());
    }
}
