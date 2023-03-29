package salud;

import java.util.Scanner;

public class Empleado extends Persona{
    double total=0,reteica;
    
    private String cargo,departamento;
    private int valorHora,horasTrabajadas;

    //contructor
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo, int valorHora, int horasTrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, documento, valorHora, horasTrabajadas, departamento);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    //getters y setters 
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void pedirEmpleado(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese su cargo: ");
        cargo=lectura.next();
        System.out.println("Ingrese el departamento: ");
        departamento=lectura.next();
        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas=lectura.nextInt();
        System.out.println("Ingrese el valor de las horas: ");
        valorHora=lectura.nextInt();
    }
    public void calcularHonorarios(){
        total=valorHora*horasTrabajadas; 
        reteica=(0.966*total);
        total-=reteica;
        System.out.println("Su total es: "+total);
    }
      public void mostrarEmpleado(){
        System.out.println("El cargo del empleado es: "+getCargo());
        System.out.println("Las horas trabajadas fueron: "+getHorasTrabajadas());
        System.out.println("El valor por hora es: "+getValorHora());
    }
    
}
