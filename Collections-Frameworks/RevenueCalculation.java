// You are tasked with developing and testing a program that takes a file of customer orders 
// and outputs the total revenue by product. Implement the program that reads the file, 
// creates a Map<Product, Integer> to store each product's revenue, 
// and updates the revenue as the orders are processed. 
// You will also need to implement sorting and output formatting to display the results in a readable format.

import java.util.HashMap;
import java.util.Map;

class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: " + this.price;
    }
}

class Order{
    private Product product;
    private int quantity;

    public Order(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return this.product;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Product: " + this.product + "\nQuantity: " + this.quantity;
    }
}

class Customer{
    private String name;
    private Order order;

    public Customer(String name, Order order){
        this.name = name;
        this.order = order;
    }

    public String getName(){
        return this.name;
    }

    public Order getOrder(){
        return this.order;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nOrder: " + this.order;
    }
}

class OrderProcessor{
    private Map<Product, Integer> productRevenue;

    public OrderProcessor(){
        this.productRevenue = new HashMap<Product, Integer>();
    }

    public void processOrder(Customer customer){
        Product product = customer.getOrder().getProduct();
        int quantity = customer.getOrder().getQuantity();
        int revenue = 0;

        if(this.productRevenue.containsKey(product)){
            revenue = this.productRevenue.get(product);
        }

        revenue += product.getPrice() * quantity;
        this.productRevenue.put(product, revenue);
    }

    public void displayRevenue(){
        System.out.println("Product Revenue");
        System.out.println("---------------");

        for(Map.Entry<Product, Integer> entry : this.productRevenue.entrySet()){
            Product product = entry.getKey();
            int revenue = entry.getValue();

            System.out.println(product.getName() + ": " + revenue);
        }
    }
}

public class RevenueCalculation {
    public static void main(String[] args){
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0);
        Product product3 = new Product("Product 3", 30.0);

        Order order1 = new Order(product1, 1);
        Order order2 = new Order(product2, 2);
        Order order3 = new Order(product3, 3);

        Customer customer1 = new Customer("Customer 1", order1);
        Customer customer2 = new Customer("Customer 2", order2);
        Customer customer3 = new Customer("Customer 3", order3);

        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.processOrder(customer1);
        orderProcessor.processOrder(customer2);
        orderProcessor.processOrder(customer3);

        orderProcessor.displayRevenue();
    }    
}
