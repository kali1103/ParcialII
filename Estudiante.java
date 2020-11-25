import javax.swing.JOptionPane;
/**
 * Almacena los datos de los Estudiantes.
 * 
 * @author Rodrigo Mendoza Quesada, C04813.
 * @version 25-11-2020.
 */
public class Estudiante
{
    //Instancia de variables.
    private String nombre;
    private int carnet;
    private ListaNota notas;
    private float promedio;
    private Estudiante siguiente;

    /**
     * Constructor por defecto de la clase.
     */
    public Estudiante()
    {
        //Inicializción de variables.
        nombre ="";
        carnet = 0;
        notas = new ListaNota();
        promedio = 0;
        siguiente = null;
    }
    
    /**
     * Constructor con parámetros de la clase.
     * Se encarga también de agregar las notas una a una.
     * @param String nombre Contiene el nombre del estudiante.
     * @param int carnet Contiene el carnet del Estudiante.
     */
    public Estudiante(String nombre, int carnet){
        this.nombre  = nombre;
        this.carnet = carnet;
        notas = new ListaNota();
        
        int opcion = 1;
        int valorNota = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar nota.\n2. Finalizar."));
            if (opcion == 1){
                valorNota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digíte un valor entero para agregar a la nota"+
                                                                               "entre 0 y 100:"));
                notas.agregar(valorNota);
            }
        }
        while(opcion == 1);
        
        promedio = getPromedio();
        siguiente = null;
    }
    
    /**
     * Retorna el nombre del Estudiante.
     * @return String  Contiene el nombre del Estudiante.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Permite establecer el nombre del Estudiante.
     * @param int carnet Contiene el carnet a agregar.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Retorna el carnet del Estudiante.
     * @return int  Contiene el carnet del Estudiante.
     */
    public int getCarnet(){
        return this.carnet;
    }
    
    /**
     * Permite establecer el carnet del Estudiante.
     * @param int carnet Contiene el carnet a agregar.
     */
    public void setCarnet(int carnet){
        this.carnet = carnet;
    }
    
    /**
     * Extrae el promedio de notas de la lista del Estudiante.
     */
    public float getPromedio(){
        return notas.calcularPromedio();
    }
    
    /**
     * Permite establecer el siguiente Estudiante.
     * @param Estudiante siguiente    Contiene el Estudiante que será asignado.
     */
    public void setSiguiente(Estudiante siguiente){
        this.siguiente = siguiente;
    }
    
    /**
     * Retorna el Estudiante siguiente.
     * @return Estudiante siguiente   Contiene una referencia hacia el Estudiante siguiente.
     */
    public Estudiante getSiguiente(){
        return siguiente;
    }
    
    /**
     * Retorna una cadena de caracteres con los datos del estudiante.
     * @return String   Contiene los datos del estudiante.
     */
    public String datos(){
        return "{Estudiante: " + nombre + " | Carné: " + carnet + " | Promedio: " + promedio + "}";
    }
}
