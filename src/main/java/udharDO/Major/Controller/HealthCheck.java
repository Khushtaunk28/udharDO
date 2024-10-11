package udharDO.Major.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
public class HealthCheck {
    private String check(){
        return "OK,udharDo is working Great";
    }
}
