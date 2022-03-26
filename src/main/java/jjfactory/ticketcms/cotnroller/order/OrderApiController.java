package jjfactory.ticketcms.cotnroller.order;

import jjfactory.ticketcms.domain.order.Order;
import jjfactory.ticketcms.dto.CommonRes;
import jjfactory.ticketcms.dto.OrderReq;
import jjfactory.ticketcms.service.order.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderApiController {

    private final OrderServiceImpl orderService;

    @PostMapping("")
    public CommonRes<?> save(@RequestBody OrderReq orderReq){
        Order order = orderReq.toEntity();
        orderService.save(order);
        return new CommonRes<>(HttpStatus.OK.value(),order);
    }

    @DeleteMapping("/{id}")
    public CommonRes<?> delete(@PathVariable Long id){
        orderService.deleteById(id);
        return new CommonRes<>(HttpStatus.OK.value(),"");
    }
}
