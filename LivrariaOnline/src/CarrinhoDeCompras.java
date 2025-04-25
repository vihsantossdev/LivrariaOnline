import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Livro> livros;

    public CarrinhoDeCompras() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("🛒 Adicionado: " + livro.getTitulo());
    }

    public void exibirCarrinho() {
        System.out.println("\n📚 LIVROS NO CARRINHO:");
        double totalCompra = 0;
        
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            totalCompra += livro.calcularPrecoTotal();
        }
        
        System.out.println("\n💰 Preço total do carrinho: R$ " + totalCompra);
    }
}
