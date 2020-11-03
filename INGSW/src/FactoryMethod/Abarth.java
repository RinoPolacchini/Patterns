package FactoryMethod;

public class Abarth implements Macchina {

	@Override
	public String getDimensione() {
		return "Media";
	}

	@Override
	public int getCilindrata() {
		return 2000;
	}

	@Override
	public String getCarburante() {
		return "Benzina";
	}

	@Override
	public int getPorte() {
		return 3;
	}

	@Override
	public String getNome() {
		
		return "Abarth";
	}

}
