package core;

public class Item {

    private int id;
    private String nombre;
    private int valor;

    public Item(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.id = 0;
    }

    public String getNombre() {
        return nombre;
    }

}
