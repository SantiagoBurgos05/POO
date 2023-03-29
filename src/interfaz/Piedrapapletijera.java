package interfaz;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapletijera implements Juego{
    private String jugador;
    private int eleccion,maquina;
    Scanner lectura=new Scanner(System.in);
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador: ");
        jugador=lectura.next();
    }
    public void jugar() {
        System.out.println(jugador+" Escoja una opcion para comenzar a jugar(1 para piedra, 2 para papel y 3 para tijera)");
        eleccion=lectura.nextInt();
        Random aleatorio=new Random();
        maquina=aleatorio.nextInt(3)+1;
        System.out.println("La maquina ha tomado una decisión");
    }
    public void finalizar() {
        if (maquina==1&&eleccion==1) {
            System.out.println("La maquina escogió piedra y "+jugador+" tambien escogió piedra. Hay un empate");
        }else if (maquina==1&&eleccion==2) {
            System.out.println("La maquina escogió piedra y "+jugador+" papel. Ha ganado");
        }else if (maquina==1&&eleccion==3) {
            System.out.println("La maquina escogió piedra y "+jugador+" tijera. Ha perdido");

        }else if (maquina==2&&eleccion==1) {
            System.out.println("La maquina escogió papel y "+jugador+" piedra. Ha perdido");
        }else if (maquina==2&&eleccion==2) {
            System.out.println("La maquina escogió papel y "+jugador+" tambien escogió papel. Hay un empate");
        }else if (maquina==2&&eleccion==3) {
            System.out.println("La maquina escogió papel y "+jugador+" tijera. Ha ganado");

        }else if (maquina==3&&eleccion==1) {
            System.out.println("La maquina escogió tijera y "+jugador+" piedra. Ha ganado");
        }else if (maquina==3&&eleccion==2) {
            System.out.println("La maquina escogió tijera y "+jugador+"  papel. Ha perdido");
        }else if (maquina==3&&eleccion==3) {
            System.out.println("La maquina escogió tijera y "+jugador+" tambien escogió tijera. Hay un empate");
        }
    }
}
