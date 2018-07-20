package calculadora;

public class División extends Operaciones {

		//Propiedades
		private int r;
		private char sign;
		private String oper;
		
		//Constructor
			public División (int numero1, int numero2) {
				super(numero1, numero2);
			}
		
		//Métodos
		public int getRes () {
			r = a / b;
			return r;
		}
		public String getOperation() {
			oper="División";
			return oper;
		}
		public char getSign() {
			sign='/';
			return sign;
		}
}