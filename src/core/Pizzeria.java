package core;

import java.util.ArrayList;
import java.util.Collections;

public class Pizzeria {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria() {
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.nombre = "Default name";
        this.pedidos = new ArrayList<>();
    }

    public boolean addCliente(Cliente cliente) {
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean addItem(Item item) {
        if (!this.items.contains(item)) {
            this.items.add(item);
            return true;
        }
        return false;
    }

    public boolean addPedido(Pedido pedido) {
        if (!this.pedidos.contains(pedido)) {
            this.pedidos.add(pedido);
            return true;
        }
        return false;
    }

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public Item getItem(int index) {
        return this.items.get(index);
    }

    public int calcProdMasVendidoCliente(int numCliente) {
        ArrayList<Integer> counts = new ArrayList<>();
        for (Item item : this.items) {
            counts.add(0);
        }
        Cliente cliente = this.getCliente(numCliente);
        for (Pedido pedido : cliente.getPedidos()) {
            if(pedido instanceof PedidoOnLine){
                for (Item item : pedido.getItems()) {
                    int itemIndex = this.items.indexOf(item);
                    counts.set(itemIndex, counts.get(itemIndex)+1);
                }
            }
        }
        System.out.println("num_Cliente: "+ numCliente);
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println("El producto " + this.items.get(i).getNombre()+ " se vendio " + counts.get(i));
        }
        int maxCount = Collections.max(counts);
        if (maxCount != 0){
            return counts.indexOf(maxCount);
        }
        return -1;
    }

}
