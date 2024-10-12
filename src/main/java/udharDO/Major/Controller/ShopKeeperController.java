package udharDO.Major.Controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopkeeper")
public class ShopKeeperController {
    //POST /shopkeeper/{shopkeeperId}/loan: Create a new loan for a customer.
    //GET /shopkeeper/{shopkeeperId}/loans: View all loans issued.
    //GET /shopkeeper/{shopkeeperId}/earnings: View earnings from interest.
    @GetMapping("health-check")
    private String check(){
        return "shopkeeper is good";
    }
    @GetMapping("id/{id}")
    public String viewLoans(@PathVariable String id) {
        return "healthy";
    }
    @PostMapping("/create-loan")
    public String createLoan() {
        return "success";


    }
}
