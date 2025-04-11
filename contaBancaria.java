public class contaBancaria {
    private int numero;
    private double saldo;
    private int agencia;
    private Cliente cliente;

    public String sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return "saque realizado com sucesso";
        }
        return "saldo insuficiente";
    }

    public String sacar() {
        this.saldo = 0;
        return "Saque realizado com sucesso";
    }

    public contaBancaria(int numero, double saldo, int agencia, String nomeCliente)
    {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.cliente = new Cliente(nomeCliente);
    }

    public int getNumero()
    {
        return numero;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public int getAgencia()
    {
        return agencia;
    }
    public void setnumero(int novoNumero)
    {
        this.numero = novoNumero;
    }
    public void setsaldo(int novoSaldo)
    {
        this.numero = novoSaldo;
    }
    public void setAgencia(int novaAgencia)
    {
        this.numero = novaAgencia;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
    public void setCliente(Cliente novoCliente)
    {
        this.cliente = novoCliente;
    }

}
