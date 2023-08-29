package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status=OrderStatus.valueOf("PAGAMENTO_PENDENTE");
    private Client client;

    private List<OrderItem> orders = new ArrayList<>();


    public Order(Date moment, Client client, List<OrderItem> orders) {
        this.moment = moment;
        this.client = client;
        this.orders = orders;
    }

    public Client getClient() {
        return client;
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

    public List<OrderItem> getOrders() {
        return orders;
    }
    public void addOrderProduct(OrderItem order){
        orders.add(order);
    }
    public void removeOrderProduct(OrderItem order) {
        orders.remove(order);
    }
    public Double total(){
        Double sum=0.0;
        for (OrderItem order:orders) {
            sum+= order.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment +
                ", status=" + status +
                ", client=" + client +
                ", orders=" + orders +
                '}';
    }
}
