package jjfactory.ticketcms.repository.order;

import jjfactory.ticketcms.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
