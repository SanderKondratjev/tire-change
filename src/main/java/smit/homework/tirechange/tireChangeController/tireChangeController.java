package smit.homework.tirechange.tireChangeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import smit.homework.tirechange.tireChangeService.tireChangeService;

@CrossOrigin
@RestController
public class tireChangeController {

    @Autowired
    private tireChangeService tireChangeService;

    @GetMapping("tire-change")
    public String info() {

        return "Tire-change booking system";
    }

    @GetMapping("tire-change/london-booking-times")
    public String getFromUrl() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:9003/api/v1/tire-change-times/available?from=2006-01-02&until=2030-01-02",
                String.class);
    }
}
