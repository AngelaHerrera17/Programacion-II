package calculadora;

public class Operaciones {	
	
	//Propiedades
	protected static int a;
	protected static int b;
	
	//Constructor
	public Operaciones (int numero1, int numero2) {
		a = numero1;
		b = numero2;
	}
	
	//Métodos
	public void setNum1 (int numero1) {
		a = numero1;
	}
	public int getNum1 () {
		return a;
	}
	public void setNum2 (int numero2) {
		b = numero2;
	}
	public int getNum2 () {
		return b;
	}
}