package salud;
 
import java.util.Scanner;

public class Persona {
    //Atributos
    private String tipoDoc;
    private String nombre;
    private String apellido;
    private String sexo;
    private int documento;
    private int edad;
    private double peso,estatura;
    //private double imc;

        //contructores
        public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
        int edad, String sexo) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.peso = peso;
    this.estatura = estatura;
    this.edad = edad;
    this.sexo = sexo;
}
    //getters y setters
        public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodos
    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in); 
        System.out.println("Ingrese el tipo de documento del paciente");
        tipoDoc=lectura.next();
        System.out.println("Ingrese el numero de documento del paciente");
        documento=lectura.nextInt();
        System.out.println("Ingrese el el nombre del paciente");
        nombre=lectura.next();
        System.out.println("Ingrese el apellido del paciente");
        apellido=lectura.next();
        /*System.out.println("Ingrese el peso del paciente");
        peso=lectura.nextDouble();
        System.out.println("Ingrese la estatura del paciente");
        estatura=lectura.nextDouble();
        System.out.println("Ingrese la edad del paciente");
        edad=lectura.nextInt();
        System.out.println("Ingrese el sexo del paciente");
        sexo=lectura.next();*/
    }
    public void mostrarPersona(){
        System.out.println("El tipo del documento del paciente es: "+tipoDoc);
        System.out.println("El número de documento del paciente es: "+documento);
        System.out.println("El nombre del paciente es: "+nombre);
        System.out.println("El apellido del paciente es: "+apellido);
        /*System.out.println("El peso del paciente es: "+peso);
        System.out.println("La estatura del paciente es: "+estatura);
        System.out.println("La edad del paciente es: "+edad);
        System.out.println("El sexo del paciente es: "+sexo);*/
    }
    public double calcularImc(double peso, double estatura){
       double imc=(peso/estatura)*2;
       return imc;
        /*if(imc<20){
            System.out.println("El peso del paciente está por debajo de lo ideal");
        }else if (imc>=20 && imc<=25) {
            System.out.println("El paciente está en el peso ideal");
        }else if (imc>25) {
            System.err.println("El paciente tiene sobrepeso");
        }*/
    }
    public void mayorEdad(){
        /*if (edad>=18) {
            System.out.println("El paciente es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }*/
    }
}
