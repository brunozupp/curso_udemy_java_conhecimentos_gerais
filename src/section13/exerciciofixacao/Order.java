package section13.exerciciofixacao;

import section13.interfaces.BaseEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class Order implements BaseEntity {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public OrderItem findItem(Predicate<OrderItem> predicate) {
        return this.items.stream().filter(predicate).findFirst().orElse(null);
    }

    public Double total() {
        var sum = 0.0;

        for(OrderItem item : this.items) {
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public void show() {
        System.out.printf("Data da emissão do pedido = %s%nStatus = %s%n",
                simpleDateFormat.format(moment),
                status
        );

        client.show();

        for(OrderItem item : this.items) {
            item.show();
        }
    }
}
