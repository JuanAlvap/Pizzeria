package core;

import java.util.ArrayList;

public abstract class Pedido {
    
    protected Cliente cliente;
    protected ArrayList<Item> items;

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
        
        this.cliente.addPedido(this);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    
    
}
