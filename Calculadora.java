import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a=0, b=0, res=0;
	   String sel=null;
	   Scanner tec=new Scanner(System.in);	
       System.out.println("Seleccione La Opción\n");
       System.out.println("+: Suma"
    		   + "\n-: Resta"
    		   + "\n*: Multiplicación"
    		   + "\n/: División");
       sel=tec.next();
       switch(sel){
       case "+":
    	   System.out.println("Ha Seleccionado Suma\n");
    	   System.out.println("Ingrese El Primer Número");
    	   a=tec.nextInt();
    	   System.out.println("Ingrese El Segundo Número");
    	   b=tec.nextInt();
    	   res=a+b;
    	   System.out.println(a+"+"+b+" = "+res);
    	   break;
       case "-":
    	   System.out.println("Ha Seleccionado Resta\n");
    	   System.out.println("Ingrese El Primer Número");
    	   a=tec.nextInt();
    	   System.out.println("Ingrese El Segundo Número");
    	   b=tec.nextInt();
    	   res=a-b;
    	   System.out.println(a+"-"+b+" = "+res);
    	   break;
       case "*":
    	   System.out.println("Ha Seleccionado Multiplicación\n");
    	   System.out.println("Ingrese El Primer Número");
    	   a=tec.nextInt();
    	   System.out.println("Ingrese El Segundo Número");
    	   b=tec.nextInt();
    	   res=a*b;
    	   System.out.println(a+"*"+b+" = "+res);
    	   break;
       case "/":
    	   System.out.println("Ha Seleccionado División\n");
    	   System.out.println("Ingrese El Primer Número");
    	   a=tec.nextInt();
    	   System.out.println("Ingrese El Segundo Número");
    	   b=tec.nextInt();
    	   res=a/b;
    	   System.out.println(a+"/"+b+ "= "+res);
    	   break;
       default:
    	   System.out.println("Esa Opción No Existe");
       tec.close();
       }   
    	   
	}

}
