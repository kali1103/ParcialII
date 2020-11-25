
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
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(alfa);
        }
    }
}
