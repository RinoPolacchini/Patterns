package FactoryMethod;

public class Model3 implements Macchina {

	@Override
	public String getDimensione() {
		return "Grande";
	}

	@Override
	public int getCilindrata() {
		return 1700;
	}

	@Override
	public String getCarburante() {
		return "Elettrica";
	}

	@Override
	public int getPorte() {
		return 5;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Model3";
	}

	
}
