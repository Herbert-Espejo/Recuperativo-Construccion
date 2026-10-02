public class Rectangulo extends Figura {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public double calcularArea() {
        return getBase() * getAltura();
    }

    public String obtenerNombre() {
        return "Rectángulo";
    }
}
