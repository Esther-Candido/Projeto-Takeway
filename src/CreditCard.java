import java.util.Scanner;
import java.util.Random;

public class CreditCard extends Takeway{
	
	//MEBROS DA CLASSE
	//ATRIBUTOS ou VARIAVEIS b 
	 String nomeCartao;//nome do cartao
	 double balanco;
	 String numero;
	 String banco;
	 int cont = 1, adc1,adc2,adc3,adc4;
	
	
	//METODOS DA CLASSE
	public void Base() {
		System.out.println("O que Deseja: \n 1 - Depositar \n 2 - Debitar \n 3 - Visualizar Saldo \n 0 - Sair");
		Scanner entrada = new Scanner(System.in);    
		int num1 = entrada.nextInt();             
		
	    switch(num1) {
	    case 1:
	       Depositar();
	       break;
	    case 2:
	    	Visualizar();
	       break;
	    }}
	
	public void Depositar() {
		System.out.println("Inserir a quantia a depositar");
		Scanner sc = new Scanner(System.in);
		Double quantia = sc.nextDouble();
		balanco += quantia;
		
	}
	public void Visualizar() {
		int numNome = nomeCartao.length();
		
		if (numNome < 17) {
			while (numNome < 17){
				numNome ++;
				nomeCartao = String.format("%s ",nomeCartao);
			}
		}
		
		String numSaldo = String.format("%.2f",balanco);
		int numSaldo2 = numSaldo.length();
		
		if (numSaldo2 < 16) {
			while (numSaldo2 < 16){
				numSaldo2 ++;
				numSaldo = String.format("%s ",numSaldo);
			}
		}
		
		String mostrarinfo = String.format("╔────────────────────────╗\r\n"
										 + "║%s\r\n"
										 + "║                        ║\r\n"
										 + "║ Nome: %s║\r\n"
										 + "║ Nº: %s║\r\n"
										 + "║ Saldo: %s║\r\n"
										 + "╚═──────────────────────═╝", banco, nomeCartao, numero, numSaldo);
		System.out.println(mostrarinfo);
		

	}
	public void Gerador() {
        Random gerador = new Random();
     
        //imprime sequência de 10 números inteiros aleatórios
        for (int i = 0; i < 4; i++,cont ++) { // numero do cartao aleatorio
        	int cartao = gerador.nextInt(1000,9999);

        	if (cont == 1) {adc1 = cartao;}
        	else if (cont == 2) {adc2 = cartao;}
        	else if (cont == 3) {adc3 = cartao;}
        	else if (cont == 4) {adc4 = cartao;}
        	
        }
        numero = adc1+" "+ adc2 +" "+ adc3 +" "+ adc4;
        
        for (int i = 0; i < 1; i++,cont ++) {
        	int dinheiro = gerador.nextInt(10,200);
        	
        	if (cont == 5) {
        		balanco = dinheiro;}
        	}
        
        for (int i = 0; i < 1; i++,cont ++) { // numero do cartao aleatorio
        	int sorteio = gerador.nextInt(1,4);
        	if (cont == 6) {
        		if (sorteio == 1) {banco = "CAIXA GERAL DE DEPOSITOS║";}
        		else if (sorteio == 2) {banco = "       MILLENNIUM       ║";}
        		else if (sorteio == 3) {banco = "       SANTANDER        ║";}
        		else if (sorteio == 4) {banco = "       NOVOBANCO        ║";}
        	}
        	
        }
    }
}

	


	
  



