package jjfactory.ticketcms.business.cotnroller.order;

import jjfactory.ticketcms.business.service.order.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/order")
@Controller
public class OrderController {
    private final OrderServiceImpl orderService;

    @GetMapping("")
    public String getOrders(){
        return "order/orders";
    }

    @GetMapping("/add")
    public String getOrderAdd(){
        return "order/orderAdd";
    }


}
