import java.util.Scanner;
import java.util.Stack;

public class pilas_primitivas {
    public static void main(String[] args) {
        boolean seguir=true;
        Scanner sc=new Scanner(System.in);
        utilidades u=new utilidades();
        Stack<Integer> pila=new Stack<>(); /*creamos la pila (Integer es una clase)*/
        while (seguir) {
            System.out.println(" ");
            System.out.println("Bienvenidos a la clase de pilas que es en donde vamos a hacer un CRUD");
            System.out.println("Escoja la Opcion:");
            System.out.println("1.) llenar pila");
            System.out.println("2.) Mostrar pila");
            System.out.println("3.) Modificar pila");
            System.out.println("4.) Borrar pila");
            System.out.println("5.) Salir");
            System.out.println("----------------------------------------------------------------------");
            System.out.println(" ");
            int opt=u.ValidarEntero(sc);/*aqui el programa va a llevar a validar la opcion que ingresa el usuario, al metodo validar   */
            switch (opt) {
                case 1:
                    pila= u.LlenarPila(pila);/*estoy llenando la pila con mi objeto u y le estoy entregando a eso la pila */
                    break;
                    case 2:
                        u.MostrarPila(pila);/*Aqui estoy llamando el metodo mostrar pila con mi objeto U  */
                        break;
                    case 3:
                        System.out.println("pagina en mantenimiento");
                        break;
                    case 4:
                        System.out.println("pagina en mantenimiento");
                        break;
                    case 5:
                        System.out.println("hasta luego");/*Si el usuario ingresa esta opcion ahora seguir va a ser falso y se va a salir de el while  */
                        seguir=false;
                        break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
    }
    
}
