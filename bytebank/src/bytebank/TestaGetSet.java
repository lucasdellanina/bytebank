package bytebank;

public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(3, 4);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		System.out.println(paulo.getNome());
	}

}
