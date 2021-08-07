
package javabasic01coursemezt.ciclos;

public class CicloFor {
    
    //Calcula la suma de n numeros
    public static void sumaDeNumeros (int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma = suma + i;
        }   
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
