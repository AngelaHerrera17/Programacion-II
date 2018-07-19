package calculadora;

public class Resta extends Operaciones {
	
		//Propiedades
		private int r;
		private char sign;
		private String oper;
		
		//Constructor
			public Resta (int numero1, int numero2) {
				super(numero1, numero2);
			}
		
		//Métodos
		public int getRes () {
		    r = a - b;
			return r;
		}
		public String getOperation() {
			oper="Resta";
			return oper;
		}
		public char getSign() {
			sign='-';
			return sign;
		}
}