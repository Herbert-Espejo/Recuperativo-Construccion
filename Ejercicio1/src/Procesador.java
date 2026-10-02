public class Procesador {
    public static void procesar(int[] datos) {
        int i = 0;
        int suma = 0;
        while (i < datos.length) {
            suma += datos[i]; //Se suma antes de evaluar si el número es negativo
            if (datos[i] < 0) {
                System.out.println("Valor negativo encontrado, se omite");
                continue; //Salta el resto y vuelve a evaluar la condición
            }
            i++; //Se omite por el "continue;"
        }
        System.out.println("Suma tota: " + suma);
    }

    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};
        procesar(datos);
    }
}
