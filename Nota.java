
/**
 * Contiene una lista enlazada con las notas del estudiante.
 * 
 * @author Rodrigo Mendoza Quesada, C04813.
 * @version 25-11-2020.
 */
public class Nota
{
    //Instancia de variables.
    private int valor;
    private Nota siguiente;

    /**
     * Constructor por defecto de la clase.
     */
    public Nota()
    {
        //Inicializción de variables.
        valor = 0;
        siguiente = null;
    }
    
    /**
     * Constructor con parámetros de la clase.
     * @param int valor Valor de la constante.
     */
    public Nota(int valor){
        this.valor = valor;
        siguiente = null;
    }
    
    /**
     * Retorna el valor de la Nota.
     * @return int  Contiene el valor númerico de la Nota.
     */
    public int getValor(){
        return this.valor;
    }
    
    /**
     * Permite establecer el valor de la Nota.
     * @param int valor Contiene el valor a agregar.
     */
    public void setValor(int valor){
        this.valor = valor;
    }
    
    /**
     * Permite establecer el valor de la siguiente Nota.
     * @param Nota siguiente    Contiene el Nota que será asignado.
     */
    public void setSiguiente(Nota siguiente){
        this.siguiente = siguiente;
    }
    
    /**
     * Retorna la Nota siguiente.
     * @return Nota siguiente   Contiene una referencia hacia la Nota siguiente.
     */
    public Nota getSiguiente(){
        return siguiente;
    }
}
