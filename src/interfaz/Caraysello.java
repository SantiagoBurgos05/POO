package interfaz;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements Juego {

    //atributos
    private int moneda;
    private String jugador;
    private int eleccion;
    Scanner lectura=new Scanner(System.in);

    //solicitar datos
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador: ");
        jugador=lectura.next();
    }
    public void jugar() {
        System.out.println(jugador+" Realice su eleccion 1 para cara y 2 para sello: ");
        eleccion=lectura.nextInt();
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        System.out.println("Se ha lanzado la moneda");
    }
    public void finalizar() {
        if (moneda==1 && eleccion==1) {
            System.out.println("Usted ha ganado, callo cara");
        }else if (moneda==2 && eleccion==2) {
            System.out.println("Usted ha ganado, cayo sello");
        }else if (moneda==1&&eleccion==2) {
            System.out.println("Perdio, cayo cara");
        }else if (moneda==2&&eleccion==1) {
            System.out.println("Perdio, cayo sello");
        }
    }
    
}
