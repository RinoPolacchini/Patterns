package FactoryMethod;

public class Tesla implements Concessionaria{

	@Override
	public Macchina MakeMacchina(String s) {
		if(s.equalsIgnoreCase("MODEL3")) {return new Model3();}
		if(s.equalsIgnoreCase("MODELS")) {return new ModelS();}
		if(s.equalsIgnoreCase("MODELX")) {return new ModelX();}
		return null;
	}
	
}
