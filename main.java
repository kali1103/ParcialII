import javax.swing.JOptionPane;
public class main{
    public static void main(String args[]){
        
        ListaEstudiante alfa = new ListaEstudiante();
        int opcion = 0;
        String nombre = "";
        int carnet = 0;
        Arbol beta = new Arbol();
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar Estudiante."+
            "\n2. Imprimir menores.\n3. Imprimir mayores.\n4. Imprimir iguales.\n5. Salir."));
            
            if (opcion == 1){
                nombre = JOptionPane.showInputDialog(null, "Digíte el nombre del estudiante:");
                carnet = Integer.parseInt(JOptionPane.showInputDialog(null, "Digíte el carnet del estudiante:"));
                alfa.agregar(nombre, carnet);
            }
            if (opcion == 2){
                
                Estudiante inicio = alfa.getInicio();
                while (inicio != null){
                    beta.agregar(inicio.getNombre(),inicio.getPromedio());
                    if (inicio.getSiguiente() != null){
                        inicio = inicio.getSiguiente();
                    }
                    else{
                        break;
                    }
                }
                
                float promedio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digíte el promedio:"));
                beta.menores(promedio);
            }
            if (opcion == 3){
                
                Estudiante inicio = alfa.getInicio();
                while (inicio != null){
                    beta.agregar(inicio.getNombre(),inicio.getPromedio());
                    if (inicio.getSiguiente() != null){
                        inicio = inicio.getSiguiente();
                    }
                    else{
                        break;
                    }
                }
                
                float promedio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digíte el promedio:"));
                beta.mayores(promedio);
            }
            if (opcion == 4){
                
                Estudiante inicio = alfa.getInicio();
                while (inicio != null){
                    beta.agregar(inicio.getNombre(),inicio.getPromedio());
                    if (inicio.getSiguiente() != null){
                        inicio = inicio.getSiguiente();
                    }
                    else{
                        break;
                    }
                }
                
                float promedio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digíte el promedio:"));
                beta.iguales(promedio);
            }
        }while(opcion != 5);
        System.out.println(alfa);
        
    }
}
