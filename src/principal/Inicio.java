package principal;
import salud.Empleado;
public class Inicio {
    public static void main(String[] args) {
        /*double imc=0,peso=0,estatura=0,resultado;
        Scanner lectura=new Scanner(System.in);
        Persona objeto=new Persona(null, 0, null, null, peso, estatura, 0, null);
        objeto.pedirDatos();
        objeto.mostrarPersona();
        objeto.mayorEdad();

        resultado=objeto.calcularImc(peso,estatura);
        /*if(imc<20){
            System.out.println("El peso del paciente está por debajo de lo ideal");
        }else if (imc>=20 && imc<=25) {
            System.out.println("El paciente está en el peso ideal");
        }else if (imc>25) {
            System.out.println("El paciente tiene sobrepeso");
        } */

        Empleado trabajador=new Empleado(null, 0, null, null, null, 0, 0, null);
        trabajador.pedirDatos();
        trabajador.pedirEmpleado();
        trabajador.mostrarPersona();
        trabajador.mostrarEmpleado();
        trabajador.calcularHonorarios();
    }
}
