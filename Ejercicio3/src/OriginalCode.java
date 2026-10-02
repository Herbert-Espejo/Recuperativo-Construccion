//Para comenzar, las clases se pueden separar en diferentes archivos para mejor mantenibilidad
public class OriginalCode {
    public static class Figura {
        //Los atributos deben ser privados
        public double base;
        public double altura;

        //No contiene constructor, ni getters ni setters

        public double calcularArea() {
            return base * altura;
        }
    }

    public static class Triangulo extends Figura {
        public double calcularArea() {
            //Se manipula lo que retorna "calcularArea()"
            return (base * altura) / 2; //"2" número mágico
        }
    }

    public static class Procesador {
        public void imprimirArea(Figura figura) {
            /*
            Para una mejor práctica, el cómo calcular el área debe recaer en la figura en sí a través de abstracción,
            no en el procesador.
             */
            if (figura instanceof Triangulo) {
                Triangulo t = (Triangulo) figura; //"t" nombre de objeto ambiguo
                System.out.println("Área del triángulo: " + t.calcularArea());
            } else {
                System.out.println("Área: " + figura.calcularArea());
            }
        }

        public static void main(String[] args) {
            //Procesador, Figura y Triangulo no pueden ser referenciados por un contexto estático
            Procesador p = new Procesador(); //"p" nombre dde objeto ambiguo
            Figura rectangulo = new Figura();
            rectangulo.base = 4;
            rectangulo.altura = 5;

            Triangulo triangulo = new Triangulo(); //Nota: se hicieron estáticas las clases de aquí para poder probar el funcionamiento del código bueno
            triangulo.base = 4;
            triangulo.altura = 5;

            p.imprimirArea(rectangulo);
            p.imprimirArea(triangulo);
        }


    }
}
