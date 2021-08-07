
package javabasic01coursemezt.objetos;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String documento;
    private String pais;
    private Double credito;
    private Carro carro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documento, String pais, Double credito, Carro carro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.pais = pais;
        this.credito = credito;
        this.carro = carro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", pais=" + pais + ", credito=" + credito + ", carro=" + carro + '}';
    }

}
