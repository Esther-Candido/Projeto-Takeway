import java.util.Scanner;

public class Autenticacao extends Takeway{
	
	int entrar;
	String nome, senha, nome1, senha1;
	
	public void Login() {
		do {
		pedido();
		
		if (entrar == 2) {
			 name();
		     pass();}
		
		if (entrar == 1) {
			nomelogin();
		    senhalogin();
			
	        if (nome1.equals(nome) && senha1.equals(senha)) {/* (!nome1.equals(nome) && !senha1.equals(senha))*/
	        	bemvindo();
	        	break;}
	        else {
	        	senhaerrada();}}
		
		/*System.out.println("Nome é "+login.nome+"\nA senha é "+login.senha);
		System.out.println("Nome é "+login.nome1+"  A senha é "+login.senha1);*/
		}while (nome1 != nome && senha1 != senha);
	
	}
	
	
	public void pedido() {
		
		System.out.printf("╔──────────────────────────────────╗\r\n"
						+ "║  1- Entrar    ║  2 - Criar Conta ║\r\n"
						+ "╚──────────────────────────────────╝\r\n"
						+ "                ");
		Scanner entrada = new Scanner(System.in);
		entrar = entrada.nextInt();
		
	}
    
	public void name() {
		
		System.out.printf("╔═══════════════════════════╗\r\n"
						+ "║        Criar Conta        ║\r\n"
						+ "║                           ╝\r\n"
						+ "║ Nome: ");
		Scanner entrada = new Scanner(System.in);
		nome = entrada.nextLine();

		
	}
	
	public void pass() {
		
		System.out.printf("║                           ║\r\n"
						+ "║ Senha: ");
		Scanner entrada1 = new Scanner(System.in);
		senha = entrada1.nextLine();
		System.out.printf("║                           ╗\r\n"
						+ "╚═══════════════════════════╝\n");
	}
	
	
	public void nomelogin() {
		
		System.out.printf("╔═══════════════════════════╗\r\n"
				        + "║          Entrar           ║\r\n"
				        + "║                           ╝\r\n"
				        + "║ Nome: ");
		Scanner entrada2 = new Scanner(System.in);
		nome1=entrada2.nextLine();
		
		
	}
	
	public void senhalogin() {
		System.out.printf("║                           ║\r\n"
				+ "║ Senha: ");
		Scanner entrada3 = new Scanner(System.in);
		senha1= entrada3.nextLine();
		System.out.printf("║                           ╗\r\n"
						+ "╚═══════════════════════════╝\n");
	}
	
	public void bemvindo() {
		System.out.println("                      ╔════════════════╗\r\n"
						 + "                      ║ Seja Bem Vindo ║");

	}
	
	public void senhaerrada() {
		System.out.println("╔──────────────────────────────────╗\r\n"
						 + "║         Login Incorreto          ║");

	}
	
	
}
