package smit.homework.tirechange.tireChangeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import smit.homework.tirechange.tireChangeService.tireChangeService;

@CrossOrigin
@RestController
public class tireChangeController {

    @Autowired
    private tireChangeService tireChangeService;


}
