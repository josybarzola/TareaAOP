/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareaaop;

/**
 *
 * @author USER
 */
public class PrismaAdaptador extends Cilindro{
    private TrianguloEquilateroPrisma prisma; 

    public PrismaAdaptador(TrianguloEquilateroPrisma prisma) {
        this.prisma = prisma;
    }

    @Override
    public double getRadio(){
        double resultado;
        
        resultado=prisma.getLado()/Math.sqrt(3);
        return resultado;
    }
    
}
