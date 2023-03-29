package figurasgeometricas;

public class Cuadrado extends Figura {
    float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public void calcularArea(){
        float area=lado*lado;
        System.out.println("El area del cuadrado es: "+area);
    }
}
