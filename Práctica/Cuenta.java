package práctica;

public class Cuenta {

	    //Atributos
	    public String Titular;
	    public double Cantidad;
	 
	    //Constructores
	    public Cuenta(String Titular) {
	        this(Titular, 0); //Sobrecarga
	    }
	 
	    public Cuenta(String Titular, double Cantidad) {
	        this.Titular = Titular;
	        //Si La Cantidad Es Menor Que 0, Lo Ponemos A 0
	        if (Cantidad < 0) {
	            this.Cantidad = 0;
	        } else {
	            this.Cantidad = Cantidad;
	        }   
	    }
	    
	    //Métodos
	    public String getTitular() {
        return Titular;
        }
	    
	    public void setTitular(String Titular) {
        this.Titular = Titular;
        }
	    
	    public double getCantidad() {
        return Cantidad;
        }
	    
	    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
        }
	    
	    public void ingresar(double Cantidad) {
            if(Cantidad > 0){
                this.Cantidad += Cantidad;  
            }
        }
	    
	    public void retirar(double Cantidad) {
            if (this.Cantidad - Math.abs(Cantidad) < 0) {
                this.Cantidad = 0;
            } else {
                this.Cantidad -= Cantidad;
            }
        }
	    
	    public String toString() {
        return"El Titular: " + Titular + " Tiene: " + Cantidad + " Dólares En La Cuenta";
        }
}