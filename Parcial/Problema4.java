import java.util.Scanner;

public class Problema4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leer = new Scanner(System.in);
		int mayor = 0;
		int menor = 0;
		int total = 0;
		boolean inicio = false;
		int tpositivo = 0;
		int tnegativo = 0;
		int n;
		int cantidadn = 0;
		int mediatotal = 0;
	do {
		if (inicio == false) {
			System.out.println("Ingrese Un Número: ");
			n = leer.nextInt();
        if (n != -1) {
            if (n > mayor) {
                mayor = n;
            }
            menor = n;
            total += n;
            if (n > 0) {
                tpositivo += n;
            }
            if (n < 0) {
                tnegativo += n;
            }
        }
        inicio = true;
        cantidadn++;
    } else {
        System.out.println("Ingrese Un Número: ");
        n = leer.nextInt();
        if (n != -1) {
            if (n > mayor) {
                mayor = n;
            }
            if (n < menor) {
                menor = n;
            }
            total += n;
            if (n > 0) {
                tpositivo += n;
            }
            if (n < 0) {
                tnegativo += n;
            }
            cantidadn++;
        }
    }
} 
	while (n != -1);
	mediatotal = (total / cantidadn);
	    System.out.println("Número Mayor: " + mayor);
        System.out.println("Número Menor: " + menor);
        System.out.println("Suma Total De Los Números: " + total);
        System.out.println("Suma Total De Los Números Positivos: " + tpositivo);
        System.out.println("Suma Total De Los Números Negativos: " + tnegativo);
        System.out.println("Media De La Suma: " + mediatotal);
        leer.close();   
   }
}