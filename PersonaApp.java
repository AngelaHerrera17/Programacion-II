package parcial;

import java.util.Locale;
import java.util.Scanner;

public class PersonaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
        
		 Scanner sc = new Scanner(System.in);
	        sc.useDelimiter("\n");
	        sc.useLocale(Locale.US); 
	        
	        //Introducimos Los Datos
	        System.out.println("Introduce El Nombre:");
	        String Nombre = sc.next();
	 
	        System.out.println("Introduce La Edad:");
	        int Edad = sc.nextInt();
	 
	        System.out.println("Introduce El Sexo:");
	        char Sexo = sc.next().charAt(0);
	 
	        System.out.println("Introduce El Peso:");
	        double Peso = sc.nextDouble();
	 
	        System.out.println("Introduce La Altura:");
	        double Altura = sc.nextDouble();
	        sc.close();
	 
	        //Creamos Objetos Con Cada Constructor
	        Persona Persona1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
	        Persona Persona2 = new Persona(Nombre, Edad, Sexo);
	        Persona Persona3 = new Persona(Nombre, Edad, Sexo, Peso, Altura);

	        //Los Datos Que No Esten Completos Los Insertamos Con Los Métodos set
	        Persona2.setPeso(80.5);
	        Persona2.setAltura(1.80);
	        
	        Persona3.setNombre("María Montenegro");
	        Persona3.setEdad(20);
	        Persona3.setSexo('M');
	        Persona3.setPeso(60);
	        Persona3.setAltura(1.60);
	 
	        //Usamos Métodos Para Realizar La Misma Acción Para Cada Objeto
	        System.out.println("\nPersona1");
	        MuestraMensajePeso(Persona1);
	        MuestraMayorDeEdad(Persona1);
	        System.out.println(Persona1.toString());
	 
	        System.out.println("Persona2");
	        MuestraMensajePeso(Persona2);
	        MuestraMayorDeEdad(Persona2);
	        System.out.println(Persona2.toString());
	 
	        System.out.println("Persona3");
	        MuestraMensajePeso(Persona3);
	        MuestraMayorDeEdad(Persona3);
	        System.out.println(Persona3.toString());
	    }
	 
	    public static void MuestraMensajePeso(Persona p) {
	        int IMC = p.calcularIMC();
	        switch (IMC) {
	            case Persona.Peso_Ideal:
	                System.out.println("La Persona Está En Su Peso Ideal");
	                break;
	            case Persona.InfraPeso:
	                System.out.println("La Persona Está Por Debajo De Su Peso Ideal");
	                break;
	            case Persona.SobrePeso:
	                System.out.println("La Persona Está Por Encima De Su Peso Ideal");
	                break;
	        }
	    }
	 
	    public static void MuestraMayorDeEdad(Persona p) {
	        if (p.EsMayorDeEdad()) {
	            System.out.println("La Persona Es Mayor De Edad");
	        } else {
	            System.out.println("La Persona No Es Mayor De Edad");
	    }
	}
}