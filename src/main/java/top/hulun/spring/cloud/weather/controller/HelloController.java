package top.hulun.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController Test.
 *
 * @since 1.0.0 2018.9.28
 * @author <a href="http://hulun.top">hulun</a>
 */

@RestController
public class HelloController {
    //@RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){

        return "Hello World!";
    }
}
