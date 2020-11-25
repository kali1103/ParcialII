import javax.swing.JOptionPane;
public class main{
    public static void main(String args[]){
        
        ListaEstudiante alfa = new ListaEstudiante();
        int opcion = 0;
        String nombre = "";
        int carnet = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar Estudiante.\n2. Salir."));
            if (opcion == 1){
                nombre = JOptionPane.showInputDialog(null, "Digíte el nombre del estudiante:");
                carnet = Integer.parseInt(JOptionPane.showInputDialog(null, "Digíte el carnet del estudiante:"));
                alfa.agregar(nombre, carnet);
            }
        }while(opcion != 2);
        System.out.println(alfa);
    }
}
