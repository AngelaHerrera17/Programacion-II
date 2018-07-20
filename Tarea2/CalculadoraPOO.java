package calculadora;

import java.util.Scanner;

public class CalculadoraPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a=0, b=0, res=0;
	   char sign=' ';
	   String oper=" ";
	   String sel=null;
	   Scanner scan=new Scanner(System.in);	
       System.out.println("Seleccione La Opción:\n");
       System.out.println("+: Suma"
    		   + "\n-: Resta"
    		   + "\n*: Multiplicación"
    		   + "\n/: División");
       sel=scan.next();
       
       switch(sel){
       case "+":
    	   System.out.println("Ha Seleccionado Suma\n");
    	   System.out.println("Ingrese El Primer Número: ");
    	   a=scan.nextInt();
    	   System.out.println("Ingrese El Segundo Número: ");
    	   b=scan.nextInt();
    	   
    	   Suma s = new Suma(a, b);
			//s.setNum1(a);
			//s.setNum2(b);
			res = s.getRes();
			sign = s.getSign();
			oper = s.getOperation();
    	   System.out.println("\nEl Resultado De La "+oper+" "+a+" "+sign+" "+b+" Es Igual A: "+res);
    	   break;
       case "-":
    	   System.out.println("Ha Seleccionado Resta\n");
    	   System.out.println("Ingrese El Primer Número: ");
    	   a=scan.nextInt();
    	   System.out.println("Ingrese El Segundo Número: ");
    	   b=scan.nextInt();
    	   
    	   Resta r = new Resta(a, b);
			//r.setNum1(a);
			//r.setNum2(b);
			res = r.getRes();
			sign = r.getSign();
			oper = r.getOperation();
    	   System.out.println("\nEl Resultado De La "+oper+" "+a+" "+sign+" "+b+" Es Igual A: "+res);
    	   break;
       case "*":
    	   System.out.println("Ha Seleccionado Multiplicación\n");
    	   System.out.println("Ingrese El Primer Número: ");
    	   a=scan.nextInt();
    	   System.out.println("Ingrese El Segundo Número: ");
    	   b=scan.nextInt();
    	   
    	   Multiplicación m = new Multiplicación(a, b);
			//m.setNum1(a);
			//m.setNum2(b);
			res = m.getRes();
			sign = m.getSign();
			oper = m.getOperation();
    	   System.out.println("\nEl Resultado De La "+oper+" "+a+" "+sign+" "+b+" Es Igual A: "+res);
    	   break;
       case "/":
    	   System.out.println("Ha Seleccionado División\n");
    	   System.out.println("Ingrese El Primer Número: ");
    	   a=scan.nextInt();
    	   System.out.println("Ingrese El Segundo Número: ");
    	   b=scan.nextInt();
    	   
    	   División d = new División(a, b);
			//d.setNum1(a);
			//d.setNum2(b);
			res = d.getRes();
			sign = d.getSign();
			oper = d.getOperation();
    	   System.out.println("\nEl Resultado De La "+oper+" "+a+" "+sign+" "+b+" Es Igual A: "+res);
    	   break;
       default:
    	   System.out.println("Esa Opción No Existe");
       scan.close();
       }   	   
	}
}