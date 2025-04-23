public class Condutor {
    private String nome;
    private int cnh;

    public Condutor(String nome, int cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public int getCnh() {
        return cnh;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCnh(int novaCnh) {
        this.cnh = novaCnh;
    }
}
