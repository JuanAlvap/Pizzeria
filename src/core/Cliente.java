package core;

import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public boolean addPedido(Pedido pedido){
        if(!this.pedidos.contains(pedido)){
            this.pedidos.add(pedido);
            return true;
        }
        return false;
    }
    
}
