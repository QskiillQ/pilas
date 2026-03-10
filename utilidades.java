import java.util.Scanner;
import java.util.Stack;

public class utilidades {
    Scanner sc=new Scanner(System.in);

    /*Validamos que el numero que inserte el usuario sea un entero, para que el programa no colapse */
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()) {/*!sc.hasNextInt si lo que yo ingreso en el sc no es un entero entonces me va a mostrar un mensaje  */
            System.out.println("Papi agarre oficio, lo que puso no es valido");
            sc.nextLine(); /*borra lo que digito el usuario */
        }
        return sc.nextInt();
    }

    /*Validamos el rango para que el usuario ingrese el numero */
    public int ValidarRango(int n1,int n2,int numero){
        utilidades u=new utilidades();
        while (numero<n1 || numero>n2) {
            System.out.println("ingrese un numero entre"+n1+" y "+n2);
            numero=u.ValidarEntero(sc);
        }
        return numero;
    }
    /*Aqui llenamos la pila creando un objeto u */
    public Stack <Integer>LlenarPila(Stack<Integer>o){
        utilidades u=new utilidades();
        boolean continuar=true;
        int numero=0, opcion=0;
        while (continuar) {
            System.out.println(" ");
            System.out.println("Ingrese el numero");
            System.out.println(" ");
            numero=u.ValidarEntero(sc);
            o.push(numero);/*le subo el numeor que ingreso el usuario a la pila  */
            System.out.println(" ");
            System.out.println("Desea agregar mas registros 1= si, 2= no");
            opcion=u.ValidarEntero(sc);
            opcion=u.ValidarRango(1, 2, opcion);
            if(opcion==2){/*si la opcion es igual a dos entonces ya se va a parar el while  */
                continuar=false;
            }
        }
        return o;
    }

    /*Mostramos la pila */
    public void MostrarPila(Stack<Integer>p){
        System.out.println(" ");
        System.out.println(p);
    }


}
