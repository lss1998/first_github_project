package com.lssnb.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lisunshuai@nnuo.com
 * @date 2023/8/2 15:55
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello lssnb !!!";
    }

}
