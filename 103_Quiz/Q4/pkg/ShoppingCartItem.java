package pkg;
import java.util.*;

public class ShoppingCartItem {
        String itemName;
        double itemCost;
        int quantity;
        
        public ShoppingCartItem() {
            this.itemName = "Nothing";
            this.itemCost = 0.0;
            this.quantity = 0;
        }
        public ShoppingCartItem(String itemName, double itemCost, int quantity) {
            this.itemName = itemName;
            this.itemCost = itemCost;
            this.quantity = quantity;
        }
        
        public void cartToString() {
            System.out.println("You have " + this.quantity + " of " + this.itemName + " for $" + this.itemCost + " each.");
        }
        public String getItemName() {
            return this.itemName;
        }
        public int getQuantity() {
            return this.quantity;
        }
        public double getTotalCost() {
            return (this.itemCost * this.quantity);
        }
        public double getTotalWithTax() {
            return (this.itemCost * this.quantity * 1.12);
        }
        public double quantityToCostCalculator(int a) {
            return (this.itemCost * a);
        }
        public double getItemCost() {
            return this.itemCost;
        }
        public boolean compareItemCost(ShoppingCartItem a) {
            if (this.itemCost < a.itemCost) {
                return true;
            }
            else {
                return false;
            }
        }
        public ShoppingCartItem copyCart() {
            return new ShoppingCartItem(this.itemName, this.itemCost, this.quantity);
        }
}
