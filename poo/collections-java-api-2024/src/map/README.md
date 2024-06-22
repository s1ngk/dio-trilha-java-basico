1. Dicionário

Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

    adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
    exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.

2. Contagem de Palavras

Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

    adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
    removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
    exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
    encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.

3. Livraria Online

Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

    adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
    removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
    exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
    pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
    obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
    exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
