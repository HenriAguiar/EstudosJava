package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<OrderItem> orders = new ArrayList<>();
        Product product;
        OrderItem orderItem;
        Order order;
        Client client;

        System.out.println("Vamos iniciar o pedido:");
        System.out.println("Forneça os dados dos clientes:");
        System.out.println("Nome");
        String clientName = sc.next();
        System.out.println("Data de nascimento");
        Date birthDate=sdf2.parse(sc.next());
        System.out.println("Email");
        String email=sc.next();
        client=new Client(clientName,email,birthDate);
        System.out.println(client.toString());
        System.out.println("Dados do pedido:");
        sdf2.applyPattern("dd/MM/yyy HH:mm:ss");
        System.out.println("Momento do pedido (dd/mm/yyy hh:mm:ss)");
        sc.nextLine();
        Date moment = sdf2.parse(sc.nextLine());
        System.out.println("Numero de produtos diferentes");

        int i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.println("Nome do produto");
            String productName= sc.next();
            System.out.println("Quantidade do produto");
            Integer productQuant= sc.nextInt();
            System.out.println("Preço do produto");
            Double productPrice= sc.nextDouble();
            product=new Product(productName,productPrice);
            orderItem=new OrderItem(productQuant,product);
            orders.add(orderItem);
        }
        order=new Order(moment,client,orders);
        System.out.println(order.total());
        System.out.println(order.getStatus());



    }
}
