/**
 * Este programa modela figuras geométricas (un rectángulo y triángulo) y calcula el área de cada una.
 * Esta clase recibe una figura y, dependiendo si es o no un triángulo, imprime su área en consola, es decir,
 * simula un sistema simple de procesamiento de formas geométricas donde cada figura sabe calcular su propia área.
 */

public class Procesador {
    public void imprimir(Figura figura) {
        //Impresión del nombre de la figura geométrica y su área respectivamente
        System.out.println("Área del " + figura.obtenerNombre() + " es: " + figura.calcularArea());
    }

    public static void main(String[] args) {
        Procesador procesador = new Procesador(); //Se crea un objeto de la clase Procesador para la impresión de la información

        //Se crean los objetos de las diferentes figuras con el valor de sus bases y alturas
        Figura rectangulo = new Rectangulo(4, 5);
        Figura triangulo = new Triangulo(4, 5);

        //Impresión del nombre y área de las figuras
        procesador.imprimir(rectangulo);
        procesador.imprimir(triangulo);
    }

}
