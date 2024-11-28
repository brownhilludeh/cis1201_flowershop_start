package info.hccis.assignment;

import info.hccis.assignment.bo.Order;

/**
 * Main class which will control overall program flow.
 * @author bjmaclean
 * @since 20190521
 */
public class Controller {
    
    private static String MAIN_MENU = "";

    private static String MENU = "\nA-add babysitting job\nB-show total\nC-Show all order details\nX-eXit";


    public static void main(String[] args) {

        //Show the business information
        Order.showBusinessInformation();
        

        

        Order order = new Order();
        order.getInformation();
        order.display();
        
    }
}
