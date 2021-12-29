package smit.homework.tirechange.tireChangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class tireChangeRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
}
