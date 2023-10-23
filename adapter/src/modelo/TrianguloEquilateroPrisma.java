package modelo;

public class TrianguloEquilateroPrisma {
    private double lado; 

    public TrianguloEquilateroPrisma(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public double getTriangulo() {
        double result;
        result = Math.pow(this.lado, 2);
        return result;
    }
}
