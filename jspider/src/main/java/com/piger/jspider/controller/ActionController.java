package com.piger.jspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pigercc.liang on 2017/5/30.
 */
@Controller
public class ActionController {

    @RequestMapping("/start")
    @ResponseBody
    public String start()
    {

        return "";
    }

    @RequestMapping("/stop")
    @ResponseBody
    public String stop()
    {
        return "";
    }
}
