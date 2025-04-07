public class loja {
    public static void main(String[] args) {
        // Criando instâncias de Produto com nome, preço e porcentagem de desconto
        Produto celular = new Produto("Celular", 2000.0, 0.10);
        Produto notebook = new Produto("Notebook", 4500.0, 0.15);
        Produto tablet = new Produto("Tablet", 1500.0, 0.05);

        // Chamando método para exibir o preço final com desconto
        celular.exibirPrecoFinal();
        notebook.exibirPrecoFinal();
        tablet.exibirPrecoFinal();
    }
}

// Nova classe para representar um produto e encapsular seu comportamento
class Produto {
    private String nome;
    private double preco;
    private double desconto;

    // Construtor para inicializar os atributos do produto
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    // Método para calcular o preço final com base no desconto
    public double calcularPrecoFinal() {
        return preco - (preco * desconto);
    }

    // Método para exibir o nome do produto e seu preço final
    public void exibirPrecoFinal() {
        System.out.println(nome + " - Preço final: R$ " + calcularPrecoFinal());
    }
}

/* 
 * Explicação das alterações no código:
 *
 * No código original, para cada produto (como celular, notebook e tablet), eram declaradas separadamente
 * variáveis para armazenar o nome, o preço, o desconto e o preço final. O cálculo do desconto e a impressão
 * das informações também eram repetidos para cada item.
 * 
 * Essa repetição tornava o código mais longo, menos legível e mais difícil de manter. A adição de novos
 * produtos exigiria duplicar todo o bloco de lógica novamente.
 *
 * Na versão refatorada, foi criada a classe Produto, que agrupa os atributos (nome, preço e desconto) e 
 * os comportamentos relacionados (como calcular e exibir o preço final). 
 * 
 * Com isso, o código ficou mais limpo, organizado e reutilizável. Agora é possível adicionar novos produtos
 * de forma muito mais simples, apenas instanciando um novo objeto da classe Produto, sem repetir lógica.
 */
