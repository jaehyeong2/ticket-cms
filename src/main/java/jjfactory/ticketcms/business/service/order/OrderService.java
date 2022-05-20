package jjfactory.ticketcms.business.service.order;

import jjfactory.ticketcms.business.domain.order.Order;

import java.util.List;

public interface OrderService {
    Order findUserById(Long id);
    List<Order> findAll();
    Long countOrder();
    void save(Order order);
    void deleteById(Long id);
}
