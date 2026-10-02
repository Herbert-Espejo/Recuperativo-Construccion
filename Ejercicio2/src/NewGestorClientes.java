import java.util.ArrayList;
import java.util.List;

/**
 * Recibe una lista de nombres de clientes y elimina de la lista a aquellos cuyo nombre coincide con un nombre
 * dado como "inactivo"
 */

public class NewGestorClientes {
    public static void eliminarInactivos(List<String> clientes, String inactivo) {
        /*
        "removeIf" itera de manera interna y elimina los elementos que cumplen la condición
        Se utiliza "equals()" para comparar el valor del texto, no su referencia de memoria
         */
        clientes.removeIf(cliente -> cliente.equals(inactivo));
    }

    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add(new String("Pedro"));
        eliminarInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}
