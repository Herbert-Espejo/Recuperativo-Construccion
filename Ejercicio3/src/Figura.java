/**
 * Clase padre Figura (clase abstracta)
 */

public abstract class Figura {
    private double base, altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Métodos abstractos que heredarán las clases hijas
    public abstract double calcularArea();
    public abstract String obtenerNombre();
}
