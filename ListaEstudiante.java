
/**
 * Se encarga del manejo de la lista de Estudiantes.
 * 
 * @author Rodrigo Mendoza Quesada, C04813.
 * @version 25-11-2020.
 */
public class ListaEstudiante
{
    //Instania de variables.
    private Estudiante inicio;
    private int indice;

    /**
     * Constructor por defecto de la clase.
     */
    public ListaEstudiante()
    {
        //Inicialización de variables.
        inicio = null;
        indice = 0;
    }
    
    /**
     * Método encargado de crear y agregar un nuevo Estudiante.
     * Verifica que el Estudiante que se ingrese se inserte en orden alfabetico.
     * @param String nombre Contiene el nombre del Estudiante.
     * @param int carnet    Contiene el valor del carnet.
     */
    public void agregar(String nombre, int carnet){
        Estudiante alfa = new Estudiante (nombre, carnet);
        if (inicio == null){
            inicio = alfa;
            indice ++;
        }
        else if (inicio.getSiguiente() == null){
            if (nombre.compareTo(inicio.getNombre()) < 0){
                alfa.setSiguiente(inicio);
                inicio = alfa;
                indice ++;
            }
            else if (nombre.compareTo(inicio.getNombre()) >= 0){
                inicio.setSiguiente(alfa);
                indice ++;
            }
        }
        else{
            Estudiante anterior = inicio;
            Estudiante siguiente = anterior.getSiguiente(); 
            while (siguiente != null){
                
                if (nombre.compareTo(anterior.getNombre()) < 0){
                    alfa.setSiguiente(anterior);
                    if (anterior != inicio){
                        busquedaValor(anterior).setSiguiente(alfa);
                    }
                    inicio = alfa;
                    indice ++;
                    break;
                }
                else if (siguiente != null && nombre.compareTo(siguiente.getNombre()) < 0){
                    alfa.setSiguiente(siguiente);
                    anterior.setSiguiente(alfa);
                    indice ++;
                    break;
                }
                anterior = anterior.getSiguiente();
                siguiente = anterior.getSiguiente();
            }
            if (siguiente == null){
                anterior.setSiguiente(alfa);
            }
        }
    }
            
    /**
     * Permite recorrer la lista por indices y retorna el valor del indice solicitado.
     * @param Estudiante valor    Contiene el valor a buscar.
     * @return Estudiante   Retorna el Estudiante del indice.
     */
    public Estudiante busquedaValor(Estudiante valor){
        Estudiante temporal = inicio;
        while (temporal != null){
            if (temporal.getSiguiente() == valor){
                return temporal;
            }
            else{
                temporal = temporal.getSiguiente();
            }
        }
        return temporal;
    }
    
    /**
     * Retorna el valor del primer elemento de la lista de Estudiantes.
     * @return Estudiante inicio    Primer elemento de la lista.
     */
    public Estudiante getInicio(){
        return inicio;
    }
    
    /**
     * Retorna una cadena de caracteres con los dato de cada estudiante.
     * @return String   Contiene los datos de cada estudiante.
     */
    public String toString(){
        String datos = "";
        Estudiante temporal = inicio;
        while (temporal != null){
            datos += temporal.datos() + "\n";
            temporal = temporal.getSiguiente();
        }
        return datos;
    }
}
