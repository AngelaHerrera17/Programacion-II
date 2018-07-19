package calculadora;

public class Multiplicación extends Operaciones {
	
		//Propiedades
		private int r;
		private char sign;
		private String oper;
		
		//Constructor
			public Multiplicación (int numero1, int numero2) {
				super(numero1, numero2);
			}
		
		//Métodos
		public int getRes () {
			r = a * b;
			return r;
		}
		public String getOperation() {
			oper="Multiplicación";
			return oper;
		}
		public char getSign() {
			sign='*';
			return sign;
		}
}