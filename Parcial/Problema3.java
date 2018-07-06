import java.util.Scanner;

public class Problema3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0;
		Scanner reander = new Scanner(System.in);
		System.out.println("Ingrese Un Número: ");
		a = reander.nextInt();
		for(int i=1; i<=a; ++i){ 
		   if(a%i==0){
			   ++b;
		   }	
	    }
		if(b==2){
			System.out.println("Es Un Número Primo");
		}
		else{
			System.out.println("No Es Un Número Primo");
		reander.close();
		}
    }
}