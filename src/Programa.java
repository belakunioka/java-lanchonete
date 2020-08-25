import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bellakunioka
 */
public class Programa {
    public static void main(String[] args) {
			
		Lanche lanche;
        try (Scanner scan = new Scanner (System.in)) {
            System.out.print("*Dev lanches!*\n"
                    + "Qual o codigo do seu lanche?:"
                    + "\n  [1]Sanduiche   [2]Bolo   [3]Massa");
            
            int codigo = 0;
            codigo = scan.nextInt();
            
            switch (codigo) {
                case 1:
                    lanche = new Sanduiche();
                    menuSanduiche(lanche);
                    break;
                case 2:
                    lanche = new Bolo();
                    menuBolo(lanche);
                    break;
                case 3:
                    menuMassa();
                    break;
                default:
                    System.out.println("Código não encontrado, tente novamente.");
                    break;
            }
        }
}
    public static void menuSanduiche (Lanche lanche) {
		String ingrediente = "";
		int contador = 0;
		String ingredientes[] = new String[10];
		
		System.out.println("Você escolheu sanduiche.\n*Tabela de valores*"
				+ "\n -Até 3 ingredientes: R$10\n -Até 5 ingredientes: R$15 "
				+ "\n -Mais de 5: R$20 ");
		System.out.println("Informe até 10 ingredientes "
				+ "para rechear seu sanduiche e digite 0 para finalizar.");
		while (contador < 10 && !ingrediente.equals("0")){
		ingrediente = scan.nextLine();
		if (!ingrediente.equals("0")) {
		ingredientes[contador] = ingrediente;
		contador ++;
		}
		}
		
		((Sanduiche) lanche).setIngredientes(ingredientes);
		
		if (contador <= 3) {
			lanche.setPrecoLanche(10);
		}
		else if (contador > 3 && contador <= 5) {
			lanche.setPrecoLanche(15);
		} else {
			lanche.setPrecoLanche(20);
		}
		
		lanche.setPedido("sanduiche recheado com " 
		+ ((Sanduiche) lanche).getIngredientes());
		
		fazerPedido(lanche);		
	}
	
	//Submenu bolo
	public static void menuBolo (Lanche lanche) {
		System.out.println("Você escolheu bolo.");
		System.out.println("Escolha a massa: ");
		String massa = scan.nextLine();
		
		System.out.println("Escolha a cobertura: ");
		String cobertura = scan.nextLine();
		
		System.out.println("Escolha o recheio: ");
		String recheio = scan.nextLine();

		((Bolo) lanche).setMassa(massa);
		((Bolo) lanche).setCobertura(cobertura);
		((Bolo) lanche).setRecheio(recheio);
				
		lanche.setPrecoLanche(10); 

		lanche.setPedido("bolo\nMassa: " + ((Bolo) lanche).getMassa() 
		+ " - Cobertura: " + ((Bolo) lanche).getCobertura() + " - Recheio: " + 
				((Bolo) lanche).getRecheio());
		
		fazerPedido(lanche);
	}
	
	static Massa massa;
	public static void menuMassa () {
		
		System.out.println("Escolha o tipo de massa");
	
		
		
		System.out.println("Escolha seu molho: ");
		String molho = scan.nextLine();
		((Massa) massa).setMolho(molho);
		
		massa.setPedido(((Massa) massa)
				+ " - molho " + ((Massa) massa).getMolho());
		fazerPedido(massa);
	}
	

	
	public static void fazerPedido(Lanche lanche) {
		System.out.println("Qual a sua distância do Dev Lanches?");
		int distancia = scan.nextInt();
		int tempo = lanche.tempoDeEntrega(distancia);
		
		if (distancia <= 10) {
			lanche.setPrecoFrete(5);
		} else if (distancia > 10 && distancia < 20) {
			lanche.setPrecoFrete(10);
		} else {
			lanche.setPrecoFrete(20);
		}
		int hora = 0;
		int minutos = 0;
		
		while (tempo >= 60) {
			tempo -= 60;
			hora++;
		}

		minutos += tempo;
		tempo = 0;
		
		lanche.setPrecoTotal(lanche.getPrecoFrete() + lanche.getPrecoLanche());
		System.out.println(lanche);
		System.out.println("Tempo aproximado de entrega: " + hora+"h" + minutos+"min");
		System.out.println("Bom apetite!");
	}
}
