package sumar;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Sumar {
    public static void main(String[] arg){
        //comentario
        Scanner l= new Scanner(System.in);
        int alfa;
        int bravo;
        int charlie;
        int delta;
        
        System.out.println("Ingrese un numero:");
        alfa=l.nextInt();
        System.out.println("Ingrese un numero:");
        bravo=l.nextInt();
        charlie=alfa+bravo;
        delta=alfa-bravo;
        System.out.println("La suma es: "+charlie);
                System.out.println("La resta es: "+delta);
    }
}
