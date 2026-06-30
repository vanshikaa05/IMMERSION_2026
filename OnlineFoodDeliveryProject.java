class FoodItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateAmount() {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item ID      : " + itemId);
        System.out.println("Item Name    : " + itemName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Amount       : " + calculateAmount());
        System.out.println("------------------------");
    }

    public String getItemName() {
        return itemName;
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String mobileNumber;

    public Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("------------------------");
    }

    public String getCustomerName() {
        return customerName;
    }
}

public class OnlineFoodDeliveryProject {

    public static void main(String[] args) {

        FoodItem f1 = new FoodItem(101, "Burger", 120, 2);
        FoodItem f2 = new FoodItem(102, "Pizza", 300, 1);
        FoodItem f3 = new FoodItem(103, "Pasta", 180, 2);
        FoodItem f4 = new FoodItem(104, "Cold Drink", 50, 3);

        Customer c1 = new Customer(1, "Rahul Sharma", "9876543210");
        Customer c2 = new Customer(2, "Priya Singh", "9876501234");

        System.out.println("===== CUSTOMER DETAILS =====");
        c1.displayCustomerDetails();
        c2.displayCustomerDetails();

        System.out.println("\n===== FOOD ITEM DETAILS =====");
        f1.displayItemDetails();
        f2.displayItemDetails();
        f3.displayItemDetails();
        f4.displayItemDetails();

        double totalBill =
                f1.calculateAmount()
              + f2.calculateAmount()
              + f3.calculateAmount()
              + f4.calculateAmount();

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Customer Name : " + c1.getCustomerName());
        System.out.println("Total Bill    : " + totalBill);
    }
}