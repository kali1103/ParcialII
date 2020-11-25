
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

    /**
     * Constructor por defecto de la clase.
     */
    public ListaEstudiante()
    {
        //Inicialización de variables.
        inicio = null;
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
        }
        else{
            Estudiante actual = inicio;
            int indice = 0;
            if (alfa.getNombre().length() < actual.getNombre().length()){
                indice = alfa.getNombre().length();
                }
            else if (alfa.getNombre().length() > actual.getNombre().length()){
                indice = alfa.getNombre().length();
                }
            else{
                indice = actual.getNombre().length();
                }
            while (actual != null){
                for (int contador = 0; contador < indice; indice++){
                    if (alfa.getNombre().charAt(contador) < actual.getNombre().charAt(contador)){
                        alfa.setSiguiente(actual);
                        inicio = alfa;
                        break;
                    }
                    else if (alfa.getNombre().charAt(contador) > actual.getNombre().charAt(contador)){
                        actual = actual.getSiguiente();
                        break;
                    }
                    else if (actual.getSiguiente() == null){
                        actual.setSiguiente(alfa);
                    }
                }
                actual = actual.getSiguiente();
            }
        }
    }
    
    /**
     * Retorna una cadena de caracteres con los dato de cada estudiante.
     * @return String   Contiene los datos de cada estudiante.
     */
    public String toString(){
        String datos = "";
        Estudiante temporal = inicio;
        while (temporal != null){
            datos += temporal.datos() + " ";
            temporal = temporal.getSiguiente();
        }
        return datos;
    }
}
