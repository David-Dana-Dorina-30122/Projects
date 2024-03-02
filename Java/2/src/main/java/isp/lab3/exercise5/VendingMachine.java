package isp.lab3.exercise5;
import java.util.Scanner;

public class VendingMachine {

    public static int value;
    public String displayProducts(){
        return "1 - Chips \n2 - Soda \n3 - Snickers";
        //System.out.println("1 - Chips");
        //System.out.println("2 - Soda");
        //System.out.println("3 - Snickers");
    }
    public static void insertCoin(int val){
        System.out.println("Insert coins");
        value += val;
    }
    public static String selectProduct(int id){

        if(id == 1) {return "Chips";}
        if(id == 2) {return "Soda";}
        if(id == 3) {return "Snickers";}
        return "Error";
    }
    public static int displayCredit(){
        return value;
    }
        public void userMenu() {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            while (choice != 4) {
                System.out.println("Select an option:");
                System.out.println("1. Select a product");
                System.out.println("2. Insert coins");
                System.out.println("3. Check available coins");
                System.out.println("4. Exit");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter product ID:");
                        int productId = scanner.nextInt();
                        String productName = selectProduct(productId);
                        System.out.println("Selected product: " + productName);
                        break;
                    case 2:
                        System.out.println("Enter coin value:");
                        int coinValue = scanner.nextInt();
                        insertCoin(coinValue);
                        break;
                    case 3:
                        int availableCoins = displayCredit();
                        System.out.println("Available coins: " + availableCoins);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                        break;
                }
            }
        }



    public static void main(String[] args){
        VendingMachine m = new VendingMachine();
        String s = m.displayProducts();
        System.out.println(s);
        /*m.insertCoin(6);
        m.displayCredit();
        String val = m.selectProduct(1);
        System.out.println(val);
        */
        m.userMenu();
    }
}
