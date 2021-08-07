
package javabasic01coursemezt.metodos;

public class Metodos {
    
    public Metodos() {}
    
    //Total acceso a un metodo publico
    public void metodoPublico (String name) {
        System.out.println("Bienvenido " + name + " al metodo publico");
    }
    
    //Se necesita crear una instancia para acceder a este metodo
    private String metodoPrivado (String name) {
        return "Bienvenido " + name + " al metodo privado";
    }
    
    //Se necesita crear una instancia para acceder a este metodo
    protected String metodoProtegido (String name) {
        return "Bienvenido " + name + " al metodo protegido";
    }
    
    //Total acceso a todos los metodos
    public void metodoGeneral (String name, String metodo) {
        switch (metodo) {
            case "Publico":
                System.out.println("Estas en el metodo publico");
                System.out.println("--------------------------");
                metodoPublico(name);
                break;
            case "Privado": {
                System.out.println("Estas en el metodo privado");
                System.out.println("--------------------------");
                String mensaje = metodoPrivado(name);
                System.out.println(mensaje);
                break;
            }
            default:{
                System.out.println("Estas en el metodo protegido");
                System.out.println("----------------------------");
                String mensaje = metodoProtegido(name);
                System.out.println(mensaje);
                break;
            }
        }
    }
}
