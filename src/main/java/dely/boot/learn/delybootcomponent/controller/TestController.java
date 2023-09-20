package dely.boot.learn.delybootcomponent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Dely
 * @Date: 2023-09-13 16:51:02
 * @Version: 1.0.0
 */
@RestController("/test")
public class TestController {

    @ResponseBody
    @GetMapping("/getById")
    public String test(@RequestParam Long id) {
        return id.toString();
    }
}
