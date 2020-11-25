
/**
 * Se encarga del manejo de la lista para las Notas.
 * 
 * @author Rodrigo Mendoza Quesada, C04813.
 * @version 25-11-2020.
 */
public class ListaNota
{
    //Instania de variables.
    private Nota inicio;
    private int indice;

    /**
     * Constructor por defecto de la clase.
     */
    public ListaNota()
    {
        //Inicialización de variables.
        inicio = null;
        indice = 0;
    }
    
    /**
     * Método encargado de crear y agregar un nuevo elemento.
     * @param int valor Valor de la constante.
     */
    public void agregar(int valor){
        Nota alfa = new Nota (valor);
        if (inicio == null){
            inicio = alfa;
            indice ++;
        }
        else{
            Nota actual = inicio;
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(alfa);
            indice ++;
        }
    }
    
    /**
     * Básicamente es un señuelo, solo se utiliza para llamar sin parámetros.
     */
    public float calcularPromedio(){
        return calcularPromedio(inicio, 0);
    }
    
    /**
     * Permite el calculo del promedio de Notas mediante un método recursivo.
     * @param Nota inicio   Contiene el primer elemento de la lista de Notas.
     * @param int suma  Contiene el valor de la suma de todas las Notas.
     * @return float    Contiene el valor del promedio.
     */
    public float calcularPromedio(Nota inicio, int suma){
        if (inicio != null){
            suma += inicio.getValor();
            if (inicio.getSiguiente() != null){
                return calcularPromedio(inicio.getSiguiente(), suma);
            }
            else{
                return suma/indice;
            }
        }
        return 0;
    }
    
    /**
     * Permite obtener el indice de la lista de Notas.
     * @return int dato Contiene el indice de la lista de Notas.
     */
    public int getIndice(){
        return indice;
    }
    
    /**
     * Permite obtener la primera Nota de la lista.
     * @return Nodo Contiene el valor de inicio de la lista de Notas.
     */
    public Nota getInicio(){
        return inicio;
    }
    
    /**
     * Retorna de forma recursiva la lista de ecuaciones.
     * @param Nodo inicio   Contiene el primer nodo de la lista de ecuaciones.
     * @param String ecuacion   Contiene una lista donde se anotan las ecuaciones.
     */
    public String dato(Nota inicio, String lista){
        if (inicio.getSiguiente() != null){
            return dato(inicio.getSiguiente(), lista += inicio.getValor() + " ");
        }
        return lista + inicio.getValor();
    }
}
