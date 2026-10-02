/**
 * Recorre un arreglo de enteros sumando sus valores y omtiendo (según su propio mensaje en consola)
 * los valores negativos
 */

public class NewProcesador {
    public static void procesarDatos(int[] datos) {
        int suma = 0;
        for (int dato : datos) { //El bucle "for" evita que se maneje índices manualmente
            if (dato < 0) { //El condicional para los números negativos
                System.out.println("Valor negativo encontrado, se omite.");
                continue;
            }
            suma += dato; //La suma se lleva a cabo si el número es positivo
        }
        System.out.println("La suma total es: " + suma);
    }

    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};
        procesarDatos(datos);
    }

}
