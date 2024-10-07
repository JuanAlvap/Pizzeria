package core;

import java.util.ArrayList;

public class PedidoOnLine extends Pedido {

    private String email;

    public PedidoOnLine(Cliente cliente, String email, ArrayList<Item> items) {
        super(cliente, items);
        this.email = email;
    }

}
