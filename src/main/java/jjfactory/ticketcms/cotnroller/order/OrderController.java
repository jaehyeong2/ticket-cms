package jjfactory.ticketcms.cotnroller.order;

import jjfactory.ticketcms.domain.order.Order;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.OrderReq;
import jjfactory.ticketcms.service.order.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/order")
@Controller
public class OrderController {
    private final OrderServiceImpl orderService;


}
