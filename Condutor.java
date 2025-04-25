public class Condutor {
    private String nome;
    private String cnh;

    public Condutor(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCnh(String novaCnh) {
        this.cnh = novaCnh;
    }
}
