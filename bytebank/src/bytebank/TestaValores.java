package bytebank;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(544, 7169);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(544, 7170);
		Conta conta3 = new Conta(544, 7171);
		
		System.out.println(Conta.getTotal());
		
	}

}
