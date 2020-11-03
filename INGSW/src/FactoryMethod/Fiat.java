package FactoryMethod;

public class Fiat implements Concessionaria{

	@Override
	public Macchina MakeMacchina(String s) {
		if(s.equalsIgnoreCase("ABARTH")) {return new Abarth();}
		if(s.equalsIgnoreCase("PANDA")) {return new Panda();}
		if(s.equalsIgnoreCase("TIPO")) {return new Tipo();}
		return null;
	}
	
}
