package demo;
import modelo.*;

public class Demo {
	public static void main(String[] args) {
        HoyoCircular hoyo = new HoyoCircular(5);
        Cilindro cilindro = new Cilindro(5);
        if (hoyo.cabe(cilindro)) {
        	System.out.println("El Cilindro de radio " + (Math.round(cilindro.getRadio()*100.0))/100.0 + " cm cabe dentro del Hoyo de " + hoyo.getRadio());
        }

        TrianguloEquilateroPrisma trianguloSmall = new TrianguloEquilateroPrisma(2);
        TrianguloEquilateroPrisma trianguloLarge = new TrianguloEquilateroPrisma(20);

        PrismaAdaptador smallAdapter = new PrismaAdaptador(trianguloSmall);
        PrismaAdaptador largeAdapter = new PrismaAdaptador(trianguloLarge);
        if (hoyo.cabe(smallAdapter)) {
        	System.out.println("El Circulo circunscrito de radio " + (Math.round(smallAdapter.getRadio()*100.0))/100.0+ " cm cabe dentro del Hoyo de "+ hoyo.getRadio());
        }
        if (!hoyo.cabe(largeAdapter)) {
        	System.out.println("El Circulo circunscrito de radio " + (Math.round(largeAdapter.getRadio()*100.0))/100.0 + " cm no cabe dentro del Hoyo de " + hoyo.getRadio());
        }
    }
}
