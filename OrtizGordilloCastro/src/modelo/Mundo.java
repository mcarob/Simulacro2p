package modelo;

public class Mundo 
{
	private Numero numero;
	public Mundo()
	{
		numero = new Numero();
	}
	
	public void picasYfijas(String numUsu)
	{
		numero.CalcularP(numUsu);
	}
}