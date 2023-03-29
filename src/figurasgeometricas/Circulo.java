package figurasgeometricas;

public class Circulo extends Figura {
    double radio;
    //contructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    //getters y setters 
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void calcularArea(){
        double area=3.14*(radio*radio);
        System.out.println("El area del circulo es: "+area);
    } 

}
