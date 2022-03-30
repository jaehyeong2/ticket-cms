package jjfactory.ticketcms.cotnroller.inquiry;

import jjfactory.ticketcms.domain.inquiry.Inquiry;
import jjfactory.ticketcms.service.inquiry.InquiryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/inquiry")
@Controller
public class InquiryController {

    private final InquiryServiceImpl inquiryService;

    @GetMapping("")
    public String getInquiry(Model model){
        List<Inquiry> inquiries = inquiryService.findAll();
        model.addAttribute("inquiries",inquiries);
        return "inquiry/inquiries";
    }

    @GetMapping("/add")
    public String getInquiryAdd(){
        return "inquiry/inquiryAdd";
    }
}
