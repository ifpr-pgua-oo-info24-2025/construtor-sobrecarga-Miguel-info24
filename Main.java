public class Main
{
    public static void main(String[] args) {
        contaBancaria conta2 = new contaBancaria(21, 200, 001, "Miguel");

        System.out.println(conta2);
        System.out.println(conta2.getCliente());
        System.out.println(conta2.getCliente().getNome());
    }
}