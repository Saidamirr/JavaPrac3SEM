package Task_17_3_Order;

public class OrderMain {
    public static void main(String[] args) {
        //Тут view использует controller, а controller использует модель
        Order model = new Order();
        OrderController controller = new OrderController(model);
        OrderView view = new OrderView(controller);
        view.setVisible(true);
    }
}
