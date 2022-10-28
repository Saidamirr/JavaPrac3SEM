package Task_17_3_Order;

public class OrderController {
    private Order model;


    public OrderController(Order model){
        this.model=model;
    }
    public String getClientName() {
        return model.getClientName();
    }

    public String getOrderStatus() {
        return model.getOrderStatus();
    }

    public void setClientName(String clientName) {
        model.setClientName(clientName);
        //Статус заказа определяется при получении имени пользователя
        checkOrderStatus();
    }

    private void setOrderStatus(String orderStatus) {
        model.setOrderStatus(orderStatus);
    }

    private void checkOrderStatus(){

        //Поиск в базе данных информации о заказе пользователя "name"...

        setOrderStatus("ready");
    }
}
