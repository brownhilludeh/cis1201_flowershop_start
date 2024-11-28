package ca.hccis;

import ca.hccis.flowerShop.Order;
import ca.hccis.util.CisUtility;

/**
 * Main class which will control overall program flow.
 * 
 * @author bjmaclean
 * @since 20190521
 */
public class Controller {

    // private static String MAIN_MENU = "";
    private static double totalCostOfAll = 0;

    private static String MAIN_MENU = "\n1-add  job\n2-show total\nX-eXit";

    public static void main(String[] args) {

        // Show the business information
        Order.showBusinessInformation();

        Order order = new Order();
        int choice = CisUtility.getInputInt(MAIN_MENU);
        do {
        // int choice = CisUtility.getInputInt(MAIN_MENU);
            switch (choice) {
                case 1:
                    order.getInformation();
                    break;
                case 2:
                    showTotal();
                    break;
                case 0:
                    System.out.println("Goodbye");
                    break;
            }
        } while (choice != 0);

    }

    public static void showTotal() {
        System.out.println("The total cost of all jobs: " + totalCostOfAll);
    }
}
