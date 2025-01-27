import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class ListaNumeros {
    private static Logger LOGGER = Logger.getLogger(ListaNumeros.class);

    public void listaElementos(List<Integer> lista){
        System.out.println("lista = " + lista);
        System.out.println("tamanio = " + lista.size());
        if(lista.size() > 5){
            LOGGER.info("La longitud de la lista es mayor a 5");
            if(lista.size() > 10)
                LOGGER.info("La longitud de la lista es mayor a 10");
        }else if(lista.isEmpty()){
            LOGGER.error("La lista es igual a cero");
        }
        LOGGER.info("Final elementos");
    }

    public void promedioElementos(List<Integer> lista){
        double suma = 0;
        double promedio = 0;
        if(lista.isEmpty()){
            LOGGER.error("La lista es igual a cero");
        }else{
            for(Integer entero: lista){
                suma += entero;
            }
            promedio = suma/lista.size();
            LOGGER.info("Promedio de la lista: " + promedio);
        }

    }
}
