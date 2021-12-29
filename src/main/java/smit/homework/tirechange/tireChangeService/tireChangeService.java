package smit.homework.tirechange.tireChangeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smit.homework.tirechange.tireChangeRepository.tireChangeRepository;

@Service
public class tireChangeService {

    @Autowired
    private tireChangeRepository tireChangeRepository;
}
