
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContaTerminal {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		int numeroConta;
		String agencia, nomeCliente;
		double saldo;

		System.out.println("Por favor, digite o número da conta!");
		numeroConta = Integer.parseInt(br.readLine());
		System.out.println("Por favor, digite o número da Agência!");
		agencia = br.readLine();
		System.out.println("Digite o seu nome!");
		nomeCliente = br.readLine();
		System.out.println("Insira o seu saldo!");
		saldo = Double.parseDouble(br.readLine());

		System.out.println("\nOlá " + nomeCliente + ", obrigado por " + "\n"
				+ "criar uma conta em nosso banco, sua agência é " + agencia + ",\n" + " conta " + numeroConta
				+ " e o seu saldo " + saldo + " já está " + "\n" + "disponível para saque.");
	}

}