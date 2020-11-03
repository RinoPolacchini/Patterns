package FactoryMethod;

import java.util.Scanner;

public class Main {
	static Scanner ins = new Scanner(System.in);
	
	public static void main(String[] args) {	
		System.out.println("Benvenuto , desideri comprare un auto ? ");
		String risposta = ins.nextLine();
		if(risposta.equalsIgnoreCase("Si")) {
			System.out.println("Di che marca la preferisci ?");
			System.out.println(" FIAT - TESLA ");
			risposta = ins.nextLine();
			if(risposta.equalsIgnoreCase("FIAT")) {
				Concessionaria factory = new Fiat();
				System.out.println("Queste auto sono pronta consegna , quali preferisci aqcuistare ?");
				System.out.println("ABARTH , PANDA , TIPO");
				risposta = ins.nextLine();
				Macchina consegna = factory.MakeMacchina(risposta);
				if(consegna != null)
					System.out.println("La sua " + consegna.getNome() + " è pronta per la consegna , grazie e arrivederci");
				else 
					System.out.println("Questa gamma non è ancora disponibile , ci scusiamo.");	
			} else if (risposta.equalsIgnoreCase("TESLA")) {
				Concessionaria gigafactory = new Tesla();
				System.out.println("Queste auto sono pronta consegna , quali preferisci aqcuistare ?");
				System.out.println("MODEL3 , MODELS , MODELX");
				risposta = ins.nextLine();
				Macchina consegna = gigafactory.MakeMacchina(risposta);
				if(consegna != null)
					System.out.println("La sua " + consegna.getNome() + " è pronta per la consegna , grazie e arrivederci");
				else 
					System.out.println("Questa gamma non è ancora disponibile , ci scusiamo.");			
				}
		
		}else {
			System.out.println("Grazie per essere passato , arrivederci");
		}
		ins.close();
	}
	
}
	
