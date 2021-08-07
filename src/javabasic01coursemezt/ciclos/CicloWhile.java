
package javabasic01coursemezt.ciclos;

public class CicloWhile {
    
    //Imprimen n numeros cercanos a 20, segun sea el valor de x
    public static void imprimirNumeros1 (int x) {
        // Salir cuando x llega a ser mayor que 4
        while (x <= 20) {
            System.out.println("Valor de x: " + x);
 
            //incrementa el valor de x para la siguiente iteración
            x++;
        }
    }
    
    //Imprimen n numeros cercanos a 20, segun sea el valor de x
    public static void imprimirNumeros2 (int x) {
        do {
            //El código dentro del do se imprime incluso
            //si la condición es falsa
            System.out.println("Valor de x :" + x);
            x++;
        }
        while (x < 20);
    }
    
}
