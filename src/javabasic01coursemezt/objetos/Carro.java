
package javabasic01coursemezt.objetos;

public class Carro {
    
    private int codigoCarro;
    private String modelo;
    private String color;
    private String placa;
    private Double precio;

    public Carro() {
    }

    public Carro(int codigoCarro, String modelo, String color, String placa, Double precio) {
        this.codigoCarro = codigoCarro;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.precio = precio;
    }

    public int getCodigoCarro() {
        return codigoCarro;
    }

    public void setCodigoCarro(int codigoCarro) {
        this.codigoCarro = codigoCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "codigoCarro=" + codigoCarro + ", modelo=" + modelo + ", color=" + color + ", placa=" + placa + ", precio=" + precio + '}';
    }
    
}
