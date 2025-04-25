# Livraria Online em Java

Este é um projeto de uma livraria online que permite ao usuário adicionar livros (físicos ou e-books) a um carrinho de compras e visualizar o total da compra. O programa utiliza conceitos de Programação Orientada a Objetos, como classes abstratas e polimorfismo.

## Funcionalidades

- **Escolha de Livros**: O usuário pode escolher entre uma lista de livros disponíveis.
- **Formato do Livro**: O usuário pode escolher entre livros físicos ou e-books.
- **Cálculo do Total**: O carrinho calcula o preço total, incluindo o frete para livros físicos.
- **Detalhes do Livro**: Exibe informações completas, como título, autor, ISBN, tipo, e preço total.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento.
- **Conceitos de POO**: Classes abstratas, herança e polimorfismo.
- **Coleções Java**: Uso de `ArrayList` para gerenciar os itens no carrinho.

## Como Executar

### Pré-requisitos
1. Certifique-se de que o Java Development Kit (JDK) está instalado. Verifique com:
   ```
   java -version
   ```
   Caso não esteja instalado, baixe a versão mais recente do [Oracle Java](https://www.oracle.com/java/technologies/javase-downloads.html) ou [OpenJDK](https://openjdk.org/).

2. Escolha um editor ou IDE como:
   - IntelliJ IDEA
   - Eclipse
   - VS Code com extensão para Java

### Passo a Passo

1. Clone este repositório ou copie os arquivos do projeto para sua máquina.
2. Certifique-se de que os arquivos `Livro.java`, `CarrinhoDeCompras.java`, `LivroFisico.java`, `Ebook.java` e `Main.java` estão no mesmo diretório.
3. Abra o terminal nesse diretório e compile os arquivos:
   ```
   javac *.java
   ```
   Isso criará os arquivos `.class` necessários para executar o programa.

4. Execute o programa com o comando:
   ```
   java Main
   ```

5. Siga as instruções no terminal para interagir com o menu.

### Exemplo de Uso

**Menu no terminal:**
```
📚 Escolha um livro para adicionar ao carrinho:
1 - Nárnia Volume Único
2 - Harry Potter
3 - O Menino, a Toupeira, a Raposa e o Cavalo
4 - Orgulho e Preconceito
0 - Finalizar compra
Digite o número do livro desejado:
```

**Escolha do formato:**
```
📢 Escolha o formato do livro:
1 - Livro Físico 📦
2 - E-book 📲
Opção: 1
```

**Exemplo de saída ao finalizar:**
```
📚 LIVROS NO CARRINHO:
📦 [FÍSICO] Nárnia Volume Único - C.S. Lewis (ISBN: 978-0066238500) - R$ 99.9 📦 Peso: 1.8kg | Frete: R$ 20.0 | Total: R$ 119.9
📲 [EBOOK] Harry Potter - J.K. Rowling (ISBN: 978-0439708180) - R$ 120.0 📲 Tamanho: 7.2MB | Total: R$ 120.0

💰 Preço total do carrinho: R$ 239.9
```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License]
