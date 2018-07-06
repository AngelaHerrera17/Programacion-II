import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Problema1{

	static final double IVA = 0.21;
	
	private static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    scanner = new Scanner(System.in);
	    Scanner scan = scanner.useLocale(Locale.US);
	    DecimalFormat df = new DecimalFormat("0.00");
	    df.setMaximumFractionDigits(2);
	    double precio, impuesto, total;
	    System.out.println("Ingrese El Precio Del Producto: ");
	    precio=scan.nextDouble();
	    impuesto=precio*IVA; 
	    total=precio+impuesto;
	    System.out.println("SubTotal:\t\t"+df.format(precio)+
	    		"\nIVA (21%):\t\t"+df.format(impuesto)+
	    		"\nTotal:\t\t\t"+df.format(total));
	    scan.close();
	}
}