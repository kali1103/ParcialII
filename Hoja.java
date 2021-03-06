
/**
 * Clase Hoja.
 * 
 * @author Rodrigo Mendoza Quesada, C04813.
 * @version 24-11-2020.
 */
public class Hoja
{
    //Instancia de variables.
    private float valor;
    private String nombre;
    private Hoja menor;
    private Hoja mayor;

    /**
     * Constructor por defecto de la clase.
     */
    public Hoja()
    {
        //Inicializción de variables.
        valor = 0;
        nombre = "";
        menor = null;
        mayor = null;
    }
    
    /**
     * Constructor con parámetros de la clase.
     * @param float valor Valor de la constante.
     * @String nombre Contiene el nombre del estudiante.
     */
    public Hoja(String nombre, float valor){
        this.nombre = nombre;
        this.valor = valor;
        menor = null;
        mayor = null;
    }
    
    /**
     * Retorna el valor de la Hoja.
     * @return float  Contiene el valor númerico de la Hoja.
     */
    public float getValor(){
        return this.valor;
    }
    
    /**
     * Retorna la Hoja menor.
     * @return Hoja menor   Contiene una referencia hacia la Hoja menor.
     */
    public Hoja getMenor(){
        return menor;
    }
    
    /**
     * Permite establecer el valor de la Hoja menor.
     * @param Hoja menor    Contiene la Hoja que será asignada.
     */
    public void setMenor(Hoja menor){
        this.menor = menor;
    }
    
    /**
     * Retorna la Hoja mayor.
     * @return Hoja mayor   Contiene una referencia hacia la Hoja mayor.
     */
    public Hoja getMayor(){
        return mayor;
    }
    
    /**
     * Permite establecer el valor de la Hoja menormayor.
     * @param Hoja mayor    Contiene la Hoja que será asignada.
     */
    public void setMayor(Hoja mayor){
        this.mayor = mayor;
    }
    
    /**
     * Permite obtener el valor del nombre.
     * @return String   Contiene el nombre.
     */
    public String getNombre(){
        return nombre;
    }
}
