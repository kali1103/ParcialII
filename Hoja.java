
/**
 * Clase Hoja.
 * 
 * @author Rodrigo Mendoza Quesada.
 * @version 24-11-2020.
 */
public class Hoja
{
    //Instancia de variables.
    private int valor;
    private Hoja menor;
    private Hoja mayor;

    /**
     * Constructor por defecto de la clase.
     */
    public Hoja()
    {
        //Inicializción de variables.
        valor = 0;
        menor = null;
        mayor = null;
    }
    
    /**
     * Constructor con parámetros de la clase.
     * @param int valor Valor de la constante.
     */
    public Hoja(int valor){
        this.valor = valor;
        menor = null;
        mayor = null;
    }
    
    /**
     * Retorna el valor de la Hoja.
     * @return int  Contiene el valor númerico de la Hoja.
     */
    public int getValor(){
        return this.valor;
    }
    
    /**
     * Permite establecer el valor de la Hoja.
     * @param int valor Contiene el valor a agregar.
     */
    public void setValor(int valor){
        this.valor = valor;
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
}
