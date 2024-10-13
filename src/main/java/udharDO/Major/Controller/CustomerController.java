package udharDO.Major.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("health-check")
    private String check(){
        return "Customer is good";
    }
    //sign-up
    //login



}
