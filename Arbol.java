 /**
 * Clase Arbol.
 * 
 * @author Rodrigo Mendoza Quesada, C04813
 * @version 24-11-2020.
 */
public class Arbol{
    //Instancia de variables.
    private Hoja raiz;
    
    /**
     * Constructor por defecto de la clase.
     */
    public Arbol(){
        //Inicialización de variables.
        raiz = null;
    }
    
    /**
     * Permite obtener la raíz del árbol.
     * @return Hoja raiz    Contiene la primer Hoja del árbol.
     */
    public Hoja getRaiz(){
        return raiz;
    }
    
    /**
     * Básicamente es un señuelo.
     * @param float valor Contiene el valor que se asigna a la Hoja.
     * @param String nombre Nombre del estudiante.
     */
    public void agregar(String nombre, float valor){
        
        agregar(nombre, valor, raiz);
    }
    
    /**
     * Permite agregar una nueva hoja al árbol.
     * @param float valor contiene el valor que se asigna a la Hoja.
     * @param Hoja raiz Contiene el valor desde el cual se empieza a recorrer el árbol.
     * @param String nombre Nombre del estudiante.
     */
    public boolean agregar(String nombre, float valor, Hoja raiz){
        if (this.raiz == null){
            Hoja nuevaHoja = new Hoja(nombre, valor);
            this.raiz = nuevaHoja;
        }
        else if (valor < raiz.getValor()){
            if (raiz.getMenor() != null){
                return agregar(nombre, valor, raiz.getMenor());
            }
            Hoja nuevaHoja = new Hoja(nombre, valor);
            raiz.setMenor(nuevaHoja);
            return true;
        }
        else if(valor > raiz.getValor()){
            if (raiz.getMayor() != null){
                return agregar(nombre, valor, raiz.getMayor());
            }
            Hoja nuevaHoja = new Hoja(nombre, valor);
            raiz.setMayor(nuevaHoja);
            return true;
        }
        return false;
    }

    /**
     * Básicamente un señuelo.
     * @param float valor a buscar.
     */
    public void menores(float valor){
        System.out.println("Menores al promedio:");
        if (menores(valor, raiz) == false){
            System.out.println("No hay coincidencias.");
        }
        System.out.println("");
    }
    
    /**
     * Imprime los elementos menores al valor.
     * @param float valor a buscar.
     * @param Hoja raiz Raíz del árbol.
     * @return boolean.
     */
    public boolean menores(float valor, Hoja raiz){
        if (raiz != null){
            if (raiz.getMenor() != null){
               menores(valor, raiz.getMenor());
            }
            if (raiz.getValor() < valor){
                System.out.print(raiz.getNombre() + " " + raiz.getValor() + " "); 
                return true;
            }
            if (raiz.getMayor() != null){
                menores(valor, raiz.getMayor());
            }
        }
        return false;
    }
    
    /**
     * Básicamente un señuelo.
     * @param float valor a buscar.
     */
    public void mayores(float valor){
        System.out.println("Mayores al promedio:");
        if (mayores(valor, raiz) == false){
            System.out.println("No hay coincidencias.");
        }
        System.out.println("");
    }
    
    /**
     * Imprime los elementos mayores al valor
     * @param float valor a buscar.
     * @param Hoja raiz Raíz del árbol.
     * @return boolean.
     */
    public boolean mayores(float valor, Hoja raiz){
        if (raiz != null){
            if (raiz.getMenor() != null){
               mayores(valor, raiz.getMenor());
            }
            if (raiz.getValor() > valor){
                System.out.print(raiz.getNombre() + " " + raiz.getValor() + " "); 
                return true;
            }
            if (raiz.getMayor() != null){
                mayores(valor, raiz.getMayor());
            }
        }
        return false;
    }
    
    /**
     * Básicamente un señuelo.
     * @param float valor a buscar.
     */
    public void iguales(float valor){
        System.out.println("Iguales al promedio:");
        if (iguales(valor, raiz) == false){
            System.out.println("No hay coincidencias.");
        }
        System.out.println("");
    }
    
    /**
     * Imprime los elementos iguales al valor
     * @param float valor a buscar.
     * @param Hoja raiz Raíz del árbol.
     * @return boolean.
     */
    public boolean iguales(float valor, Hoja raiz){
        if (raiz != null){
            if (raiz.getMenor() != null){
               iguales(valor, raiz.getMenor());
            }
            if (raiz.getValor() == valor){
                System.out.print(raiz.getNombre() + " " + raiz.getValor() + " "); 
                return true;
            }
            if (raiz.getMayor() != null){
                iguales(valor, raiz.getMayor());
            }
        }
        return false;
    }
}