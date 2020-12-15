package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");

        Member member = new Member();
        member.setId(1L);

        return "hello";
    }

}
