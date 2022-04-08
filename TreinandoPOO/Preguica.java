package treinandoPOO;

public class Preguica extends Animal{
	
	private String deveSubirArvores;
	
	public Preguica(String nome, int idade, String deveEmitirSom, String deveCorrer, String deveSubirArvores) {
		super(nome, idade, deveEmitirSom, deveCorrer);
		this.deveSubirArvores = deveSubirArvores;
	}

	public String getDeveSubirArvores() {
		return deveSubirArvores;
	}

	public void setDeveSubirArvores(String deveSubirArvores) {
		this.deveSubirArvores = deveSubirArvores;
	}
	
	public void imprimirInfoA3()
	{
		System.out.println("\nNome da pregui�a: " + getNome()+ "\n"+"Idade da pregui�a: "+getIdade()+ "\n"+ 
	    "Emite Som: " + getDeveEmitirSom() + "\n"+ "Corre: " + getDeveCorrer() + "\n" + "Sobe em �rvores: "+deveSubirArvores);
	}


	

}
