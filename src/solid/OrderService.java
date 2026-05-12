package solid;

import solid.model.Order;
import solid.model.OrderDTO;
import solid.model.User;
import solid.notificationRelated.Notification;
import solid.paymentRelated.Payment;

public class OrderService {


    private final Notification notification;

    private final Payment payment;


    public OrderService(Notification notification, Payment payment) {
        this.notification = notification;
        this.payment = payment;
    }

    public OrderDTO placeOrder(Order order, User user){

        OrderDTO orderDTO = new OrderDTO();

        if (payment.pay(order.getAmount())){
            orderDTO.setMessage("Order has been successfully placed...");
            orderDTO.setName(order.getName());
            orderDTO.setQuantity(order.getQuantity());
            notification.notifyUser(user);

        }else {
            orderDTO.setMessage("Order failed @!");
            orderDTO.setName(order.getName());
            orderDTO.setQuantity(order.getQuantity());
        }
        return orderDTO;


    }
}
