package com.danny.web;

import com.danny.dao.SecondKillDAO;
import com.danny.domain.SecondKill;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiazhang-676002187@qq.com
 * @date 2019-05-14
 */
@RestController
@RequestMapping("/")
public class IndexController {

    private final SecondKillDAO secondKillDAO;

    public IndexController(SecondKillDAO secondKillDAO) {
        this.secondKillDAO = secondKillDAO;
    }

    @GetMapping("index")
    public List<SecondKill> index() {
        List<SecondKill> secondKill = secondKillDAO.findById("3fa8eed759df4b16a07a00ddd4b7a8b1");
        return secondKill;
    }
}
