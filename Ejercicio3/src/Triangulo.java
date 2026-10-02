public class Triangulo extends Figura {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {
        final double DENOMINADOR = 2; //Eliminamos el número mágico de la operación
        return (getBase() * getAltura() / DENOMINADOR);
    }

    public String obtenerNombre() {
        return "Triángulo";
    }
}
