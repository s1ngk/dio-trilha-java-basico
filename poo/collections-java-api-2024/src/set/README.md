1. Conjunto de Palavras Únicas

Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

    adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
    removerPalavra(String palavra): Remove uma palavra do conjunto.
    verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
    exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.

2. Lista de Tarefas

Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

    adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
    removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
    contarTarefas(): Conta o número total de tarefas na lista de tarefas.
    obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
    obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
    marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
    marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
    limparListaTarefas(): Remove todas as tarefas da lista de tarefas.

3. Lista de Alunos

Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

    adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
    removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
    exibirAlunos(): Exibe todos os alunos do conjunto.
