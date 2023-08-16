
public class Produto {
    private String nome;
    private String marca;
    private int quantidade;

    public Produto(String n, String m, int q) {
        nome = n;
        marca = m;
        quantidade = q;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

}