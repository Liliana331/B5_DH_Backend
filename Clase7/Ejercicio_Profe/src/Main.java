import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        List<Integer> listado = new ArrayList<>();
        for(int i= 0; i < 0; i++){
            listado.add(1);
        }

        listaNumeros.listaElementos(listado);

        listaNumeros.promedioElementos(listado);
    }
}
