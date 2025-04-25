import java.util.Scanner;

public class MainCarro {
	public static Scanner scan = new Scanner(System.in);
	public static Carro carro = new Carro("fiat", "aaa1111", "unoMille", 1996);
	public static void main(String[] args) {
		
		int op = 0;
		carro = cadastrar();
		while (op != 3) {
			Menu();
			op = scan.nextInt();
			scan.nextLine();
			op_menu(op, carro);
		}

		scan.close();

	}

	public static void Menu() {

		System.out.println("1 - imprimir carro");
		System.out.println("2 - alterar carro");
		System.out.println("3 - sair");
	}

	public static void op_menu(int op, Carro carro) {
		switch (op) {
			case 1:
				print(carro);
				break;
			case 2:
				alterar(carro);

			case 3:
				System.out.println("saindo");
				break;
			default:
				System.out.println("opcao invalida");
		}
	}

	public static Carro cadastrar() {
		char opCondutor, opMotor;
		Condutor condutor = new Condutor("miguel", "1234");
		Motor motor = new Motor("de 15", 100);
		Carro carro = new Carro("fiat", "aaa1111", "unoMille", 1996, condutor, motor);

		System.out.println("cadastrando carro");

		System.out.println("digite a marca do carro");
		String marca = scan.next();
		carro.setMarca(marca);

		System.out.println("digite a placa do carro");
		String placa = scan.next();
		carro.setPlaca(placa);

		System.out.println("Modelo:");
		String modelo = scan.next();
		carro.setModelo(modelo);

		System.out.println("Ano:");
		int Ano = scan.nextInt();
		scan.nextLine();
		carro.setAno(Ano);

		System.out.println("deseja criar um condutor para o carro? (s/n)");
		opCondutor = scan.next().charAt(0);
		if (opCondutor == 's') {
			System.out.println("Condutor:");
			String nome = scan.next();
			condutor.setNome(nome);

			System.out.println("CNH:");
			String cnh = scan.next();
			condutor.setCnh(cnh);
		}
		System.out.println("deseja criar um motor para o carro? (s/n)");
		opMotor = scan.next().charAt(0);
		if (opMotor == 's') {
			System.out.println("Motor:");
			String tipo = scan.next();
			motor.setTipo(tipo);

			System.out.println("Potencia:");
			int potencia = scan.nextInt();
			motor.setPotencia(potencia);
		}
		if(opCondutor == 's' && opMotor != 's')
		{
			carro = new Carro(marca, placa, modelo, Ano, condutor);
		}
		else if(opCondutor != 's' && opMotor == 's')
		{
			carro = new Carro(marca, placa, modelo, Ano, motor);
		}
		else if(opCondutor != 's' && opMotor != 's')
		{
			carro = new Carro(marca, placa, modelo, Ano);
		}
		else
		{
			carro = new Carro(marca, placa, modelo, Ano, condutor, motor);
		}
		
		return carro;
	}

	public static void print(Carro carro) 
	{
		System.out.println(carro.toString() + '\n');
	}

	public static void alterar(Carro carro) {
		if (carro == null) {
			System.out.println("\nNao ha carros criados!");

			return;
		}

		System.out.println("***ALTERAR CARRO***\n");

		System.out.println(carro.toString() + '\n');

		System.out.println("1 - Adicionar motor");
		System.out.println("2 - Adicionar condutor");
		System.out.println("3 - Alterar motor");
		System.out.println("4 - Alterar condutor");
		System.out.println("5 - Voltar ao menu anterior");
		System.out.print("\nEscolha uma opcao: ");
		int op = scan.nextInt();
		scan.nextLine();

		if (op == 3) {
			if (carro.getMotor() == null) {
				System.out.println("\nNao ha motores nesse carro!");

				return;
			}
		} else if (op == 4) {
			if (carro.getCondutor() == null) {
				System.out.println("\nNao ha condutores nesse carro!");

				return;
			}
		}

		switch ((op == 1 || op == 3) ? 1 : (op == 2 || op == 4) ? 2 : op) {
			case 1:
				System.out.print("\nTipo do motor: ");
				String tipo = scan.nextLine();

				System.out.print("Potencia do motor (cv): ");
				int pot = scan.nextInt();
				scan.nextLine();

				carro.setMotor(new Motor(tipo, pot));
				System.out.println("\nMotor atualizado!");
				break;
			case 2:
				System.out.print("\nNome do condutor: ");
				String nome = scan.nextLine();

				System.out.print("CNH do condutor: ");
				String cnh = scan.nextLine();

				carro.setCondutor(new Condutor(nome, cnh));
				System.out.println("\nCondutor atualizado!");
				break;
			case 5:
				return;
			default:
				System.out.println("\nOpcao invalida!");
				break;
		}
	}
}