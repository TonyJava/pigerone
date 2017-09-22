package com.piger.jspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pigercc.liang on 2017/5/30.
 */
@Controller
public class StatController {

    @RequestMapping("/stat")
    @ResponseBody
    public String getStat()
    {
        return "123";
    }

}
