package jjfactory.ticketcms.service.order;

import jjfactory.ticketcms.domain.order.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService {
    Order findUserById(Long id);
    List<Order> findAll();
    Long countOrder();
    void save(Order order);
    void deleteById(Long id);
}
