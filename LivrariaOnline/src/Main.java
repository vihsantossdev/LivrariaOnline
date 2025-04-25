import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Criando os livros disponíveis para compra
        String[] titulos = {
            "Nárnia Volume Único",
            "Harry Potter",
            "O Menino, a Toupeira, a Raposa e o Cavalo",
            "Orgulho e Preconceito"
        };

        String[] autores = {
            "C.S. Lewis",
            "J.K. Rowling",
            "Charlie Mackesy",
            "Jane Austen"
        };

        String[] isbns = {
            "978-0066238500",
            "978-0439708180",
            "978-0062976581",
            "978-0141040349"
        };

        double[] precos = {99.90, 120.00, 35.50, 25.90};
        double[] pesos = {1.8, 1.2, 0.5, 0.3};
        double[] fretes = {20.00, 15.00, 10.00, 8.00};
        double[] tamanhosMb = {5.0, 7.2, 2.0, 1.5};

        while (true) {
            System.out.println("\n📚 Escolha um livro para adicionar ao carrinho:");
            for (int i = 0; i < titulos.length; i++) {
                System.out.println((i + 1) + " - " + titulos[i]);
            }
            System.out.println("0 - Finalizar compra");

            System.out.print("Digite o número do livro desejado: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;  // Sai do loop e finaliza a compra
            } else if (escolha > 0 && escolha <= titulos.length) {
                System.out.println("\n📢 Escolha o formato do livro:");
                System.out.println("1 - Livro Físico 📦");
                System.out.println("2 - E-book 📲");
                System.out.print("Opção: ");
                int formato = scanner.nextInt();

                Livro livroEscolhido = null;
                int index = escolha - 1;

                if (formato == 1) {
                    livroEscolhido = new LivroFisico(titulos[index], autores[index], isbns[index], precos[index], pesos[index], fretes[index]);
                } else if (formato == 2) {
                    livroEscolhido = new Ebook(titulos[index], autores[index], isbns[index], precos[index], tamanhosMb[index]);
                } else {
                    System.out.println("❌ Opção inválida. Tente novamente.");
                    continue;
                }

                carrinho.adicionarLivro(livroEscolhido);
            } else {
                System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }

        // Exibir total do carrinho
        carrinho.exibirCarrinho();
        scanner.close();
    }
}
