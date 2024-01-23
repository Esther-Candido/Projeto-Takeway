import java.util.Scanner;

public class ProdutoMenu extends Produto{

	
	public void hamburguer() {
				System.out.println(
					       "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
					     + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
					     + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
						 + "║                       ║\r\n"
						 + "║ 1 - TW Chicken 5.20Є  ║\r\n"
						 + "║ 2 - TW Tasty 8.70Є    ║\r\n"
						 + "║ 3 - TW CBO 7.00Є      ║\r\n"
						 + "║ 4 - TW Royal 6.20Є    ║\r\n"
						 + "║ 5 - TW Cheese 5.20Є   ║\r\n"
						 + "║                       ║\r\n"
						 + "║ 0 - Voltar            ║\r\n"
						 + "╚═══════════════════════╝");
		hamM = 0;
		Hamburguer c1 = new Hamburguer ();
		Scanner entrada = new Scanner(System.in);   	
		escolhahamburguer = entrada.nextInt();
		switch (escolhahamburguer) {
		case 1:
		c1.mcChicken();
		hamCHI += 1;
		hamM += 5.20;
		break;
		case 2:
		c1.bigTasty();
		hamTAS += 1;
		hamM += 8.70;
		break;
		case 3:
		c1.cbo();
		hamCBO += 1;
		hamM += 7.00;
		break;
		case 4:
		c1.mcRoyal();
		hamROY += 1;
		hamM += 6.20;
		break;
		case 5:
		c1.mcChese();
		hamCHE += 1;
		hamM += 5.20;
		break;
		case 0:
		break;
		default:
			if (escolhahamburguer > 0 || escolhahamburguer < 0){System.out.println("Você inseriu a opção errada");}
		break;
		}	
		
	}
	
	
	
	public void bebida() {
 
		System.out.println(
			       "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
			     + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
			     + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				 + "                        ║                    ║\r\n"
				 + "                        ║ 1 - Agua           ║\r\n"
				 + "                        ║ 2 - CocaCola       ║\r\n"
				 + "                        ║ 3 - IceTea         ║\r\n"
				 + "                        ║ 4 - Monster        ║\r\n"
				 + "                        ║ 5 - Sumo Nat       ║\r\n"
				 + "                        ║                    ║\r\n"
				 + "                        ║ 0 - Voltar         ║\r\n"
				 + "                        ╚════════════════════╝");
		
		
		Bebidas c1 = new Bebidas ();
		Scanner entrada2 = new Scanner(System.in);   	
 		escolhabebida  = entrada2.nextInt();
		switch (escolhabebida) {
		case 1:
		c1.agua();
		bebAGU += 1;
		bebM += 1.50;
		break;
		case 2:
		c1.colaCola();
		bebCOL += 1;
		bebM += 2.40;
		break;
		case 3:
		c1.iceTea();
		bebICE += 1;
		bebM += 2.20;
		break;
		case 4:
		c1.monster();
		bebMON += 1;
		bebM += 3.20;
		break;
		case 5:
		c1.sumoNatural();
		bebSUM += 1;
		bebM += 1.90;
		break;
		case 0:
		hamM = 0;
		break;
		default:
			if (escolhabebida > 0 || escolhabebida < 0){System.out.println("Você inseriu a opção errada");}
		break;

		}			
	}
	
	public void acompanhamento() {
		System.out.println(
			       "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
			     + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
			     + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				 + "                                             ║                        ║\r\n"
				 + "                                             ║ 1 - Batata Frita       ║\r\n"
				 + "                                             ║ 2 - Sopa               ║\r\n"
				 + "                                             ║ 3 - Salada             ║\r\n"
				 + "                                             ║                        ║\r\n"
				 + "                                             ║ 0 - Voltar             ║\r\n"
				 + "                                             ╚════════════════════════╝");
		
		Acompanhamento c1 = new Acompanhamento ();
		Scanner entrada2 = new Scanner(System.in);   	
 		escolhaacompanhamento  = entrada2.nextInt();
		switch (escolhaacompanhamento) {
		case 1:
		c1.batataFrita();
		acBAT += 1;
		acoM = 2.50;
		break;
		case 2:
		c1.sopa();
		acSOP += 1;
		acoM = 2.50;
		break;
		case 3:
		c1.salada();
		acSAL += 1;
		acoM = 2.50;
		break;
		case 0:
	    bebM = 0;
		break;
		default:
			if (escolhaacompanhamento > 0 || escolhaacompanhamento < 0){System.out.println("Você inseriu a opção errada");}
		break;
		}			
	}
	
	public void sobremesa() {	
		System.out.println(
			       "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
			     + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
			     + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				 + "                                                                      ║                    ║\r\n"
				 + "                                                                      ║ 1 - Gelado    1Є   ║\r\n"
				 + "                                                                      ║ 2 - Cafe      1Є   ║\r\n"
				 + "                                                                      ║ 3 - Panqueca  1Є   ║\r\n"
				 + "                                                                      ║ 4 - Não Obrigado   ║\r\n"
				 + "                                                                      ║                    ║\r\n"
				 + "                                                                      ║ 0 - Voltar         ║\r\n"
				 + "                                                                      ╚════════════════════╝");
		
		Sobremesa c1 = new Sobremesa();
		Scanner entrada3 = new Scanner(System.in);   	
		escolhasobremesa  = entrada3.nextInt();
		switch (escolhasobremesa) {
		case 1:
		c1.gelado();
		sobGEL += 1;
		sobM += 1;
		break;
		case 2:
		c1.cafe();
		sobCAF += 1;
		sobM += 1;
		break;
		case 3:
		c1.panqueca();
		sobPAN += 1;
		sobM += 1;
		break;
		case 4:
			break;
		case 0:
		acoM = 0;
		break;
		default:
			if (escolhasobremesa > 0 || escolhasobremesa < 0){System.out.println("Você inseriu a opção errada");}
		break;
	
		}
		
	}

	
}
