// You are developing an E-commerce website that allows users to 
// browse through products and add them to a cart before making a purchase. 
// Develop and test a Java program that uses ArrayList to store the products and
//  LinkedList to store the user's cart incrementally. 
// Implement methods that add products to the list of available products and 
// add them to the cart when the user requests it.

import java.util.ArrayList;
import java.util.LinkedList;

class Products{
    private String name;
    private String description;
    private double price;

    public Products(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nDescription: " + this.description + "\nPrice: " + this.price;
    }
}

class Cart{
    private String name;
    private String description;
    private double price;

    public Cart(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nDescription: " + this.description + "\nPrice: " + this.price;
    }
}

class ECommerce{
    private ArrayList<Products> products;
    private LinkedList<Cart> cart;

    public ECommerce(){
        this.products = new ArrayList<Products>();
        this.cart = new LinkedList<Cart>();
    }

    public void addProduct(Products product){
        this.products.add(product);
    }

    public void addToCart(Cart cart){
        this.cart.add(cart);
    }

    public void displayProducts(){
        for(Products product : this.products){
            System.out.println(product);
        }
    }

    public void displayCart(){
        if(cart.isEmpty()){
            System.out.println("Cart is empty");
            return;
        }
        else{
            System.out.println("Cart contents: ");
            for(Cart cart : this.cart){
                System.out.println(cart);
            }
        }
    }
}

public class ECommerceWeb {
    public static void main(String[] args) {
        ECommerce ecommerce = new ECommerce();

        // Products product1 = new Products("Product 1", "Product 1 description", 100.00);
        // Products product2 = new Products("Product 2", "Product 2 description", 200.00);
        // Products product3 = new Products("Product 3", "Product 3 description", 300.00);

        // Cart cart1 = new Cart("Cart 1", "Cart 1 description", 100.00);
        // Cart cart2 = new Cart("Cart 2", "Cart 2 description", 200.00);
        // Cart cart3 = new Cart("Cart 3", "Cart 3 description", 300.00);

        // ecommerce.addProduct(product1);
        // ecommerce.addProduct(product2);
        // ecommerce.addProduct(product3);

        // ecommerce.addToCart(cart1);
        // ecommerce.addToCart(cart2);
        // ecommerce.addToCart(cart3);

        ecommerce.addProduct(new Products("Product 1", "Product 1 description", 100.00));
        ecommerce.addProduct(new Products("Product 2", "Product 2 description", 200.00));
        ecommerce.addProduct(new Products("Product 3", "Product 3 description", 300.00));

        ecommerce.addToCart(new Cart("Cart 1", "Cart 1 description", 100.00));
        ecommerce.addToCart(new Cart("Cart 2", "Cart 2 description", 200.00));
        ecommerce.addToCart(new Cart("Cart 3", "Cart 3 description", 300.00));

        ecommerce.displayProducts();
        ecommerce.displayCart();
    }
}
