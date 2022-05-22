package jjfactory.ticketcms.business.user.api;

import jjfactory.ticketcms.business.user.dto.FindUserDto;
import jjfactory.ticketcms.business.user.service.UserServiceImpl;
import jjfactory.ticketcms.global.dto.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserApi {
    private final UserServiceImpl userService;

    @GetMapping("")
    public ApiResponse<FindUserDto> findUser(@RequestParam(required = false) String username ,
                                             @RequestParam(required = false) String name,
                                             @RequestParam(required = false) String email,
                                             @RequestParam(required = false) String phone){
        return new ApiResponse(userService.findUser(username,name,email,phone));
    }
}
