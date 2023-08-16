public class Principal {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("fluxo");
        Produto p;
        p = new Produto("Arroz", "Tio Joao", 125);
        estoque.adicionarProduto(p);
        p = new Produto("Sabonete", "Nivea", 25);
        estoque.adicionarProduto(p);
        p = new Produto("Sabonete", "Palmolive", 40);
        estoque.adicionarProduto(p);
        p = new Produto("Arroz", "Prato Fino", 250);
        estoque.adicionarProduto(p);
        p = new Produto("Sabonete", "Dove", 50);
        estoque.adicionarProduto(p);

        estoque.gerarRelatorio();

    }
}