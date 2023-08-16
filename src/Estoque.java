import java.util.ArrayList;
import java.util.Comparator;

public class Estoque {
    private String tipo;
    private ArrayList<Produto> produtos;

    public Estoque(String t) {
        tipo = t;
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public Comparator<Produto> getComparador() {
        Comparator<Produto> comparador = new Comparator<>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                if (p1.getNome().equals(p2.getNome())) {
                    return p1.getMarca().compareTo(p2.getMarca());
                } else {
                    return p1.getNome().compareTo(p2.getNome());
                }
            }
        };
        return comparador;
    }

    public void gerarRelatorio() {
        produtos.sort(getComparador());

        System.out.printf("Tipo do estoque: %s\n", tipo);
        System.out.printf("%-15s %-15s %-15s\n", "Nome", "Marca", "Quantidade");
        for (Produto p : produtos) {
            System.out.printf("%-15s %-15s %-15d\n", p.getNome(), p.getMarca(), p.getQuantidade());
        }

    }

}