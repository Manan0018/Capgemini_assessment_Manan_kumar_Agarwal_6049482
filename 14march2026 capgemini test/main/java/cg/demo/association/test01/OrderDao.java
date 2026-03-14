package cg.demo.association.test01;


import java.util.List;

public interface OrderDao {

    void addOrder(Order order);

    Order viewOrderById(int orderId);

    List<Order> viewOrdersByCustomerName(String name);
}
