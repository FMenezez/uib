package uib;

public class uibmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "felipe";
		cliente1.cpf = "077.075.514-35";	
		
		Conta conta1 = new Conta();
		
		conta1.saldo = 100;
		conta1.donoDaConta = cliente1.nome;
				
		
		System.out.println(cliente1.nome + " tem " + conta1.saldo);
		

	}

}
