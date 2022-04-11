package treinandoPOO;

public class Preguica2 extends Animal2{

	public Preguica2()
	{
		super("Tipo animal: Pregui�a");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome da pregui�a: "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom que a pregui�a emite: "+somAnimal);
	}
	
	public void subirArvore()
	{
		System.out.println("\nUma das caracter�sticas da pregui�a � subir em �rvores!!!");
	}

}
