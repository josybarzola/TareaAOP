package modelo;

public class PrismaAdaptador extends Cilindro {
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
