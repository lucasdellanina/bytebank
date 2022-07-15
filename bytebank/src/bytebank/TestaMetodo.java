package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta(188, 5895);
		conta.deposita(100);
		System.out.println(conta.getSaldo());
		conta.deposita(150);
		System.out.println(conta.getSaldo());
		
		boolean conseguiuRetirar = conta.saca(120);
		System.out.println(conta.getSaldo());
		System.out.println(conseguiuRetirar);
		
		conseguiuRetirar = conta.saca(1200);
		System.out.println(conta.getSaldo());
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta(589, 5148);
		conta2.deposita(5000);
		System.out.println();
		System.out.println(conta2.getSaldo());
		conta2.transfere(1000, conta);
		System.out.println(conta.getSaldo() + " " + conta2.getSaldo());
		
	}

}
