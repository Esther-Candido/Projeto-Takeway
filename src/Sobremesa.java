import java.util.Scanner;

public class Sobremesa extends Produto{
	int gelm, gelc, cafc, cafl, panm, panc, dentrosobre;
	
	Scanner entrada1 = new Scanner(System.in);
	
	public void gelado () {	
		System.out.println("╔───────────────╗\r\n"
						 + "║     Gelado    ║\r\n"
						 + "║               ║\r\n"
						 + "║ 1 - Morango   ║\r\n"
						 + "║ 2 - Chocolate ║\r\n"
						 + "╚═─────────────═╝");	
		dentrosobre = entrada1.nextInt();
		
		if (dentrosobre == 1) {
			System.out.println("╔───────────────────╗\r\n"
							 + "║ Gelado de Morango ║\r\n"
							 + "║     Adicionado    ║\r\n"
							 + "╚═─────────────────═╝");
			gelm += 1;}
		
		if (dentrosobre == 2) {
			System.out.println("╔─────────────────────╗\r\n"
							 + "║ Gelado de Chocolate ║\r\n"
							 + "║      Adicionado     ║\r\n"
							 + "╚═───────────────────═╝");
			gelc += 1;}
		
		}
		
	public void cafe () {	
		System.out.println("╔──────────────╗\r\n"
						 + "║     Café     ║\r\n"
						 + "║              ║\r\n"
						 + "║ 1 - Curto    ║\r\n"
						 + "║ 2 - Longo    ║\r\n"
						 + "╚═────────────═╝");	
		dentrosobre = entrada1.nextInt();
		
		if (dentrosobre == 1) {
			System.out.println("╔────────────╗\r\n"
							 + "║ Café Curto ║\r\n"
							 + "║ Adicionado ║\r\n"
							 + "╚═──────────═╝");
			cafc += 1;}
		
		if (dentrosobre == 2) {
			System.out.println("╔────────────╗\r\n"
							 + "║ Café Longo ║\r\n"
							 + "║ Adicionado ║\r\n"
							 + "╚═──────────═╝");
			cafl += 1;}
		
		}
		
	public void panqueca () {
		System.out.println("╔──────────────────╗\r\n"
						 + "║     Panqueca     ║\r\n"
						 + "║                  ║\r\n"
						 + "║ 1 - Morango      ║\r\n"
						 + "║ 2 - Chocolate    ║\r\n"
						 + "╚═────────────────═╝");	
		dentrosobre = entrada1.nextInt();
		
		if (dentrosobre == 1) {
			System.out.println("╔─────────────────────╗\r\n"
							 + "║ Panqueca de Morango ║\r\n"
							 + "║      Adicionada     ║\r\n"
							 + "╚═───────────────────═╝");
			panm += 1;}
		
		if (dentrosobre == 2) {
			System.out.println("╔───────────────────────╗\r\n"
							 + "║ Panqueca de Chocolate ║\r\n"
							 + "║       Adicionada      ║\r\n"
							 + "╚═─────────────────────═╝");
			panc += 1;}
		
		}
}
