package jjfactory.ticketcms.business.service.order;

import jjfactory.ticketcms.business.domain.order.Order;
import jjfactory.ticketcms.business.repository.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order findUserById(Long id){
        return orderRepository.findById(id).orElseThrow( () ->{
            throw new IllegalArgumentException("주문 조회 실패");
        });
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Long countOrder(){
        return orderRepository.count();
    }

    @Transactional
    @Override
    public void save (Order order){
        orderRepository.save(order);
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        orderRepository.deleteById(id);
    }
}
