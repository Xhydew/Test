package nav09;

import java.util.Scanner;

/**
 *Calcula numeros primos desde 1 hasta un numero introducido
 * 
 * @author Joan Galiana Magán
 */
public class Nav09 {

    public static boolean primo(int nummero) {
        for (int i = 2; i < (nummero - 1); i++) {
            if ((nummero % i) == 0) {
                return false;
                //en cuanto el numero es divisible entre otro que no sea si mismo ni 1, no es entero por lo tanto devuelve falso y sale de la funcion
            }
        }
        //si no ha sido divisible entre los anteriores sigue la ejecucion y por lo tanto es primo
        System.out.println("Es primo \t " + nummero);
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclao = new Scanner(System.in);

        int max;//numero hasta el que queremos calcular

        System.out.print("Introduzca numero hasta el que desa calcular: ");
        max = teclao.nextInt();

        System.out.println("Desde el numero uno hasta el numero " + max);
        for (int num = 2; num <= max; num++) { //1 nunca sera primo por lo tanto no lo evaluamos
            primo(num);//comprueba si es primo desde el numero 2 hasta el numero introducido

        }

    }

}
