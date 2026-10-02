package com_java_languagefundamentals;

public class mobile_exp {

    String mobileModel;
    int quantity;
    double price;
    double DeliveryCharge;

    mobile_exp() {
        this("realme");
        System.out.println("no arg Constructor called");
    }

    mobile_exp(String mobileModel) {
        this(mobileModel, 50);
    }

    mobile_exp(String mobileModel, int quantity) {
        this(mobileModel, quantity, 45673.8);
    }

    mobile_exp(String mobileModel, int quantity, double price) {
        this(mobileModel, quantity, price, 4500);
    }

    mobile_exp(String mobileModel, int quantity, double price,
               double DeliveryCharge) {

        this.mobileModel = mobileModel;
        this.quantity = quantity;
        this.price = price;
        this.DeliveryCharge = DeliveryCharge;

        double mobilecost = quantity * price;
        double finalbill = DeliveryCharge + mobilecost;

        System.out.println("Mobile cost is: " + mobilecost);
        System.out.println("Final bill is: " + finalbill);
    }

    public static void main(String[] args) {

        System.out.println("main method started");

        mobile_exp m = new mobile_exp();
        m.display();

        System.out.println("main method ended");
    }

    void display() {
        System.out.println("Mobile model: " + mobileModel);
        System.out.println("Mobile price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery charge: " + DeliveryCharge);
    }
}
