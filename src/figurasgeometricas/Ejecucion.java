package figurasgeometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        float base,altura,base2,altura2,lado;
        double radio;
        int menu,i=1;
        Scanner lectura=new Scanner(System.in);

        while (i==1) {
        System.out.println("De que figura desea saber el area?: (Digite: triangulo=1, rectangulo=2,circulo=3, cuadrado=4) ");
        menu=lectura.nextInt();
        if (menu==1) {
            System.out.println("Ingrese la base del triangulo: ");
            base2=lectura.nextFloat();
            System.out.println("Ingrese la altura del triangulo: ");
            altura2=lectura.nextFloat();
            Triangulo t1=new Triangulo(base2,altura2);
            t1.calcularArea();
        }else if (menu==2) {
            System.out.println("Ingrese la base de la base del rectangulo: ");
            base=lectura.nextFloat();
            System.out.println("Ingrese la altura del rectangulo: ");
            altura=lectura.nextFloat();
            Rectangulo r1=new Rectangulo(base,altura);
            r1.calcularArea();
        }else if (menu==3) {
            System.out.println("Ingrese el radio del circulo: ");
            radio=lectura.nextDouble();
            Circulo c1=new Circulo(radio);
            c1.calcularArea();
        }else if (menu==4) {
            System.out.println("Ingrese el lado del cuadrado: ");
            lado=lectura.nextFloat(); 
            Cuadrado cu1=new Cuadrado(lado);
            cu1.calcularArea();           
        }
        System.out.println("Desea calcular otra arera? (Digite 1 para si y 2 para no)");
        i=lectura.nextInt();
        i=i++;
        }
    }
}
