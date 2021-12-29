package smit.homework.tirechange.tireChangeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import smit.homework.tirechange.tireChangeService.tireChangeService;

@CrossOrigin
@RestController
public class tireChangeController {

    @Autowired
    private tireChangeService tireChangeService;

    @GetMapping("/")
    public String info() {

        return "Tire-change booking system";
    }

    @GetMapping("tire-change/london-booking-times")
    public String getFromLondonBookingTimes() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:9003/api/v1/tire-change-times/available?from=2006-01-02&until=2030-01-02",
                String.class);
    }

    @GetMapping("manchester-booking-times")
    public String getFromManchesterBookingTimes() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:9003/api/v1/tire-change-times/available?from=2006-01-02&until=2030-01-02",
                String.class);
    }

//    @PutMapping("london-book-time")
//    public String bookLondonTime() {
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject("http://localhost:9003/api/v1/tire-change-times/72ff11e4-f256-49d9-a185-730e4fc29445/book",
//                String.class);
//    }
}
