package práctica;

public class CuentaApp {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta Cuenta_1 = new Cuenta("Angela Herrera");
		Cuenta Cuenta_2 = new Cuenta("María Montenegro", 500);
		
		//Ingrese Dinero En Las Cuentas
		Cuenta_1.ingresar(500);
		Cuenta_2.ingresar(300);
		
		//Retire Dinero En Las Cuentas
		Cuenta_1.retirar(200);
		Cuenta_2.retirar(150);
		
		//Muestre La Información De Las Cuentas
		System.out.println(Cuenta_1); //0 Dólares
		System.out.println(Cuenta_2); //500 Dólares
	}
}