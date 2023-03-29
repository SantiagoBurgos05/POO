package figurasgeometricas;

public class Triangulo {
    private float base2,altura2;

    public Triangulo(float base2, float altura2) {
        this.base2 = base2;
        this.altura2 = altura2;
    }

    public float getBase2() {
        return base2;
    }

    public void setBase2(float base2) {
        this.base2 = base2;
    }

    public float getAltura2() {
        return altura2;
    }

    public void setAltura2(float altura2) {
        this.altura2 = altura2;
    }
    public void calcularArea(){
        float area=(base2*altura2)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
