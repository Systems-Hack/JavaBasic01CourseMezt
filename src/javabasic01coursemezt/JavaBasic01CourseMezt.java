
package javabasic01coursemezt;

import java.util.Scanner;
import javabasic01coursemezt.ciclos.CicloFor;
import javabasic01coursemezt.ciclos.CicloIf;
import javabasic01coursemezt.ciclos.CicloWhile;
import javabasic01coursemezt.clases.DateUtils;
import javabasic01coursemezt.metodos.Metodos;
import javabasic01coursemezt.objetos.Carro;
import javabasic01coursemezt.objetos.Persona;

public class JavaBasic01CourseMezt {
    
    //Clase principal - Hola Mundo
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int operacion, x;
        String cadena;
        Carro carro = new Carro();
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("CURSO BÁSICO JAVA - SESION 01");
            System.out.println("-----------------------------");
            System.out.println("[1] Verificar si es numero par o impar");
            System.out.println("[2] Suma de numeros");
            System.out.println("[3] Imprimir n numeros (while) ");
            System.out.println("[4] Imprimir n numeros (do while) ");
            System.out.println("[5] ¿Que hora es?");
            System.out.println("[6] Acceso a metodo publico");
            System.out.println("[7] Acceso a metodo privado");
            System.out.println("[8] Acceso a metodo protegido");
            System.out.println("[9] Quiero registrar carros en la tienda");
            System.out.println("[10] Quiero comprar un carro");
            System.out.println("[11] Salir");
            System.out.println("-----------------------------");
            System.out.print("Ingrese opcion : ");
            operacion = entrada.nextInt();

            switch (operacion) {
                case 1 -> {
                    System.out.println("[1] Verificar si es numero par o impar");
                    System.out.println("--------------------------------------");
                    System.out.print(" Ingrese numero : ");
                    x = entrada.nextInt();
                    CicloIf.esNumeroPar(x);
                }
                case 2 -> {
                    System.out.println("[2] Suma de numeros");
                    System.out.println("-------------------");
                    System.out.print(" Ingrese numero : ");
                    x = entrada.nextInt();
                    CicloFor.sumaDeNumeros(x);
                }
                case 3 -> {
                    System.out.println("[3] Imprimir n numeros (while) ");
                    System.out.println("-------------------------------");
                    System.out.print(" Ingrese numero : ");
                    x = entrada.nextInt();
                    CicloWhile.imprimirNumeros1(x);
                }
                case 4 -> {
                    System.out.println("[4] Imprimir n numeros (do while) ");
                    System.out.println("----------------------------------");
                    System.out.print(" Ingrese numero : ");
                    x = entrada.nextInt();
                    CicloWhile.imprimirNumeros2(x);
                }
                case 5 -> {
                    System.out.println("[5] ¿Que hora es?");
                    System.out.println("-------------------");
                    DateUtils.queHoraEs();
                }
                case 6 -> {
                    System.out.println("[6] Acceso a metodo publico");
                    System.out.println("---------------------------");
                    System.out.print(" Ingrese su nombre : ");
                    cadena = entrada.next();
                    Metodos metodoPublico = new Metodos();
                    metodoPublico.metodoPublico(cadena);
                }
                case 7 -> {
                    System.out.println("[7] Acceso a metodo privado");
                    System.out.println("---------------------------");
                    System.out.print(" Ingrese su nombre : ");
                    cadena = entrada.next();
                    Metodos metodoPrivado = new Metodos();
                    metodoPrivado.metodoGeneral(cadena, "Privado");
                }
                case 8 -> {
                    System.out.println("[8] Acceso a metodo protegido");
                    System.out.println("-----------------------------");
                    System.out.print(" Ingrese su nombre : ");
                    cadena = entrada.next();
                    Metodos metodoProtegido = new Metodos();
                    metodoProtegido.metodoGeneral(cadena, "Protegido");
                }
                case 9 -> {
                    System.out.println("[9] Quiero registrar carros en la tienda");
                    System.out.println("----------------------------------------");
                    carro = agregarCarroTienda();
                    System.out.println("El carro con codigo: " + carro.getCodigoCarro() 
                            + " y modelo: " + carro.getModelo() + " ha sido registrado");
                }
                case 10 -> {
                    System.out.println("[10] Quiero comprar un carro");
                    System.out.println("----------------------------");
                    Persona persona = comprarCarro(carro);
                    
                    if (null == persona.getCarro()) {
                        System.out.println("= No se pudo realizar la compra =");
                        System.out.println("Lo sentimos " + persona.getNombre() + " el carro no ha sido adquirido.");
                    }
                    else {
                        System.out.println("===========!Muchas Gracias¡=========");
                        System.out.println("Gracias " + persona.getNombre() + " " + persona.getApellido()
                                + " ha comprado el carro: " + persona.getCarro().getCodigoCarro() + " modelo: " + persona.getCarro().getModelo());
                    }
                }
                default -> System.exit(0);
            }
        } while (operacion != 10);
    }
   
    public static Carro agregarCarroTienda () {
        String modelo, color, placa;
        Double precio;
        Scanner entrada = new Scanner(System.in);

        Carro carro = new Carro();
        System.out.println("[!] Ingrese un modelo de carro");
        modelo = entrada.next();
        carro.setModelo(modelo);
        System.out.println("[!] Ingrese un color de carro");
        color = entrada.next();
        carro.setColor(color);
        System.out.println("[!] Ingrese un placa de carro");
        placa = entrada.next();
        carro.setPlaca(placa);
        System.out.println("[!] Ingrese un precio de carro");
        precio = entrada.nextDouble();
        carro.setPrecio(precio);
        carro.setCodigoCarro(23655);
        
        System.out.println("[!] El carro se registró correctamente");
        
        return carro;
    }
    
    public static Persona comprarCarro(Carro carro){
        String nombre, apellido, documento, pais, cadena;
        Double credito;
        Scanner entrada = new Scanner(System.in);

        Persona persona = new Persona();
        System.out.println("[!] Ingrese su nombre ");
        nombre = entrada.next();
        persona.setNombre(nombre);
        System.out.println("[!] Ingrese su apellido ");
        apellido = entrada.next();
        persona.setApellido(apellido);
        System.out.println("[!] Ingrese su documento ");
        documento = entrada.next();
        persona.setDocumento(documento);
        System.out.println("[!] Ingrese su pais ");
        pais = entrada.next();
        persona.setPais(pais);
        System.out.println("[!] Ingrese su credito ");
        credito = entrada.nextDouble();
        persona.setCredito(credito);
        
        System.out.println("[!] Usted fue registrado con exito ");
        System.out.println("===================================");
        System.out.println("[CARROS DISPONIBLES]");
        System.out.println("====================");
        System.out.println("  [#] CODIGO:      " + carro.getCodigoCarro());
        System.out.println("  [#] MODELO:      " + carro.getModelo());
        System.out.println("  [#] COLOR:       " + carro.getColor());
        System.out.println("  [#] PLACA:       " + carro.getPlaca());
        System.out.println("  [#] PRECIO(US$): " + carro.getPrecio());
        System.out.println("[!] ¿Desea elegir el carro n° " + carro.getCodigoCarro() + " ? (S/N)");
        cadena = entrada.next();
        
        switch (cadena) {
            case "S" -> {
                Double resta = persona.getCredito() - carro.getPrecio();
                
                if (resta < 0) {
                    System.out.println("[!] Usted no tiene suficiente credito para comprar el carro " + carro.getCodigoCarro()
                            + " le falta US$: " + resta*-1);
                    persona.setCarro(null);
                }
                else {
                    System.out.println("[!] Felicidades, usted tiene el nuevo carro.");
                    persona.setCarro(carro);
                }
                return persona;
            }
            case "N" -> {
                System.out.println("[!] Usted no ha elegido el carro");
                persona.setCarro(null);
                return persona;
            }
            default -> {
                    System.out.println("[!] Solo puede ingresar N (No) o S (Si).");
                    persona.setCarro(null);
                    return persona;
            }
        }
        
    }
 
    
}
