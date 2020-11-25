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
     */
    public void agregar(float valor){
        agregar(valor, raiz);
    }
    
    /**
     * Permite agregar una nueva hoja al árbol.
     * @param float valor contiene el valor que se asigna a la Hoja.
     * @param Hoja raiz Contiene el valor desde el cual se empieza a recorrer el árbol.
     */
    public boolean agregar(float valor, Hoja raiz){
        if (this.raiz == null){
            Hoja nuevaHoja = new Hoja(valor);
            this.raiz = nuevaHoja;
        }
        else if (valor < raiz.getValor()){
            if (raiz.getMenor() != null){
                return agregar(valor, raiz.getMenor());
            }
            Hoja nuevaHoja = new Hoja(valor);
            raiz.setMenor(nuevaHoja);
            return true;
        }
        else if(valor > raiz.getValor()){
            if (raiz.getMayor() != null){
                return agregar(valor, raiz.getMayor());
            }
            Hoja nuevaHoja = new Hoja(valor);
            raiz.setMayor(nuevaHoja);
            return true;
        }
        return false;
    }
    
    /**
     * Básicamente un señuelo.
     * @param float valor Contiene el valor que se busca.
     */
    public void buscar(float valor){
        System.out.println(valor + ": "+ buscar(valor, raiz));
    }
    
    /**
     * Permite buscar una Hoja en el árbol.
     * @param float valor Contiene el valor que se busca.
     * @param hoja raiz Raíz del árbol.
     */
    public boolean buscar(float valor, Hoja raiz){
        if (raiz != null){
            if (valor == raiz.getValor()){
                return true;
            }
            else if (valor < raiz.getValor()){
                if (raiz.getMenor() != null){
                    return buscar(valor, raiz.getMenor());
                }
                return false;
            }
            else if(valor > raiz.getValor()){
                if (raiz.getMayor() != null){
                    return buscar(valor, raiz.getMayor());
                }
                return false;
            }
        }
        return false;
    }
    
    /**
     * Básicamente un señuelo.
     */
    public void preOrder(){
        System.out.println("Pre Orden:");
        preOrder(raiz);
        System.out.println("");
    }
    
    /**
     * Permite recorrer el árbol en pre-orden.
     * @param Hoja raiz Raíz del árbol.
     */
    public void preOrder(Hoja raiz){
        if (raiz != null){
            System.out.print(raiz.getValor() + " ");
            if (raiz.getMenor() != null){
                preOrder(raiz.getMenor());
            }
            if (raiz.getMayor() != null){
                preOrder(raiz.getMayor());
            }
        }
    }
    
    /**
     * Básicamente un señuelo.
     */
    public void inOrder(){
        System.out.println("En Orden:");
        inOrder(raiz);
        System.out.println("");
    }
    
    /**
     * Permite recorrer el árbol en orden.
     * @param Hoja raiz Raíz del árbol.
     */
    public void inOrder(Hoja raiz){
        if (raiz != null){
            if (raiz.getMenor() != null){
               inOrder(raiz.getMenor());
            }
            System.out.print(raiz.getValor() + " "); 
            if (raiz.getMayor() != null){
                inOrder(raiz.getMayor());
            }
        }
    }
    
    /**
     * Básicamente un señuelo.
     */
    public void postOrder(){
        System.out.println("Post Orden:");
        postOrder(raiz);
        System.out.println("");
    }
    
    /**
     * Permite recorrer el árbol en post-orden.
     * @param Hoja raiz Raíz del árbol.
     */
    public void postOrder(Hoja raiz){
        if (raiz != null){
            if (raiz.getMenor() != null){
                postOrder(raiz.getMenor());
            }
            if (raiz.getMayor() != null){
                postOrder(raiz.getMayor());
            }
            System.out.print(raiz.getValor() + " ");
        }
    }
}