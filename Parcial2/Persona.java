package parcial;

public class Persona {

	//Constantes
    private final static char Sexo_Def = 'H';
    public static final int InfraPeso = -1;
    public static final int Peso_Ideal = 0;
    public static final int SobrePeso = 1;
 
    //Atributos
    private String Nombre;
    private int Edad;
    private String DNI;
    private char Sexo;
    private double Peso;
    private double Altura;
 
    //Contructores
    public Persona() {
        this("", 0, Sexo_Def, 0, 0);
    }

    public Persona(String Nombre, int Edad, char Sexo) {
        this(Nombre, Edad, Sexo, 0, 0);
    }

    public Persona(String Nombre, int Edad, char Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
        generarDni();
        this.Sexo = Sexo;
        comprobarSexo();
    }
 
    //Métodos Privados
    private void comprobarSexo() {
 
        //Si El Sexo No Es Una H o Una M, Por Defecto Es H
        if (Sexo != 'H' && Sexo != 'M') {
            this.Sexo = Sexo_Def;
        }
    }
 
    private void generarDni() {
        final int Divisor = 23;
 
        //Generamos Un Número De 8 Dígitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / Divisor * Divisor);
 
        //Calculamos La Letra Del DNI
        char letraDNI = generaLetraDNI(res);
 
        //Pasamos El DNI A String
        DNI = Integer.toString(numDNI) + letraDNI;
    }
 
    private char generaLetraDNI(int res) {
        char Letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return Letras[res];
    }
 
    //Métodos Públicos
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
 
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
 
    public int calcularIMC() {
        //Calculamos El Peso De La Persona
        double pesoActual = Peso / (Math.pow(Altura, 2));
        //Según El Peso, Devuelve Un Código
        if (pesoActual >= 20 && pesoActual <= 25) {
            return Peso_Ideal;
        } else if (pesoActual < 20) {
            return InfraPeso;
        } else {
            return SobrePeso;
        }
    }

    public boolean EsMayorDeEdad() {
        boolean Mayor = false;
        if (Edad >= 18) {
            Mayor = true;
        }
        return Mayor;
    }

    public String toString() {
        String Sexo;
        if (this.Sexo == 'H') {
            Sexo = "Hombre";
        } else {
            Sexo = "Mujer";
        }
        return "Información De La Persona:\n"
                + "Nombre: " + Nombre + "\n"
                + "Sexo: " + Sexo + "\n"
                + "Edad: " + Edad + " Años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + Peso + " kg\n"
                + "Altura: " + Altura + " Metros\n";
    } 
}